package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionAppLockerFile extends Entity {
  // The friendly name
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // File as a byte array
  var file: js.UndefOr[scala.Double] = js.undefined
  // SHA256 hash of the file
  var fileHash: js.UndefOr[java.lang.String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsInformationProtectionAppLockerFile {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    file: scala.Int | scala.Double = null,
    fileHash: java.lang.String = null,
    id: java.lang.String = null,
    version: java.lang.String = null
  ): WindowsInformationProtectionAppLockerFile = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash)
    if (id != null) __obj.updateDynamic("id")(id)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WindowsInformationProtectionAppLockerFile]
  }
}

