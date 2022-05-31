package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameItemKey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element
  
  var key: js.Any
}
object DictpropNameItemKey {
  
  inline def apply(item: typings.std.Element, key: js.Any): DictpropNameItemKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItemKey]
  }
  
  extension [Self <: DictpropNameItemKey](x: Self) {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
