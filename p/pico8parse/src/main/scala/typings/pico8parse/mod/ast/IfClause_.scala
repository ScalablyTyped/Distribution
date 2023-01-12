package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.IfClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfClause_
  extends StObject
     with Base[IfClause]
     with _Node {
  
  var body: js.Array[Statement]
  
  var condition: Expression
}
object IfClause_ {
  
  inline def apply(body: js.Array[Statement], condition: Expression): IfClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfClause")
    __obj.asInstanceOf[IfClause_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfClause_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
