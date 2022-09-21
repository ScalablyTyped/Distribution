package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.AssignmentStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentStatement_
  extends StObject
     with Base[AssignmentStatement]
     with _Statement {
  
  var init: js.Array[Expression]
  
  var variables: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]
}
object AssignmentStatement_ {
  
  inline def apply(
    init: js.Array[Expression],
    variables: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]
  ): AssignmentStatement_ = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentStatement")
    __obj.asInstanceOf[AssignmentStatement_]
  }
  
  extension [Self <: AssignmentStatement_](x: Self) {
    
    inline def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value*))
    
    inline def setVariables(value: js.Array[IndexExpression_ | MemberExpression_ | Identifier_]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: (IndexExpression_ | MemberExpression_ | Identifier_)*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
