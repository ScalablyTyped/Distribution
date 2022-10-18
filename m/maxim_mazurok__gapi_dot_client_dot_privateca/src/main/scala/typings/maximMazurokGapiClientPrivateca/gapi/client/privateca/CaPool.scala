package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaPool extends StObject {
  
  /** Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool. */
  var issuancePolicy: js.UndefOr[IssuancePolicy] = js.undefined
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. The resource name for this CaPool in the format `projects/ *‍/locations/ *‍/caPools/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool. */
  var publishingOptions: js.UndefOr[PublishingOptions] = js.undefined
  
  /** Required. Immutable. The Tier of this CaPool. */
  var tier: js.UndefOr[String] = js.undefined
}
object CaPool {
  
  inline def apply(): CaPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaPool]
  }
  
  extension [Self <: CaPool](x: Self) {
    
    inline def setIssuancePolicy(value: IssuancePolicy): Self = StObject.set(x, "issuancePolicy", value.asInstanceOf[js.Any])
    
    inline def setIssuancePolicyUndefined: Self = StObject.set(x, "issuancePolicy", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublishingOptions(value: PublishingOptions): Self = StObject.set(x, "publishingOptions", value.asInstanceOf[js.Any])
    
    inline def setPublishingOptionsUndefined: Self = StObject.set(x, "publishingOptions", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
