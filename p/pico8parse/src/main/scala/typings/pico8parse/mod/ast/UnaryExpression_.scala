package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.UnaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryExpression_
  extends StObject
     with Base[UnaryExpression]
     with Expression {
  
  var argument: Expression
  
  var operator: UnaryOperator
}
object UnaryExpression_ {
  
  inline def apply(argument: Expression, operator: UnaryOperator): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[UnaryExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnaryExpression_] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: UnaryOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
