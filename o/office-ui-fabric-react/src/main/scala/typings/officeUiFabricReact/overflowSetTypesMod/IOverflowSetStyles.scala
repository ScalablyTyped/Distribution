package typings.officeUiFabricReact.overflowSetTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowSetStyles extends js.Object {
  /** The style that is layered onto each individual item in the overflow set. */
  var item: js.UndefOr[IStyle] = js.undefined
  /** The style that is layered onto the overflow button for the overflow set. */
  var overflowButton: js.UndefOr[IStyle] = js.undefined
  /** The style that is layered onto the root element of OverflowSet. */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IOverflowSetStyles {
  @scala.inline
  def apply(
    item: js.UndefOr[Null | IStyle] = js.undefined,
    overflowButton: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IOverflowSetStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowButton)) __obj.updateDynamic("overflowButton")(overflowButton.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowSetStyles]
  }
}

