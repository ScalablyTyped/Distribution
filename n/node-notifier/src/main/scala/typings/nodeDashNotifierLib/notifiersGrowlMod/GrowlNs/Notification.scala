package typings
package nodeDashNotifierLib.notifiersGrowlMod.GrowlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** Absolute path (not balloons) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** type of notification to use (defaults to the first registered type) */
  var label: java.lang.String
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** the priority of the notification from lowest (-2) to highest (2) */
  var priority: scala.Double
  /** whether or not to sticky the notification (defaults to false) */
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Wait with callback until user action is taken on notification */
  @JSName("wait")
  var wait_FNotification: js.UndefOr[scala.Boolean] = js.undefined
}

