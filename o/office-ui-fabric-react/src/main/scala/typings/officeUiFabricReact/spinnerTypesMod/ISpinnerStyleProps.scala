package typings.officeUiFabricReact.spinnerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerStyleProps extends js.Object {
  /** CSS class name for the component attached to the root stylable area. */
  var className: js.UndefOr[String] = js.undefined
  /** Position of the label in regards to the spinner animation. */
  var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.undefined
  /** Size of the spinner animation. */
  var size: js.UndefOr[SpinnerSize] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: ITheme
}

object ISpinnerStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    labelPosition: SpinnerLabelPosition = null,
    size: SpinnerSize = null
  ): ISpinnerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerStyleProps]
  }
}

