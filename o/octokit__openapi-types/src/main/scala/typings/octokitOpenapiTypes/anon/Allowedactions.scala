package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.local_only
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowedactions extends StObject {
  
  var allowed_actions: js.UndefOr[all | local_only | selected] = js.undefined
  
  var enabled_organizations: all | none_ | selected
  
  var selected_actions_url: js.UndefOr[String] = js.undefined
  
  /** @description The API URL to use to get or set the selected organizations that are allowed to run GitHub Actions, when `enabled_organizations` is set to `selected`. */
  var selected_organizations_url: js.UndefOr[String] = js.undefined
}
object Allowedactions {
  
  inline def apply(enabled_organizations: all | none_ | selected): Allowedactions = {
    val __obj = js.Dynamic.literal(enabled_organizations = enabled_organizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowedactions]
  }
  
  extension [Self <: Allowedactions](x: Self) {
    
    inline def setAllowed_actions(value: all | local_only | selected): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_organizations(value: all | none_ | selected): Self = StObject.set(x, "enabled_organizations", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_url(value: String): Self = StObject.set(x, "selected_actions_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_actions_urlUndefined: Self = StObject.set(x, "selected_actions_url", js.undefined)
    
    inline def setSelected_organizations_url(value: String): Self = StObject.set(x, "selected_organizations_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_organizations_urlUndefined: Self = StObject.set(x, "selected_organizations_url", js.undefined)
  }
}
