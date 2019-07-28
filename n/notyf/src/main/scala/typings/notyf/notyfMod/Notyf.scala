package typings.notyf.notyfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notyf extends js.Object {
  def alert(text: String): Unit
  def confirm(text: String): Unit
}

object Notyf {
  @scala.inline
  def apply(alert: String => Unit, confirm: String => Unit): Notyf = {
    val __obj = js.Dynamic.literal(alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm))
  
    __obj.asInstanceOf[Notyf]
  }
}

