package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousItem[K]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element
  
  var key: K
  
  var previousItem: typings.std.Element
  
  var previousKey: K
}
object PreviousItem {
  
  inline def apply[K](item: typings.std.Element, key: K, previousItem: typings.std.Element, previousKey: K): PreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousItem[K]]
  }
  
  extension [Self <: PreviousItem[?], K](x: Self & PreviousItem[K]) {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPreviousItem(value: typings.std.Element): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    inline def setPreviousKey(value: K): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
  }
}
