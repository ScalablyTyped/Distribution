package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.alter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alter extends AST {
  
  var expr: js.Any = js.native
  
  var table: From = js.native
  
  var `type`: alter = js.native
}
object Alter {
  
  @scala.inline
  def apply(expr: js.Any, table: From, `type`: alter): Alter = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
