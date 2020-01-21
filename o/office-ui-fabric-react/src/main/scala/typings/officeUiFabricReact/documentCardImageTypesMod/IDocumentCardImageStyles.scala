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
    centeredIcon: IStyle = null,
    centeredIconWrapper: IStyle = null,
    cornerIcon: IStyle = null,
    root: IStyle = null
  ): IDocumentCardImageStyles = {
    val __obj = js.Dynamic.literal()
    if (centeredIcon != null) __obj.updateDynamic("centeredIcon")(centeredIcon.asInstanceOf[js.Any])
    if (centeredIconWrapper != null) __obj.updateDynamic("centeredIconWrapper")(centeredIconWrapper.asInstanceOf[js.Any])
    if (cornerIcon != null) __obj.updateDynamic("cornerIcon")(cornerIcon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardImageStyles]
  }
}

