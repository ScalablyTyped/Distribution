package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends AST {
  var from: js.Array[From | Dual]
  var tables: js.Any
  var `type`: delete
  var where: js.Any
}

object Delete {
  @scala.inline
  def apply(from: js.Array[From | Dual], tables: js.Any, `type`: delete, where: js.Any): Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

