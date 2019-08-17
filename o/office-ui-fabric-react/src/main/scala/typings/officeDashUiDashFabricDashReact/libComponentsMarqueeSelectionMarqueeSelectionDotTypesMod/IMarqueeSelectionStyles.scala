package typings.officeDashUiDashFabricDashReact.libComponentsMarqueeSelectionMarqueeSelectionDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(box: IStyle = null, boxFill: IStyle = null, dragMask: IStyle = null, root: IStyle = null): IMarqueeSelectionStyles = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (boxFill != null) __obj.updateDynamic("boxFill")(boxFill.asInstanceOf[js.Any])
    if (dragMask != null) __obj.updateDynamic("dragMask")(dragMask.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionStyles]
  }
}

