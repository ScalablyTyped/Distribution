package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromItem
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var fromItem: typings.std.Element
  
  var fromKey: js.Any
  
  var toItem: typings.std.Element
  
  var toKey: js.Any
}
object FromItem {
  
  inline def apply(fromItem: typings.std.Element, fromKey: js.Any, toItem: typings.std.Element, toKey: js.Any): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromItem]
  }
  
  extension [Self <: FromItem](x: Self) {
    
    inline def setFromItem(value: typings.std.Element): Self = StObject.set(x, "fromItem", value.asInstanceOf[js.Any])
    
    inline def setFromKey(value: js.Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    inline def setToItem(value: typings.std.Element): Self = StObject.set(x, "toItem", value.asInstanceOf[js.Any])
    
    inline def setToKey(value: js.Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
  }
}
