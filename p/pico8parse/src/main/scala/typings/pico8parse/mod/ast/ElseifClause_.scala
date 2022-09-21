package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.ElseifClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElseifClause_
  extends StObject
     with Base[ElseifClause]
     with _Node {
  
  var body: js.Array[Statement]
  
  var condition: Expression
}
object ElseifClause_ {
  
  inline def apply(body: js.Array[Statement], condition: Expression): ElseifClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElseifClause")
    __obj.asInstanceOf[ElseifClause_]
  }
  
  extension [Self <: ElseifClause_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
