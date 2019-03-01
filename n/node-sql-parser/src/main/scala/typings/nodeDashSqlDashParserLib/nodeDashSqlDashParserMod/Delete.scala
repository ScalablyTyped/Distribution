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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("tables")(tables)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[Delete]
  }
}

