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
  class Channel protected () extends EmitterBase[ChannelEvents] {
    def this(wire: default) = this()
    
    /* protected */ def addChannelToClientMaps(channel: ChannelClient, channelId: String, endpointId: String): Unit = js.native
    
    /* protected */ def checkForPreviousClientConnection(channelId: String): Unit = js.native
    
    var clientMap: js.Any = js.native
    
    def connect(channelName: String): js.Promise[ChannelClient] = js.native
    def connect(channelName: String, options: ConnectOptions): js.Promise[ChannelClient] = js.native
    
    def create(channelName: String): js.Promise[ChannelProvider] = js.native
    
    var endpointIdMap: js.Any = js.native
    
    def getAllChannels(): js.Promise[js.Array[ProviderIdentity]] = js.native
    
    def onChannelConnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    def onChannelDisconnect(listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    def onmessage(msg: ChannelMessage): Boolean = js.native
    
    var processChannelConnection: js.Any = js.native
    
    var processChannelMessage: js.Any = js.native
    
    var providerMap: js.Any = js.native
    
    /* protected */ def removeChannelFromClientMaps(channelId: String, endpointId: String): Unit = js.native
    
    /* protected */ def removeChannelFromProviderMap(channelId: String): Unit = js.native
  }
  
  trait ChannelMessage
    extends StObject
       with Message[js.Any] {
    
    var ackToSender: js.Any
    
    var connectAction: Boolean
    
    var providerIdentity: ProviderIdentity
    
    var senderIdentity: Identity
  }
  object ChannelMessage {
    
    @scala.inline
    def apply(
      ackToSender: js.Any,
      action: String,
      connectAction: Boolean,
      payload: js.Any,
      providerIdentity: ProviderIdentity,
      senderIdentity: Identity
    ): ChannelMessage = {
      val __obj = js.Dynamic.literal(ackToSender = ackToSender.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], connectAction = connectAction.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], providerIdentity = providerIdentity.asInstanceOf[js.Any], senderIdentity = senderIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelMessage]
    }
    
    @scala.inline
    implicit class ChannelMessageMutableBuilder[Self <: ChannelMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckToSender(value: js.Any): Self = StObject.set(x, "ackToSender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectAction(value: Boolean): Self = StObject.set(x, "connectAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderIdentity(value: ProviderIdentity): Self = StObject.set(x, "providerIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderIdentity(value: Identity): Self = StObject.set(x, "senderIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelPayload extends StObject {
    
    var payload: Payload
  }
  object ChannelPayload {
    
    @scala.inline
    def apply(payload: Payload): ChannelPayload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelPayload]
    }
    
    @scala.inline
    implicit class ChannelPayloadMutableBuilder[Self <: ChannelPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOptions extends StObject {
    
    var payload: js.UndefOr[js.Any] = js.undefined
    
    @JSName("wait")
    var wait_FConnectOptions: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectOptions {
    
    @scala.inline
    def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
