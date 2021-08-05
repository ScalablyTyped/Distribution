package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  /** The service control environment to use. If empty, no control plane feature (like quota and billing) will be enabled. */
  var environment: js.UndefOr[String] = js.undefined
}
object Control {
  
  inline def apply(): Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Control]
  }
  
  extension [Self <: Control](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
