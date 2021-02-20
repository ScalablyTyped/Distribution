package typings.omelette

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("omelette", JSImport.Namespace)
  @js.native
  val ^ : Omelette = js.native
  
  type Callback = js.Function1[/* obj */ CallbackValue, Unit]
  
  type CallbackAsync = js.Function1[/* obj */ CallbackAsyncValue, js.Promise[Unit]]
  
  @js.native
  trait CallbackAsyncValue extends StObject {
    
    var before: String = js.native
    
    var fragment: Double = js.native
    
    var line: String = js.native
    
    def reply(value: js.Promise[Choices]): Unit = js.native
    @JSName("reply")
    var reply_Original: ReplyFn[js.Promise[Choices]] = js.native
  }
  
  @js.native
  trait CallbackValue extends StObject {
    
    var before: String = js.native
    
    var fragment: Double = js.native
    
    var line: String = js.native
    
    def reply(value: Choices): Unit = js.native
    @JSName("reply")
    var reply_Original: ReplyFn[Choices] = js.native
  }
  
  type Choices = js.Array[String]
  
  @js.native
  trait Instance extends StObject {
    
    def cleanupShellInitFile(): Unit = js.native
    
    def init(): Unit = js.native
    
    def next(fn: js.Function0[Unit]): Unit = js.native
    
    def on(action: String, callback: Callback): Unit = js.native
    
    def onAsync(actions: String, callback: CallbackAsync): Unit = js.native
    
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
