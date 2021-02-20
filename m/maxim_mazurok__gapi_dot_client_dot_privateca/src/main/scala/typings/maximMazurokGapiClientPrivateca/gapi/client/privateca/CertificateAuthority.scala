package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthority extends StObject {
  
  /** Output only. URLs for accessing content published by this CA, such as the CA certificate and CRLs. */
  var accessUrls: js.UndefOr[AccessUrls] = js.native
  
  /** Output only. A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root. */
  var caCertificateDescriptions: js.UndefOr[js.Array[CertificateDescription]] = js.native
  
  /** Optional. The CertificateAuthorityPolicy to enforce when issuing Certificates from this CertificateAuthority. */
  var certificatePolicy: js.UndefOr[CertificateAuthorityPolicy] = js.native
  
  /** Required. Immutable. The config used to create a self-signed X.509 certificate or CSR. */
  var config: js.UndefOr[CertificateConfig] = js.native
  
  /** Output only. The time at which this CertificateAuthority was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this CertificateAuthority will be deleted, if scheduled for deletion. */
  var deleteTime: js.UndefOr[String] = js.native
  
  /**
    * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any
    * prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed
    * bucket will be created.
    */
  var gcsBucket: js.UndefOr[String] = js.native
  
  /** Optional. The IssuingOptions to follow when issuing Certificates from this CertificateAuthority. */
  var issuingOptions: js.UndefOr[IssuingOptions] = js.native
  
  /**
    * Required. Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign
    * the self-signed CA certificate. Otherwise, it is used to sign a CSR.
    */
  var keySpec: js.UndefOr[KeyVersionSpec] = js.native
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateAuthority with TopLevel[js.Any]
  ] = js.native
  
  /** Required. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. */
  var lifetime: js.UndefOr[String] = js.native
  
  /** Output only. The resource name for this CertificateAuthority in the format `projects/∗/locations/∗/certificateAuthorities/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element
    * (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
    */
  var pemCaCertificates: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. The State for this CertificateAuthority. */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this
    * CertificateAuthority must continue to validate.
    */
  var subordinateConfig: js.UndefOr[SubordinateConfig] = js.native
  
  /** Required. Immutable. The Tier of this CertificateAuthority. */
  var tier: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The Type of this CertificateAuthority. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this CertificateAuthority was updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object CertificateAuthority {
  
  @scala.inline
  def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  
  @scala.inline
  implicit class CertificateAuthorityMutableBuilder[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessUrls(value: AccessUrls): Self = StObject.set(x, "accessUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUrlsUndefined: Self = StObject.set(x, "accessUrls", js.undefined)
    
    @scala.inline
    def setCaCertificateDescriptions(value: js.Array[CertificateDescription]): Self = StObject.set(x, "caCertificateDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateDescriptionsUndefined: Self = StObject.set(x, "caCertificateDescriptions", js.undefined)
    
    @scala.inline
    def setCaCertificateDescriptionsVarargs(value: CertificateDescription*): Self = StObject.set(x, "caCertificateDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCertificatePolicy(value: CertificateAuthorityPolicy): Self = StObject.set(x, "certificatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePolicyUndefined: Self = StObject.set(x, "certificatePolicy", js.undefined)
    
    @scala.inline
    def setConfig(value: CertificateConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    @scala.inline
    def setGcsBucket(value: String): Self = StObject.set(x, "gcsBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsBucketUndefined: Self = StObject.set(x, "gcsBucket", js.undefined)
    
    @scala.inline
    def setIssuingOptions(value: IssuingOptions): Self = StObject.set(x, "issuingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingOptionsUndefined: Self = StObject.set(x, "issuingOptions", js.undefined)
    
    @scala.inline
    def setKeySpec(value: KeyVersionSpec): Self = StObject.set(x, "keySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySpecUndefined: Self = StObject.set(x, "keySpec", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateAuthority with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPemCaCertificates(value: js.Array[String]): Self = StObject.set(x, "pemCaCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemCaCertificatesUndefined: Self = StObject.set(x, "pemCaCertificates", js.undefined)
    
    @scala.inline
    def setPemCaCertificatesVarargs(value: String*): Self = StObject.set(x, "pemCaCertificates", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubordinateConfig(value: SubordinateConfig): Self = StObject.set(x, "subordinateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubordinateConfigUndefined: Self = StObject.set(x, "subordinateConfig", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
