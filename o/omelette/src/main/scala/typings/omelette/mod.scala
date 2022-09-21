package typings.omelette

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.omelette.omeletteStrings.complete
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("omelette", JSImport.Namespace)
  @js.native
  val ^ : Omelette = js.native
  
  type Callback = js.Function1[/* obj */ CallbackValue, Unit]
  
  type CallbackAsync = js.Function1[/* obj */ CallbackAsyncValue, js.Promise[Unit]]
  
  trait CallbackAsyncValue extends StObject {
    
    var before: String
    
    var fragment: Double
    
    var line: String
    
    def reply(value: js.Promise[Choices]): Unit
    @JSName("reply")
    var reply_Original: ReplyFn[js.Promise[Choices]]
  }
  object CallbackAsyncValue {
    
    inline def apply(before: String, fragment: Double, line: String, reply: js.Promise[Choices] => Unit): CallbackAsyncValue = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply))
      __obj.asInstanceOf[CallbackAsyncValue]
    }
    
    extension [Self <: CallbackAsyncValue](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setFragment(value: Double): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setReply(value: js.Promise[Choices] => Unit): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
    }
  }
  
  type CallbackOnComplete = js.Function2[/* fragment */ String, /* obj */ CallbackValue, Unit]
  
  trait CallbackValue extends StObject {
    
    var before: String
    
    var fragment: Double
    
    var line: String
    
    def reply(value: Choices): Unit
    @JSName("reply")
    var reply_Original: ReplyFn[Choices]
  }
  object CallbackValue {
    
    inline def apply(before: String, fragment: Double, line: String, reply: Choices => Unit): CallbackValue = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], reply = js.Any.fromFunction1(reply))
      __obj.asInstanceOf[CallbackValue]
    }
    
    extension [Self <: CallbackValue](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setFragment(value: Double): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setReply(value: Choices => Unit): Self = StObject.set(x, "reply", js.Any.fromFunction1(value))
    }
  }
  
  type Choices = js.Array[String]
  
  @js.native
  trait Instance extends StObject {
    
    def cleanupShellInitFile(): Unit = js.native
    
    def init(): Unit = js.native
    
    def next(fn: js.Function0[Unit]): Unit = js.native
    
    def on(action: String, callback: Callback): Unit = js.native
    
    def onAsync(actions: String, callback: CallbackAsync): Unit = js.native
    
    @JSName("on")
    def on_complete(action: complete, callback: CallbackOnComplete): Unit = js.native
    
    def setupShellInitFile(): Unit = js.native
    def setupShellInitFile(initFile: String): Unit = js.native
    
    def tree(value: TreeValue): this.type = js.native
  }
  
  @js.native
  trait Omelette extends StObject {
    
    def apply(literals: TemplateStringsArray, placeholders: TemplateValue*): Instance = js.native
    def apply(message: String): Instance = js.native
  }
  
  type ReplyFn[T] = js.Function1[/* value */ T, Unit]
  
  type TemplatePrimativeValue = String | Choices
  
  type TemplateValue = TemplatePrimativeValue | Callback
  
  type TreeValue = StringDictionary[Choices]
  
  type _To = Omelette
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Omelette = ^
}
