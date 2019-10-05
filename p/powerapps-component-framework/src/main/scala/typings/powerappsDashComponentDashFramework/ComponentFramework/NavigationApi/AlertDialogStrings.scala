package typings.powerappsDashComponentDashFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents the String parameters for Alert Dialog.
		 */
trait AlertDialogStrings extends js.Object {
  /**
  			 * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
  			 */
  var confirmButtonLabel: js.UndefOr[String] = js.undefined
  /**
  			 * The message to be displyed in the alert dialog.
  			 */
  var text: String
}

object AlertDialogStrings {
  @scala.inline
  def apply(text: String, confirmButtonLabel: String = null): AlertDialogStrings = {
    val __obj = js.Dynamic.literal(text = text)
    if (confirmButtonLabel != null) __obj.updateDynamic("confirmButtonLabel")(confirmButtonLabel)
    __obj.asInstanceOf[AlertDialogStrings]
  }
}

