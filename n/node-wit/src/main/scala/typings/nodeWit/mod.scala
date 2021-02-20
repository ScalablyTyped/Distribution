package typings.nodeWit

import typings.nodeWit.mod.log.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-wit", "Wit")
  @js.native
  class Wit protected () extends StObject {
    def this(option: WitOption) = this()
    
    def converse(sessionId: String, message: String, context: WitContext): js.Promise[MessageResponse] = js.native
    def converse(sessionId: String, message: String, context: WitContext, reset: Boolean): js.Promise[MessageResponse] = js.native
    
    def message(message: String, context: WitContext): js.Promise[MessageResponse] = js.native
    
    def runActions(sessionId: String, message: String, context: WitContext): js.Promise[WitContext] = js.native
    def runActions(sessionId: String, message: String, context: WitContext, maxSteps: Double): js.Promise[WitContext] = js.native
  }
  
  object log {
    
    @JSImport("node-wit", "log.DEBUG")
    @js.native
    val DEBUG: String = js.native
    
    @JSImport("node-wit", "log.ERROR")
    @js.native
    val ERROR: String = js.native
    
    @JSImport("node-wit", "log.INFO")
    @js.native
    val INFO: String = js.native
    
    @JSImport("node-wit", "log.Logger")
    @js.native
    class Logger protected () extends StObject {
      def this(level: String) = this()
    }
    
    @JSImport("node-wit", "log.WARN")
    @js.native
    val WARN: String = js.native
  }
  
  @js.native
  trait MessageResponse extends StObject {
    
    var _text: String = js.native
    
    var entities: js.Any = js.native
    
    var msg_id: String = js.native
  }
  object MessageResponse {
    
    @scala.inline
    def apply(_text: String, entities: js.Any, msg_id: String): MessageResponse = {
      val __obj = js.Dynamic.literal(_text = _text.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], msg_id = msg_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageResponse]
    }
    
    @scala.inline
    implicit class MessageResponseMutableBuilder[Self <: MessageResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntities(value: js.Any): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg_id(value: String): Self = StObject.set(x, "msg_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_text(value: String): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageResponseEntity extends StObject {
    
    var confidence: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object MessageResponseEntity {
    
    @scala.inline
    def apply(): MessageResponseEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageResponseEntity]
    }
    
    @scala.inline
    implicit class MessageResponseEntityMutableBuilder[Self <: MessageResponseEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait WitContext extends StObject {
    
    var entities: js.UndefOr[js.Array[WitEntity]] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var reference_time: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[js.Array[String]] = js.native
    
    var timezone: js.UndefOr[String] = js.native
  }
  object WitContext {
    
    @scala.inline
    def apply(): WitContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitContext]
    }
    
    @scala.inline
    implicit class WitContextMutableBuilder[Self <: WitContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntities(value: js.Array[WitEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      @scala.inline
      def setEntitiesVarargs(value: WitEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setReference_time(value: String): Self = StObject.set(x, "reference_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference_timeUndefined: Self = StObject.set(x, "reference_time", js.undefined)
      
      @scala.inline
      def setState(value: js.Array[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStateVarargs(value: String*): Self = StObject.set(x, "state", js.Array(value :_*))
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  @js.native
  trait WitEntity extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var values: js.UndefOr[js.Array[WitEntityValue]] = js.native
  }
  object WitEntity {
    
    @scala.inline
    def apply(): WitEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitEntity]
    }
    
    @scala.inline
    implicit class WitEntityMutableBuilder[Self <: WitEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[WitEntityValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: WitEntityValue*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WitEntityValue extends StObject {
    
    var expressions: js.UndefOr[js.Array[String]] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object WitEntityValue {
    
    @scala.inline
    def apply(): WitEntityValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitEntityValue]
    }
    
    @scala.inline
    implicit class WitEntityValueMutableBuilder[Self <: WitEntityValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
      
      @scala.inline
      def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait WitOption extends StObject {
    
    var accessToken: String = js.native
    
    var actions: js.UndefOr[js.Any] = js.native
    
    var logger: js.UndefOr[Logger] = js.native
  }
  object WitOption {
    
    @scala.inline
    def apply(accessToken: String): WitOption = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[WitOption]
    }
    
    @scala.inline
    implicit class WitOptionMutableBuilder[Self <: WitOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActions(value: js.Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  @js.native
  trait WitRequest extends StObject {
    
    var context: js.UndefOr[WitContext] = js.native
    
    var entities: js.UndefOr[js.Array[WitEntity]] = js.native
    
    var sessionId: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object WitRequest {
    
    @scala.inline
    def apply(): WitRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitRequest]
    }
    
    @scala.inline
    implicit class WitRequestMutableBuilder[Self <: WitRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: WitContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEntities(value: js.Array[WitEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      @scala.inline
      def setEntitiesVarargs(value: WitEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait WitResponse extends StObject {
    
    var quickReplies: js.UndefOr[js.Any] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object WitResponse {
    
    @scala.inline
    def apply(): WitResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitResponse]
    }
    
    @scala.inline
    implicit class WitResponseMutableBuilder[Self <: WitResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuickReplies(value: js.Any): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
