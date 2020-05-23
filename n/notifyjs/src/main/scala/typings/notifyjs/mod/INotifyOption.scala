package typings.notifyjs.mod

import typings.std.Event
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
  var body: js.UndefOr[String] = js.undefined
  /**
    * path for icon to display in notification
    */
  var icon: js.UndefOr[String] = js.undefined
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
  var notifyShow: js.UndefOr[js.Function1[/* e */ Event, _]] = js.undefined
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
  var requireInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * whether this notification should be silent or not
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * unique identifier to stop duplicate notifications
    */
  var tag: js.UndefOr[String] = js.undefined
  /**
    * number of seconds to close the notification automatically
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object INotifyOption {
  @scala.inline
  def apply(
    body: String = null,
    icon: String = null,
    notifyClick: js.Function = null,
    notifyClose: js.Function = null,
    notifyError: js.Function = null,
    notifyShow: /* e */ Event => _ = null,
    permissionDenied: js.Function = null,
    permissionGranted: js.Function = null,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): INotifyOption = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (notifyClick != null) __obj.updateDynamic("notifyClick")(notifyClick.asInstanceOf[js.Any])
    if (notifyClose != null) __obj.updateDynamic("notifyClose")(notifyClose.asInstanceOf[js.Any])
    if (notifyError != null) __obj.updateDynamic("notifyError")(notifyError.asInstanceOf[js.Any])
    if (notifyShow != null) __obj.updateDynamic("notifyShow")(js.Any.fromFunction1(notifyShow))
    if (permissionDenied != null) __obj.updateDynamic("permissionDenied")(permissionDenied.asInstanceOf[js.Any])
    if (permissionGranted != null) __obj.updateDynamic("permissionGranted")(permissionGranted.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyOption]
  }
}

