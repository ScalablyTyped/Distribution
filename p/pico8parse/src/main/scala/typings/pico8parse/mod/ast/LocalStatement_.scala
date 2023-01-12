package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.LocalStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStatement_
  extends StObject
     with Base[LocalStatement]
     with _Statement {
  
  var init: js.Array[Expression]
  
  var variables: js.Array[Identifier_]
}
object LocalStatement_ {
  
  inline def apply(init: js.Array[Expression], variables: js.Array[Identifier_]): LocalStatement_ = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LocalStatement")
    __obj.asInstanceOf[LocalStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalStatement_] (val x: Self) extends AnyVal {
    
    inline def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value*))
    
    inline def setVariables(value: js.Array[Identifier_]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: Identifier_ *): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
