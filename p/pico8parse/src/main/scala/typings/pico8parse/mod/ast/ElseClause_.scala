package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.ElseClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElseClause_
  extends StObject
     with Base[ElseClause]
     with _Node {
  
  var body: js.Array[Statement]
}
object ElseClause_ {
  
  inline def apply(body: js.Array[Statement]): ElseClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElseClause")
    __obj.asInstanceOf[ElseClause_]
  }
  
  extension [Self <: ElseClause_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
  }
}
