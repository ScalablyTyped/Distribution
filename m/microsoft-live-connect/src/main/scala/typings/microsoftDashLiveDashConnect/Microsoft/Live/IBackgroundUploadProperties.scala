package typings.microsoftDashLiveDashConnect.Microsoft.Live

import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.backgroundUpload method.
  */
trait IBackgroundUploadProperties extends js.Object {
  /**
    * The file input object to read the file from. Can be a
    * Windows.Storage.StorageFile or an IFile.
    */
  var file_input: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of the file to upload.
    */
  var file_name: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify "true" to overwrite, "false" to not overwrite and for
    * the WL.backgroundUpload method call to fail, or "rename" to not
    * overwrite and enable SkyDrive to assign a new name to the uploaded
    * file.
    * @default "false".
    */
  var overwrite: js.UndefOr[String] = js.undefined
  /**
    * The path to the file to upload.
    */
  var path: String
  /**
    * The file input stream to read the file from.
    */
  var stream_input: js.UndefOr[IInputStream] = js.undefined
}

object IBackgroundUploadProperties {
  @scala.inline
  def apply(
    path: String,
    file_input: js.Any = null,
    file_name: String = null,
    overwrite: String = null,
    stream_input: IInputStream = null
  ): IBackgroundUploadProperties = {
    val __obj = js.Dynamic.literal(path = path)
    if (file_input != null) __obj.updateDynamic("file_input")(file_input)
    if (file_name != null) __obj.updateDynamic("file_name")(file_name)
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite)
    if (stream_input != null) __obj.updateDynamic("stream_input")(stream_input)
    __obj.asInstanceOf[IBackgroundUploadProperties]
  }
}

