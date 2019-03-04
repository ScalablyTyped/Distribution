package typings
package notyfLib.notyfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notyf extends js.Object {
  def alert(text: java.lang.String): scala.Unit
  def confirm(text: java.lang.String): scala.Unit
}

object Notyf {
  @scala.inline
  def apply(
    alert: js.Function1[java.lang.String, scala.Unit],
    confirm: js.Function1[java.lang.String, scala.Unit]
  ): Notyf = {
    val __obj = js.Dynamic.literal(alert = alert, confirm = confirm)
  
    __obj.asInstanceOf[Notyf]
  }
}

