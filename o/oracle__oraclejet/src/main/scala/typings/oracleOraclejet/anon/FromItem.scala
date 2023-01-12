package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromItem
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var fromItem: typings.std.Element
  
  var fromKey: Any
  
  var toItem: typings.std.Element
  
  var toKey: Any
}
object FromItem {
  
  inline def apply(fromItem: typings.std.Element, fromKey: Any, toItem: typings.std.Element, toKey: Any): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromItem] (val x: Self) extends AnyVal {
    
    inline def setFromItem(value: typings.std.Element): Self = StObject.set(x, "fromItem", value.asInstanceOf[js.Any])
    
    inline def setFromKey(value: Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    inline def setToItem(value: typings.std.Element): Self = StObject.set(x, "toItem", value.asInstanceOf[js.Any])
    
    inline def setToKey(value: Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
  }
}
