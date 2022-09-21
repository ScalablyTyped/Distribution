package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkAnalysisWordCollection.toJSON()`. */
trait InkAnalysisWordCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}
object InkAnalysisWordCollectionData {
  
  inline def apply(): InkAnalysisWordCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordCollectionData]
  }
  
  extension [Self <: InkAnalysisWordCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[InkAnalysisWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: InkAnalysisWordData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
