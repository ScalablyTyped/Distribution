package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait With extends js.Object {
  var columns: js.UndefOr[js.Array[_]] = js.undefined
  var name: java.lang.String
  var stmt: js.Array[_]
}

object With {
  @scala.inline
  def apply(name: java.lang.String, stmt: js.Array[_], columns: js.Array[_] = null): With = {
    val __obj = js.Dynamic.literal(name = name, stmt = stmt)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    __obj.asInstanceOf[With]
  }
}

