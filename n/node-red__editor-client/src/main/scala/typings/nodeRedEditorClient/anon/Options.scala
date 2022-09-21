package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.MenuItemOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var options: js.Array[MenuItemOption | Null]
}
object Options {
  
  inline def apply(options: js.Array[MenuItemOption | Null]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOptions(value: js.Array[MenuItemOption | Null]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: (MenuItemOption | Null)*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
