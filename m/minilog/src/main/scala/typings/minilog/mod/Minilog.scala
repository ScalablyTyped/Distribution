package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Minilog extends js.Object {
  def debug(msg: js.Any*): Minilog
  def error(msg: js.Any*): Minilog
  def info(msg: js.Any*): Minilog
  def log(msg: js.Any*): Minilog
  def warn(msg: js.Any*): Minilog
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
}

