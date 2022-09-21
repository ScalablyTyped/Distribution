package typings.openfin

import typings.openfin.baseMod.EmitterBase
import typings.openfin.channelMod.ChannelEvents
import typings.openfin.clientMod.ChannelClient
import typings.openfin.identityMod.Identity
import typings.openfin.providerMod.ChannelProvider
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.openfin.transportMod.Message
import typings.openfin.transportMod.Payload
import typings.openfin.transportMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interappbusChannelMod {
  
  @JSImport("openfin/_v2/api/interappbus/channel", "Channel")
  @js.native
  open class Channel protected () extends EmitterBase[ChannelEvents] {
    def this(wire: default) = this()
    
    /* protected */ def addChannelToClientMaps(channel: ChannelClient, channelId: String, endpointId: String): Unit = js.native
    
    /* protected */ def checkForPreviousClientConnection(channelId: String): Unit = js.native
    
    /* private */ var clientMap: Any = js.native
    
    def connect(channelName: String): js.Promise[ChannelClient] = js.native
    def connect(channelName: String, options: ConnectOptions): js.Promise[ChannelClient] = js.native
    
    def create(channelName: String): js.Promise[ChannelProvider] = js.native
    
    /* private */ var endpointIdMap: Any = js.native
    
    def getAllChannels(): js.Promise[js.Array[ProviderIdentity]] = js.native
    
    def onChannelConnect(listener: js.Function1[/* repeated */ Any, Unit]): js.Promise[Unit] = js.native
    
    def onChannelDisconnect(listener: js.Function1[/* repeated */ Any, Unit]): js.Promise[Unit] = js.native
    
    def onmessage(msg: ChannelMessage): Boolean = js.native
    
    /* private */ var processChannelConnection: Any = js.native
    
    /* private */ var processChannelMessage: Any = js.native
    
    /* private */ var providerMap: Any = js.native
    
    /* protected */ def removeChannelFromClientMaps(channelId: String, endpointId: String): Unit = js.native
    
    /* protected */ def removeChannelFromProviderMap(channelId: String): Unit = js.native
  }
  
  trait ChannelMessage
    extends StObject
       with Message[Any] {
    
    var ackToSender: Any
    
    var connectAction: Boolean
    
    var providerIdentity: ProviderIdentity
    
    var senderIdentity: Identity
  }
  object ChannelMessage {
    
    inline def apply(
      ackToSender: Any,
      action: String,
      connectAction: Boolean,
      payload: Any,
      providerIdentity: ProviderIdentity,
      senderIdentity: Identity
    ): ChannelMessage = {
      val __obj = js.Dynamic.literal(ackToSender = ackToSender.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], connectAction = connectAction.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], providerIdentity = providerIdentity.asInstanceOf[js.Any], senderIdentity = senderIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelMessage]
    }
    
    extension [Self <: ChannelMessage](x: Self) {
      
      inline def setAckToSender(value: Any): Self = StObject.set(x, "ackToSender", value.asInstanceOf[js.Any])
      
      inline def setConnectAction(value: Boolean): Self = StObject.set(x, "connectAction", value.asInstanceOf[js.Any])
      
      inline def setProviderIdentity(value: ProviderIdentity): Self = StObject.set(x, "providerIdentity", value.asInstanceOf[js.Any])
      
      inline def setSenderIdentity(value: Identity): Self = StObject.set(x, "senderIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelPayload extends StObject {
    
    var payload: Payload
  }
  object ChannelPayload {
    
    inline def apply(payload: Payload): ChannelPayload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPayload]
    }
    
    extension [Self <: ChannelPayload](x: Self) {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOptions extends StObject {
    
    var payload: js.UndefOr[Any] = js.undefined
    
    @JSName("wait")
    var wait_FConnectOptions: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
