package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisLineCollection.toJSON()". */
@js.native
trait InkAnalysisLineCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.native
}
object InkAnalysisLineCollectionData {
  
  @scala.inline
  def apply(): InkAnalysisLineCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineCollectionData]
  }
  
  @scala.inline
  implicit class InkAnalysisLineCollectionDataMutableBuilder[Self <: InkAnalysisLineCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkAnalysisLineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkAnalysisLineData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
