package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnAst extends js.Object {
  var ast: js.Array[AST] | AST
  var columnsList: js.Array[java.lang.String]
  var tableList: js.Array[java.lang.String]
}

object TableColumnAst {
  @scala.inline
  def apply(
    ast: js.Array[AST] | AST,
    columnsList: js.Array[java.lang.String],
    tableList: js.Array[java.lang.String]
  ): TableColumnAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], columnsList = columnsList, tableList = tableList)
  
    __obj.asInstanceOf[TableColumnAst]
  }
}

