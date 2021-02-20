package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameStringAny
  extends /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element = js.native
}
object DictpropNameStringAny {
  
  @scala.inline
  def apply(item: typings.std.Element): DictpropNameStringAny = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameStringAny]
  }
  
  @scala.inline
  implicit class DictpropNameStringAnyMutableBuilder[Self <: DictpropNameStringAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
