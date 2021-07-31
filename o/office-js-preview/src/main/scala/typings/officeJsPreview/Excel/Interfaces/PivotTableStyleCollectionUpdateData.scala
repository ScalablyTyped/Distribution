package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTableStyleCollection object, for use in `pivotTableStyleCollection.set({ ... })`. */
trait PivotTableStyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotTableStyleData]] = js.undefined
}
object PivotTableStyleCollectionUpdateData {
  
  @scala.inline
  def apply(): PivotTableStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableStyleCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PivotTableStyleCollectionUpdateDataMutableBuilder[Self <: PivotTableStyleCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PivotTableStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PivotTableStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
