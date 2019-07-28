package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhonegapNotification extends js.Object {
  def alert(message: String, alertCallback: js.Function): Unit = js.native
  def alert(message: String, alertCallback: js.Function, title: String): Unit = js.native
  def alert(message: String, alertCallback: js.Function, title: String, buttonName: String): Unit = js.native
  def beep(times: Double): Unit = js.native
  def confirm(message: String, confirmCallback: js.Function): Unit = js.native
  def confirm(message: String, confirmCallback: js.Function, title: String): Unit = js.native
  def confirm(message: String, confirmCallback: js.Function, title: String, buttonLabels: String): Unit = js.native
  def confirm(message: String, confirmCallback: js.Function, title: String, buttonLabels: js.Array[String]): Unit = js.native
  def vibrate(milliseconds: Double): Unit = js.native
}

