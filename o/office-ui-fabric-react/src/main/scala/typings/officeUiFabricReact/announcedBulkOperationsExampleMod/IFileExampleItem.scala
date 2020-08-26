package typings.officeUiFabricReact.announcedBulkOperationsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileExampleItem extends js.Object {
  var filesize: String = js.native
  var key: String = js.native
  var modified: String = js.native
  var modifiedby: String = js.native
  var name: String = js.native
}

object IFileExampleItem {
  @scala.inline
  def apply(filesize: String, key: String, modified: String, modifiedby: String, name: String): IFileExampleItem = {
    val __obj = js.Dynamic.literal(filesize = filesize.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modifiedby = modifiedby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileExampleItem]
  }
  @scala.inline
  implicit class IFileExampleItemOps[Self <: IFileExampleItem] (val x: Self) extends AnyVal {
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
    def setFilesize(value: String): Self = this.set("filesize", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedby(value: String): Self = this.set("modifiedby", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

