package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardPreviewDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewStyles extends js.Object {
  var fileList: IStyle
  var fileListIcon: IStyle
  var fileListOverflowText: IStyle
  var icon: IStyle
  var previewIcon: IStyle
  var root: IStyle
}

object IDocumentCardPreviewStyles {
  @scala.inline
  def apply(
    fileList: IStyle = null,
    fileListIcon: IStyle = null,
    fileListOverflowText: IStyle = null,
    icon: IStyle = null,
    previewIcon: IStyle = null,
    root: IStyle = null
  ): IDocumentCardPreviewStyles = {
    val __obj = js.Dynamic.literal()
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (fileListIcon != null) __obj.updateDynamic("fileListIcon")(fileListIcon.asInstanceOf[js.Any])
    if (fileListOverflowText != null) __obj.updateDynamic("fileListOverflowText")(fileListOverflowText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (previewIcon != null) __obj.updateDynamic("previewIcon")(previewIcon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewStyles]
  }
}

