package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression_
  extends StObject
     with Base[CallExpression]
     with Expression {
  
  var arguments: js.Array[Expression]
  
  var base: Expression
}
object CallExpression_ {
  
  inline def apply(arguments: js.Array[Expression], base: Expression): CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[CallExpression_]
  }
  
  extension [Self <: CallExpression_](x: Self) {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
