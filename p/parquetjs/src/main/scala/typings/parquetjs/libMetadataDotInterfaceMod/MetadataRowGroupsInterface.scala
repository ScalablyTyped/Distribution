package typings.parquetjs.libMetadataDotInterfaceMod

import typings.nodeDashInt64.nodeDashInt64Mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRowGroupsInterface extends js.Object {
  var columns: js.Array[MetadataRowGroupsColumnsInterface]
  var num_rows: ^
  var sorting_columns: (js.Array[js.Array[String] | String]) | Null
  var total_byte_size: ^
}

object MetadataRowGroupsInterface {
  @scala.inline
  def apply(
    columns: js.Array[MetadataRowGroupsColumnsInterface],
    num_rows: ^,
    total_byte_size: ^,
    sorting_columns: js.Array[js.Array[String] | String] = null
  ): MetadataRowGroupsInterface = {
    val __obj = js.Dynamic.literal(columns = columns, num_rows = num_rows, total_byte_size = total_byte_size)
    if (sorting_columns != null) __obj.updateDynamic("sorting_columns")(sorting_columns)
    __obj.asInstanceOf[MetadataRowGroupsInterface]
  }
}

