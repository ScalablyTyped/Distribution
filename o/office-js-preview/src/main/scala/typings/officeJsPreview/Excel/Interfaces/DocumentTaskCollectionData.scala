package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentTaskCollection.toJSON()`. */
trait DocumentTaskCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[DocumentTaskData]] = js.undefined
}
object DocumentTaskCollectionData {
  
  inline def apply(): DocumentTaskCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskCollectionData]
  }
  
  extension [Self <: DocumentTaskCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[DocumentTaskData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DocumentTaskData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
