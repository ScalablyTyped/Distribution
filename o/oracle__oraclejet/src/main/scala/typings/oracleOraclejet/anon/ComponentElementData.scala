package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElementData extends StObject {
  
  var componentElement: typings.std.Element
  
  var data: js.Object
}
object ComponentElementData {
  
  inline def apply(componentElement: typings.std.Element, data: js.Object): ComponentElementData = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentElementData] (val x: Self) extends AnyVal {
    
    inline def setComponentElement(value: typings.std.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
