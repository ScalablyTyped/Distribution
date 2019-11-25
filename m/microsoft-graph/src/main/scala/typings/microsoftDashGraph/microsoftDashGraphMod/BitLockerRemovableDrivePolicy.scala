package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitLockerRemovableDrivePolicy extends js.Object {
  /**
    * This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a
    * computer.
    */
  var blockCrossOrganizationWriteAccess: js.UndefOr[Boolean] = js.undefined
  // Select the encryption method for removable drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
  var encryptionMethod: js.UndefOr[BitLockerEncryptionMethod] = js.undefined
  /**
    * Indicates whether to block write access to devices configured in another organization. If
    * requireEncryptionForWriteAccess is false, this value does not affect.
    */
  var requireEncryptionForWriteAccess: js.UndefOr[Boolean] = js.undefined
}

object BitLockerRemovableDrivePolicy {
  @scala.inline
  def apply(
    blockCrossOrganizationWriteAccess: js.UndefOr[Boolean] = js.undefined,
    encryptionMethod: BitLockerEncryptionMethod = null,
    requireEncryptionForWriteAccess: js.UndefOr[Boolean] = js.undefined
  ): BitLockerRemovableDrivePolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockCrossOrganizationWriteAccess)) __obj.updateDynamic("blockCrossOrganizationWriteAccess")(blockCrossOrganizationWriteAccess.asInstanceOf[js.Any])
    if (encryptionMethod != null) __obj.updateDynamic("encryptionMethod")(encryptionMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(requireEncryptionForWriteAccess)) __obj.updateDynamic("requireEncryptionForWriteAccess")(requireEncryptionForWriteAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitLockerRemovableDrivePolicy]
  }
}

