package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatusRequest extends StObject {
  
  /** Management server can use these match criteria to identify clients. The match follows OR semantics. */
  var nodeMatchers: js.UndefOr[js.Array[NodeMatcher]] = js.native
}
object ClientStatusRequest {
  
  @scala.inline
  def apply(): ClientStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStatusRequest]
  }
  
  @scala.inline
  implicit class ClientStatusRequestMutableBuilder[Self <: ClientStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeMatchers(value: js.Array[NodeMatcher]): Self = StObject.set(x, "nodeMatchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeMatchersUndefined: Self = StObject.set(x, "nodeMatchers", js.undefined)
    
    @scala.inline
    def setNodeMatchersVarargs(value: NodeMatcher*): Self = StObject.set(x, "nodeMatchers", js.Array(value :_*))
  }
}
