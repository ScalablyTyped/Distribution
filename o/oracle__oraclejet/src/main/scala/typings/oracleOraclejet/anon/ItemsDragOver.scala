package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsDragOver extends StObject {
  
  var items: DragOver = js.native
}
object ItemsDragOver {
  
  @scala.inline
  def apply(items: DragOver): ItemsDragOver = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDragOver]
  }
  
  @scala.inline
  implicit class ItemsDragOverMutableBuilder[Self <: ItemsDragOver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: DragOver): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
