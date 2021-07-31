package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the HyperlinkCollection object, for use in "hyperlinkCollection.set({ ... })". */
trait HyperlinkCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[HyperlinkData]] = js.undefined
}
object HyperlinkCollectionUpdateData {
  
  @scala.inline
  def apply(): HyperlinkCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkCollectionUpdateData]
  }
  
  @scala.inline
  implicit class HyperlinkCollectionUpdateDataMutableBuilder[Self <: HyperlinkCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[HyperlinkData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: HyperlinkData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
