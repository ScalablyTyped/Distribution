package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkWordCollection object, for use in "inkWordCollection.set({ ... })". */
@js.native
trait InkWordCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkWordData]] = js.native
}
object InkWordCollectionUpdateData {
  
  @scala.inline
  def apply(): InkWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionUpdateData]
  }
  
  @scala.inline
  implicit class InkWordCollectionUpdateDataMutableBuilder[Self <: InkWordCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkWordData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
