package typings
package parquetjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.Any
  var num_rows: scala.Double
  var sorting_columns: scala.Null | js.Array[java.lang.String]
  var total_byte_size: scala.Double
}

object Anon_Columns {
  @scala.inline
  def apply(
    columns: js.Any,
    num_rows: scala.Double,
    total_byte_size: scala.Double,
    sorting_columns: js.Array[java.lang.String] = null
  ): Anon_Columns = {
    val __obj = js.Dynamic.literal(columns = columns, num_rows = num_rows, total_byte_size = total_byte_size)
    if (sorting_columns != null) __obj.updateDynamic("sorting_columns")(sorting_columns)
    __obj.asInstanceOf[Anon_Columns]
  }
}

