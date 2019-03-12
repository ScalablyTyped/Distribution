package typings
package notifyjsLib.notifyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Notify's optional parameter.
  */
trait INotifyOption extends js.Object {
  /**
    * notification message body
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * path for icon to display in notification
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * callback when notification is clicked
    */
  var notifyClick: js.UndefOr[js.Function] = js.undefined
  /**
    * callback when notification is closed
    */
  var notifyClose: js.UndefOr[js.Function] = js.undefined
  /**
    * callback when notification throws an error
    */
  var notifyError: js.UndefOr[js.Function] = js.undefined
  /**
    * callback when notification is shown
    */
  var notifyShow: js.UndefOr[js.Function1[/* e */ stdLib.Event, _]] = js.undefined
  /**
    * callback when user has denied permission
    */
  var permissionDenied: js.UndefOr[js.Function] = js.undefined
  /**
    *  callback when user has granted permission
    */
  var permissionGranted: js.UndefOr[js.Function] = js.undefined
  /**
    * whether we expect for user interaction or not
    * in case value is true the timeout for closing the notification won't be set
    */
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * unique identifier to stop duplicate notifications
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * number of seconds to close the notification automatically
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object INotifyOption {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    icon: java.lang.String = null,
    notifyClick: js.Function = null,
    notifyClose: js.Function = null,
    notifyError: js.Function = null,
    notifyShow: /* e */ stdLib.Event => _ = null,
    permissionDenied: js.Function = null,
    permissionGranted: js.Function = null,
    requireInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): INotifyOption = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (notifyClick != null) __obj.updateDynamic("notifyClick")(notifyClick)
    if (notifyClose != null) __obj.updateDynamic("notifyClose")(notifyClose)
    if (notifyError != null) __obj.updateDynamic("notifyError")(notifyError)
    if (notifyShow != null) __obj.updateDynamic("notifyShow")(js.Any.fromFunction1(notifyShow))
    if (permissionDenied != null) __obj.updateDynamic("permissionDenied")(permissionDenied)
    if (permissionGranted != null) __obj.updateDynamic("permissionGranted")(permissionGranted)
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyOption]
  }
}

