package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var file_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify "true" to overwrite, "false" to not overwrite and for
    * the WL.backgroundUpload method call to fail, or "rename" to not
    * overwrite and enable SkyDrive to assign a new name to the uploaded
    * file.
    * @default "false".
    */
  var overwrite: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to the file to upload.
    */
  var path: java.lang.String
  /**
    * The file input stream to read the file from.
    */
  var stream_input: js.UndefOr[winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream] = js.undefined
}

