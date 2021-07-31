package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `groupShapeCollection.toJSON()`. */
trait GroupShapeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}
object GroupShapeCollectionData {
  
  @scala.inline
  def apply(): GroupShapeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupShapeCollectionData]
  }
  
  @scala.inline
  implicit class GroupShapeCollectionDataMutableBuilder[Self <: GroupShapeCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ShapeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ShapeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
