package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeBorderCollection.toJSON()`. */
trait RangeBorderCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
}
object RangeBorderCollectionData {
  
  @scala.inline
  def apply(): RangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderCollectionData]
  }
  
  @scala.inline
  implicit class RangeBorderCollectionDataMutableBuilder[Self <: RangeBorderCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[RangeBorderData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: RangeBorderData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
