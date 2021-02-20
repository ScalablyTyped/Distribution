package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisWordCollection.toJSON()". */
@js.native
trait InkAnalysisWordCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisWordData]] = js.native
}
object InkAnalysisWordCollectionData {
  
  @scala.inline
  def apply(): InkAnalysisWordCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordCollectionData]
  }
  
  @scala.inline
  implicit class InkAnalysisWordCollectionDataMutableBuilder[Self <: InkAnalysisWordCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkAnalysisWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkAnalysisWordData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
