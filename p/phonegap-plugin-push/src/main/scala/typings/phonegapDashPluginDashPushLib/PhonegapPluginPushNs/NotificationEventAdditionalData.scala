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

