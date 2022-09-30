package typings.mobx.anon

import typings.mobx.mobxStrings.action
import typings.mobx.spyMod._PureSpyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arguments
  extends StObject
     with _PureSpyEvent {
  
  var arguments: js.Array[Any]
  
  var name: String
  
  var `object`: Any
  
  var `type`: action
}
object Arguments {
  
  inline def apply(arguments: js.Array[Any], name: String, `object`: Any): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("action")
    __obj.asInstanceOf[Arguments]
  }
  
  extension [Self <: Arguments](x: Self) {
    
    inline def setArguments(value: js.Array[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Any*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: action): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
