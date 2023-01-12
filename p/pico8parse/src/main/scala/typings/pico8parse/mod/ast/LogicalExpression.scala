package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.and
import typings.pico8parse.pico8parseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalExpression
  extends StObject
     with Base[typings.pico8parse.pico8parseStrings.LogicalExpression]
     with Expression {
  
  var left: Expression
  
  var operator: or | and
  
  var right: Expression
}
object LogicalExpression {
  
  inline def apply(left: Expression, operator: or | and, right: Expression): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[LogicalExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogicalExpression] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: or | and): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
