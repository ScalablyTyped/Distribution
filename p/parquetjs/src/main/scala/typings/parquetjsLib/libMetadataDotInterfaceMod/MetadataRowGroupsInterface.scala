package typings
package parquetjsLib.libMetadataDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRowGroupsInterface extends js.Object {
  var columns: js.Array[MetadataRowGroupsColumnsInterface]
  var num_rows: nodeDashInt64Lib.nodeDashInt64Mod.^
  var sorting_columns: (js.Array[js.Array[java.lang.String] | java.lang.String]) | scala.Null
  var total_byte_size: nodeDashInt64Lib.nodeDashInt64Mod.^
}

object MetadataRowGroupsInterface {
  @scala.inline
  def apply(
    columns: js.Array[MetadataRowGroupsColumnsInterface],
    num_rows: nodeDashInt64Lib.nodeDashInt64Mod.^,
    total_byte_size: nodeDashInt64Lib.nodeDashInt64Mod.^,
    sorting_columns: js.Array[js.Array[java.lang.String] | java.lang.String] = null
  ): MetadataRowGroupsInterface = {
    val __obj = js.Dynamic.literal(columns = columns, num_rows = num_rows, total_byte_size = total_byte_size)
    if (sorting_columns != null) __obj.updateDynamic("sorting_columns")(sorting_columns)
    __obj.asInstanceOf[MetadataRowGroupsInterface]
  }
}

