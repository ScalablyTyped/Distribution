package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessApplications extends StObject {
  
  // The list of application IDs explicitly excluded from the policy.
  var excludeApplications: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of application IDs the policy applies to, unless explicitly excluded (in excludeApplications). Can also be set
    * to All.
    */
  var includeApplications: js.UndefOr[js.Array[String]] = js.undefined
  
  // User actions to include. For example, urn:user:registersecurityinfo
  var includeUserActions: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessApplications {
  
  @scala.inline
  def apply(): ConditionalAccessApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessApplications]
  }
  
  @scala.inline
  implicit class ConditionalAccessApplicationsMutableBuilder[Self <: ConditionalAccessApplications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeApplications(value: js.Array[String]): Self = StObject.set(x, "excludeApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeApplicationsUndefined: Self = StObject.set(x, "excludeApplications", js.undefined)
    
    @scala.inline
    def setExcludeApplicationsVarargs(value: String*): Self = StObject.set(x, "excludeApplications", js.Array(value :_*))
    
    @scala.inline
    def setIncludeApplications(value: js.Array[String]): Self = StObject.set(x, "includeApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeApplicationsUndefined: Self = StObject.set(x, "includeApplications", js.undefined)
    
    @scala.inline
    def setIncludeApplicationsVarargs(value: String*): Self = StObject.set(x, "includeApplications", js.Array(value :_*))
    
    @scala.inline
    def setIncludeUserActions(value: js.Array[String]): Self = StObject.set(x, "includeUserActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUserActionsUndefined: Self = StObject.set(x, "includeUserActions", js.undefined)
    
    @scala.inline
    def setIncludeUserActionsVarargs(value: String*): Self = StObject.set(x, "includeUserActions", js.Array(value :_*))
  }
}
