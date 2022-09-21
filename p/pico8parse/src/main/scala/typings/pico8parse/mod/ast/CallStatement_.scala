package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.CallStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallStatement_
  extends StObject
     with Base[CallStatement]
     with _Statement {
  
  var expression: CallExpression_ | StringCallExpression_ | TableCallExpression_
}
object CallStatement_ {
  
  inline def apply(expression: CallExpression_ | StringCallExpression_ | TableCallExpression_): CallStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallStatement")
    __obj.asInstanceOf[CallStatement_]
  }
  
  extension [Self <: CallStatement_](x: Self) {
    
    inline def setExpression(value: CallExpression_ | StringCallExpression_ | TableCallExpression_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
