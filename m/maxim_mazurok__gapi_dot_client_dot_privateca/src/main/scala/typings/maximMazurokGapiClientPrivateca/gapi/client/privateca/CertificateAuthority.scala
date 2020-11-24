package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthority extends js.Object {
  
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
  implicit class CertificateAuthorityOps[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    
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
    def setAccessUrls(value: AccessUrls): Self = this.set("accessUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessUrls: Self = this.set("accessUrls", js.undefined)
    
    @scala.inline
    def setCaCertificateDescriptionsVarargs(value: CertificateDescription*): Self = this.set("caCertificateDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCaCertificateDescriptions(value: js.Array[CertificateDescription]): Self = this.set("caCertificateDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificateDescriptions: Self = this.set("caCertificateDescriptions", js.undefined)
    
    @scala.inline
    def setCertificatePolicy(value: CertificateAuthorityPolicy): Self = this.set("certificatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePolicy: Self = this.set("certificatePolicy", js.undefined)
    
    @scala.inline
    def setConfig(value: CertificateConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeleteTime(value: String): Self = this.set("deleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTime: Self = this.set("deleteTime", js.undefined)
    
    @scala.inline
    def setGcsBucket(value: String): Self = this.set("gcsBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsBucket: Self = this.set("gcsBucket", js.undefined)
    
    @scala.inline
    def setIssuingOptions(value: IssuingOptions): Self = this.set("issuingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuingOptions: Self = this.set("issuingOptions", js.undefined)
    
    @scala.inline
    def setKeySpec(value: KeyVersionSpec): Self = this.set("keySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySpec: Self = this.set("keySpec", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateAuthority with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPemCaCertificatesVarargs(value: String*): Self = this.set("pemCaCertificates", js.Array(value :_*))
    
    @scala.inline
    def setPemCaCertificates(value: js.Array[String]): Self = this.set("pemCaCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCaCertificates: Self = this.set("pemCaCertificates", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSubordinateConfig(value: SubordinateConfig): Self = this.set("subordinateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubordinateConfig: Self = this.set("subordinateConfig", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
