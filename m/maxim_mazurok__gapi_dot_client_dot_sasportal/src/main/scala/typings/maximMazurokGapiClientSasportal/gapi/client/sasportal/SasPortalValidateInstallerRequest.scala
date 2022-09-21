package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalValidateInstallerRequest extends StObject {
  
  /** Required. JSON Web Token signed using a CPI private key. Payload must include a "secret" claim whose value is the secret. */
  var encodedSecret: js.UndefOr[String] = js.undefined
  
  /** Required. Unique installer id (CPI ID) from the Certified Professional Installers database. */
  var installerId: js.UndefOr[String] = js.undefined
  
  /** Required. Secret returned by the GenerateSecret. */
  var secret: js.UndefOr[String] = js.undefined
}
object SasPortalValidateInstallerRequest {
  
  inline def apply(): SasPortalValidateInstallerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalValidateInstallerRequest]
  }
  
  extension [Self <: SasPortalValidateInstallerRequest](x: Self) {
    
    inline def setEncodedSecret(value: String): Self = StObject.set(x, "encodedSecret", value.asInstanceOf[js.Any])
    
    inline def setEncodedSecretUndefined: Self = StObject.set(x, "encodedSecret", js.undefined)
    
    inline def setInstallerId(value: String): Self = StObject.set(x, "installerId", value.asInstanceOf[js.Any])
    
    inline def setInstallerIdUndefined: Self = StObject.set(x, "installerId", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
