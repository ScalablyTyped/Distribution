package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkAnalysisParagraphCollection.toJSON()". */
trait InkAnalysisParagraphCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.undefined
}
object InkAnalysisParagraphCollectionData {
  
  inline def apply(): InkAnalysisParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionData]
  }
  
  extension [Self <: InkAnalysisParagraphCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[InkAnalysisParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkAnalysisParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
