package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeAreasCollection.toJSON()`. */
trait RangeAreasCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeAreasData]] = js.undefined
}
object RangeAreasCollectionData {
  
  @scala.inline
  def apply(): RangeAreasCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasCollectionData]
  }
  
  @scala.inline
  implicit class RangeAreasCollectionDataMutableBuilder[Self <: RangeAreasCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeAreasData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeAreasData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
