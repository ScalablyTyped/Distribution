package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedSheetViewCollection.toJSON()`. */
trait NamedSheetViewCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[NamedSheetViewData]] = js.undefined
}
object NamedSheetViewCollectionData {
  
  inline def apply(): NamedSheetViewCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewCollectionData]
  }
  
  extension [Self <: NamedSheetViewCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[NamedSheetViewData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NamedSheetViewData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
