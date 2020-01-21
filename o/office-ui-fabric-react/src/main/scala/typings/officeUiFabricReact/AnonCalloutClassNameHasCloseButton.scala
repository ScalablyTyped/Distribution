package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalloutClassNameHasCloseButton extends js.Object {
  /** Class name for callout. */
  var calloutClassName: js.UndefOr[String] = js.undefined
  /** If the close button is visible. */
  var hasCloseButton: js.UndefOr[Boolean] = js.undefined
  /** Class name for primary button. */
  var primaryButtonClassName: js.UndefOr[String] = js.undefined
  /** Class name for secondary button. */
  var secondaryButtonClassName: js.UndefOr[String] = js.undefined
}

object AnonCalloutClassNameHasCloseButton {
  @scala.inline
  def apply(
    calloutClassName: String = null,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    primaryButtonClassName: String = null,
    secondaryButtonClassName: String = null
  ): AnonCalloutClassNameHasCloseButton = {
    val __obj = js.Dynamic.literal()
    if (calloutClassName != null) __obj.updateDynamic("calloutClassName")(calloutClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (primaryButtonClassName != null) __obj.updateDynamic("primaryButtonClassName")(primaryButtonClassName.asInstanceOf[js.Any])
    if (secondaryButtonClassName != null) __obj.updateDynamic("secondaryButtonClassName")(secondaryButtonClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalloutClassNameHasCloseButton]
  }
}

