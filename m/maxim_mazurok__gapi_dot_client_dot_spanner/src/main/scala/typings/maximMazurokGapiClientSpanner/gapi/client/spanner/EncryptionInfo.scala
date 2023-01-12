package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionInfo extends StObject {
  
  /** Output only. If present, the status of a recent encrypt/decrypt call on underlying data for this database or backup. Regardless of status, data is always encrypted at rest. */
  var encryptionStatus: js.UndefOr[Status] = js.undefined
  
  /** Output only. The type of encryption. */
  var encryptionType: js.UndefOr[String] = js.undefined
  
  /** Output only. A Cloud KMS key version that is being used to protect the database or backup. */
  var kmsKeyVersion: js.UndefOr[String] = js.undefined
}
object EncryptionInfo {
  
  inline def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionInfo] (val x: Self) extends AnyVal {
    
    inline def setEncryptionStatus(value: Status): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyVersion(value: String): Self = StObject.set(x, "kmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionUndefined: Self = StObject.set(x, "kmsKeyVersion", js.undefined)
  }
}
