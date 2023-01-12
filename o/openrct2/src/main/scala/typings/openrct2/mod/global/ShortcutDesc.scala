package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutDesc extends StObject {
  
  /**
    * Default bindings for the shortcut.
    * E.g. `["CTRL+SHIFT+L", "MOUSE 3"]`
    */
  var bindings: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Function to call when the shortcut is invoked.
    */
  def callback(): Unit
  
  /**
    * The unique identifier for the shortcut.
    * If the identifier already exists, the shortcut will not be registered.
    * Use full stops to group shortcuts together, e.g. `yourplugin.somewindow.apply`.
    */
  var id: String
  
  /**
    * The display text for the shortcut.
    */
  var text: String
}
object ShortcutDesc {
  
  inline def apply(callback: () => Unit, id: String, text: String): ShortcutDesc = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDesc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShortcutDesc] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: js.Array[String]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: String*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
