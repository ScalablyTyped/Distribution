package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeDataItemCollection object, for use in "shapeDataItemCollection.set({ ... })". */
@js.native
trait ShapeDataItemCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeDataItemData]] = js.native
}
object ShapeDataItemCollectionUpdateData {
  
  @scala.inline
  def apply(): ShapeDataItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataItemCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ShapeDataItemCollectionUpdateDataMutableBuilder[Self <: ShapeDataItemCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ShapeDataItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ShapeDataItemData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
