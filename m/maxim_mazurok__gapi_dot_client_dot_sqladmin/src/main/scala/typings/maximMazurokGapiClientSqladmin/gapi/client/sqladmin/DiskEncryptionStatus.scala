package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskEncryptionStatus extends StObject {
  
  /** This is always `sql#diskEncryptionStatus`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** KMS key version used to encrypt the Cloud SQL instance resource */
  var kmsKeyVersionName: js.UndefOr[String] = js.undefined
}
object DiskEncryptionStatus {
  
  inline def apply(): DiskEncryptionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskEncryptionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskEncryptionStatus] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKmsKeyVersionName(value: String): Self = StObject.set(x, "kmsKeyVersionName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionNameUndefined: Self = StObject.set(x, "kmsKeyVersionName", js.undefined)
  }
}
