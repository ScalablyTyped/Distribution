package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeCollection.toJSON()`. */
@js.native
trait RangeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeData]] = js.native
}
object RangeCollectionData {
  
  @scala.inline
  def apply(): RangeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCollectionData]
  }
  
  @scala.inline
  implicit class RangeCollectionDataMutableBuilder[Self <: RangeCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
