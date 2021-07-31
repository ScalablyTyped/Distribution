package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  /** The service control environment to use. If empty, no control plane feature (like quota and billing) will be enabled. */
  var environment: js.UndefOr[String] = js.undefined
}
object Control {
  
  @scala.inline
  def apply(): Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
