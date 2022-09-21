package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfStatement_
  extends StObject
     with Base[IfStatement]
     with _Statement {
  
  var clauses: IfStatementClauses
}
object IfStatement_ {
  
  inline def apply(clauses: IfStatementClauses): IfStatement_ = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[IfStatement_]
  }
  
  extension [Self <: IfStatement_](x: Self) {
    
    inline def setClauses(value: IfStatementClauses): Self = StObject.set(x, "clauses", value.asInstanceOf[js.Any])
  }
}
