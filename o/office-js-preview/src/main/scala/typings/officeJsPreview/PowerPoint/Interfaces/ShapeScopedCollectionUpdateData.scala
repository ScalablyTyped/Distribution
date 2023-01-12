package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeScopedCollection object, for use in `shapeScopedCollection.set({ ... })`. */
trait ShapeScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}
object ShapeScopedCollectionUpdateData {
  
  inline def apply(): ShapeScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeScopedCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeScopedCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ShapeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ShapeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
