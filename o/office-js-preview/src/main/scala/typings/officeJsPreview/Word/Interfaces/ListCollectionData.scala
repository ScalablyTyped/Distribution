package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `listCollection.toJSON()`. */
trait ListCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ListData]] = js.undefined
}
object ListCollectionData {
  
  @scala.inline
  def apply(): ListCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionData]
  }
  
  @scala.inline
  implicit class ListCollectionDataMutableBuilder[Self <: ListCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ListData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ListData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
