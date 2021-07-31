package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuingOptions extends StObject {
  
  /** Required. When true, includes a URL to the issuing CA certificate in the "authority information access" X.509 extension. */
  var includeCaCertUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will
    * rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
    */
  var includeCrlAccessUrl: js.UndefOr[Boolean] = js.undefined
}
object IssuingOptions {
  
  @scala.inline
  def apply(): IssuingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuingOptions]
  }
  
  @scala.inline
  implicit class IssuingOptionsMutableBuilder[Self <: IssuingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeCaCertUrl(value: Boolean): Self = StObject.set(x, "includeCaCertUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCaCertUrlUndefined: Self = StObject.set(x, "includeCaCertUrl", js.undefined)
    
    @scala.inline
    def setIncludeCrlAccessUrl(value: Boolean): Self = StObject.set(x, "includeCrlAccessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCrlAccessUrlUndefined: Self = StObject.set(x, "includeCrlAccessUrl", js.undefined)
  }
}
