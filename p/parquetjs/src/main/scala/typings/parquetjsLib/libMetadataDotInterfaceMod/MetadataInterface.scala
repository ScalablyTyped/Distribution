package typings
package parquetjsLib.libMetadataDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataInterface extends js.Object {
  var created_by: java.lang.String
  var key_value_metadata: js.Array[parquetjsLib.Anon_Key]
  var num_rows: nodeDashInt64Lib.nodeDashInt64Mod.^
  var row_groups: js.Array[MetadataRowGroupsInterface]
  var schema: js.Array[MetadataSchemaInterface]
  var version: scala.Double
}

object MetadataInterface {
  @scala.inline
  def apply(
    created_by: java.lang.String,
    key_value_metadata: js.Array[parquetjsLib.Anon_Key],
    num_rows: nodeDashInt64Lib.nodeDashInt64Mod.^,
    row_groups: js.Array[MetadataRowGroupsInterface],
    schema: js.Array[MetadataSchemaInterface],
    version: scala.Double
  ): MetadataInterface = {
    val __obj = js.Dynamic.literal(created_by = created_by, key_value_metadata = key_value_metadata, num_rows = num_rows, row_groups = row_groups, schema = schema, version = version)
  
    __obj.asInstanceOf[MetadataInterface]
  }
}

