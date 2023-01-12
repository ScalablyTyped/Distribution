package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tool extends StObject {
  
  def cancel(): Unit
  
  var cursor: CursorType
  
  var id: String
}
object Tool {
  
  inline def apply(cancel: () => Unit, cursor: CursorType, id: String): Tool = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cursor = cursor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tool] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setCursor(value: CursorType): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
