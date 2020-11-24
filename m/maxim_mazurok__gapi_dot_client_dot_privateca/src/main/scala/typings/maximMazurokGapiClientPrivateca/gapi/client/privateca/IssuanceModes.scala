package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuanceModes extends js.Object {
  
  /** Required. When true, allows callers to create Certificates by specifying a CertificateConfig. */
  var allowConfigBasedIssuance: js.UndefOr[Boolean] = js.native
  
  /** Required. When true, allows callers to create Certificates by specifying a CSR. */
  var allowCsrBasedIssuance: js.UndefOr[Boolean] = js.native
}
object IssuanceModes {
  
  @scala.inline
  def apply(): IssuanceModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuanceModes]
  }
  
  @scala.inline
  implicit class IssuanceModesOps[Self <: IssuanceModes] (val x: Self) extends AnyVal {
    
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
    def setAllowConfigBasedIssuance(value: Boolean): Self = this.set("allowConfigBasedIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConfigBasedIssuance: Self = this.set("allowConfigBasedIssuance", js.undefined)
    
    @scala.inline
    def setAllowCsrBasedIssuance(value: Boolean): Self = this.set("allowCsrBasedIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCsrBasedIssuance: Self = this.set("allowCsrBasedIssuance", js.undefined)
  }
}
