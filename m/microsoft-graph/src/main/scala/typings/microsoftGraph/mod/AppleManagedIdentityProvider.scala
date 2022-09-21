package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppleManagedIdentityProvider
  extends StObject
     with IdentityProviderBase {
  
  // The certificate data, which is a long string of text from the certificate. Can be null.
  var certificateData: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Apple developer identifier. Required.
  var developerId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Apple key identifier. Required.
  var keyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Apple service identifier. Required.
  var serviceId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AppleManagedIdentityProvider {
  
  inline def apply(): AppleManagedIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppleManagedIdentityProvider]
  }
  
  extension [Self <: AppleManagedIdentityProvider](x: Self) {
    
    inline def setCertificateData(value: NullableOption[String]): Self = StObject.set(x, "certificateData", value.asInstanceOf[js.Any])
    
    inline def setCertificateDataNull: Self = StObject.set(x, "certificateData", null)
    
    inline def setCertificateDataUndefined: Self = StObject.set(x, "certificateData", js.undefined)
    
    inline def setDeveloperId(value: NullableOption[String]): Self = StObject.set(x, "developerId", value.asInstanceOf[js.Any])
    
    inline def setDeveloperIdNull: Self = StObject.set(x, "developerId", null)
    
    inline def setDeveloperIdUndefined: Self = StObject.set(x, "developerId", js.undefined)
    
    inline def setKeyId(value: NullableOption[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setServiceId(value: NullableOption[String]): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
