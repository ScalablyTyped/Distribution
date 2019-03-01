package typings
package phonegapDashPluginDashPushLib.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * TODO: document all possible properties (I only got the android ones)
	 *
	 * Loosened up with a dictionary notation, but all non-defined properties need to use (map['prop']) notation
	 *
	 * Ideally the developer would overload (merged declaration) this or create a new interface that would extend this one
	 * so that he could specify any custom code without having to use array notation (map['prop']) for all of them.
	 */
trait NotificationEventAdditionalData
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  		 * Will be true if the application is started by clicking on the push notification, false if the app is already started. (Android/iOS only)
  		 */
  var coldstart: js.UndefOr[scala.Boolean] = js.undefined
  var collapse_key: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Whether the notification was received while the app was in the foreground
  		 */
  var foreground: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var notId: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationEventAdditionalData {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    coldstart: js.UndefOr[scala.Boolean] = js.undefined,
    collapse_key: java.lang.String = null,
    foreground: js.UndefOr[scala.Boolean] = js.undefined,
    from: java.lang.String = null,
    notId: java.lang.String = null
  ): NotificationEventAdditionalData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(coldstart)) __obj.updateDynamic("coldstart")(coldstart)
    if (collapse_key != null) __obj.updateDynamic("collapse_key")(collapse_key)
    if (!js.isUndefined(foreground)) __obj.updateDynamic("foreground")(foreground)
    if (from != null) __obj.updateDynamic("from")(from)
    if (notId != null) __obj.updateDynamic("notId")(notId)
    __obj.asInstanceOf[NotificationEventAdditionalData]
  }
}

