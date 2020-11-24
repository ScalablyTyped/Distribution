package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.aggr_func
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggrFunc extends js.Object {
  
  var args: ColumnRef | AggrFunc | Star | Null = js.native
  
  var name: String = js.native
  
  var `type`: aggr_func = js.native
}
object AggrFunc {
  
  @scala.inline
  def apply(name: String, `type`: aggr_func): AggrFunc = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggrFunc]
  }
  
  @scala.inline
  implicit class AggrFuncOps[Self <: AggrFunc] (val x: Self) extends AnyVal {
    
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
    def setType(value: aggr_func): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: ColumnRef | AggrFunc | Star): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsNull: Self = this.set("args", null)
  }
}
