package typings
package nodeDashNotifierLib.notifiersBalloonMod.WindowsBalloonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Notification extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Only Notification Center or Windows Toasters */
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  /** How long to show balloons in ms */
  var time: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Wait with callback until user action is taken on notification */
  @JSName("wait")
  var wait_FNotification: js.UndefOr[scala.Boolean] = js.undefined
}

