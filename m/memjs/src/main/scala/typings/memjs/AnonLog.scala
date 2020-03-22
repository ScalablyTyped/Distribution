package typings.memjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  def log(args: js.Any*): Unit
}

object AnonLog {
  @scala.inline
  def apply(log: /* repeated */ js.Any => Unit): AnonLog = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[AnonLog]
  }
}

