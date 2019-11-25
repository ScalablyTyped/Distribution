package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionAppLockerFile extends Entity {
  // The friendly name
  var displayName: js.UndefOr[String] = js.undefined
  // File as a byte array
  var file: js.UndefOr[Double] = js.undefined
  // SHA256 hash of the file
  var fileHash: js.UndefOr[String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[String] = js.undefined
}

object WindowsInformationProtectionAppLockerFile {
  @scala.inline
  def apply(
    displayName: String = null,
    file: Int | Double = null,
    fileHash: String = null,
    id: String = null,
    version: String = null
  ): WindowsInformationProtectionAppLockerFile = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionAppLockerFile]
  }
}

