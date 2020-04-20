package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RalLogger extends js.Object {
  def debug(param: js.Any*): Unit
  def fatal(param: js.Any*): Unit
  def notice(param: js.Any*): Unit
  def trace(param: js.Any*): Unit
  def warning(param: js.Any*): Unit
}

object RalLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    fatal: /* repeated */ js.Any => Unit,
    notice: /* repeated */ js.Any => Unit,
    trace: /* repeated */ js.Any => Unit,
    warning: /* repeated */ js.Any => Unit
  ): RalLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), fatal = js.Any.fromFunction1(fatal), notice = js.Any.fromFunction1(notice), trace = js.Any.fromFunction1(trace), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[RalLogger]
  }
}

