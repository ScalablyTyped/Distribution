package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomXmlPartScopedCollection object, for use in `customXmlPartScopedCollection.set({ ... })`. */
trait CustomXmlPartScopedCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}
object CustomXmlPartScopedCollectionUpdateData {
  
  inline def apply(): CustomXmlPartScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartScopedCollectionUpdateData]
  }
  
  extension [Self <: CustomXmlPartScopedCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
