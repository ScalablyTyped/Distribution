package typings
package nodemailerLib.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(params: js.Any*): scala.Unit
  def error(params: js.Any*): scala.Unit
  def fatal(params: js.Any*): scala.Unit
  def info(params: js.Any*): scala.Unit
  def level(level: LoggerLevel): scala.Unit
  def trace(params: js.Any*): scala.Unit
  def warn(params: js.Any*): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => scala.Unit,
    error: /* repeated */ js.Any => scala.Unit,
    fatal: /* repeated */ js.Any => scala.Unit,
    info: /* repeated */ js.Any => scala.Unit,
    level: LoggerLevel => scala.Unit,
    trace: /* repeated */ js.Any => scala.Unit,
    warn: /* repeated */ js.Any => scala.Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

