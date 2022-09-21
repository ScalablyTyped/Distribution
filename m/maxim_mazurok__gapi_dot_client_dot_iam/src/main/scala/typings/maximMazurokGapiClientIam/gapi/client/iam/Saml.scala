package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Saml extends StObject {
  
  /**
    * Required. SAML Identity provider configuration metadata xml doc. The xml document should comply with [SAML 2.0
    * specification](https://www.oasis-open.org/committees/download.php/56785/sstc-saml-metadata-errata-2.0-wd-05.pdf). The max size of the acceptable xml document will be bounded to 128k
    * characters. The metadata xml document should satisfy the following constraints: 1) Must contain an Identity Provider Entity ID. 2) Must contain at least one non-expired signing key
    * certificate. 3) For each signing key: a) Valid from should be no more than 7 days from now. b) Valid to should be no more than 10 years in the future. 4) Upto 3 IdP signing keys are
    * allowed in the metadata xml. When updating the provider's metadata xml, at lease one non-expired signing key must overlap with the existing metadata. This requirement is skipped if
    * there are no non-expired signing keys present in the existing metadata
    */
  var idpMetadataXml: js.UndefOr[String] = js.undefined
}
object Saml {
  
  inline def apply(): Saml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Saml]
  }
  
  extension [Self <: Saml](x: Self) {
    
    inline def setIdpMetadataXml(value: String): Self = StObject.set(x, "idpMetadataXml", value.asInstanceOf[js.Any])
    
    inline def setIdpMetadataXmlUndefined: Self = StObject.set(x, "idpMetadataXml", js.undefined)
  }
}
