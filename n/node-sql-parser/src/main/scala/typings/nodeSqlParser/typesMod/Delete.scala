package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delete extends AST {
  
  var from: js.Array[From | Dual] = js.native
  
  var table: js.Any = js.native
  
  var `type`: delete = js.native
  
  var where: js.Any = js.native
}
object Delete {
  
  @scala.inline
  def apply(from: js.Array[From | Dual], table: js.Any, `type`: delete, where: js.Any): Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
    
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
    def setFromVarargs(value: (From | Dual)*): Self = this.set("from", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: js.Array[From | Dual]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: js.Any): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Any): Self = this.set("where", value.asInstanceOf[js.Any])
  }
}
