package typings.pico8parse.mod.ast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDeclaration
  extends StObject
     with Base[typings.pico8parse.pico8parseStrings.FunctionDeclaration]
     with Expression
     with _Statement {
  
  var body: js.Array[Statement]
  
  var identifier: Identifier_ | MemberExpression_ | Null
  
  var isLocal: Boolean
  
  var parameters: js.Array[Identifier_ | VarargLiteral]
}
object FunctionDeclaration {
  
  inline def apply(body: js.Array[Statement], isLocal: Boolean, parameters: js.Array[Identifier_ | VarargLiteral]): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[FunctionDeclaration]
  }
  
  extension [Self <: FunctionDeclaration](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setIdentifier(value: Identifier_ | MemberExpression_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Identifier_ | VarargLiteral]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Identifier_ | VarargLiteral)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
