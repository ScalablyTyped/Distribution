package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuancePolicy extends StObject {
  
  /** Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates. */
  var allowedIssuanceModes: js.UndefOr[IssuanceModes] = js.undefined
  
  /** Optional. If any AllowedKeyType is specified, then the certificate request's public key must match one of the key types listed here. Otherwise, any key may be used. */
  var allowedKeyTypes: js.UndefOr[js.Array[AllowedKeyType]] = js.undefined
  
  /**
    * Optional. A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request includes conflicting values for the same properties,
    * they will be overwritten by the values defined here. If a certificate request uses a CertificateTemplate that defines conflicting predefined_values for the same properties, the
    * certificate issuance request will fail.
    */
  var baselineValues: js.UndefOr[X509Parameters] = js.undefined
  
  /**
    * Optional. Describes constraints on identities that may appear in Certificates issued through this CaPool. If this is omitted, then this CaPool will not add restrictions on a
    * certificate's identity.
    */
  var identityConstraints: js.UndefOr[CertificateIdentityConstraints] = js.undefined
  
  /**
    * Optional. The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority expires before a Certificate's requested maximum_lifetime, the
    * effective lifetime will be explicitly truncated to match it.
    */
  var maximumLifetime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued through this CaPool. If a certificate request sets extensions that don't appear in the
    * passthrough_extensions, those extensions will be dropped. If a certificate request uses a CertificateTemplate with predefined_values that don't appear here, the certificate issuance
    * request will fail. If this is omitted, then this CaPool will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this
    * CaPool's baseline_values.
    */
  var passthroughExtensions: js.UndefOr[CertificateExtensionConstraints] = js.undefined
}
object IssuancePolicy {
  
  inline def apply(): IssuancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuancePolicy]
  }
  
  extension [Self <: IssuancePolicy](x: Self) {
    
    inline def setAllowedIssuanceModes(value: IssuanceModes): Self = StObject.set(x, "allowedIssuanceModes", value.asInstanceOf[js.Any])
    
    inline def setAllowedIssuanceModesUndefined: Self = StObject.set(x, "allowedIssuanceModes", js.undefined)
    
    inline def setAllowedKeyTypes(value: js.Array[AllowedKeyType]): Self = StObject.set(x, "allowedKeyTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedKeyTypesUndefined: Self = StObject.set(x, "allowedKeyTypes", js.undefined)
    
    inline def setAllowedKeyTypesVarargs(value: AllowedKeyType*): Self = StObject.set(x, "allowedKeyTypes", js.Array(value*))
    
    inline def setBaselineValues(value: X509Parameters): Self = StObject.set(x, "baselineValues", value.asInstanceOf[js.Any])
    
    inline def setBaselineValuesUndefined: Self = StObject.set(x, "baselineValues", js.undefined)
    
    inline def setIdentityConstraints(value: CertificateIdentityConstraints): Self = StObject.set(x, "identityConstraints", value.asInstanceOf[js.Any])
    
    inline def setIdentityConstraintsUndefined: Self = StObject.set(x, "identityConstraints", js.undefined)
    
    inline def setMaximumLifetime(value: String): Self = StObject.set(x, "maximumLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaximumLifetimeUndefined: Self = StObject.set(x, "maximumLifetime", js.undefined)
    
    inline def setPassthroughExtensions(value: CertificateExtensionConstraints): Self = StObject.set(x, "passthroughExtensions", value.asInstanceOf[js.Any])
    
    inline def setPassthroughExtensionsUndefined: Self = StObject.set(x, "passthroughExtensions", js.undefined)
  }
}
