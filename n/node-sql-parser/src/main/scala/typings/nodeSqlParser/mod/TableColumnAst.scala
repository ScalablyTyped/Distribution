package typings.nodeSqlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnAst extends js.Object {
  var ast: js.Array[AST] | AST
  var columnsList: js.Array[String]
  var tableList: js.Array[String]
}

object TableColumnAst {
  @scala.inline
  def apply(ast: js.Array[AST] | AST, columnsList: js.Array[String], tableList: js.Array[String]): TableColumnAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], columnsList = columnsList.asInstanceOf[js.Any], tableList = tableList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableColumnAst]
  }
}

