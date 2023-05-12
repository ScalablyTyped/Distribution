package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pullrequest extends StObject {
  
  /** @description Path to devcontainer.json config to use for this codespace */
  var devcontainer_path: js.UndefOr[String] = js.undefined
  
  /** @description Time in minutes before codespace stops from inactivity */
  var idle_timeout_minutes: js.UndefOr[Double] = js.undefined
  
  /** @description The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. */
  var location: js.UndefOr[String] = js.undefined
  
  /** @description Machine type to use for this codespace */
  var machine: js.UndefOr[String] = js.undefined
  
  /** @description Pull request number for this codespace */
  var pull_request: Pullrequestnumber
  
  /** @description Working directory for this codespace */
  var working_directory: js.UndefOr[String] = js.undefined
}
object Pullrequest {
  
  inline def apply(pull_request: Pullrequestnumber): Pullrequest = {
    val __obj = js.Dynamic.literal(pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullrequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pullrequest] (val x: Self) extends AnyVal {
    
    inline def setDevcontainer_path(value: String): Self = StObject.set(x, "devcontainer_path", value.asInstanceOf[js.Any])
    
    inline def setDevcontainer_pathUndefined: Self = StObject.set(x, "devcontainer_path", js.undefined)
    
    inline def setIdle_timeout_minutes(value: Double): Self = StObject.set(x, "idle_timeout_minutes", value.asInstanceOf[js.Any])
    
    inline def setIdle_timeout_minutesUndefined: Self = StObject.set(x, "idle_timeout_minutes", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineUndefined: Self = StObject.set(x, "machine", js.undefined)
    
    inline def setPull_request(value: Pullrequestnumber): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setWorking_directory(value: String): Self = StObject.set(x, "working_directory", value.asInstanceOf[js.Any])
    
    inline def setWorking_directoryUndefined: Self = StObject.set(x, "working_directory", js.undefined)
  }
}
