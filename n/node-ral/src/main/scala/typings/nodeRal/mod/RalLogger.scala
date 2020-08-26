package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RalLogger extends js.Object {
  def debug(param: js.Any*): Unit = js.native
  def fatal(param: js.Any*): Unit = js.native
  def notice(param: js.Any*): Unit = js.native
  def trace(param: js.Any*): Unit = js.native
  def warning(param: js.Any*): Unit = js.native
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
  @scala.inline
  implicit class RalLoggerOps[Self <: RalLogger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def setFatal(value: /* repeated */ js.Any => Unit): Self = this.set("fatal", js.Any.fromFunction1(value))
    @scala.inline
    def setNotice(value: /* repeated */ js.Any => Unit): Self = this.set("notice", js.Any.fromFunction1(value))
    @scala.inline
    def setTrace(value: /* repeated */ js.Any => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def setWarning(value: /* repeated */ js.Any => Unit): Self = this.set("warning", js.Any.fromFunction1(value))
  }
  
}

