package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the SlicerStyleCollection object, for use in `slicerStyleCollection.set({ ... })`. */
@js.native
trait SlicerStyleCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[SlicerStyleData]] = js.native
}
object SlicerStyleCollectionUpdateData {
  
  @scala.inline
  def apply(): SlicerStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerStyleCollectionUpdateData]
  }
  
  @scala.inline
  implicit class SlicerStyleCollectionUpdateDataMutableBuilder[Self <: SlicerStyleCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SlicerStyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SlicerStyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
