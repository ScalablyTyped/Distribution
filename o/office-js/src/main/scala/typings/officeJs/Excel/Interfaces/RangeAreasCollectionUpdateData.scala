package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeAreasCollection object, for use in `rangeAreasCollection.set({ ... })`. */
@js.native
trait RangeAreasCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeAreasData]] = js.native
}
object RangeAreasCollectionUpdateData {
  
  @scala.inline
  def apply(): RangeAreasCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasCollectionUpdateData]
  }
  
  @scala.inline
  implicit class RangeAreasCollectionUpdateDataMutableBuilder[Self <: RangeAreasCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeAreasData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeAreasData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
