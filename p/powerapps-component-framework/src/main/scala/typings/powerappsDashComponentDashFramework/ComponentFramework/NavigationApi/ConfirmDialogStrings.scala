package typings.powerappsDashComponentDashFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents the String parameters for Confirm Dialog.
		 */
trait ConfirmDialogStrings extends js.Object {
  /**
  			 * Cancel Button label.
  			 */
  var cancelButtonLabel: js.UndefOr[String] = js.undefined
  /**
  			 * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
  			 */
  var confirmButtonLabel: js.UndefOr[String] = js.undefined
  /**
  			 * Confirm Dialog Subtitle
  			 */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
  			 * Confirm Dialog Text\Message.
  			 */
  var text: String
  /**
  			 * Confirm Dialog Title.
  			 */
  var title: js.UndefOr[String] = js.undefined
}

object ConfirmDialogStrings {
  @scala.inline
  def apply(
    text: String,
    cancelButtonLabel: String = null,
    confirmButtonLabel: String = null,
    subtitle: String = null,
    title: String = null
  ): ConfirmDialogStrings = {
    val __obj = js.Dynamic.literal(text = text)
    if (cancelButtonLabel != null) __obj.updateDynamic("cancelButtonLabel")(cancelButtonLabel)
    if (confirmButtonLabel != null) __obj.updateDynamic("confirmButtonLabel")(confirmButtonLabel)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ConfirmDialogStrings]
  }
}

