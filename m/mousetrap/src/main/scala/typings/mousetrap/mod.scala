package typings.mousetrap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mousetrap", JSImport.Namespace)
  @js.native
  class ^ () extends MousetrapInstance {
    def this(el: Element) = this()
  }
  @JSImport("mousetrap", JSImport.Namespace)
  @js.native
  val ^ : MousetrapStatic = js.native
  
  @js.native
  trait ExtendedKeyboardEvent extends KeyboardEvent
  
  @js.native
  trait MousetrapInstance extends StObject {
    
    def bind(keys: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]): this.type = js.native
    def bind(
      keys: String,
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
      action: String
    ): this.type = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]
    ): this.type = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
      action: String
    ): this.type = js.native
    
    def handleKey(character: String, modifiers: js.Array[String], e: ExtendedKeyboardEvent): Unit = js.native
    
    def reset(): this.type = js.native
    
    def stopCallback(e: ExtendedKeyboardEvent, element: Element, combo: String): Boolean = js.native
    
    def trigger(keys: String): this.type = js.native
    def trigger(keys: String, action: String): this.type = js.native
    
    def unbind(keys: String): this.type = js.native
    def unbind(keys: String, action: String): this.type = js.native
    def unbind(keys: js.Array[String]): this.type = js.native
    def unbind(keys: js.Array[String], action: String): this.type = js.native
  }
  
  @js.native
  trait MousetrapStatic
    extends Instantiable0[MousetrapInstance]
       with Instantiable1[/* el */ Element, MousetrapInstance] {
    
    def apply(el: Element): MousetrapInstance = js.native
    
    def addKeycodes(keycodes: NumberDictionary[String]): Unit = js.native
    
    def bind(keys: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]): MousetrapInstance = js.native
    def bind(
      keys: String,
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
      action: String
    ): MousetrapInstance = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]
    ): MousetrapInstance = js.native
    def bind(
      keys: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
      action: String
    ): MousetrapInstance = js.native
    
    /** https://craig.is/killing/mice#extensions.global */
    def bindGlobal(keyArray: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]): Unit = js.native
    def bindGlobal(
      keyArray: String,
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
      action: String
    ): Unit = js.native
    def bindGlobal(
      keyArray: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]
    ): Unit = js.native
    def bindGlobal(
      keyArray: js.Array[String],
      callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
      action: String
    ): Unit = js.native
    
    def reset(): MousetrapInstance = js.native
    
    def stopCallback(e: ExtendedKeyboardEvent, element: Element, combo: String): Boolean = js.native
    
    def trigger(keys: String): MousetrapInstance = js.native
    def trigger(keys: String, action: String): MousetrapInstance = js.native
    
    def unbind(keys: String): MousetrapInstance = js.native
    def unbind(keys: String, action: String): MousetrapInstance = js.native
    def unbind(keys: js.Array[String]): MousetrapInstance = js.native
    def unbind(keys: js.Array[String], action: String): MousetrapInstance = js.native
  }
  
  type _To = MousetrapStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MousetrapStatic = ^
}
