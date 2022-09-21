package typings.oja

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.oja.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oja", "Action")
  @js.native
  open class Action () extends Flow {
    
    def activate(): this.type = js.native
    
    def add(child: AddableToAction*): this.type = js.native
    
    def execute(): Unit = js.native
  }
  
  @JSImport("oja", "EventContext")
  @js.native
  open class EventContext protected () extends StObject {
    def this(context: js.Object) = this()
    def this(context: EventContext) = this()
    
    def emit(name: String, value: Any): this.type = js.native
    
    def get(name: String): Any = js.native
    
    def on(`type`: String, handler: js.Function1[/* event */ Any, Unit]): this.type = js.native
    
    def once(`type`: String, handler: js.Function1[/* event */ Any, Unit]): this.type = js.native
    
    def repub(`type`: String, handler: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    def stageContext(topics: String): StageContext = js.native
    def stageContext(topics: js.Array[String]): StageContext = js.native
    
    def state(): State = js.native
  }
  
  @JSImport("oja", "Flow")
  @js.native
  open class Flow () extends StObject {
    def this(baseFlow: Flow) = this()
    
    def `catch`(callback: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    def consume(topic: String): js.Promise[Any] = js.native
    def consume(topic: String, callback: ConsumerCallback): this.type = js.native
    def consume(topic: js.Array[String], callback: ConsumerCallback): this.type = js.native
    def consume(topics: js.Array[String]): js.Promise[StringDictionary[String]] = js.native
    
    def consumeStream(topic: String): ReadableStream = js.native
    def consumeStream(topic: String, callback: js.Function1[/* stream */ ReadableStream, Unit]): this.type = js.native
    
    def define(topic: String, data: js.Object): this.type = js.native
    def define(topic: String, data: js.Promise[Primitive]): this.type = js.native
    def define(topic: String, data: DefinitionFunction): this.type = js.native
    def define(topic: String, data: Primitive): this.type = js.native
    def define(topics: String): StageContext = js.native
    def define(topics: js.Array[String]): StageContext = js.native
    
    def getReader(topic: String): Next = js.native
    
    def state(): State = js.native
    
    def timeout(topics: String, ms: Double): this.type = js.native
    def timeout(topics: js.Array[String], ms: Double): this.type = js.native
  }
  
  @JSImport("oja", "FunctionAction")
  @js.native
  open class FunctionAction protected () extends Action {
    def this(callback: js.Function1[/* runtime */ FunctionAction, Any]) = this()
  }
  
  @JSImport("oja", "ReadableStream")
  @js.native
  open class ReadableStream protected () extends Readable {
    def this(topic: String, emitter: EventEmitter) = this()
  }
  
  @JSImport("oja", "StageContext")
  @js.native
  open class StageContext protected () extends EventContext {
    def this(context: js.Object) = this()
    def this(context: EventContext) = this()
    
    def pub(data: Any): Unit = js.native
  }
  
  type AddableFunction = js.Function1[/* runtime */ Flow, Unit]
  
  type AddableToAction = Action | AddableFunction
  
  type ConsumerCallback = js.Function2[/* payload */ Any, /* runtime */ Flow, Unit]
  
  type DefinitionFunction = js.Function2[/* publisher */ StageContext, /* runtime */ Flow, Any]
  
  type Primitive = js.UndefOr[Boolean | Double | String | js.Symbol | Null]
  
  trait State extends StObject {
    
    var pending: js.Array[String]
    
    var queue: js.Array[String]
  }
  object State {
    
    inline def apply(pending: js.Array[String], queue: js.Array[String]): State = {
      val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setPending(value: js.Array[String]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: String*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setQueue(value: js.Array[String]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: String*): Self = StObject.set(x, "queue", js.Array(value*))
    }
  }
}
