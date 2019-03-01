package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBy extends js.Object {
  var expr: js.Any
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.ASC | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.DESC
}

object OrderBy {
  @scala.inline
  def apply(
    expr: js.Any,
    `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.ASC | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.DESC
  ): OrderBy = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("expr")(expr)
    __obj.asInstanceOf[OrderBy]
  }
}

