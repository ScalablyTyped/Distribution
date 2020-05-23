package typings.officeUiFabricReact.iconTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconStyles extends js.Object {
  /**
    * Deprecated. Use `root`.
    * @deprecated Use `root`.
    */
  var imageContainer: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
}

object IIconStyles {
  @scala.inline
  def apply(
    imageContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IIconStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageContainer)) __obj.updateDynamic("imageContainer")(imageContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconStyles]
  }
}

