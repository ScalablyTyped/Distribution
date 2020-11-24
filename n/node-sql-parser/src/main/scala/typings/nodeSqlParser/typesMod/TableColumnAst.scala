package typings.nodeSqlParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableColumnAst extends js.Object {
  
  var ast: js.Array[AST] | AST = js.native
  
  var columnList: js.Array[String] = js.native
  
  var tableList: js.Array[String] = js.native
}
object TableColumnAst {
  
  @scala.inline
  def apply(ast: js.Array[AST] | AST, columnList: js.Array[String], tableList: js.Array[String]): TableColumnAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], columnList = columnList.asInstanceOf[js.Any], tableList = tableList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnAst]
  }
  
  @scala.inline
  implicit class TableColumnAstOps[Self <: TableColumnAst] (val x: Self) extends AnyVal {
    
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
    def setAstVarargs(value: AST*): Self = this.set("ast", js.Array(value :_*))
    
    @scala.inline
    def setAst(value: js.Array[AST] | AST): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnListVarargs(value: String*): Self = this.set("columnList", js.Array(value :_*))
    
    @scala.inline
    def setColumnList(value: js.Array[String]): Self = this.set("columnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableListVarargs(value: String*): Self = this.set("tableList", js.Array(value :_*))
    
    @scala.inline
    def setTableList(value: js.Array[String]): Self = this.set("tableList", value.asInstanceOf[js.Any])
  }
}
