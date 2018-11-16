package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogsService extends js.Object {
  def alert(message: java.lang.String): js.Any = js.native
  def alert(message: java.lang.String, title: java.lang.String): js.Any = js.native
  def alert(message: java.lang.String, title: java.lang.String, buttonName: java.lang.String): js.Any = js.native
  def beep(repetitions: scala.Double): scala.Unit = js.native
  def confirm(message: java.lang.String): js.Any = js.native
  def confirm(message: java.lang.String, title: java.lang.String): js.Any = js.native
  def confirm(message: java.lang.String, title: java.lang.String, buttonArray: js.Array[java.lang.String]): js.Any = js.native
  def prompt(message: java.lang.String): js.Any = js.native
  def prompt(message: java.lang.String, title: java.lang.String): js.Any = js.native
  def prompt(message: java.lang.String, title: java.lang.String, buttonArray: js.Array[java.lang.String]): js.Any = js.native
  def prompt(
    message: java.lang.String,
    title: java.lang.String,
    buttonArray: js.Array[java.lang.String],
    defaultText: java.lang.String
  ): js.Any = js.native
}

