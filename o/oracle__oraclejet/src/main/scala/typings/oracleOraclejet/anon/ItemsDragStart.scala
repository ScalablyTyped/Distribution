package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsDragStart extends StObject {
  
  var items: DragStart
}
object ItemsDragStart {
  
  inline def apply(items: DragStart): ItemsDragStart = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDragStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsDragStart] (val x: Self) extends AnyVal {
    
    inline def setItems(value: DragStart): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
