package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "pageCollection.toJSON()". */
trait PageCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PageData]] = js.undefined
}
object PageCollectionData {
  
  @scala.inline
  def apply(): PageCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCollectionData]
  }
  
  @scala.inline
  implicit class PageCollectionDataMutableBuilder[Self <: PageCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PageData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PageData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
