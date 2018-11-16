package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhonegapNotification extends js.Object {
  def alert(message: java.lang.String, alertCallback: js.Function): scala.Unit = js.native
  def alert(message: java.lang.String, alertCallback: js.Function, title: java.lang.String): scala.Unit = js.native
  def alert(
    message: java.lang.String,
    alertCallback: js.Function,
    title: java.lang.String,
    buttonName: java.lang.String
  ): scala.Unit = js.native
  def beep(times: scala.Double): scala.Unit = js.native
  def confirm(message: java.lang.String, confirmCallback: js.Function): scala.Unit = js.native
  def confirm(message: java.lang.String, confirmCallback: js.Function, title: java.lang.String): scala.Unit = js.native
  def confirm(
    message: java.lang.String,
    confirmCallback: js.Function,
    title: java.lang.String,
    buttonLabels: java.lang.String
  ): scala.Unit = js.native
  def confirm(
    message: java.lang.String,
    confirmCallback: js.Function,
    title: java.lang.String,
    buttonLabels: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def vibrate(milliseconds: scala.Double): scala.Unit = js.native
}

