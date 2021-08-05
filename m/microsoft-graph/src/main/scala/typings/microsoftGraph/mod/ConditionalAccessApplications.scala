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
  
  inline def apply(): ConditionalAccessApplications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessApplications]
  }
  
  extension [Self <: ConditionalAccessApplications](x: Self) {
    
    inline def setExcludeApplications(value: js.Array[String]): Self = StObject.set(x, "excludeApplications", value.asInstanceOf[js.Any])
    
    inline def setExcludeApplicationsUndefined: Self = StObject.set(x, "excludeApplications", js.undefined)
    
    inline def setExcludeApplicationsVarargs(value: String*): Self = StObject.set(x, "excludeApplications", js.Array(value :_*))
    
    inline def setIncludeApplications(value: js.Array[String]): Self = StObject.set(x, "includeApplications", value.asInstanceOf[js.Any])
    
    inline def setIncludeApplicationsUndefined: Self = StObject.set(x, "includeApplications", js.undefined)
    
    inline def setIncludeApplicationsVarargs(value: String*): Self = StObject.set(x, "includeApplications", js.Array(value :_*))
    
    inline def setIncludeUserActions(value: js.Array[String]): Self = StObject.set(x, "includeUserActions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUserActionsUndefined: Self = StObject.set(x, "includeUserActions", js.undefined)
    
    inline def setIncludeUserActionsVarargs(value: String*): Self = StObject.set(x, "includeUserActions", js.Array(value :_*))
  }
}
