package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.upload method.
  */
trait IUploadProperties extends js.Object {
  /**
    * The id attribute of the <input> tag containing info about the file to
    * upload.
    */
  var element: String
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify true or "true" to overwrite, false or "false" to not
    * overwrite and for the WL.upload method call to fail, or "rename" to
    * not overwrite and enable SkyDrive to assign a new name to the
    * uploaded file.
    * @default "false"
    */
  var overwrite: js.UndefOr[String] = js.undefined
  /**
    * The path to the file to upload.
    */
  var path: String
}

object IUploadProperties {
  @scala.inline
  def apply(element: String, path: String, overwrite: String = null): IUploadProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadProperties]
  }
}

