package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetList extends js.Object {
  var column: java.lang.String
  var table: java.lang.String | scala.Null
  var value: js.Any
}

object SetList {
  @scala.inline
  def apply(column: java.lang.String, value: js.Any, table: java.lang.String = null): SetList = {
    val __obj = js.Dynamic.literal(column = column, value = value)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[SetList]
  }
}

