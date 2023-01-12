package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.ForGenericStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForGenericStatement_
  extends StObject
     with Base[ForGenericStatement]
     with _Statement {
  
  var body: js.Array[Statement]
  
  var iterators: js.Array[Expression]
  
  var variables: js.Array[Identifier_]
}
object ForGenericStatement_ {
  
  inline def apply(body: js.Array[Statement], iterators: js.Array[Expression], variables: js.Array[Identifier_]): ForGenericStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForGenericStatement")
    __obj.asInstanceOf[ForGenericStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForGenericStatement_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setIterators(value: js.Array[Expression]): Self = StObject.set(x, "iterators", value.asInstanceOf[js.Any])
    
    inline def setIteratorsVarargs(value: Expression*): Self = StObject.set(x, "iterators", js.Array(value*))
    
    inline def setVariables(value: js.Array[Identifier_]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: Identifier_ *): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
