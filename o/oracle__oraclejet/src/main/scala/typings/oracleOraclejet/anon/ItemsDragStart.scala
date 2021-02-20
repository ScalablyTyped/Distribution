package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsDragStart extends StObject {
  
  var items: DragStart = js.native
}
object ItemsDragStart {
  
  @scala.inline
  def apply(items: DragStart): ItemsDragStart = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDragStart]
  }
  
  @scala.inline
  implicit class ItemsDragStartMutableBuilder[Self <: ItemsDragStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: DragStart): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
