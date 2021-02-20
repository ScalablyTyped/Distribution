package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatusResponse extends StObject {
  
  /** Client configs for the clients specified in the ClientStatusRequest. */
  var config: js.UndefOr[js.Array[ClientConfig]] = js.native
}
object ClientStatusResponse {
  
  @scala.inline
  def apply(): ClientStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStatusResponse]
  }
  
  @scala.inline
  implicit class ClientStatusResponseMutableBuilder[Self <: ClientStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Array[ClientConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setConfigVarargs(value: ClientConfig*): Self = StObject.set(x, "config", js.Array(value :_*))
  }
}
