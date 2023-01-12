package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement_
  extends StObject
     with Base[ReturnStatement]
     with _Statement {
  
  var arguments: js.Array[Expression]
}
object ReturnStatement_ {
  
  inline def apply(arguments: js.Array[Expression]): ReturnStatement_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnStatement_] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value*))
  }
}
