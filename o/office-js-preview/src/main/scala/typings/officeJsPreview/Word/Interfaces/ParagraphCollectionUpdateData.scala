package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ParagraphCollection object, for use in `paragraphCollection.set({ ... })`. */
@js.native
trait ParagraphCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ParagraphData]] = js.native
}
object ParagraphCollectionUpdateData {
  
  @scala.inline
  def apply(): ParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ParagraphCollectionUpdateDataMutableBuilder[Self <: ParagraphCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
