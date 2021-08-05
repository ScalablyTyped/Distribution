package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuanceModes extends StObject {
  
  /** Required. When true, allows callers to create Certificates by specifying a CertificateConfig. */
  var allowConfigBasedIssuance: js.UndefOr[Boolean] = js.undefined
  
  /** Required. When true, allows callers to create Certificates by specifying a CSR. */
  var allowCsrBasedIssuance: js.UndefOr[Boolean] = js.undefined
}
object IssuanceModes {
  
  inline def apply(): IssuanceModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuanceModes]
  }
  
  extension [Self <: IssuanceModes](x: Self) {
    
    inline def setAllowConfigBasedIssuance(value: Boolean): Self = StObject.set(x, "allowConfigBasedIssuance", value.asInstanceOf[js.Any])
    
    inline def setAllowConfigBasedIssuanceUndefined: Self = StObject.set(x, "allowConfigBasedIssuance", js.undefined)
    
    inline def setAllowCsrBasedIssuance(value: Boolean): Self = StObject.set(x, "allowCsrBasedIssuance", value.asInstanceOf[js.Any])
    
    inline def setAllowCsrBasedIssuanceUndefined: Self = StObject.set(x, "allowCsrBasedIssuance", js.undefined)
  }
}
