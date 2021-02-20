package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Apps
import typings.octokitTypes.anon.Contextsurl
import typings.octokitTypes.anon.Dismissalrestrictions
import typings.octokitTypes.anon.EnabledBoolean
import typings.octokitTypes.anon.EnabledUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateBranchProtectionResponseData extends StObject {
  
  var allow_deletions: EnabledBoolean = js.native
  
  var allow_force_pushes: EnabledBoolean = js.native
  
  var enforce_admins: EnabledUrl = js.native
  
  var required_linear_history: EnabledBoolean = js.native
  
  var required_pull_request_reviews: Dismissalrestrictions = js.native
  
  var required_status_checks: Contextsurl = js.native
  
  var restrictions: Apps = js.native
  
  var url: String = js.native
}
object ReposUpdateBranchProtectionResponseData {
  
  @scala.inline
  def apply(
    allow_deletions: EnabledBoolean,
    allow_force_pushes: EnabledBoolean,
    enforce_admins: EnabledUrl,
    required_linear_history: EnabledBoolean,
    required_pull_request_reviews: Dismissalrestrictions,
    required_status_checks: Contextsurl,
    restrictions: Apps,
    url: String
  ): ReposUpdateBranchProtectionResponseData = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposUpdateBranchProtectionResponseDataMutableBuilder[Self <: ReposUpdateBranchProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_deletions(value: EnabledBoolean): Self = StObject.set(x, "allow_deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_force_pushes(value: EnabledBoolean): Self = StObject.set(x, "allow_force_pushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforce_admins(value: EnabledUrl): Self = StObject.set(x, "enforce_admins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_linear_history(value: EnabledBoolean): Self = StObject.set(x, "required_linear_history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_pull_request_reviews(value: Dismissalrestrictions): Self = StObject.set(x, "required_pull_request_reviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_status_checks(value: Contextsurl): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictions(value: Apps): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
