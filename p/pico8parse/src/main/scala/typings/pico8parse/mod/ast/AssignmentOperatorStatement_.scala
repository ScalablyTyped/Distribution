package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.AssignmentOperatorStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentOperatorStatement_
  extends StObject
     with Base[AssignmentOperatorStatement]
     with _Statement {
  
  var init: js.Array[Expression]
  
  var operator: BinaryOperator
  
  var variables: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]
}
object AssignmentOperatorStatement_ {
  
  inline def apply(
    init: js.Array[Expression],
    operator: BinaryOperator,
    variables: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]
  ): AssignmentOperatorStatement_ = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentOperatorStatement")
    __obj.asInstanceOf[AssignmentOperatorStatement_]
  }
  
  extension [Self <: AssignmentOperatorStatement_](x: Self) {
    
    inline def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value*))
    
    inline def setOperator(value: BinaryOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: (IndexExpression_ | MemberExpression_ | Identifier_)*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
