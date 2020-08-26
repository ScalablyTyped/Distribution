package typings.microsoftLiveConnect.Microsoft.Live

import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.backgroundUpload method.
  */
@js.native
trait IBackgroundUploadProperties extends js.Object {
  /**
    * The file input object to read the file from. Can be a
    * Windows.Storage.StorageFile or an IFile.
    */
  var file_input: js.UndefOr[js.Any] = js.native
  /**
    * The name of the file to upload.
    */
  var file_name: js.UndefOr[String] = js.native
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify "true" to overwrite, "false" to not overwrite and for
    * the WL.backgroundUpload method call to fail, or "rename" to not
    * overwrite and enable SkyDrive to assign a new name to the uploaded
    * file.
    * @default "false".
    */
  var overwrite: js.UndefOr[String] = js.native
  /**
    * The path to the file to upload.
    */
  var path: String = js.native
  /**
    * The file input stream to read the file from.
    */
  var stream_input: js.UndefOr[IInputStream] = js.native
}

object IBackgroundUploadProperties {
  @scala.inline
  def apply(path: String): IBackgroundUploadProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundUploadProperties]
  }
  @scala.inline
  implicit class IBackgroundUploadPropertiesOps[Self <: IBackgroundUploadProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_input(value: js.Any): Self = this.set("file_input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_input: Self = this.set("file_input", js.undefined)
    @scala.inline
    def setFile_name(value: String): Self = this.set("file_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile_name: Self = this.set("file_name", js.undefined)
    @scala.inline
    def setOverwrite(value: String): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setStream_input(value: IInputStream): Self = this.set("stream_input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream_input: Self = this.set("stream_input", js.undefined)
  }
  
}

