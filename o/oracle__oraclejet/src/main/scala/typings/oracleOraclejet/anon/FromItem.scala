package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromItem
  extends /* key */ StringDictionary[js.Any] {
  
  var fromItem: typings.std.Element = js.native
  
  var fromKey: js.Any = js.native
  
  var toItem: typings.std.Element = js.native
  
  var toKey: js.Any = js.native
}
object FromItem {
  
  @scala.inline
  def apply(fromItem: typings.std.Element, fromKey: js.Any, toItem: typings.std.Element, toKey: js.Any): FromItem = {
    val __obj = js.Dynamic.literal(fromItem = fromItem.asInstanceOf[js.Any], fromKey = fromKey.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], toKey = toKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromItem]
  }
  
  @scala.inline
  implicit class FromItemMutableBuilder[Self <: FromItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromItem(value: typings.std.Element): Self = StObject.set(x, "fromItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromKey(value: js.Any): Self = StObject.set(x, "fromKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToItem(value: typings.std.Element): Self = StObject.set(x, "toItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToKey(value: js.Any): Self = StObject.set(x, "toKey", value.asInstanceOf[js.Any])
  }
}
