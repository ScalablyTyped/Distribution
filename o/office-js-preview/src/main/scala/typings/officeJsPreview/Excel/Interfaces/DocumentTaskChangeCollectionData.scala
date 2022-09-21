package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `documentTaskChangeCollection.toJSON()`. */
trait DocumentTaskChangeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[DocumentTaskChangeData]] = js.undefined
}
object DocumentTaskChangeCollectionData {
  
  inline def apply(): DocumentTaskChangeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTaskChangeCollectionData]
  }
  
  extension [Self <: DocumentTaskChangeCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[DocumentTaskChangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DocumentTaskChangeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
