package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Babel extends StObject {
  
  var __js_expression: Parser[Any]
  
  var __vue_event_binding: Parser[Any]
  
  var __vue_expression: Parser[Any]
  
  var babel: Parser[Any]
  
  var `babel-flow`: Parser[Any]
  
  var `babel-ts`: Parser[Any]
  
  var json: Parser[Any]
  
  var `json-stringify`: Parser[Any]
  
  var json5: Parser[Any]
}
object Babel {
  
  inline def apply(
    __js_expression: Parser[Any],
    __vue_event_binding: Parser[Any],
    __vue_expression: Parser[Any],
    babel: Parser[Any],
    `babel-flow`: Parser[Any],
    `babel-ts`: Parser[Any],
    json: Parser[Any],
    `json-stringify`: Parser[Any],
    json5: Parser[Any]
  ): Babel = {
    val __obj = js.Dynamic.literal(__js_expression = __js_expression.asInstanceOf[js.Any], __vue_event_binding = __vue_event_binding.asInstanceOf[js.Any], __vue_expression = __vue_expression.asInstanceOf[js.Any], babel = babel.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], json5 = json5.asInstanceOf[js.Any])
    __obj.updateDynamic("babel-flow")(`babel-flow`.asInstanceOf[js.Any])
    __obj.updateDynamic("babel-ts")(`babel-ts`.asInstanceOf[js.Any])
    __obj.updateDynamic("json-stringify")(`json-stringify`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Babel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Babel] (val x: Self) extends AnyVal {
    
    inline def setBabel(value: Parser[Any]): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
    
    inline def `setBabel-flow`(value: Parser[Any]): Self = StObject.set(x, "babel-flow", value.asInstanceOf[js.Any])
    
    inline def `setBabel-ts`(value: Parser[Any]): Self = StObject.set(x, "babel-ts", value.asInstanceOf[js.Any])
    
    inline def setJson(value: Parser[Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def `setJson-stringify`(value: Parser[Any]): Self = StObject.set(x, "json-stringify", value.asInstanceOf[js.Any])
    
    inline def setJson5(value: Parser[Any]): Self = StObject.set(x, "json5", value.asInstanceOf[js.Any])
    
    inline def set__js_expression(value: Parser[Any]): Self = StObject.set(x, "__js_expression", value.asInstanceOf[js.Any])
    
    inline def set__vue_event_binding(value: Parser[Any]): Self = StObject.set(x, "__vue_event_binding", value.asInstanceOf[js.Any])
    
    inline def set__vue_expression(value: Parser[Any]): Self = StObject.set(x, "__vue_expression", value.asInstanceOf[js.Any])
  }
}
