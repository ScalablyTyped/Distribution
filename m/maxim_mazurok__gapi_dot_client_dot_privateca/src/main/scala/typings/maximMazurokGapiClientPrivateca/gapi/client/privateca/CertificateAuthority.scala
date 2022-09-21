package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthority extends StObject {
  
  /** Output only. URLs for accessing content published by this CA, such as the CA certificate and CRLs. */
  var accessUrls: js.UndefOr[AccessUrls] = js.undefined
  
  /** Output only. A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root. */
  var caCertificateDescriptions: js.UndefOr[js.Array[CertificateDescription]] = js.undefined
  
  /** Required. Immutable. The config used to create a self-signed X.509 certificate or CSR. */
  var config: js.UndefOr[CertificateConfig] = js.undefined
  
  /** Output only. The time at which this CertificateAuthority was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any
    * prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed
    * bucket will be created.
    */
  var gcsBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign
    * the self-signed CA certificate. Otherwise, it is used to sign a CSR.
    */
  var keySpec: js.UndefOr[KeyVersionSpec] = js.undefined
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateAuthority & TopLevel[Any]
  ] = js.undefined
  
  /** Required. Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. */
  var lifetime: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name for this CertificateAuthority in the format `projects/ *‍/locations/ *‍/caPools/ *‍/certificateAuthorities/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element
    * (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
    */
  var pemCaCertificates: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The State for this CertificateAuthority. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this
    * CertificateAuthority must continue to validate.
    */
  var subordinateConfig: js.UndefOr[SubordinateConfig] = js.undefined
  
  /** Output only. The CaPool.Tier of the CaPool that includes this CertificateAuthority. */
  var tier: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The Type of this CertificateAuthority. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this CertificateAuthority was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object CertificateAuthority {
  
  inline def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  
  extension [Self <: CertificateAuthority](x: Self) {
    
    inline def setAccessUrls(value: AccessUrls): Self = StObject.set(x, "accessUrls", value.asInstanceOf[js.Any])
    
    inline def setAccessUrlsUndefined: Self = StObject.set(x, "accessUrls", js.undefined)
    
    inline def setCaCertificateDescriptions(value: js.Array[CertificateDescription]): Self = StObject.set(x, "caCertificateDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateDescriptionsUndefined: Self = StObject.set(x, "caCertificateDescriptions", js.undefined)
    
    inline def setCaCertificateDescriptionsVarargs(value: CertificateDescription*): Self = StObject.set(x, "caCertificateDescriptions", js.Array(value*))
    
    inline def setConfig(value: CertificateConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setGcsBucket(value: String): Self = StObject.set(x, "gcsBucket", value.asInstanceOf[js.Any])
    
    inline def setGcsBucketUndefined: Self = StObject.set(x, "gcsBucket", js.undefined)
    
    inline def setKeySpec(value: KeyVersionSpec): Self = StObject.set(x, "keySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "keySpec", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateAuthority & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPemCaCertificates(value: js.Array[String]): Self = StObject.set(x, "pemCaCertificates", value.asInstanceOf[js.Any])
    
    inline def setPemCaCertificatesUndefined: Self = StObject.set(x, "pemCaCertificates", js.undefined)
    
    inline def setPemCaCertificatesVarargs(value: String*): Self = StObject.set(x, "pemCaCertificates", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubordinateConfig(value: SubordinateConfig): Self = StObject.set(x, "subordinateConfig", value.asInstanceOf[js.Any])
    
    inline def setSubordinateConfigUndefined: Self = StObject.set(x, "subordinateConfig", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
