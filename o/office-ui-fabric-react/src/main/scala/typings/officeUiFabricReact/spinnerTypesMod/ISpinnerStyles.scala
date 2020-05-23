package typings.officeUiFabricReact.spinnerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerStyles extends js.Object {
  /** Styles for the spinner circle animation. */
  var circle: js.UndefOr[IStyle] = js.undefined
  /** Styles for the label accompanying the circle. */
  var label: js.UndefOr[IStyle] = js.undefined
  /** Styles for the root element. Refers to the wrapper containing both the circle and the label. */
  var root: js.UndefOr[IStyle] = js.undefined
  /** Styles for the hidden helper element to aid with screen readers. */
  var screenReaderText: js.UndefOr[IStyle] = js.undefined
}

object ISpinnerStyles {
  @scala.inline
  def apply(
    circle: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    screenReaderText: js.UndefOr[Null | IStyle] = js.undefined
  ): ISpinnerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderText)) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerStyles]
  }
}

