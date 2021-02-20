package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameItemKey
  extends /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element = js.native
  
  var key: js.Any = js.native
}
object DictpropNameItemKey {
  
  @scala.inline
  def apply(item: typings.std.Element, key: js.Any): DictpropNameItemKey = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameItemKey]
  }
  
  @scala.inline
  implicit class DictpropNameItemKeyMutableBuilder[Self <: DictpropNameItemKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
