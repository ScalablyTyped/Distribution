package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientStatusResponse extends StObject {
  
  /** Client configs for the clients specified in the ClientStatusRequest. */
  var config: js.UndefOr[js.Array[ClientConfig]] = js.undefined
}
object ClientStatusResponse {
  
  inline def apply(): ClientStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: js.Array[ClientConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfigVarargs(value: ClientConfig*): Self = StObject.set(x, "config", js.Array(value*))
  }
}
