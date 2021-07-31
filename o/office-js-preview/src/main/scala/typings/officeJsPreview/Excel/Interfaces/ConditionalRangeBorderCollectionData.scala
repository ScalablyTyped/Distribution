package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalRangeBorderCollection.toJSON()`. */
trait ConditionalRangeBorderCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ConditionalRangeBorderData]] = js.undefined
}
object ConditionalRangeBorderCollectionData {
  
  @scala.inline
  def apply(): ConditionalRangeBorderCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderCollectionData]
  }
  
  @scala.inline
  implicit class ConditionalRangeBorderCollectionDataMutableBuilder[Self <: ConditionalRangeBorderCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ConditionalRangeBorderData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ConditionalRangeBorderData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
