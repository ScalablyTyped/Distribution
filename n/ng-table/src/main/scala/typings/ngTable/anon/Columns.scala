package typings.ngTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: String
  var tableParams: String
}

object Columns {
  @scala.inline
  def apply(columns: String, tableParams: String): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], tableParams = tableParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

