package typings.parquetjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.Any
  var num_rows: Double
  var sorting_columns: Null | js.Array[String]
  var total_byte_size: Double
}

object Columns {
  @scala.inline
  def apply(
    columns: js.Any,
    num_rows: Double,
    total_byte_size: Double,
    sorting_columns: js.Array[String] = null
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any], sorting_columns = sorting_columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

