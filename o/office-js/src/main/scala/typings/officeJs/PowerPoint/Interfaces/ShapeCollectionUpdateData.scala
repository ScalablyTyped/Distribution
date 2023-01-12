package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeCollection object, for use in `shapeCollection.set({ ... })`. */
trait ShapeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}
object ShapeCollectionUpdateData {
  
  inline def apply(): ShapeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ShapeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ShapeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
