package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Machine extends StObject {
  
  /** @description IP for location auto-detection when proxying a request */
  var client_ip: js.UndefOr[String] = js.undefined
  
  /** @description Path to devcontainer.json config to use for this codespace */
  var devcontainer_path: js.UndefOr[String] = js.undefined
  
  /** @description Display name for this codespace */
  var display_name: js.UndefOr[String] = js.undefined
  
  /** @description Time in minutes before codespace stops from inactivity */
  var idle_timeout_minutes: js.UndefOr[Double] = js.undefined
  
  /** @description Location for this codespace. Assigned by IP if not provided */
  var location: js.UndefOr[String] = js.undefined
  
  /** @description Machine type to use for this codespace */
  var machine: js.UndefOr[String] = js.undefined
  
  /** @description Whether to authorize requested permissions from devcontainer.json */
  var multi_repo_permissions_opt_out: js.UndefOr[Boolean] = js.undefined
  
  /** @description Git ref (typically a branch name) for this codespace */
  var ref: js.UndefOr[String] = js.undefined
  
  /** @description Repository id for this codespace */
  var repository_id: Double
  
  /** @description Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). */
  var retention_period_minutes: js.UndefOr[Double] = js.undefined
  
  /** @description Working directory for this codespace */
  var working_directory: js.UndefOr[String] = js.undefined
}
object Machine {
  
  inline def apply(repository_id: Double): Machine = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Machine]
  }
  
  extension [Self <: Machine](x: Self) {
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setClient_ipUndefined: Self = StObject.set(x, "client_ip", js.undefined)
    
    inline def setDevcontainer_path(value: String): Self = StObject.set(x, "devcontainer_path", value.asInstanceOf[js.Any])
    
    inline def setDevcontainer_pathUndefined: Self = StObject.set(x, "devcontainer_path", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setIdle_timeout_minutes(value: Double): Self = StObject.set(x, "idle_timeout_minutes", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeout_minutesUndefined: Self = StObject.set(x, "idle_timeout_minutes", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineUndefined: Self = StObject.set(x, "machine", js.undefined)
    
    inline def setMulti_repo_permissions_opt_out(value: Boolean): Self = StObject.set(x, "multi_repo_permissions_opt_out", value.asInstanceOf[js.Any])
    
    inline def setMulti_repo_permissions_opt_outUndefined: Self = StObject.set(x, "multi_repo_permissions_opt_out", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRetention_period_minutes(value: Double): Self = StObject.set(x, "retention_period_minutes", value.asInstanceOf[js.Any])
    
    inline def setRetention_period_minutesUndefined: Self = StObject.set(x, "retention_period_minutes", js.undefined)
    
    inline def setWorking_directory(value: String): Self = StObject.set(x, "working_directory", value.asInstanceOf[js.Any])
    
    inline def setWorking_directoryUndefined: Self = StObject.set(x, "working_directory", js.undefined)
  }
}
