package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customXmlPartScopedCollection.toJSON()`. */
trait CustomXmlPartScopedCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
}
object CustomXmlPartScopedCollectionData {
  
  inline def apply(): CustomXmlPartScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartScopedCollectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomXmlPartScopedCollectionData] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
