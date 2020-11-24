package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessApplications extends js.Object {
  
  // The list of application IDs explicitly excluded from the policy.
  var excludeApplications: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of application IDs the policy applies to, unless explicitly excluded (in excludeApplications). Can also be set
    * to All.
    */
  var includeApplications: js.UndefOr[js.Array[String]] = js.native
  
  // User actions to include. For example, urn:user:registersecurityinfo
  var includeUserActions: js.UndefOr[js.Array[String]] = js.native
}
object ConditionalAccessApplications {
  
  @scala.inline
  def apply(): ConditionalAccessApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessApplications]
  }
  
  @scala.inline
  implicit class ConditionalAccessApplicationsOps[Self <: ConditionalAccessApplications] (val x: Self) extends AnyVal {
    
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
    def setExcludeApplicationsVarargs(value: String*): Self = this.set("excludeApplications", js.Array(value :_*))
    
    @scala.inline
    def setExcludeApplications(value: js.Array[String]): Self = this.set("excludeApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeApplications: Self = this.set("excludeApplications", js.undefined)
    
    @scala.inline
    def setIncludeApplicationsVarargs(value: String*): Self = this.set("includeApplications", js.Array(value :_*))
    
    @scala.inline
    def setIncludeApplications(value: js.Array[String]): Self = this.set("includeApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeApplications: Self = this.set("includeApplications", js.undefined)
    
    @scala.inline
    def setIncludeUserActionsVarargs(value: String*): Self = this.set("includeUserActions", js.Array(value :_*))
    
    @scala.inline
    def setIncludeUserActions(value: js.Array[String]): Self = this.set("includeUserActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUserActions: Self = this.set("includeUserActions", js.undefined)
  }
}
