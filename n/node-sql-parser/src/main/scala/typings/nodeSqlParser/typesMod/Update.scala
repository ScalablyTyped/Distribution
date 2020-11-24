package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends AST {
  
  var db: String | Null = js.native
  
  var set: js.Array[SetList] = js.native
  
  var table: (js.Array[From | Dual]) | Null = js.native
  
  var `type`: update = js.native
  
  var where: js.Any = js.native
}
object Update {
  
  @scala.inline
  def apply(set: js.Array[SetList], `type`: update, where: js.Any): Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    
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
    def setSetVarargs(value: SetList*): Self = this.set("set", js.Array(value :_*))
    
    @scala.inline
    def setSet(value: js.Array[SetList]): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Any): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNull: Self = this.set("db", null)
    
    @scala.inline
    def setTableVarargs(value: (From | Dual)*): Self = this.set("table", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: js.Array[From | Dual]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNull: Self = this.set("table", null)
  }
}
