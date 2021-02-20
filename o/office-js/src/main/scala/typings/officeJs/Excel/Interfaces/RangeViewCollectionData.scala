package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeViewCollection.toJSON()`. */
@js.native
trait RangeViewCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeViewData]] = js.native
}
object RangeViewCollectionData {
  
  @scala.inline
  def apply(): RangeViewCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeViewCollectionData]
  }
  
  @scala.inline
  implicit class RangeViewCollectionDataMutableBuilder[Self <: RangeViewCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeViewData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
