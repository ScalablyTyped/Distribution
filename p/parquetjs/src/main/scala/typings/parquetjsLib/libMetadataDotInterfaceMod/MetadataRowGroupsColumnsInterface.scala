package typings
package parquetjsLib.libMetadataDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRowGroupsColumnsInterface extends js.Object {
  var file_offset: nodeDashInt64Lib.nodeDashInt64Mod.^
  var file_path: java.lang.String | scala.Null
  var meta_data: parquetjsLib.Anon_Codec
}

object MetadataRowGroupsColumnsInterface {
  @scala.inline
  def apply(
    file_offset: nodeDashInt64Lib.nodeDashInt64Mod.^,
    meta_data: parquetjsLib.Anon_Codec,
    file_path: java.lang.String = null
  ): MetadataRowGroupsColumnsInterface = {
    val __obj = js.Dynamic.literal(file_offset = file_offset, meta_data = meta_data)
    if (file_path != null) __obj.updateDynamic("file_path")(file_path)
    __obj.asInstanceOf[MetadataRowGroupsColumnsInterface]
  }
}

