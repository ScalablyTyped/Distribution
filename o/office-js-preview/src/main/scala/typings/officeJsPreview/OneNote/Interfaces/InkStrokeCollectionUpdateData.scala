package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkStrokeCollection object, for use in "inkStrokeCollection.set({ ... })". */
@js.native
trait InkStrokeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkStrokeData]] = js.native
}
object InkStrokeCollectionUpdateData {
  
  @scala.inline
  def apply(): InkStrokeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeCollectionUpdateData]
  }
  
  @scala.inline
  implicit class InkStrokeCollectionUpdateDataMutableBuilder[Self <: InkStrokeCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkStrokeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkStrokeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
