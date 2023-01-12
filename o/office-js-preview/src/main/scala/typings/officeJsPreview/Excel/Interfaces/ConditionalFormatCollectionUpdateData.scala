package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalFormatCollection object, for use in `conditionalFormatCollection.set({ ... })`. */
trait ConditionalFormatCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
}
object ConditionalFormatCollectionUpdateData {
  
  inline def apply(): ConditionalFormatCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatCollectionUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormatCollectionUpdateData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ConditionalFormatData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ConditionalFormatData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
