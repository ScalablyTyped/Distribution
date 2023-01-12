package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ngaction extends StObject {
  
  var __ng_action: Parser[Any]
  
  var __ng_binding: Parser[Any]
  
  var __ng_directive: Parser[Any]
  
  var __ng_interpolation: Parser[Any]
}
object Ngaction {
  
  inline def apply(
    __ng_action: Parser[Any],
    __ng_binding: Parser[Any],
    __ng_directive: Parser[Any],
    __ng_interpolation: Parser[Any]
  ): Ngaction = {
    val __obj = js.Dynamic.literal(__ng_action = __ng_action.asInstanceOf[js.Any], __ng_binding = __ng_binding.asInstanceOf[js.Any], __ng_directive = __ng_directive.asInstanceOf[js.Any], __ng_interpolation = __ng_interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ngaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ngaction] (val x: Self) extends AnyVal {
    
    inline def set__ng_action(value: Parser[Any]): Self = StObject.set(x, "__ng_action", value.asInstanceOf[js.Any])
    
    inline def set__ng_binding(value: Parser[Any]): Self = StObject.set(x, "__ng_binding", value.asInstanceOf[js.Any])
    
    inline def set__ng_directive(value: Parser[Any]): Self = StObject.set(x, "__ng_directive", value.asInstanceOf[js.Any])
    
    inline def set__ng_interpolation(value: Parser[Any]): Self = StObject.set(x, "__ng_interpolation", value.asInstanceOf[js.Any])
  }
}
