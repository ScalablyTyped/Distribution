package typings.openfin

import typings.openfin.anon.FnCall
import typings.openfin.channelChannelMod.ChannelBase
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("openfin/_v2/api/interappbus/channel/client", "ChannelClient")
  @js.native
  class ChannelClient protected () extends ChannelBase {
    def this(routingInfo: RoutingInfo, send: FnCall, clientMap: Map[String, ChannelClient]) = this()
    
    /* private */ var clientMap: js.Any = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    /* private */ var disconnectListener: js.Any = js.native
    
    def dispatch(action: String): js.Promise[js.Any] = js.native
    def dispatch(action: String, payload: js.Any): js.Promise[js.Any] = js.native
    
    /* private */ var endpointId: js.Any = js.native
    
    def onDisconnection(listener: DisconnectionListener): Unit = js.native
    
    def providerIdentity: ProviderIdentity = js.native
  }
  
  type DisconnectionListener = js.Function1[/* providerIdentity */ ProviderIdentity, js.Any]
  
  trait RoutingInfo
    extends StObject
       with ProviderIdentity {
    
    var endpointId: String
  }
  object RoutingInfo {
    
    inline def apply(endpointId: String, uuid: String): RoutingInfo = {
      val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingInfo]
    }
    
    extension [Self <: RoutingInfo](x: Self) {
      
      inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    }
  }
}
