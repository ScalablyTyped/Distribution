package typings.parquetjs.metadataInterfaceMod

import typings.nodeInt64.mod.^
import typings.parquetjs.AnonCodec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRowGroupsColumnsInterface extends js.Object {
  var file_offset: ^
  var file_path: String | Null
  var meta_data: AnonCodec
}

object MetadataRowGroupsColumnsInterface {
  @scala.inline
  def apply(file_offset: ^, meta_data: AnonCodec, file_path: String = null): MetadataRowGroupsColumnsInterface = {
    val __obj = js.Dynamic.literal(file_offset = file_offset.asInstanceOf[js.Any], meta_data = meta_data.asInstanceOf[js.Any])
    if (file_path != null) __obj.updateDynamic("file_path")(file_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRowGroupsColumnsInterface]
  }
}

