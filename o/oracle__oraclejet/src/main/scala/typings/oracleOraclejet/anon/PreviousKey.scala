package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousKey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item: typings.std.Element
  
  var key: Any
  
  var previousItem: typings.std.Element
  
  var previousKey: Any
}
object PreviousKey {
  
  inline def apply(item: typings.std.Element, key: Any, previousItem: typings.std.Element, previousKey: Any): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviousKey] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPreviousItem(value: typings.std.Element): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    inline def setPreviousKey(value: Any): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
  }
}
