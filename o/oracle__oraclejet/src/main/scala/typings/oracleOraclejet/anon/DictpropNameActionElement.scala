package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.add
import typings.oracleOraclejet.oracleOraclejetStrings.remove
import typings.oracleOraclejet.oracleOraclejetStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameActionElement
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var action: add | remove | update
  
  var element: typings.std.Element
}
object DictpropNameActionElement {
  
  inline def apply(action: add | remove | update, element: typings.std.Element): DictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameActionElement]
  }
  
  extension [Self <: DictpropNameActionElement](x: Self) {
    
    inline def setAction(value: add | remove | update): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
