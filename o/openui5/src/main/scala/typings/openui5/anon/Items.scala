package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  /**
    * an array of the selected items.
    */
  var items: js.UndefOr[js.Array[Any]] = js.undefined
}
object Items {
  
  inline def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
