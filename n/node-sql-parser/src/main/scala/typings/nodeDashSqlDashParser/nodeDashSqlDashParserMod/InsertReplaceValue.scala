package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.expr_list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertReplaceValue extends js.Object {
  var `type`: expr_list
  var value: js.Array[_]
}

object InsertReplaceValue {
  @scala.inline
  def apply(`type`: expr_list, value: js.Array[_]): InsertReplaceValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplaceValue]
  }
}

