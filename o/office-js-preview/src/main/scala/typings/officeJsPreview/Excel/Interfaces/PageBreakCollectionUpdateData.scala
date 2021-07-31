package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageBreakCollection object, for use in `pageBreakCollection.set({ ... })`. */
trait PageBreakCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PageBreakData]] = js.undefined
}
object PageBreakCollectionUpdateData {
  
  @scala.inline
  def apply(): PageBreakCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakCollectionUpdateData]
  }
  
  @scala.inline
  implicit class PageBreakCollectionUpdateDataMutableBuilder[Self <: PageBreakCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PageBreakData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PageBreakData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
