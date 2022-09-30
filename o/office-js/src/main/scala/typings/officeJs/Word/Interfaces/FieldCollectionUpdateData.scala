package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the FieldCollection object, for use in `fieldCollection.set({ ... })`. */
trait FieldCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[FieldData]] = js.undefined
}
object FieldCollectionUpdateData {
  
  inline def apply(): FieldCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldCollectionUpdateData]
  }
  
  extension [Self <: FieldCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[FieldData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: FieldData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
