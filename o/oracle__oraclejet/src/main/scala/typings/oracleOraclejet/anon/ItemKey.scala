package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemKey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item: typings.std.Element
  
  var key: Any
}
object ItemKey {
  
  inline def apply(item: typings.std.Element, key: Any): ItemKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemKey] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
