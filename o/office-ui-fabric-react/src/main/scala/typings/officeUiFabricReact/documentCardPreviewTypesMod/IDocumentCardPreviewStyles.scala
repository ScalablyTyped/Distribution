package typings.officeUiFabricReact.documentCardPreviewTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardPreviewStyles extends js.Object {
  var fileList: IStyle = js.native
  var fileListIcon: IStyle = js.native
  var fileListLink: IStyle = js.native
  var fileListOverflowText: IStyle = js.native
  var icon: IStyle = js.native
  var previewIcon: IStyle = js.native
  var root: IStyle = js.native
}

object IDocumentCardPreviewStyles {
  @scala.inline
  def apply(): IDocumentCardPreviewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardPreviewStyles]
  }
  @scala.inline
  implicit class IDocumentCardPreviewStylesOps[Self <: IDocumentCardPreviewStyles] (val x: Self) extends AnyVal {
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
    def setFileList(value: IStyle): Self = this.set("fileList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileList: Self = this.set("fileList", js.undefined)
    @scala.inline
    def setFileListNull: Self = this.set("fileList", null)
    @scala.inline
    def setFileListIcon(value: IStyle): Self = this.set("fileListIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileListIcon: Self = this.set("fileListIcon", js.undefined)
    @scala.inline
    def setFileListIconNull: Self = this.set("fileListIcon", null)
    @scala.inline
    def setFileListLink(value: IStyle): Self = this.set("fileListLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileListLink: Self = this.set("fileListLink", js.undefined)
    @scala.inline
    def setFileListLinkNull: Self = this.set("fileListLink", null)
    @scala.inline
    def setFileListOverflowText(value: IStyle): Self = this.set("fileListOverflowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileListOverflowText: Self = this.set("fileListOverflowText", js.undefined)
    @scala.inline
    def setFileListOverflowTextNull: Self = this.set("fileListOverflowText", null)
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setPreviewIcon(value: IStyle): Self = this.set("previewIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewIcon: Self = this.set("previewIcon", js.undefined)
    @scala.inline
    def setPreviewIconNull: Self = this.set("previewIcon", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

