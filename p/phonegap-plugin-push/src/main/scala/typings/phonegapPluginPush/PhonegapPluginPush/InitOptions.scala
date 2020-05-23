package typings.phonegapPluginPush.PhonegapPluginPush

import typings.phonegapPluginPush.anon.Alert
import typings.phonegapPluginPush.anon.ApplicationServerKey
import typings.phonegapPluginPush.anon.ClearBadge
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
  var android: js.UndefOr[ClearBadge] = js.undefined
  /**
  		 * Browser specific initialization options.
  		 */
  var browser: js.UndefOr[ApplicationServerKey] = js.undefined
  /**
  		 * iOS specific initialization options.
  		 */
  var ios: js.UndefOr[Alert] = js.undefined
  /**
  		 * Windows specific initialization options.
  		 */
  var windows: js.UndefOr[js.Object] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    android: ClearBadge = null,
    browser: ApplicationServerKey = null,
    ios: Alert = null,
    windows: js.Object = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

