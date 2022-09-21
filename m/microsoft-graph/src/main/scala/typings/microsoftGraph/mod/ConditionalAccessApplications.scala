package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessApplications extends StObject {
  
  /**
    * Can be one of the following: The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the
    * list of apps included in Office365, see Conditional Access target apps: Office 365
    */
  var excludeApplications: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Can be one of the following: The list of client IDs (appId) the policy applies to, unless explicitly excluded (in
    * excludeApplications) All Office365 - For the list of apps included in Office365, see Conditional Access target apps:
    * Office 365
    */
  var includeApplications: js.UndefOr[js.Array[String]] = js.undefined
  
  var includeAuthenticationContextClassReferences: js.UndefOr[js.Array[String]] = js.undefined
  
  // User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
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
    
    inline def setExcludeApplicationsVarargs(value: String*): Self = StObject.set(x, "excludeApplications", js.Array(value*))
    
    inline def setIncludeApplications(value: js.Array[String]): Self = StObject.set(x, "includeApplications", value.asInstanceOf[js.Any])
    
    inline def setIncludeApplicationsUndefined: Self = StObject.set(x, "includeApplications", js.undefined)
    
    inline def setIncludeApplicationsVarargs(value: String*): Self = StObject.set(x, "includeApplications", js.Array(value*))
    
    inline def setIncludeAuthenticationContextClassReferences(value: js.Array[String]): Self = StObject.set(x, "includeAuthenticationContextClassReferences", value.asInstanceOf[js.Any])
    
    inline def setIncludeAuthenticationContextClassReferencesUndefined: Self = StObject.set(x, "includeAuthenticationContextClassReferences", js.undefined)
    
    inline def setIncludeAuthenticationContextClassReferencesVarargs(value: String*): Self = StObject.set(x, "includeAuthenticationContextClassReferences", js.Array(value*))
    
    inline def setIncludeUserActions(value: js.Array[String]): Self = StObject.set(x, "includeUserActions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUserActionsUndefined: Self = StObject.set(x, "includeUserActions", js.undefined)
    
    inline def setIncludeUserActionsVarargs(value: String*): Self = StObject.set(x, "includeUserActions", js.Array(value*))
  }
}
