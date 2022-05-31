package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameStringAny
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var item: typings.std.Element
}
object DictpropNameStringAny {
  
  inline def apply(item: typings.std.Element): DictpropNameStringAny = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameStringAny]
  }
  
  extension [Self <: DictpropNameStringAny](x: Self) {
    
    inline def setItem(value: typings.std.Element): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
