package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSecurityState extends js.Object {
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.undefined
  // File name (without path).
  var name: js.UndefOr[String] = js.undefined
  // Full file path of the file/imageFile.
  var path: js.UndefOr[String] = js.undefined
  /**
    * Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.undefined
}

object FileSecurityState {
  @scala.inline
  def apply(fileHash: FileHash = null, name: String = null, path: String = null, riskScore: String = null): FileSecurityState = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSecurityState]
  }
}

