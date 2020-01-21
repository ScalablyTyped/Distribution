package typings.nodeSqlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetList extends js.Object {
  var column: String
  var table: String | Null
  var value: js.Any
}

object SetList {
  @scala.inline
  def apply(column: String, value: js.Any, table: String = null): SetList = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetList]
  }
}

