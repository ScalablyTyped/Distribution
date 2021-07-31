package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalValidateInstallerRequest extends StObject {
  
  /** Required. JSON Web Token signed using a CPI private key. Payload must include a "secret" claim whose value is the secret. */
  var encodedSecret: js.UndefOr[String] = js.undefined
  
  /** Required. Unique installer id (cpiId) from the Certified Professional Installers database. */
  var installerId: js.UndefOr[String] = js.undefined
  
  /** Required. Secret returned by the GenerateSecret method. */
  var secret: js.UndefOr[String] = js.undefined
}
object SasPortalValidateInstallerRequest {
  
  @scala.inline
  def apply(): SasPortalValidateInstallerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalValidateInstallerRequest]
  }
  
  @scala.inline
  implicit class SasPortalValidateInstallerRequestMutableBuilder[Self <: SasPortalValidateInstallerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedSecret(value: String): Self = StObject.set(x, "encodedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedSecretUndefined: Self = StObject.set(x, "encodedSecret", js.undefined)
    
    @scala.inline
    def setInstallerId(value: String): Self = StObject.set(x, "installerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallerIdUndefined: Self = StObject.set(x, "installerId", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
