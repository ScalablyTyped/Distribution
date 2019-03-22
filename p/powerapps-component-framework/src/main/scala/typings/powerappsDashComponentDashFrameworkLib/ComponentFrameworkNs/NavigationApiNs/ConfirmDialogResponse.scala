package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
		 */
trait ConfirmDialogResponse extends js.Object {
  /**
  			 *  confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
  			 */
  var confirmed: scala.Boolean
}

object ConfirmDialogResponse {
  @scala.inline
  def apply(confirmed: scala.Boolean): ConfirmDialogResponse = {
    val __obj = js.Dynamic.literal(confirmed = confirmed)
  
    __obj.asInstanceOf[ConfirmDialogResponse]
  }
}

