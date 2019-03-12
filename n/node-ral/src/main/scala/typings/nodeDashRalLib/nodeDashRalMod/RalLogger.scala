package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RalLogger extends js.Object {
  def debug(param: js.Any*): scala.Unit
  def fatal(param: js.Any*): scala.Unit
  def notice(param: js.Any*): scala.Unit
  def trace(param: js.Any*): scala.Unit
  def warning(param: js.Any*): scala.Unit
}

object RalLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => scala.Unit,
    fatal: /* repeated */ js.Any => scala.Unit,
    notice: /* repeated */ js.Any => scala.Unit,
    trace: /* repeated */ js.Any => scala.Unit,
    warning: /* repeated */ js.Any => scala.Unit
  ): RalLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), fatal = js.Any.fromFunction1(fatal), notice = js.Any.fromFunction1(notice), trace = js.Any.fromFunction1(trace), warning = js.Any.fromFunction1(warning))
  
    __obj.asInstanceOf[RalLogger]
  }
}

