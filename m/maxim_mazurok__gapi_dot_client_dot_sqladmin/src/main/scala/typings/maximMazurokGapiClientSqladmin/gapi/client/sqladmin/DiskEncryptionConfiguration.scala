package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskEncryptionConfiguration extends StObject {
  
  /** This is always `sql#diskEncryptionConfiguration`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Resource name of KMS key for disk encryption */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object DiskEncryptionConfiguration {
  
  inline def apply(): DiskEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskEncryptionConfiguration]
  }
  
  extension [Self <: DiskEncryptionConfiguration](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
