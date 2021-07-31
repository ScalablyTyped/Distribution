package typings.openfin

import typings.node.eventsMod.EventEmitter
import typings.openfin.anon.NotificationId
import typings.openfin.anon.Reject
import typings.openfin.environmentMod.Environment
import typings.openfin.eventAggregatorMod.EventAggregator
import typings.openfin.eventsBaseMod.RuntimeEvent
import typings.openfin.identityMod.Identity
import typings.openfin.openfinBooleans.`true`
import typings.openfin.openfinStrings.`process-desktop-event`
import typings.openfin.openfinStrings.`process-notification-event`
import typings.openfin.openfinStrings.`request-external-authorization`
import typings.openfin.utilEntityTypeMod.EntityTypeHelpers
import typings.openfin.wireMod.ConnectConfig
import typings.openfin.wireMod.ExistingConnectConfig
import typings.openfin.wireMod.InternalConnectConfig
import typings.openfin.wireMod.WireConstructor
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("openfin/_v2/transport/transport", JSImport.Default)
  @js.native
  class default protected () extends Transport {
    def this(WireType: WireConstructor, environment: Environment) = this()
  }
  
  trait AuthorizationPayload extends StObject {
    
    var file: String
    
    var token: String
  }
  object AuthorizationPayload {
    
    @scala.inline
    def apply(file: String, token: String): AuthorizationPayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationPayload]
    }
    
    @scala.inline
    implicit class AuthorizationPayloadMutableBuilder[Self <: AuthorizationPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventMessage
    extends StObject
       with Message[RuntimeEvent[String, String]] {
    
    @JSName("action")
    var action_EventMessage: `process-desktop-event`
  }
  object EventMessage {
    
    @scala.inline
    def apply(payload: RuntimeEvent[String, String]): EventMessage = {
      val __obj = js.Dynamic.literal(action = "process-desktop-event", payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMessage]
    }
    
    @scala.inline
    implicit class EventMessageMutableBuilder[Self <: EventMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: `process-desktop-event`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message[T] extends StObject {
    
    var action: String
    
    var correlationId: js.UndefOr[Double] = js.undefined
    
    var payload: T
  }
  object Message {
    
    @scala.inline
    def apply[T](action: String, payload: T): Message[T] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message[T]]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message[?], T] (val x: Self & Message[T]) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationId(value: Double): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageHandler = js.Function1[/* data */ js.Any, Boolean]
  
  trait NotificationEvent extends StObject {
    
    var payload: NotificationId
    
    var `type`: String | js.Symbol
  }
  object NotificationEvent {
    
    @scala.inline
    def apply(payload: NotificationId, `type`: String | js.Symbol): NotificationEvent = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEvent]
    }
    
    @scala.inline
    implicit class NotificationEventMutableBuilder[Self <: NotificationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: NotificationId): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationEventMessage
    extends StObject
       with Message[NotificationEvent] {
    
    @JSName("action")
    var action_NotificationEventMessage: `process-notification-event`
  }
  object NotificationEventMessage {
    
    @scala.inline
    def apply(payload: NotificationEvent): NotificationEventMessage = {
      val __obj = js.Dynamic.literal(action = "process-notification-event", payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEventMessage]
    }
    
    @scala.inline
    implicit class NotificationEventMessageMutableBuilder[Self <: NotificationEventMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: `process-notification-event`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var data: js.Any
    
    var success: Boolean
  }
  object Payload {
    
    @scala.inline
    def apply(data: js.Any, success: Boolean): Payload = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transport extends EventEmitter {
    
    var READY_STATE: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof READY_STATE */ js.Any = js.native
    
    /* protected */ def addWireListener(id: Double, resolve: js.Function, reject: js.Function, uncorrelated: Boolean): Unit = js.native
    
    def connect(config: InternalConnectConfig): js.Promise[String] = js.native
    
    def connectByPort(config: ExistingConnectConfig): js.Promise[String] = js.native
    
    def connectSync(config: ConnectConfig): Unit = js.native
    
    var environment: Environment = js.native
    
    var eventAggregator: EventAggregator = js.native
    
    def ferryAction(data: js.Any): js.Promise[Message[js.Any]] = js.native
    
    def getPort(): String = js.native
    
    /* protected */ def handleMessage(data: Message[Payload]): Boolean = js.native
    
    var me: Identity & EntityTypeHelpers = js.native
    
    var messageHandlers: js.Array[MessageHandler] = js.native
    
    /* protected */ def onmessage(data: Message[Payload]): Unit = js.native
    
    def registerMessageHandler(handler: MessageHandler): Unit = js.native
    
    def sendAction(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
    def sendAction(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
    
    def sendRaw(data: js.Any): js.Promise[js.Any] = js.native
    @JSName("sendRaw")
    var sendRaw_Original: js.Function1[/* data */ js.Any, js.Promise[js.Any]] = js.native
    
    def shutdown(): js.Promise[Unit] = js.native
    
    var topicRefMap: Map[String, Double] = js.native
    
    var uncorrelatedListener: js.Function = js.native
    
    var wireListeners: Map[Double, Reject] = js.native
  }
}
