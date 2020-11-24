package typings.parquetjs.metadataInterfaceMod

import typings.nodeInt64.mod.^
import typings.parquetjs.anon.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataRowGroupsColumnsInterface extends js.Object {
  
  var file_offset: ^ = js.native
  
  var file_path: String | Null = js.native
  
  var meta_data: Codec = js.native
}
object MetadataRowGroupsColumnsInterface {
  
  @scala.inline
  def apply(file_offset: ^, meta_data: Codec): MetadataRowGroupsColumnsInterface = {
    val __obj = js.Dynamic.literal(file_offset = file_offset.asInstanceOf[js.Any], meta_data = meta_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRowGroupsColumnsInterface]
  }
  
  @scala.inline
  implicit class MetadataRowGroupsColumnsInterfaceOps[Self <: MetadataRowGroupsColumnsInterface] (val x: Self) extends AnyVal {
    
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
    def setFile_offset(value: ^): Self = this.set("file_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta_data(value: Codec): Self = this.set("meta_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_path(value: String): Self = this.set("file_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_pathNull: Self = this.set("file_path", null)
  }
}
