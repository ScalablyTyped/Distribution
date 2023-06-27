package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizedactornames extends StObject {
  
  var admin_enforced: js.UndefOr[`524`] = js.undefined
  
  var authorized_actor_names: js.UndefOr[FromArray] = js.undefined
  
  var authorized_actors_only: js.UndefOr[`524`] = js.undefined
  
  var authorized_dismissal_actors_only: js.UndefOr[`524`] = js.undefined
  
  var linear_history_requirement_enforcement_level: js.UndefOr[`525`] = js.undefined
  
  var required_status_checks: js.UndefOr[FromArray] = js.undefined
  
  var required_status_checks_enforcement_level: js.UndefOr[`525`] = js.undefined
}
object Authorizedactornames {
  
  inline def apply(): Authorizedactornames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authorizedactornames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authorizedactornames] (val x: Self) extends AnyVal {
    
    inline def setAdmin_enforced(value: `524`): Self = StObject.set(x, "admin_enforced", value.asInstanceOf[js.Any])
    
    inline def setAdmin_enforcedUndefined: Self = StObject.set(x, "admin_enforced", js.undefined)
    
    inline def setAuthorized_actor_names(value: FromArray): Self = StObject.set(x, "authorized_actor_names", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_actor_namesUndefined: Self = StObject.set(x, "authorized_actor_names", js.undefined)
    
    inline def setAuthorized_actors_only(value: `524`): Self = StObject.set(x, "authorized_actors_only", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_actors_onlyUndefined: Self = StObject.set(x, "authorized_actors_only", js.undefined)
    
    inline def setAuthorized_dismissal_actors_only(value: `524`): Self = StObject.set(x, "authorized_dismissal_actors_only", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_dismissal_actors_onlyUndefined: Self = StObject.set(x, "authorized_dismissal_actors_only", js.undefined)
    
    inline def setLinear_history_requirement_enforcement_level(value: `525`): Self = StObject.set(x, "linear_history_requirement_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setLinear_history_requirement_enforcement_levelUndefined: Self = StObject.set(x, "linear_history_requirement_enforcement_level", js.undefined)
    
    inline def setRequired_status_checks(value: FromArray): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksUndefined: Self = StObject.set(x, "required_status_checks", js.undefined)
    
    inline def setRequired_status_checks_enforcement_level(value: `525`): Self = StObject.set(x, "required_status_checks_enforcement_level", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checks_enforcement_levelUndefined: Self = StObject.set(x, "required_status_checks_enforcement_level", js.undefined)
  }
}
