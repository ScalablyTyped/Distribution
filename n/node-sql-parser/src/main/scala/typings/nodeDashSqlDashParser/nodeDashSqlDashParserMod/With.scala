package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait With extends js.Object {
  var columns: js.UndefOr[js.Array[_]] = js.undefined
  var name: String
  var stmt: js.Array[_]
}

object With {
  @scala.inline
  def apply(name: String, stmt: js.Array[_], columns: js.Array[_] = null): With = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stmt = stmt.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[With]
  }
}

