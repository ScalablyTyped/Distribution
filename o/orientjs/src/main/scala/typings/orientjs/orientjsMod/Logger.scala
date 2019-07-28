package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(args: js.Any*): Unit
  def error(args: js.Any*): Unit
  def log(args: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Logger]
  }
}

