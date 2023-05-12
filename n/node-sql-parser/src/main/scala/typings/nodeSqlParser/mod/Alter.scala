package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.alter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alter
  extends StObject
     with AST {
  
  var expr: Any
  
  var table: From
  
  var `type`: alter
}
object Alter {
  
  inline def apply(expr: Any, table: From): Alter = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alter")
    __obj.asInstanceOf[Alter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alter] (val x: Self) extends AnyVal {
    
    inline def setExpr(value: Any): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setTable(value: From): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setType(value: alter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
