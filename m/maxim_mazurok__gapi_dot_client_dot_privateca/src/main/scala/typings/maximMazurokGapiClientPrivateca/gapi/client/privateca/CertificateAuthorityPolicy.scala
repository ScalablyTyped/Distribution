package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthorityPolicy extends StObject {
  
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
  implicit class CertificateAuthorityPolicyMutableBuilder[Self <: CertificateAuthorityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedCommonNames(value: js.Array[String]): Self = StObject.set(x, "allowedCommonNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCommonNamesUndefined: Self = StObject.set(x, "allowedCommonNames", js.undefined)
    
    @scala.inline
    def setAllowedCommonNamesVarargs(value: String*): Self = StObject.set(x, "allowedCommonNames", js.Array(value :_*))
    
    @scala.inline
    def setAllowedConfigList(value: AllowedConfigList): Self = StObject.set(x, "allowedConfigList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedConfigListUndefined: Self = StObject.set(x, "allowedConfigList", js.undefined)
    
    @scala.inline
    def setAllowedIssuanceModes(value: IssuanceModes): Self = StObject.set(x, "allowedIssuanceModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedIssuanceModesUndefined: Self = StObject.set(x, "allowedIssuanceModes", js.undefined)
    
    @scala.inline
    def setAllowedLocationsAndOrganizations(value: js.Array[Subject]): Self = StObject.set(x, "allowedLocationsAndOrganizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedLocationsAndOrganizationsUndefined: Self = StObject.set(x, "allowedLocationsAndOrganizations", js.undefined)
    
    @scala.inline
    def setAllowedLocationsAndOrganizationsVarargs(value: Subject*): Self = StObject.set(x, "allowedLocationsAndOrganizations", js.Array(value :_*))
    
    @scala.inline
    def setAllowedSans(value: AllowedSubjectAltNames): Self = StObject.set(x, "allowedSans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedSansUndefined: Self = StObject.set(x, "allowedSans", js.undefined)
    
    @scala.inline
    def setMaximumLifetime(value: String): Self = StObject.set(x, "maximumLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLifetimeUndefined: Self = StObject.set(x, "maximumLifetime", js.undefined)
    
    @scala.inline
    def setOverwriteConfigValues(value: ReusableConfigWrapper): Self = StObject.set(x, "overwriteConfigValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteConfigValuesUndefined: Self = StObject.set(x, "overwriteConfigValues", js.undefined)
  }
}
