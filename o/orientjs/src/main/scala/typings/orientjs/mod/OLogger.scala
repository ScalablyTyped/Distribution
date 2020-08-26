package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLogger extends js.Object {
  def debug(args: js.Any*): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def log(args: js.Any*): Unit = js.native
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
  @scala.inline
  implicit class OLoggerOps[Self <: OLogger] (val x: Self) extends AnyVal {
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
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
  }
  
}

