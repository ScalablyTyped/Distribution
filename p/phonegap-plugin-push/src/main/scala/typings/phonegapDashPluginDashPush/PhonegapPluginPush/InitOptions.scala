package typings.phonegapDashPluginDashPush.PhonegapPluginPush

import typings.phonegapDashPluginDashPush.Anon_Alert
import typings.phonegapDashPluginDashPush.Anon_ApplicationServerKey
import typings.phonegapDashPluginDashPush.Anon_ClearBadge
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
  var android: js.UndefOr[Anon_ClearBadge] = js.undefined
  /**
  		 * Browser specific initialization options.
  		 */
  var browser: js.UndefOr[Anon_ApplicationServerKey] = js.undefined
  /**
  		 * iOS specific initialization options.
  		 */
  var ios: js.UndefOr[Anon_Alert] = js.undefined
  /**
  		 * Windows specific initialization options.
  		 */
  var windows: js.UndefOr[js.Object] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    android: Anon_ClearBadge = null,
    browser: Anon_ApplicationServerKey = null,
    ios: Anon_Alert = null,
    windows: js.Object = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    if (windows != null) __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[InitOptions]
  }
}

