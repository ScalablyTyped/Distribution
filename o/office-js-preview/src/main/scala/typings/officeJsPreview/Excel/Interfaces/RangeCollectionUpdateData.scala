package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeCollection object, for use in `rangeCollection.set({ ... })`. */
@js.native
trait RangeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeData]] = js.native
}
object RangeCollectionUpdateData {
  
  @scala.inline
  def apply(): RangeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCollectionUpdateData]
  }
  
  @scala.inline
  implicit class RangeCollectionUpdateDataMutableBuilder[Self <: RangeCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
