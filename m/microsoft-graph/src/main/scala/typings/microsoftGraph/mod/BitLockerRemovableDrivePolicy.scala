package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitLockerRemovableDrivePolicy extends js.Object {
  /**
    * This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a
    * computer.
    */
  var blockCrossOrganizationWriteAccess: js.UndefOr[Boolean] = js.native
  // Select the encryption method for removable drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
  var encryptionMethod: js.UndefOr[BitLockerEncryptionMethod] = js.native
  /**
    * Indicates whether to block write access to devices configured in another organization. If
    * requireEncryptionForWriteAccess is false, this value does not affect.
    */
  var requireEncryptionForWriteAccess: js.UndefOr[Boolean] = js.native
}

object BitLockerRemovableDrivePolicy {
  @scala.inline
  def apply(): BitLockerRemovableDrivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitLockerRemovableDrivePolicy]
  }
  @scala.inline
  implicit class BitLockerRemovableDrivePolicyOps[Self <: BitLockerRemovableDrivePolicy] (val x: Self) extends AnyVal {
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
    def setBlockCrossOrganizationWriteAccess(value: Boolean): Self = this.set("blockCrossOrganizationWriteAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockCrossOrganizationWriteAccess: Self = this.set("blockCrossOrganizationWriteAccess", js.undefined)
    @scala.inline
    def setEncryptionMethod(value: BitLockerEncryptionMethod): Self = this.set("encryptionMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionMethod: Self = this.set("encryptionMethod", js.undefined)
    @scala.inline
    def setRequireEncryptionForWriteAccess(value: Boolean): Self = this.set("requireEncryptionForWriteAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireEncryptionForWriteAccess: Self = this.set("requireEncryptionForWriteAccess", js.undefined)
  }
  
}

