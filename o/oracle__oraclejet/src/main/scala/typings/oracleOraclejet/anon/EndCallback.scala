package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.close
import typings.oracleOraclejet.oracleOraclejetStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndCallback
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var action: open | close
  
  var element: typings.std.Element
  
  def endCallback(): Unit
}
object EndCallback {
  
  inline def apply(action: open | close, element: typings.std.Element, endCallback: () => Unit): EndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    __obj.asInstanceOf[EndCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndCallback] (val x: Self) extends AnyVal {
    
    inline def setAction(value: open | close): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: () => Unit): Self = StObject.set(x, "endCallback", js.Any.fromFunction0(value))
  }
}
