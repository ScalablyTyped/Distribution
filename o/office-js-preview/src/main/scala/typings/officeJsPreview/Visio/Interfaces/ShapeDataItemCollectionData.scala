package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shapeDataItemCollection.toJSON()`. */
trait ShapeDataItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeDataItemData]] = js.undefined
}
object ShapeDataItemCollectionData {
  
  inline def apply(): ShapeDataItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataItemCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeDataItemCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ShapeDataItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ShapeDataItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
