package typings.passportAzureAd.bearerStrategyMod

import typings.passportAzureAd.commonMod.IBaseStrategyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBearerStrategyOption extends IBaseStrategyOption {
  
  var allowMultiAudiencesInToken: js.UndefOr[Boolean] = js.native
  
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  
  var policyName: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[js.Array[String]] = js.native
}
object IBearerStrategyOption {
  
  @scala.inline
  def apply(clientID: String, identityMetadata: String): IBearerStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBearerStrategyOption]
  }
  
  @scala.inline
  implicit class IBearerStrategyOptionOps[Self <: IBearerStrategyOption] (val x: Self) extends AnyVal {
    
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
    def setAllowMultiAudiencesInToken(value: Boolean): Self = this.set("allowMultiAudiencesInToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiAudiencesInToken: Self = this.set("allowMultiAudiencesInToken", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setPolicyName(value: String): Self = this.set("policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
