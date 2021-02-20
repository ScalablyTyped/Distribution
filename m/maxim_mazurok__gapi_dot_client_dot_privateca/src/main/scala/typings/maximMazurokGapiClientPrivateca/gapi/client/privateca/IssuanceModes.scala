package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuanceModes extends StObject {
  
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
  implicit class IssuanceModesMutableBuilder[Self <: IssuanceModes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowConfigBasedIssuance(value: Boolean): Self = StObject.set(x, "allowConfigBasedIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowConfigBasedIssuanceUndefined: Self = StObject.set(x, "allowConfigBasedIssuance", js.undefined)
    
    @scala.inline
    def setAllowCsrBasedIssuance(value: Boolean): Self = StObject.set(x, "allowCsrBasedIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCsrBasedIssuanceUndefined: Self = StObject.set(x, "allowCsrBasedIssuance", js.undefined)
  }
}
