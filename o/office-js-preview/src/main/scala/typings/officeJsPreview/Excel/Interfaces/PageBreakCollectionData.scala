package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageBreakCollection.toJSON()`. */
trait PageBreakCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PageBreakData]] = js.undefined
}
object PageBreakCollectionData {
  
  @scala.inline
  def apply(): PageBreakCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakCollectionData]
  }
  
  @scala.inline
  implicit class PageBreakCollectionDataMutableBuilder[Self <: PageBreakCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PageBreakData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PageBreakData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
