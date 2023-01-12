package typings.mongodb.anon

import typings.mongodb.mod.AutoEncryptionTlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Azure extends StObject {
  
  var aws: js.UndefOr[AutoEncryptionTlsOptions] = js.undefined
  
  var azure: js.UndefOr[AutoEncryptionTlsOptions] = js.undefined
  
  var gcp: js.UndefOr[AutoEncryptionTlsOptions] = js.undefined
  
  var kmip: js.UndefOr[AutoEncryptionTlsOptions] = js.undefined
  
  var local: js.UndefOr[AutoEncryptionTlsOptions] = js.undefined
}
object Azure {
  
  inline def apply(): Azure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Azure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Azure] (val x: Self) extends AnyVal {
    
    inline def setAws(value: AutoEncryptionTlsOptions): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
    
    inline def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
    
    inline def setAzure(value: AutoEncryptionTlsOptions): Self = StObject.set(x, "azure", value.asInstanceOf[js.Any])
    
    inline def setAzureUndefined: Self = StObject.set(x, "azure", js.undefined)
    
    inline def setGcp(value: AutoEncryptionTlsOptions): Self = StObject.set(x, "gcp", value.asInstanceOf[js.Any])
    
    inline def setGcpUndefined: Self = StObject.set(x, "gcp", js.undefined)
    
    inline def setKmip(value: AutoEncryptionTlsOptions): Self = StObject.set(x, "kmip", value.asInstanceOf[js.Any])
    
    inline def setKmipUndefined: Self = StObject.set(x, "kmip", js.undefined)
    
    inline def setLocal(value: AutoEncryptionTlsOptions): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}
