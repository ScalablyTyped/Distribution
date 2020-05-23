package typings.nodal.anon

import typings.nodal.mod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.Array[IColumn]
  var table: String
}

object Columns {
  @scala.inline
  def apply(columns: js.Array[IColumn], table: String): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

