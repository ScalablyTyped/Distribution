package typings.officeUiFabricReact.marqueeSelectionTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarqueeSelectionStyles extends js.Object {
  var box: js.UndefOr[IStyle] = js.undefined
  var boxFill: js.UndefOr[IStyle] = js.undefined
  var dragMask: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
}

object IMarqueeSelectionStyles {
  @scala.inline
  def apply(
    box: js.UndefOr[Null | IStyle] = js.undefined,
    boxFill: js.UndefOr[Null | IStyle] = js.undefined,
    dragMask: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IMarqueeSelectionStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(box)) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (!js.isUndefined(boxFill)) __obj.updateDynamic("boxFill")(boxFill.asInstanceOf[js.Any])
    if (!js.isUndefined(dragMask)) __obj.updateDynamic("dragMask")(dragMask.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionStyles]
  }
}

