package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceExecResource extends StObject {
  
  /** What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce. */
  var enforce: js.UndefOr[OSPolicyResourceExecResourceExec] = js.undefined
  
  /**
    * Required. What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any
    * other exit code indicates a failure running validate.
    */
  var validate: js.UndefOr[OSPolicyResourceExecResourceExec] = js.undefined
}
object OSPolicyResourceExecResource {
  
  inline def apply(): OSPolicyResourceExecResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceExecResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyResourceExecResource] (val x: Self) extends AnyVal {
    
    inline def setEnforce(value: OSPolicyResourceExecResourceExec): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setValidate(value: OSPolicyResourceExecResourceExec): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
