package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Minilog extends js.Object {
  def debug(msg: js.Any*): Minilog = js.native
  def error(msg: js.Any*): Minilog = js.native
  def info(msg: js.Any*): Minilog = js.native
  def log(msg: js.Any*): Minilog = js.native
  def warn(msg: js.Any*): Minilog = js.native
}

object Minilog {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Minilog,
    error: /* repeated */ js.Any => Minilog,
    info: /* repeated */ js.Any => Minilog,
    log: /* repeated */ js.Any => Minilog,
    warn: /* repeated */ js.Any => Minilog
  ): Minilog = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Minilog]
  }
  @scala.inline
  implicit class MinilogOps[Self <: Minilog] (val x: Self) extends AnyVal {
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
    def setDebug(value: /* repeated */ js.Any => Minilog): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: /* repeated */ js.Any => Minilog): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Minilog): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Minilog): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Minilog): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

