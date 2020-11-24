package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountDelegationInfo extends js.Object {
  
  /** First party (Google) identity as the real authority. */
  var firstPartyPrincipal: js.UndefOr[FirstPartyPrincipal] = js.native
  
  /** A string representing the principal_subject associated with the identity. See go/3pical for more info on how principal_subject is formatted. */
  var principalSubject: js.UndefOr[String] = js.native
  
  /** Third party identity as the real authority. */
  var thirdPartyPrincipal: js.UndefOr[ThirdPartyPrincipal] = js.native
}
object ServiceAccountDelegationInfo {
  
  @scala.inline
  def apply(): ServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountDelegationInfo]
  }
  
  @scala.inline
  implicit class ServiceAccountDelegationInfoOps[Self <: ServiceAccountDelegationInfo] (val x: Self) extends AnyVal {
    
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
    def setFirstPartyPrincipal(value: FirstPartyPrincipal): Self = this.set("firstPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPartyPrincipal: Self = this.set("firstPartyPrincipal", js.undefined)
    
    @scala.inline
    def setPrincipalSubject(value: String): Self = this.set("principalSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalSubject: Self = this.set("principalSubject", js.undefined)
    
    @scala.inline
    def setThirdPartyPrincipal(value: ThirdPartyPrincipal): Self = this.set("thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyPrincipal: Self = this.set("thirdPartyPrincipal", js.undefined)
  }
}
