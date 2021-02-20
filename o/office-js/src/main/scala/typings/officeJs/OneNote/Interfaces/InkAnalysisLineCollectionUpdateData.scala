package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisLineCollection object, for use in "inkAnalysisLineCollection.set({ ... })". */
@js.native
trait InkAnalysisLineCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisLineData]] = js.native
}
object InkAnalysisLineCollectionUpdateData {
  
  @scala.inline
  def apply(): InkAnalysisLineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineCollectionUpdateData]
  }
  
  @scala.inline
  implicit class InkAnalysisLineCollectionUpdateDataMutableBuilder[Self <: InkAnalysisLineCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkAnalysisLineData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkAnalysisLineData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
