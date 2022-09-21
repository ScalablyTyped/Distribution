package typings.openfin

import typings.openfin.anon.FnCall
import typings.openfin.channelChannelMod.ChannelBase
import typings.openfin.identityMod.Identity
import typings.openfin.shapesIdentityMod.ClientIdentity
import typings.openfin.shapesIdentityMod.ProviderIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("openfin/_v2/api/interappbus/channel/provider", "ChannelProvider")
  @js.native
  open class ChannelProvider protected () extends ChannelBase {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
    
    /* private */ var connectListener: Any = js.native
    
    var connections: js.Array[ClientIdentity] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    /* private */ var disconnectListener: Any = js.native
    
    def dispatch(to: Identity, action: String): js.Promise[Any] = js.native
    def dispatch(to: Identity, action: String, payload: Any): js.Promise[Any] = js.native
    
    def onConnection(listener: ConnectionListener): Unit = js.native
    
    def onDisconnection(listener: DisconnectionListener): Unit = js.native
    
    def processConnection(senderId: Identity, payload: Any): js.Promise[Any] = js.native
    
    def publish(action: String, payload: Any): js.Array[js.Promise[Any]] = js.native
  }
  
  type ConnectionListener = js.Function2[/* identity */ Identity, /* connectionMessage */ js.UndefOr[Any], Any]
  
  type DisconnectionListener = js.Function1[/* identity */ Identity, Any]
}
