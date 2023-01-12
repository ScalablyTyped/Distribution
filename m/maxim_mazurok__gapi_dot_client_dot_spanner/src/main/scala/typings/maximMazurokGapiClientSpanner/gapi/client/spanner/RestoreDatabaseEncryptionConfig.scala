package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDatabaseEncryptionConfig extends StObject {
  
  /** Required. The encryption type of the restored database. */
  var encryptionType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The Cloud KMS key that will be used to encrypt/decrypt the restored database. This field should be set only when encryption_type is `CUSTOMER_MANAGED_ENCRYPTION`. Values
    * are of the form `projects//locations//keyRings//cryptoKeys/`.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object RestoreDatabaseEncryptionConfig {
  
  inline def apply(): RestoreDatabaseEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDatabaseEncryptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreDatabaseEncryptionConfig] (val x: Self) extends AnyVal {
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
