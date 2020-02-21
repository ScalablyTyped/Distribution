package typings.officeUiFabricReact

import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalloutPropsHasCloseButton extends js.Object {
  /** Style props for callout. */
  var calloutProps: js.UndefOr[ICalloutContentStyleProps] = js.undefined
  /** If the close button is visible. */
  var hasCloseButton: js.UndefOr[Boolean] = js.undefined
  /** If a headline has been specified. */
  var hasHeadline: js.UndefOr[Boolean] = js.undefined
  /** Class name for primary button. */
  var primaryButtonClassName: js.UndefOr[String] = js.undefined
  /** Class name for secondary button. */
  var secondaryButtonClassName: js.UndefOr[String] = js.undefined
}

object AnonCalloutPropsHasCloseButton {
  @scala.inline
  def apply(
    calloutProps: ICalloutContentStyleProps = null,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    hasHeadline: js.UndefOr[Boolean] = js.undefined,
    primaryButtonClassName: String = null,
    secondaryButtonClassName: String = null
  ): AnonCalloutPropsHasCloseButton = {
    val __obj = js.Dynamic.literal()
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHeadline)) __obj.updateDynamic("hasHeadline")(hasHeadline.asInstanceOf[js.Any])
    if (primaryButtonClassName != null) __obj.updateDynamic("primaryButtonClassName")(primaryButtonClassName.asInstanceOf[js.Any])
    if (secondaryButtonClassName != null) __obj.updateDynamic("secondaryButtonClassName")(secondaryButtonClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalloutPropsHasCloseButton]
  }
}

