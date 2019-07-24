package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSecurityState extends js.Object {
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.undefined
  // File name (without path).
  var name: js.UndefOr[java.lang.String] = js.undefined
  // Full file path of the file/imageFile.
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[java.lang.String] = js.undefined
}

object FileSecurityState {
  @scala.inline
  def apply(
    fileHash: FileHash = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    riskScore: java.lang.String = null
  ): FileSecurityState = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore)
    __obj.asInstanceOf[FileSecurityState]
  }
}

