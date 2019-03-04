package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends AST {
  var from: js.Array[From | Dual]
  var tables: js.Any
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.delete
  var where: js.Any
}

object Delete {
  @scala.inline
  def apply(
    from: js.Array[From | Dual],
    tables: js.Any,
    `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.delete,
    where: js.Any
  ): Delete = {
    val __obj = js.Dynamic.literal(from = from, tables = tables, where = where)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Delete]
  }
}

