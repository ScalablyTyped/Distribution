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
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    fatal: js.Function1[/* repeated */ js.Any, scala.Unit],
    notice: js.Function1[/* repeated */ js.Any, scala.Unit],
    trace: js.Function1[/* repeated */ js.Any, scala.Unit],
    warning: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): RalLogger = {
    val __obj = js.Dynamic.literal(debug = debug, fatal = fatal, notice = notice, trace = trace, warning = warning)
  
    __obj.asInstanceOf[RalLogger]
  }
}

