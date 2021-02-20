package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `paragraphCollection.toJSON()`. */
@js.native
trait ParagraphCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ParagraphData]] = js.native
}
object ParagraphCollectionData {
  
  @scala.inline
  def apply(): ParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphCollectionData]
  }
  
  @scala.inline
  implicit class ParagraphCollectionDataMutableBuilder[Self <: ParagraphCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
