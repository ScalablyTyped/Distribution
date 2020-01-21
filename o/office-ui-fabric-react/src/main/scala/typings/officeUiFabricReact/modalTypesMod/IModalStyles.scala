package typings.officeUiFabricReact.modalTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalStyles extends js.Object {
  var keyboardMoveIcon: IStyle
  var keyboardMoveIconContainer: IStyle
  var layer: IStyle
  var main: IStyle
  var root: IStyle
  var scrollableContent: IStyle
}

object IModalStyles {
  @scala.inline
  def apply(
    keyboardMoveIcon: IStyle = null,
    keyboardMoveIconContainer: IStyle = null,
    layer: IStyle = null,
    main: IStyle = null,
    root: IStyle = null,
    scrollableContent: IStyle = null
  ): IModalStyles = {
    val __obj = js.Dynamic.literal()
    if (keyboardMoveIcon != null) __obj.updateDynamic("keyboardMoveIcon")(keyboardMoveIcon.asInstanceOf[js.Any])
    if (keyboardMoveIconContainer != null) __obj.updateDynamic("keyboardMoveIconContainer")(keyboardMoveIconContainer.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (scrollableContent != null) __obj.updateDynamic("scrollableContent")(scrollableContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyles]
  }
}

