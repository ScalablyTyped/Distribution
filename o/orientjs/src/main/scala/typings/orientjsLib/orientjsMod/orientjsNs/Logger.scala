package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(args: js.Any*): scala.Unit
  def error(args: js.Any*): scala.Unit
  def log(args: js.Any*): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => scala.Unit,
    error: /* repeated */ js.Any => scala.Unit,
    log: /* repeated */ js.Any => scala.Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Logger]
  }
}

