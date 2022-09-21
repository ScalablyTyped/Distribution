package typings.nodeWit

import typings.nodeWit.mod.log.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-wit", "Wit")
  @js.native
  open class Wit protected () extends StObject {
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
    open class Logger protected () extends StObject {
      def this(level: String) = this()
    }
    
    @JSImport("node-wit", "log.WARN")
    @js.native
    val WARN: String = js.native
  }
  
  trait MessageResponse extends StObject {
    
    var entities: Any
    
    var intents: js.Array[WitIntent]
    
    var text: String
    
    var traits: Any
  }
  object MessageResponse {
    
    inline def apply(entities: Any, intents: js.Array[WitIntent], text: String, traits: Any): MessageResponse = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], intents = intents.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageResponse]
    }
    
    extension [Self <: MessageResponse](x: Self) {
      
      inline def setEntities(value: Any): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setIntents(value: js.Array[WitIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
      
      inline def setIntentsVarargs(value: WitIntent*): Self = StObject.set(x, "intents", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTraits(value: Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageResponseEntity extends StObject {
    
    var confidence: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object MessageResponseEntity {
    
    inline def apply(): MessageResponseEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageResponseEntity]
    }
    
    extension [Self <: MessageResponseEntity](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait WitContext extends StObject {
    
    var entities: js.UndefOr[js.Array[WitEntity]] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var reference_time: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[js.Array[String]] = js.undefined
    
    var timezone: js.UndefOr[String] = js.undefined
  }
  object WitContext {
    
    inline def apply(): WitContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitContext]
    }
    
    extension [Self <: WitContext](x: Self) {
      
      inline def setEntities(value: js.Array[WitEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      inline def setEntitiesVarargs(value: WitEntity*): Self = StObject.set(x, "entities", js.Array(value*))
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setReference_time(value: String): Self = StObject.set(x, "reference_time", value.asInstanceOf[js.Any])
      
      inline def setReference_timeUndefined: Self = StObject.set(x, "reference_time", js.undefined)
      
      inline def setState(value: js.Array[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStateVarargs(value: String*): Self = StObject.set(x, "state", js.Array(value*))
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  trait WitEntity extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[js.Array[WitEntityValue]] = js.undefined
  }
  object WitEntity {
    
    inline def apply(): WitEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitEntity]
    }
    
    extension [Self <: WitEntity](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setValues(value: js.Array[WitEntityValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: WitEntityValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait WitEntityValue extends StObject {
    
    var expressions: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object WitEntityValue {
    
    inline def apply(): WitEntityValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitEntityValue]
    }
    
    extension [Self <: WitEntityValue](x: Self) {
      
      inline def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
      
      inline def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait WitIntent extends StObject {
    
    var confidence: Double
    
    var id: String
    
    var name: String
  }
  object WitIntent {
    
    inline def apply(confidence: Double, id: String, name: String): WitIntent = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[WitIntent]
    }
    
    extension [Self <: WitIntent](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait WitOption extends StObject {
    
    var accessToken: String
    
    var actions: js.UndefOr[Any] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object WitOption {
    
    inline def apply(accessToken: String): WitOption = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[WitOption]
    }
    
    extension [Self <: WitOption](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  trait WitRequest extends StObject {
    
    var context: js.UndefOr[WitContext] = js.undefined
    
    var entities: js.UndefOr[js.Array[WitEntity]] = js.undefined
    
    var sessionId: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object WitRequest {
    
    inline def apply(): WitRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitRequest]
    }
    
    extension [Self <: WitRequest](x: Self) {
      
      inline def setContext(value: WitContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEntities(value: js.Array[WitEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
      
      inline def setEntitiesVarargs(value: WitEntity*): Self = StObject.set(x, "entities", js.Array(value*))
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait WitResponse extends StObject {
    
    var quickReplies: js.UndefOr[Any] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object WitResponse {
    
    inline def apply(): WitResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WitResponse]
    }
    
    extension [Self <: WitResponse](x: Self) {
      
      inline def setQuickReplies(value: Any): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
      
      inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
