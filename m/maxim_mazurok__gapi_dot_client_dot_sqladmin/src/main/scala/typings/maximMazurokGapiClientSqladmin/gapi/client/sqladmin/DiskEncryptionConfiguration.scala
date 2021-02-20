package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskEncryptionConfiguration extends StObject {
  
  /** This is always *sql#diskEncryptionConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Resource name of KMS key for disk encryption */
  var kmsKeyName: js.UndefOr[String] = js.native
}
object DiskEncryptionConfiguration {
  
  @scala.inline
  def apply(): DiskEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class DiskEncryptionConfigurationMutableBuilder[Self <: DiskEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
