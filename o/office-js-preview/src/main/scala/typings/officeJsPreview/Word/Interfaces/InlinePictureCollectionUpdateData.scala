package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InlinePictureCollection object, for use in `inlinePictureCollection.set({ ... })`. */
trait InlinePictureCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
}
object InlinePictureCollectionUpdateData {
  
  @scala.inline
  def apply(): InlinePictureCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureCollectionUpdateData]
  }
  
  @scala.inline
  implicit class InlinePictureCollectionUpdateDataMutableBuilder[Self <: InlinePictureCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InlinePictureData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InlinePictureData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
