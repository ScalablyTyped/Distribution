package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationInfo extends js.Object {
  
  /** The authority selector specified by the requestor, if any. It is not guaranteed that the principal was allowed to use this authority. */
  var authoritySelector: js.UndefOr[String] = js.native
  
  /**
    * The email address of the authenticated user (or service account on behalf of third party principal) making the request. For third party identity callers, the `principal_subject`
    * field is populated instead of this field. For privacy reasons, the principal email address is sometimes redacted. For more information, see [Caller identities in audit
    * logs](https://cloud.google.com/logging/docs/audit#user-id).
    */
  var principalEmail: js.UndefOr[String] = js.native
  
  /** String representation of identity of requesting party. Populated for both first and third party identities. */
  var principalSubject: js.UndefOr[String] = js.native
  
  /**
    * Identity delegation history of an authenticated service account that makes the request. It contains information on the real authorities that try to access GCP resources by
    * delegating on a service account. When multiple authorities present, they are guaranteed to be sorted based on the original ordering of the identity delegation events.
    */
  var serviceAccountDelegationInfo: js.UndefOr[js.Array[ServiceAccountDelegationInfo]] = js.native
  
  /**
    * The name of the service account key used to create or exchange credentials for authenticating the service account making the request. This is a scheme-less URI full resource name.
    * For example: "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
    */
  var serviceAccountKeyName: js.UndefOr[String] = js.native
  
  /**
    * The third party identification (if any) of the authenticated user making the request. When the JSON object represented here has a proto equivalent, the proto name will be indicated
    * in the `@type` property.
    */
  var thirdPartyPrincipal: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.AuthenticationInfo with TopLevel[js.Any]
  ] = js.native
}
object AuthenticationInfo {
  
  @scala.inline
  def apply(): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationInfo]
  }
  
  @scala.inline
  implicit class AuthenticationInfoOps[Self <: AuthenticationInfo] (val x: Self) extends AnyVal {
    
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
    def setAuthoritySelector(value: String): Self = this.set("authoritySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoritySelector: Self = this.set("authoritySelector", js.undefined)
    
    @scala.inline
    def setPrincipalEmail(value: String): Self = this.set("principalEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalEmail: Self = this.set("principalEmail", js.undefined)
    
    @scala.inline
    def setPrincipalSubject(value: String): Self = this.set("principalSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalSubject: Self = this.set("principalSubject", js.undefined)
    
    @scala.inline
    def setServiceAccountDelegationInfoVarargs(value: ServiceAccountDelegationInfo*): Self = this.set("serviceAccountDelegationInfo", js.Array(value :_*))
    
    @scala.inline
    def setServiceAccountDelegationInfo(value: js.Array[ServiceAccountDelegationInfo]): Self = this.set("serviceAccountDelegationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountDelegationInfo: Self = this.set("serviceAccountDelegationInfo", js.undefined)
    
    @scala.inline
    def setServiceAccountKeyName(value: String): Self = this.set("serviceAccountKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccountKeyName: Self = this.set("serviceAccountKeyName", js.undefined)
    
    @scala.inline
    def setThirdPartyPrincipal(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.AuthenticationInfo with TopLevel[js.Any]
    ): Self = this.set("thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyPrincipal: Self = this.set("thirdPartyPrincipal", js.undefined)
  }
}
