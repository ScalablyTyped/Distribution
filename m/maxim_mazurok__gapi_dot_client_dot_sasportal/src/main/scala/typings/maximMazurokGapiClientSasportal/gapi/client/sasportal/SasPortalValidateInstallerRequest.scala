package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalValidateInstallerRequest extends js.Object {
  
  /** Required. JSON Web Token signed using a CPI private key. Payload must include a "secret" claim whose value is the secret. */
  var encodedSecret: js.UndefOr[String] = js.native
  
  /** Required. Unique installer id (cpiId) from the Certified Professional Installers database. */
  var installerId: js.UndefOr[String] = js.native
  
  /** Required. Secret returned by the GenerateSecret method. */
  var secret: js.UndefOr[String] = js.native
}
object SasPortalValidateInstallerRequest {
  
  @scala.inline
  def apply(): SasPortalValidateInstallerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalValidateInstallerRequest]
  }
  
  @scala.inline
  implicit class SasPortalValidateInstallerRequestOps[Self <: SasPortalValidateInstallerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncodedSecret(value: String): Self = this.set("encodedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedSecret: Self = this.set("encodedSecret", js.undefined)
    
    @scala.inline
    def setInstallerId(value: String): Self = this.set("installerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallerId: Self = this.set("installerId", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
