package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /** Output only. A structured description of the issued X.509 certificate. */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.undefined
  
  /**
    * Immutable. The resource name for a CertificateTemplate used to issue this certificate, in the format `projects/ *‍/locations/ *‍/certificateTemplates/ *`. If this is specified, the
    * caller must have the necessary permission to use this template. If this is omitted, no template will be used. This template must be in the same location as the Certificate.
    */
  var certificateTemplate: js.UndefOr[String] = js.undefined
  
  /** Immutable. A description of the certificate and key that does not require X.509 or ASN.1. */
  var config: js.UndefOr[CertificateConfig] = js.undefined
  
  /** Output only. The time at which this Certificate was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the issuing CertificateAuthority in the format `projects/ *‍/locations/ *‍/caPools/ *‍/certificateAuthorities/ *`. */
  var issuerCertificateAuthority: js.UndefOr[String] = js.undefined
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may
    * be truncated if it would extend past the life of any certificate authority in the issuing chain.
    */
  var lifetime: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name for this Certificate in the format `projects/ *‍/locations/ *‍/caPools/ *‍/certificates/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The pem-encoded, signed X.509 certificate. */
  var pemCertificate: js.UndefOr[String] = js.undefined
  
  /** Output only. The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246. */
  var pemCertificateChain: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Immutable. A pem-encoded X.509 certificate signing request (CSR). */
  var pemCsr: js.UndefOr[String] = js.undefined
  
  /** Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present. */
  var revocationDetails: js.UndefOr[RevocationDetails] = js.undefined
  
  /** Immutable. Specifies how the Certificate's identity fields are to be decided. If this is omitted, the `DEFAULT` subject mode will be used. */
  var subjectMode: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this Certificate was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  extension [Self <: Certificate](x: Self) {
    
    inline def setCertificateDescription(value: CertificateDescription): Self = StObject.set(x, "certificateDescription", value.asInstanceOf[js.Any])
    
    inline def setCertificateDescriptionUndefined: Self = StObject.set(x, "certificateDescription", js.undefined)
    
    inline def setCertificateTemplate(value: String): Self = StObject.set(x, "certificateTemplate", value.asInstanceOf[js.Any])
    
    inline def setCertificateTemplateUndefined: Self = StObject.set(x, "certificateTemplate", js.undefined)
    
    inline def setConfig(value: CertificateConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setIssuerCertificateAuthority(value: String): Self = StObject.set(x, "issuerCertificateAuthority", value.asInstanceOf[js.Any])
    
    inline def setIssuerCertificateAuthorityUndefined: Self = StObject.set(x, "issuerCertificateAuthority", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPemCertificate(value: String): Self = StObject.set(x, "pemCertificate", value.asInstanceOf[js.Any])
    
    inline def setPemCertificateChain(value: js.Array[String]): Self = StObject.set(x, "pemCertificateChain", value.asInstanceOf[js.Any])
    
    inline def setPemCertificateChainUndefined: Self = StObject.set(x, "pemCertificateChain", js.undefined)
    
    inline def setPemCertificateChainVarargs(value: String*): Self = StObject.set(x, "pemCertificateChain", js.Array(value*))
    
    inline def setPemCertificateUndefined: Self = StObject.set(x, "pemCertificate", js.undefined)
    
    inline def setPemCsr(value: String): Self = StObject.set(x, "pemCsr", value.asInstanceOf[js.Any])
    
    inline def setPemCsrUndefined: Self = StObject.set(x, "pemCsr", js.undefined)
    
    inline def setRevocationDetails(value: RevocationDetails): Self = StObject.set(x, "revocationDetails", value.asInstanceOf[js.Any])
    
    inline def setRevocationDetailsUndefined: Self = StObject.set(x, "revocationDetails", js.undefined)
    
    inline def setSubjectMode(value: String): Self = StObject.set(x, "subjectMode", value.asInstanceOf[js.Any])
    
    inline def setSubjectModeUndefined: Self = StObject.set(x, "subjectMode", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
