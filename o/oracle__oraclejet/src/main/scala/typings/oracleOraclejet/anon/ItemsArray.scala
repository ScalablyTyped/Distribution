package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsArray extends StObject {
  
  var items: js.Array[typings.std.Element]
}
object ItemsArray {
  
  inline def apply(items: js.Array[typings.std.Element]): ItemsArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArray]
  }
  
  extension [Self <: ItemsArray](x: Self) {
    
    inline def setItems(value: js.Array[typings.std.Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: typings.std.Element*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
