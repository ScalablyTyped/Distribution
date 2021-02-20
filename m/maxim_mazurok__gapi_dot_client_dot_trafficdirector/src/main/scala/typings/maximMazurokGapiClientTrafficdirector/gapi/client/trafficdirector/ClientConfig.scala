package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig extends StObject {
  
  /** Node for a particular client. */
  var node: js.UndefOr[Node] = js.native
  
  var xdsConfig: js.UndefOr[js.Array[PerXdsConfig]] = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setXdsConfig(value: js.Array[PerXdsConfig]): Self = StObject.set(x, "xdsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXdsConfigUndefined: Self = StObject.set(x, "xdsConfig", js.undefined)
    
    @scala.inline
    def setXdsConfigVarargs(value: PerXdsConfig*): Self = StObject.set(x, "xdsConfig", js.Array(value :_*))
  }
}
