package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientStatusRequest extends StObject {
  
  /** Management server can use these match criteria to identify clients. The match follows OR semantics. */
  var nodeMatchers: js.UndefOr[js.Array[NodeMatcher]] = js.undefined
}
object ClientStatusRequest {
  
  inline def apply(): ClientStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientStatusRequest]
  }
  
  extension [Self <: ClientStatusRequest](x: Self) {
    
    inline def setNodeMatchers(value: js.Array[NodeMatcher]): Self = StObject.set(x, "nodeMatchers", value.asInstanceOf[js.Any])
    
    inline def setNodeMatchersUndefined: Self = StObject.set(x, "nodeMatchers", js.undefined)
    
    inline def setNodeMatchersVarargs(value: NodeMatcher*): Self = StObject.set(x, "nodeMatchers", js.Array(value :_*))
  }
}
