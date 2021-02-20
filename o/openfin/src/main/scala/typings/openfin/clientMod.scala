package typings.openfin

import typings.openfin.anon.FnCall
import typings.openfin.channelChannelMod.ChannelBase
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("openfin/_v2/api/interappbus/channel/client", "ChannelClient")
  @js.native
  class ChannelClient protected () extends ChannelBase {
    def this(routingInfo: RoutingInfo, send: FnCall, clientMap: Map[String, ChannelClient]) = this()
    
    var clientMap: js.Any = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    var disconnectListener: js.Any = js.native
    
    def dispatch(action: String): js.Promise[_] = js.native
    def dispatch(action: String, payload: js.Any): js.Promise[_] = js.native
    
    var endpointId: js.Any = js.native
    
    def onDisconnection(listener: DisconnectionListener): Unit = js.native
    
    def providerIdentity: ProviderIdentity = js.native
  }
  
  type DisconnectionListener = js.Function1[/* providerIdentity */ ProviderIdentity, js.Any]
  
  @js.native
  trait RoutingInfo extends ProviderIdentity {
    
    var endpointId: String = js.native
  }
  object RoutingInfo {
    
    @scala.inline
    def apply(endpointId: String, uuid: String): RoutingInfo = {
      val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingInfo]
    }
    
    @scala.inline
    implicit class RoutingInfoMutableBuilder[Self <: RoutingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    }
  }
}
