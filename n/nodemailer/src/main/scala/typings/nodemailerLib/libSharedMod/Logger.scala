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
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    fatal: js.Function1[/* repeated */ js.Any, scala.Unit],
    info: js.Function1[/* repeated */ js.Any, scala.Unit],
    level: js.Function1[LoggerLevel, scala.Unit],
    trace: js.Function1[/* repeated */ js.Any, scala.Unit],
    warn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, fatal = fatal, info = info, level = level, trace = trace, warn = warn)
  
    __obj.asInstanceOf[Logger]
  }
}

