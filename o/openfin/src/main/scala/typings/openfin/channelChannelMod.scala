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
  open class ChannelBase protected () extends StObject {
    def this(
      providerIdentity: ProviderIdentity,
      send: FnCall,
      channelProtectedMap: WeakMap[ChannelBase, ProtectedItems]
    ) = this()
    
    def afterAction(func: Action): Unit = js.native
    
    def beforeAction(func: Action): Unit = js.native
    
    def defaultAction(): Any = js.native
    def defaultAction(action: String): Any = js.native
    def defaultAction(action: String, payload: Any): Any = js.native
    def defaultAction(action: String, payload: Any, senderIdentity: ProviderIdentity): Any = js.native
    def defaultAction(action: String, payload: Unit, senderIdentity: ProviderIdentity): Any = js.native
    def defaultAction(action: Unit, payload: Any): Any = js.native
    def defaultAction(action: Unit, payload: Any, senderIdentity: ProviderIdentity): Any = js.native
    def defaultAction(action: Unit, payload: Unit, senderIdentity: ProviderIdentity): Any = js.native
    
    /* private */ var defaultSet: Any = js.native
    
    /* private */ var errorMiddleware: Any = js.native
    
    def onError(func: js.Function3[/* action */ String, /* error */ Any, /* id */ Identity, Any]): Unit = js.native
    
    /* private */ var postAction: Any = js.native
    
    /* private */ var preAction: Any = js.native
    
    def processAction(action: String, payload: Any, senderIdentity: ProviderIdentity): js.Promise[Any] = js.native
    
    def register(topic: String, listener: Action): Boolean = js.native
    
    def remove(action: String): Unit = js.native
    
    /* protected */ def removeChannel(mapKey: String): Unit = js.native
    /* protected */ def removeChannel(mapKey: String, endpointId: String): Unit = js.native
    
    def setDefaultAction(
      func: js.Function3[
          /* action */ js.UndefOr[String], 
          /* payload */ js.UndefOr[Any], 
          /* senderIdentity */ js.UndefOr[ProviderIdentity], 
          Any
        ]
    ): Unit = js.native
    
    /* protected */ var subscriptions: Any = js.native
  }
  
  @JSImport("openfin/_v2/api/interappbus/channel/channel", "ProtectedItems")
  @js.native
  open class ProtectedItems protected () extends StObject {
    def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
    
    var providerIdentity: ProviderIdentity = js.native
    
    def send(to: Identity, action: String, payload: Any): js.Promise[Message[Unit]] = js.native
    
    def sendRaw(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
    def sendRaw(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
    @JSName("sendRaw")
    var sendRaw_Original: FnCall = js.native
  }
  
  type Action = js.Function0[Any] | (js.Function1[/* payload */ Any, Any]) | (js.Function2[/* payload */ Any, /* id */ ProviderIdentity, Any])
  
  trait ChannelMessagePayload
    extends StObject
       with Identity {
    
    var action: String
    
    var payload: Any
  }
  object ChannelMessagePayload {
    
    inline def apply(action: String, payload: Any, uuid: String): ChannelMessagePayload = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelMessagePayload]
    }
    
    extension [Self <: ChannelMessagePayload](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type Middleware = js.Function0[Any] | (js.Function1[/* action */ String, Any]) | (js.Function2[/* action */ String, /* payload */ Any, Any]) | (js.Function3[/* action */ String, /* payload */ Any, /* id */ ProviderIdentity, Any])
}
