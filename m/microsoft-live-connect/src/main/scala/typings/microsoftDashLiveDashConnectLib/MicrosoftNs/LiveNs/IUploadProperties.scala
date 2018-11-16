package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var element: java.lang.String
  /**
           * Indicates whether the uploaded file should overwrite an existing
           * copy. Specify true or "true" to overwrite, false or "false" to not
           * overwrite and for the WL.upload method call to fail, or "rename" to
           * not overwrite and enable SkyDrive to assign a new name to the
           * uploaded file.
           * @default "false"
           */
  var overwrite: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The path to the file to upload.
           */
  var path: java.lang.String
}

