package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OLogger extends js.Object {
  def debug(args: js.Any*): Unit
  def error(args: js.Any*): Unit
  def log(args: js.Any*): Unit
}

object OLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit
  ): OLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[OLogger]
  }
}

