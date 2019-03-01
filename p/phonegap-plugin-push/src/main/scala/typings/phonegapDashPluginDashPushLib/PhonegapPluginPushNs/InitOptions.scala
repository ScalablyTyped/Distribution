package typings
package phonegapDashPluginDashPushLib.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * platform specific initialization options.
	 */
trait InitOptions extends js.Object {
  /**
  		 * Android specific initialization options.
  		 */
  var android: js.UndefOr[phonegapDashPluginDashPushLib.Anon_ClearNotifications] = js.undefined
  /**
  		 * iOS specific initialization options.
  		 */
  var ios: js.UndefOr[phonegapDashPluginDashPushLib.Anon_Alert] = js.undefined
  /**
  		 * Windows specific initialization options.
  		 */
  var windows: js.UndefOr[js.Object] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    android: phonegapDashPluginDashPushLib.Anon_ClearNotifications = null,
    ios: phonegapDashPluginDashPushLib.Anon_Alert = null,
    windows: js.Object = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    if (windows != null) __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[InitOptions]
  }
}

