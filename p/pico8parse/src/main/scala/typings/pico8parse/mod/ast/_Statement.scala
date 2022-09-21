package typings.pico8parse.mod.ast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Statement
  extends StObject
     with _Node
object _Statement {
  
  inline def AssignmentOperatorStatement_(
    init: js.Array[Expression],
    operator: BinaryOperator,
    variables: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]
  ): typings.pico8parse.mod.ast.AssignmentOperatorStatement_ = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentOperatorStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.AssignmentOperatorStatement_]
  }
  
  inline def AssignmentStatement_(
    init: js.Array[Expression],
    variables: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]
  ): typings.pico8parse.mod.ast.AssignmentStatement_ = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.AssignmentStatement_]
  }
  
  inline def CallStatement_(expression: CallExpression_ | StringCallExpression_ | TableCallExpression_): typings.pico8parse.mod.ast.CallStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.CallStatement_]
  }
  
  inline def DoStatement_(body: js.Array[Statement]): typings.pico8parse.mod.ast.DoStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.DoStatement_]
  }
  
  inline def ForGenericStatement_(body: js.Array[Statement], iterators: js.Array[Expression], variables: js.Array[Identifier_]): typings.pico8parse.mod.ast.ForGenericStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForGenericStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.ForGenericStatement_]
  }
  
  inline def ForNumericStatement_(body: js.Array[Statement], end: Expression, start: Expression, variable: Identifier_): typings.pico8parse.mod.ast.ForNumericStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], step = null)
    __obj.updateDynamic("type")("ForNumericStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.ForNumericStatement_]
  }
  
  inline def FunctionDeclaration(body: js.Array[Statement], isLocal: Boolean, parameters: js.Array[Identifier_ | VarargLiteral]): typings.pico8parse.mod.ast.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.FunctionDeclaration]
  }
  
  inline def GotoStatement_(label: Identifier_): typings.pico8parse.mod.ast.GotoStatement_ = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GotoStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.GotoStatement_]
  }
  
  inline def IfStatement_(clauses: IfStatementClauses): typings.pico8parse.mod.ast.IfStatement_ = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.IfStatement_]
  }
  
  inline def LabelStatement_(label: Identifier_): typings.pico8parse.mod.ast.LabelStatement_ = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabelStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.LabelStatement_]
  }
  
  inline def LocalStatement_(init: js.Array[Expression], variables: js.Array[Identifier_]): typings.pico8parse.mod.ast.LocalStatement_ = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LocalStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.LocalStatement_]
  }
  
  inline def RepeatStatement_(body: js.Array[Statement], condition: Expression): typings.pico8parse.mod.ast.RepeatStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RepeatStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.RepeatStatement_]
  }
  
  inline def ReturnStatement_(arguments: js.Array[Expression]): typings.pico8parse.mod.ast.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.ReturnStatement_]
  }
  
  inline def WhileStatement_(body: js.Array[Statement], condition: Expression): typings.pico8parse.mod.ast.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.pico8parse.mod.ast.WhileStatement_]
  }
}
