package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "hyperlinkCollection.toJSON()". */
trait HyperlinkCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[HyperlinkData]] = js.undefined
}
object HyperlinkCollectionData {
  
  @scala.inline
  def apply(): HyperlinkCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkCollectionData]
  }
  
  @scala.inline
  implicit class HyperlinkCollectionDataMutableBuilder[Self <: HyperlinkCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[HyperlinkData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: HyperlinkData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
