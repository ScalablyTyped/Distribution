package typings.nodeSqlParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait With extends js.Object {
  
  var columns: js.UndefOr[js.Array[_]] = js.native
  
  var name: String = js.native
  
  var stmt: js.Array[_] = js.native
}
object With {
  
  @scala.inline
  def apply(name: String, stmt: js.Array[_]): With = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stmt = stmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[With]
  }
  
  @scala.inline
  implicit class WithOps[Self <: With] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStmtVarargs(value: js.Any*): Self = this.set("stmt", js.Array(value :_*))
    
    @scala.inline
    def setStmt(value: js.Array[_]): Self = this.set("stmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
}
