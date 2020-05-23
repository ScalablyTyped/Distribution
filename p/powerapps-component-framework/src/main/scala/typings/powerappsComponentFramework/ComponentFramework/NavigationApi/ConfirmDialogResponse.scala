package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

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
  var confirmed: Boolean
}

object ConfirmDialogResponse {
  @scala.inline
  def apply(confirmed: Boolean): ConfirmDialogResponse = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogResponse]
  }
}

