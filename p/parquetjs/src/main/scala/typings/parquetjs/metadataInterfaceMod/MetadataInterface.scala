package typings.parquetjs.metadataInterfaceMod

import typings.nodeInt64.mod.^
import typings.parquetjs.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataInterface extends js.Object {
  var created_by: String
  var key_value_metadata: js.Array[Key]
  var num_rows: ^
  var row_groups: js.Array[MetadataRowGroupsInterface]
  var schema: js.Array[MetadataSchemaInterface]
  var version: Double
}

object MetadataInterface {
  @scala.inline
  def apply(
    created_by: String,
    key_value_metadata: js.Array[Key],
    num_rows: ^,
    row_groups: js.Array[MetadataRowGroupsInterface],
    schema: js.Array[MetadataSchemaInterface],
    version: Double
  ): MetadataInterface = {
    val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], key_value_metadata = key_value_metadata.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], row_groups = row_groups.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataInterface]
  }
}

