package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.ForNumericStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForNumericStatement_
  extends StObject
     with Base[ForNumericStatement]
     with _Statement {
  
  var body: js.Array[Statement]
  
  var end: Expression
  
  var start: Expression
  
  var step: Expression | Null
  
  var variable: Identifier_
}
object ForNumericStatement_ {
  
  inline def apply(body: js.Array[Statement], end: Expression, start: Expression, variable: Identifier_): ForNumericStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], step = null)
    __obj.updateDynamic("type")("ForNumericStatement")
    __obj.asInstanceOf[ForNumericStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForNumericStatement_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setEnd(value: Expression): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Expression): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Expression): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setVariable(value: Identifier_): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
