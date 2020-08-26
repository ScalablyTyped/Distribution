package typings.officeUiFabricReact.detailsListDocumentsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocument extends js.Object {
  var dateModified: String = js.native
  var dateModifiedValue: Double = js.native
  var fileSize: String = js.native
  var fileSizeRaw: Double = js.native
  var fileType: String = js.native
  var iconName: String = js.native
  var key: String = js.native
  var modifiedBy: String = js.native
  var name: String = js.native
  var value: String = js.native
}

object IDocument {
  @scala.inline
  def apply(
    dateModified: String,
    dateModifiedValue: Double,
    fileSize: String,
    fileSizeRaw: Double,
    fileType: String,
    iconName: String,
    key: String,
    modifiedBy: String,
    name: String,
    value: String
  ): IDocument = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], dateModifiedValue = dateModifiedValue.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileSizeRaw = fileSizeRaw.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocument]
  }
  @scala.inline
  implicit class IDocumentOps[Self <: IDocument] (val x: Self) extends AnyVal {
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
    def setDateModified(value: String): Self = this.set("dateModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateModifiedValue(value: Double): Self = this.set("dateModifiedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSizeRaw(value: Double): Self = this.set("fileSizeRaw", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

