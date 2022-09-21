package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.BinaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryExpression_
  extends StObject
     with Base[BinaryExpression]
     with Expression {
  
  var left: Expression
  
  var operator: BinaryOperator | ComparisonOperator
  
  var right: Expression
}
object BinaryExpression_ {
  
  inline def apply(left: Expression, operator: BinaryOperator | ComparisonOperator, right: Expression): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[BinaryExpression_]
  }
  
  extension [Self <: BinaryExpression_](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: BinaryOperator | ComparisonOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
