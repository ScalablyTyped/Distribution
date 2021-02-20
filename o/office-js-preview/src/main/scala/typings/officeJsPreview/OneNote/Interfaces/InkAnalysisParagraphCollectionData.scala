package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisParagraphCollection.toJSON()". */
@js.native
trait InkAnalysisParagraphCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.native
}
object InkAnalysisParagraphCollectionData {
  
  @scala.inline
  def apply(): InkAnalysisParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionData]
  }
  
  @scala.inline
  implicit class InkAnalysisParagraphCollectionDataMutableBuilder[Self <: InkAnalysisParagraphCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkAnalysisParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkAnalysisParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
