package typings
package minilogLib.minilogMod

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
    debug: js.Function1[/* repeated */ js.Any, Minilog],
    error: js.Function1[/* repeated */ js.Any, Minilog],
    info: js.Function1[/* repeated */ js.Any, Minilog],
    log: js.Function1[/* repeated */ js.Any, Minilog],
    warn: js.Function1[/* repeated */ js.Any, Minilog]
  ): Minilog = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, info = info, log = log, warn = warn)
  
    __obj.asInstanceOf[Minilog]
  }
}

