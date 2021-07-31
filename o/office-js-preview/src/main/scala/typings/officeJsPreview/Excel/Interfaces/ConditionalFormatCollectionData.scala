package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalFormatCollection.toJSON()`. */
trait ConditionalFormatCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
}
object ConditionalFormatCollectionData {
  
  @scala.inline
  def apply(): ConditionalFormatCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatCollectionData]
  }
  
  @scala.inline
  implicit class ConditionalFormatCollectionDataMutableBuilder[Self <: ConditionalFormatCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ConditionalFormatData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ConditionalFormatData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
