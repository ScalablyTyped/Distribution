package typings.nodemailer.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(params: js.Any*): Unit
  def error(params: js.Any*): Unit
  def fatal(params: js.Any*): Unit
  def info(params: js.Any*): Unit
  def level(level: LoggerLevel): Unit
  def trace(params: js.Any*): Unit
  def warn(params: js.Any*): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    fatal: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    level: LoggerLevel => Unit,
    trace: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}

