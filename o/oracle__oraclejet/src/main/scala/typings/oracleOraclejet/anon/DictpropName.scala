package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropName
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var fromCollapsible: typings.std.Element
  
  var toCollapsible: typings.std.Element
}
object DictpropName {
  
  inline def apply(fromCollapsible: typings.std.Element, toCollapsible: typings.std.Element): DictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictpropName] (val x: Self) extends AnyVal {
    
    inline def setFromCollapsible(value: typings.std.Element): Self = StObject.set(x, "fromCollapsible", value.asInstanceOf[js.Any])
    
    inline def setToCollapsible(value: typings.std.Element): Self = StObject.set(x, "toCollapsible", value.asInstanceOf[js.Any])
  }
}
