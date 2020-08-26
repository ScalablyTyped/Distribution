package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSecurityState extends js.Object {
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.native
  // File name (without path).
  var name: js.UndefOr[String] = js.native
  // Full file path of the file/imageFile.
  var path: js.UndefOr[String] = js.native
  /**
    * Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
}

object FileSecurityState {
  @scala.inline
  def apply(): FileSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSecurityState]
  }
  @scala.inline
  implicit class FileSecurityStateOps[Self <: FileSecurityState] (val x: Self) extends AnyVal {
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
    def setFileHash(value: FileHash): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRiskScore(value: String): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
  }
  
}

