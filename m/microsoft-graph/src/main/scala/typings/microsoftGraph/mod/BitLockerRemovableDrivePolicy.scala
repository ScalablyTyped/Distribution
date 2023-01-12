package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitLockerRemovableDrivePolicy extends StObject {
  
  /**
    * This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a
    * computer.
    */
  var blockCrossOrganizationWriteAccess: js.UndefOr[Boolean] = js.undefined
  
  // Select the encryption method for removable drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
  var encryptionMethod: js.UndefOr[NullableOption[BitLockerEncryptionMethod]] = js.undefined
  
  /**
    * Indicates whether to block write access to devices configured in another organization. If
    * requireEncryptionForWriteAccess is false, this value does not affect.
    */
  var requireEncryptionForWriteAccess: js.UndefOr[Boolean] = js.undefined
}
object BitLockerRemovableDrivePolicy {
  
  inline def apply(): BitLockerRemovableDrivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitLockerRemovableDrivePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitLockerRemovableDrivePolicy] (val x: Self) extends AnyVal {
    
    inline def setBlockCrossOrganizationWriteAccess(value: Boolean): Self = StObject.set(x, "blockCrossOrganizationWriteAccess", value.asInstanceOf[js.Any])
    
    inline def setBlockCrossOrganizationWriteAccessUndefined: Self = StObject.set(x, "blockCrossOrganizationWriteAccess", js.undefined)
    
    inline def setEncryptionMethod(value: NullableOption[BitLockerEncryptionMethod]): Self = StObject.set(x, "encryptionMethod", value.asInstanceOf[js.Any])
    
    inline def setEncryptionMethodNull: Self = StObject.set(x, "encryptionMethod", null)
    
    inline def setEncryptionMethodUndefined: Self = StObject.set(x, "encryptionMethod", js.undefined)
    
    inline def setRequireEncryptionForWriteAccess(value: Boolean): Self = StObject.set(x, "requireEncryptionForWriteAccess", value.asInstanceOf[js.Any])
    
    inline def setRequireEncryptionForWriteAccessUndefined: Self = StObject.set(x, "requireEncryptionForWriteAccess", js.undefined)
  }
}
