package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.alter
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
  implicit class AlterOps[Self <: Alter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpr(value: js.Any): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: From): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: alter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
