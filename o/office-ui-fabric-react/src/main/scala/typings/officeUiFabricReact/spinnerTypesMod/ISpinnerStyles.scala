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
  def apply(circle: IStyle = null, label: IStyle = null, root: IStyle = null, screenReaderText: IStyle = null): ISpinnerStyles = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (screenReaderText != null) __obj.updateDynamic("screenReaderText")(screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerStyles]
  }
}

