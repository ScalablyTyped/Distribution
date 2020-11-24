package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthorityPolicy extends js.Object {
  
  /**
    * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be
    * allowed for this fied. Glob patterns are also supported.
    */
  var allowedCommonNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list. */
  var allowedConfigList: js.UndefOr[AllowedConfigList] = js.native
  
  /** Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates. */
  var allowedIssuanceModes: js.UndefOr[IssuanceModes] = js.native
  
  /**
    * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any
    * value will be allowed for that field.
    */
  var allowedLocationsAndOrganizations: js.UndefOr[js.Array[Subject]] = js.native
  
  /**
    * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is
    * specified, any value will be allowed for the SubjectAltNames field.
    */
  var allowedSans: js.UndefOr[AllowedSubjectAltNames] = js.native
  
  /**
    * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate's requested maximum_lifetime, the
    * effective lifetime will be explicitly truncated.
    */
  var maximumLifetime: js.UndefOr[String] = js.native
  
  /** Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values. */
  var overwriteConfigValues: js.UndefOr[ReusableConfigWrapper] = js.native
}
object CertificateAuthorityPolicy {
  
  @scala.inline
  def apply(): CertificateAuthorityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorityPolicy]
  }
  
  @scala.inline
  implicit class CertificateAuthorityPolicyOps[Self <: CertificateAuthorityPolicy] (val x: Self) extends AnyVal {
    
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
    def setAllowedCommonNamesVarargs(value: String*): Self = this.set("allowedCommonNames", js.Array(value :_*))
    
    @scala.inline
    def setAllowedCommonNames(value: js.Array[String]): Self = this.set("allowedCommonNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedCommonNames: Self = this.set("allowedCommonNames", js.undefined)
    
    @scala.inline
    def setAllowedConfigList(value: AllowedConfigList): Self = this.set("allowedConfigList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedConfigList: Self = this.set("allowedConfigList", js.undefined)
    
    @scala.inline
    def setAllowedIssuanceModes(value: IssuanceModes): Self = this.set("allowedIssuanceModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedIssuanceModes: Self = this.set("allowedIssuanceModes", js.undefined)
    
    @scala.inline
    def setAllowedLocationsAndOrganizationsVarargs(value: Subject*): Self = this.set("allowedLocationsAndOrganizations", js.Array(value :_*))
    
    @scala.inline
    def setAllowedLocationsAndOrganizations(value: js.Array[Subject]): Self = this.set("allowedLocationsAndOrganizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedLocationsAndOrganizations: Self = this.set("allowedLocationsAndOrganizations", js.undefined)
    
    @scala.inline
    def setAllowedSans(value: AllowedSubjectAltNames): Self = this.set("allowedSans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedSans: Self = this.set("allowedSans", js.undefined)
    
    @scala.inline
    def setMaximumLifetime(value: String): Self = this.set("maximumLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLifetime: Self = this.set("maximumLifetime", js.undefined)
    
    @scala.inline
    def setOverwriteConfigValues(value: ReusableConfigWrapper): Self = this.set("overwriteConfigValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteConfigValues: Self = this.set("overwriteConfigValues", js.undefined)
  }
}
