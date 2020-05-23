package typings.officeUiFabricReact.documentCardPreviewTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewStyles extends js.Object {
  var fileList: IStyle
  var fileListIcon: IStyle
  var fileListLink: IStyle
  var fileListOverflowText: IStyle
  var icon: IStyle
  var previewIcon: IStyle
  var root: IStyle
}

object IDocumentCardPreviewStyles {
  @scala.inline
  def apply(
    fileList: js.UndefOr[Null | IStyle] = js.undefined,
    fileListIcon: js.UndefOr[Null | IStyle] = js.undefined,
    fileListLink: js.UndefOr[Null | IStyle] = js.undefined,
    fileListOverflowText: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    previewIcon: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IDocumentCardPreviewStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileList)) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (!js.isUndefined(fileListIcon)) __obj.updateDynamic("fileListIcon")(fileListIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(fileListLink)) __obj.updateDynamic("fileListLink")(fileListLink.asInstanceOf[js.Any])
    if (!js.isUndefined(fileListOverflowText)) __obj.updateDynamic("fileListOverflowText")(fileListOverflowText.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(previewIcon)) __obj.updateDynamic("previewIcon")(previewIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewStyles]
  }
}

