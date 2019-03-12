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
  def apply(alert: java.lang.String => scala.Unit, confirm: java.lang.String => scala.Unit): Notyf = {
    val __obj = js.Dynamic.literal(alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm))
  
    __obj.asInstanceOf[Notyf]
  }
}

