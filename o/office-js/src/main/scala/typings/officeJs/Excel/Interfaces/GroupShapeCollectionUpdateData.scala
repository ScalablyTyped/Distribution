package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the GroupShapeCollection object, for use in `groupShapeCollection.set({ ... })`. */
trait GroupShapeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}
object GroupShapeCollectionUpdateData {
  
  @scala.inline
  def apply(): GroupShapeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupShapeCollectionUpdateData]
  }
  
  @scala.inline
  implicit class GroupShapeCollectionUpdateDataMutableBuilder[Self <: GroupShapeCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ShapeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ShapeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
