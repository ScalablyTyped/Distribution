package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertReplaceValue extends js.Object {
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.expr_list
  var value: js.Array[_]
}

object InsertReplaceValue {
  @scala.inline
  def apply(`type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.expr_list, value: js.Array[_]): InsertReplaceValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InsertReplaceValue]
  }
}

