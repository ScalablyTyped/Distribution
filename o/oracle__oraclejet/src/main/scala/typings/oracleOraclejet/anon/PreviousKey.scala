package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousKey
  extends /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element = js.native
  
  var key: js.Any = js.native
  
  var previousItem: typings.std.Element = js.native
  
  var previousKey: js.Any = js.native
}
object PreviousKey {
  
  @scala.inline
  def apply(item: typings.std.Element, key: js.Any, previousItem: typings.std.Element, previousKey: js.Any): PreviousKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousKey]
  }
  
  @scala.inline
  implicit class PreviousKeyMutableBuilder[Self <: PreviousKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousItem(value: typings.std.Element): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousKey(value: js.Any): Self = StObject.set(x, "previousKey", value.asInstanceOf[js.Any])
  }
}
