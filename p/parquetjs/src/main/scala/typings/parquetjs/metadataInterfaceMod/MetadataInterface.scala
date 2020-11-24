package typings.parquetjs.metadataInterfaceMod

import typings.nodeInt64.mod.^
import typings.parquetjs.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataInterface extends js.Object {
  
  var created_by: String = js.native
  
  var key_value_metadata: js.Array[Key] = js.native
  
  var num_rows: ^ = js.native
  
  var row_groups: js.Array[MetadataRowGroupsInterface] = js.native
  
  var schema: js.Array[MetadataSchemaInterface] = js.native
  
  var version: Double = js.native
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
  
  @scala.inline
  implicit class MetadataInterfaceOps[Self <: MetadataInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreated_by(value: String): Self = this.set("created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_value_metadataVarargs(value: Key*): Self = this.set("key_value_metadata", js.Array(value :_*))
    
    @scala.inline
    def setKey_value_metadata(value: js.Array[Key]): Self = this.set("key_value_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_rows(value: ^): Self = this.set("num_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_groupsVarargs(value: MetadataRowGroupsInterface*): Self = this.set("row_groups", js.Array(value :_*))
    
    @scala.inline
    def setRow_groups(value: js.Array[MetadataRowGroupsInterface]): Self = this.set("row_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVarargs(value: MetadataSchemaInterface*): Self = this.set("schema", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: js.Array[MetadataSchemaInterface]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
