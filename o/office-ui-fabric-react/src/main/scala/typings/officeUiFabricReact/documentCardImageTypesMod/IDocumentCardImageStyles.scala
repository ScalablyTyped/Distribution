package typings.officeUiFabricReact.documentCardImageTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardImageStyles extends js.Object {
  var centeredIcon: IStyle
  var centeredIconWrapper: IStyle
  var cornerIcon: IStyle
  var root: IStyle
}

object IDocumentCardImageStyles {
  @scala.inline
  def apply(
    centeredIcon: js.UndefOr[Null | IStyle] = js.undefined,
    centeredIconWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    cornerIcon: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IDocumentCardImageStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centeredIcon)) __obj.updateDynamic("centeredIcon")(centeredIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredIconWrapper)) __obj.updateDynamic("centeredIconWrapper")(centeredIconWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerIcon)) __obj.updateDynamic("cornerIcon")(cornerIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardImageStyles]
  }
}

