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
    keyboardMoveIcon: js.UndefOr[Null | IStyle] = js.undefined,
    keyboardMoveIconContainer: js.UndefOr[Null | IStyle] = js.undefined,
    layer: js.UndefOr[Null | IStyle] = js.undefined,
    main: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    scrollableContent: js.UndefOr[Null | IStyle] = js.undefined
  ): IModalStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keyboardMoveIcon)) __obj.updateDynamic("keyboardMoveIcon")(keyboardMoveIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardMoveIconContainer)) __obj.updateDynamic("keyboardMoveIconContainer")(keyboardMoveIconContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollableContent)) __obj.updateDynamic("scrollableContent")(scrollableContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyles]
  }
}

