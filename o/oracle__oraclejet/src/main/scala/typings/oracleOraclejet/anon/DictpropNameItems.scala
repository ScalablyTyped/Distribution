package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameItems
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var items: js.Array[typings.std.Element]
}
object DictpropNameItems {
  
  inline def apply(items: js.Array[typings.std.Element]): DictpropNameItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictpropNameItems] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[typings.std.Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: typings.std.Element*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
