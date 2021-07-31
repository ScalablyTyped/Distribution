package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeViewCollection object, for use in `rangeViewCollection.set({ ... })`. */
trait RangeViewCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeViewData]] = js.undefined
}
object RangeViewCollectionUpdateData {
  
  @scala.inline
  def apply(): RangeViewCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewCollectionUpdateData]
  }
  
  @scala.inline
  implicit class RangeViewCollectionUpdateDataMutableBuilder[Self <: RangeViewCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeViewData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
