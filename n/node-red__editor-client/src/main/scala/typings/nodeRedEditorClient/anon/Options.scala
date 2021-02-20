package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.MenuItemOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var options: js.Array[MenuItemOption | Null] = js.native
}
object Options {
  
  @scala.inline
  def apply(options: js.Array[MenuItemOption | Null]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[MenuItemOption | Null]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: (MenuItemOption | Null)*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
