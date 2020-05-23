package typings.officeUiFabricReact.toggleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggleStyles extends js.Object {
  /**
    * Container for the toggle pill and the text next to it.
    */
  var container: IStyle
  /**
    * Label element above the toggle.
    */
  var label: IStyle
  /**
    * Pill, rendered as a button.
    */
  var pill: IStyle
  /** Root element. */
  var root: IStyle
  /**
    * Text next to the pill.
    */
  var text: IStyle
  /**
    * Thumb inside of the pill.
    */
  var thumb: IStyle
}

object IToggleStyles {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    pill: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    text: js.UndefOr[Null | IStyle] = js.undefined,
    thumb: js.UndefOr[Null | IStyle] = js.undefined
  ): IToggleStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(pill)) __obj.updateDynamic("pill")(pill.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb)) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToggleStyles]
  }
}

