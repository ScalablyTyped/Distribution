package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousKey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element
  
  var key: js.Any
  
  var previousItem: typings.std.Element
  
  var previousKey: js.Any
}
object PreviousKey {
  
  inline def apply(item: typings.std.Element, key: js.Any, previousItem: typings.std.Element, previousKey: js.Any): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousKey]
  }
  
  extension [Self <: PreviousKey](x: Self) {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPreviousItem(value: typings.std.Element): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    inline def setPreviousKey(value: js.Any): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
  }
}
