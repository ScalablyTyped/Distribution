package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.alter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alter
  extends StObject
     with AST {
  
  var expr: js.Any
  
  var table: From
  
  var `type`: alter
}
object Alter {
  
  @scala.inline
  def apply(expr: js.Any, table: From): Alter = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alter")
    __obj.asInstanceOf[Alter]
  }
  
  @scala.inline
  implicit class AlterMutableBuilder[Self <: Alter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpr(value: js.Any): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: From): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: alter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
