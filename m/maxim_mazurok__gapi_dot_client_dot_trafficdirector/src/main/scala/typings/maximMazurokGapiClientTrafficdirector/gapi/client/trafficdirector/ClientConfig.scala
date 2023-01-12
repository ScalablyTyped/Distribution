package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfig extends StObject {
  
  /** Node for a particular client. */
  var node: js.UndefOr[Node] = js.undefined
  
  var xdsConfig: js.UndefOr[js.Array[PerXdsConfig]] = js.undefined
}
object ClientConfig {
  
  inline def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setXdsConfig(value: js.Array[PerXdsConfig]): Self = StObject.set(x, "xdsConfig", value.asInstanceOf[js.Any])
    
    inline def setXdsConfigUndefined: Self = StObject.set(x, "xdsConfig", js.undefined)
    
    inline def setXdsConfigVarargs(value: PerXdsConfig*): Self = StObject.set(x, "xdsConfig", js.Array(value*))
  }
}
