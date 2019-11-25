package typings.phonegapDashPluginDashPush.PhonegapPluginPush

import org.scalablytyped.runtime.StringDictionary
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
  extends /* name */ StringDictionary[js.Any] {
  /**
  		 * Will be true if the application is started by clicking on the push notification, false if the app is already started. (Android/iOS only)
  		 */
  var coldstart: js.UndefOr[Boolean] = js.undefined
  var collapse_key: js.UndefOr[String] = js.undefined
  /**
  		 * Whether the notification was received while the app was in the foreground
  		 */
  var foreground: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var notId: js.UndefOr[String] = js.undefined
}

object NotificationEventAdditionalData {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    coldstart: js.UndefOr[Boolean] = js.undefined,
    collapse_key: String = null,
    foreground: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    notId: String = null
  ): NotificationEventAdditionalData = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(coldstart)) __obj.updateDynamic("coldstart")(coldstart.asInstanceOf[js.Any])
    if (collapse_key != null) __obj.updateDynamic("collapse_key")(collapse_key.asInstanceOf[js.Any])
    if (!js.isUndefined(foreground)) __obj.updateDynamic("foreground")(foreground.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (notId != null) __obj.updateDynamic("notId")(notId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventAdditionalData]
  }
}

