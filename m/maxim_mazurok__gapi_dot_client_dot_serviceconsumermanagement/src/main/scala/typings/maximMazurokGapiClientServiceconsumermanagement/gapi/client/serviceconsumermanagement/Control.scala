package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  /**
    * The service controller environment to use. If empty, no control plane feature (like quota and billing) will be enabled. The recommended value for most services is
    * servicecontrol.googleapis.com
    */
  var environment: js.UndefOr[String] = js.undefined
}
object Control {
  
  inline def apply(): Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
