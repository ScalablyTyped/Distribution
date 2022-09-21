package typings.mousetrap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** https://craig.is/killing/mice#extensions.global */
/** https://craig.is/killing/mice#extensions.pause */
object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mousetrap", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MousetrapInstance {
    def this(el: Element) = this()
  }
  @JSImport("mousetrap", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MousetrapStatic = js.native
  
  @js.native
  trait ExtendedKeyboardEvent
    extends StObject
       with KeyboardEvent
  
  @js.native
  trait MousetrapInstance extends StObject {
    
    def bind(keys: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any]): this.type = js.native
    def bind(
      keys: String,
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any],
      action: String
    ): this.type = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any]
    ): this.type = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any],
      action: String
    ): this.type = js.native
    
    def handleKey(character: String, modifiers: js.Array[String], e: ExtendedKeyboardEvent): Unit = js.native
    
    def pause(): this.type = js.native
    
    def reset(): this.type = js.native
    
    def stopCallback(e: ExtendedKeyboardEvent, element: Element, combo: String): Boolean = js.native
    
    def trigger(keys: String): this.type = js.native
    def trigger(keys: String, action: String): this.type = js.native
    
    def unbind(keys: String): this.type = js.native
    def unbind(keys: String, action: String): this.type = js.native
    def unbind(keys: js.Array[String]): this.type = js.native
    def unbind(keys: js.Array[String], action: String): this.type = js.native
    
    def unpause(): this.type = js.native
  }
  
  @js.native
  trait MousetrapStatic
    extends StObject
       with Instantiable0[MousetrapInstance]
       with Instantiable1[/* el */ Element, MousetrapInstance] {
    
    def apply(): MousetrapInstance = js.native
    def apply(el: Element): MousetrapInstance = js.native
    
    def addKeycodes(keycodes: NumberDictionary[String]): Unit = js.native
    
    def bind(keys: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any]): MousetrapInstance = js.native
    def bind(
      keys: String,
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any],
      action: String
    ): MousetrapInstance = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any]
    ): MousetrapInstance = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any],
      action: String
    ): MousetrapInstance = js.native
    
    def bindGlobal(keyArray: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any]): Unit = js.native
    def bindGlobal(
      keyArray: String,
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any],
      action: String
    ): Unit = js.native
    def bindGlobal(
      keyArray: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any]
    ): Unit = js.native
    def bindGlobal(
      keyArray: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Any],
      action: String
    ): Unit = js.native
    
    def pause(): MousetrapInstance = js.native
    
    def reset(): MousetrapInstance = js.native
    
    def stopCallback(e: ExtendedKeyboardEvent, element: Element, combo: String): Boolean = js.native
    
    def trigger(keys: String): MousetrapInstance = js.native
    def trigger(keys: String, action: String): MousetrapInstance = js.native
    
    def unbind(keys: String): MousetrapInstance = js.native
    def unbind(keys: String, action: String): MousetrapInstance = js.native
    def unbind(keys: js.Array[String]): MousetrapInstance = js.native
    def unbind(keys: js.Array[String], action: String): MousetrapInstance = js.native
    
    def unpause(): MousetrapInstance = js.native
  }
  
  type _To = js.Object & MousetrapStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & MousetrapStatic = ^
}
