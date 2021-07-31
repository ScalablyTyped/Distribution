package typings.openfin

import typings.openfin.anon.FnCall
import typings.openfin.identityMod.Identity
import typings.openfin.openfinBooleans.`true`
import typings.openfin.openfinStrings.`request-external-authorization`
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.openfin.transportMod.AuthorizationPayload
import typings.openfin.transportMod.Message
import typings.openfin.transportMod.Payload
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelChannelMod {
  
  @JSImport("openfin/_v2/api/interappbus/channel/channel", "ChannelBase")
  @js.native
  class ChannelBase protected () extends StObject {
    def this(
      providerIdentity: ProviderIdentity,
      send: FnCall,
      channelProtectedMap: WeakMap[ChannelBase, ProtectedItems]
    ) = this()
    
    def afterAction(func: Action): Unit = js.native
    
    def beforeAction(func: Action): Unit = js.native
    
    def defaultAction(): js.Any = js.native
    def defaultAction(action: String): js.Any = js.native
    def defaultAction(action: String, payload: js.Any): js.Any = js.native
    def defaultAction(action: String, payload: js.Any, senderIdentity: ProviderIdentity): js.Any = js.native
    def defaultAction(action: String, payload: Unit, senderIdentity: ProviderIdentity): js.Any = js.native
    def defaultAction(action: Unit, payload: js.Any): js.Any = js.native
    def defaultAction(action: Unit, payload: js.Any, senderIdentity: ProviderIdentity): js.Any = js.native
    def defaultAction(action: Unit, payload: Unit, senderIdentity: ProviderIdentity): js.Any = js.native
    
    var defaultSet: js.Any = js.native
    
    var errorMiddleware: js.Any = js.native
    
    def onError(func: js.Function3[/* action */ String, /* error */ js.Any, /* id */ Identity, js.Any]): Unit = js.native
    
    var postAction: js.Any = js.native
    
    var preAction: js.Any = js.native
    
    def processAction(action: String, payload: js.Any, senderIdentity: ProviderIdentity): js.Promise[js.Any] = js.native
    
    def register(topic: String, listener: Action): Boolean = js.native
    
    def remove(action: String): Unit = js.native
    
    /* protected */ def removeChannel(mapKey: String): Unit = js.native
    /* protected */ def removeChannel(mapKey: String, endpointId: String): Unit = js.native
    
    def setDefaultAction(
      func: js.Function3[
          /* action */ js.UndefOr[String], 
          /* payload */ js.UndefOr[js.Any], 
          /* senderIdentity */ js.UndefOr[ProviderIdentity], 
          js.Any
        ]
    ): Unit = js.native
    
    var subscriptions: js.Any = js.native
  }
  
  @JSImport("openfin/_v2/api/interappbus/channel/channel", "ProtectedItems")
  @js.native
  class ProtectedItems protected () extends StObject {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
    
    var providerIdentity: ProviderIdentity = js.native
    
    def send(to: Identity, action: String, payload: js.Any): js.Promise[Message[Unit]] = js.native
    
    def sendRaw(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
    def sendRaw(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
    @JSName("sendRaw")
    var sendRaw_Original: FnCall = js.native
  }
  
  type Action = js.Function0[js.Any] | (js.Function1[/* payload */ js.Any, js.Any]) | (js.Function2[/* payload */ js.Any, /* id */ ProviderIdentity, js.Any])
  
  trait ChannelMessagePayload
    extends StObject
       with Identity {
    
    var action: String
    
    var payload: js.Any
  }
  object ChannelMessagePayload {
    
    @scala.inline
    def apply(action: String, payload: js.Any, uuid: String): ChannelMessagePayload = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelMessagePayload]
    }
    
    @scala.inline
    implicit class ChannelMessagePayloadMutableBuilder[Self <: ChannelMessagePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type Middleware = js.Function0[js.Any] | (js.Function1[/* action */ String, js.Any]) | (js.Function2[/* action */ String, /* payload */ js.Any, js.Any]) | (js.Function3[/* action */ String, /* payload */ js.Any, /* id */ ProviderIdentity, js.Any])
}
