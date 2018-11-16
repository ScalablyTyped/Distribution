package typings
package nodeDashNotifierLib.notifiersNotifysendMod.NotifySendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Notification extends js.Object {
  /** Specifies the notification category */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies basic extra data to pass. Valid types are int, double, string and byte. */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies  the  timeout  in  milliseconds at which to expire the notification */
  var time: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the urgency level  (low,  normal,  critical). */
  var urgency: js.UndefOr[java.lang.String] = js.undefined
}

