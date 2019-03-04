package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(args: js.Any*): scala.Unit
  def error(args: js.Any*): scala.Unit
  def log(args: js.Any*): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: js.Function1[/* repeated */ js.Any, scala.Unit],
    error: js.Function1[/* repeated */ js.Any, scala.Unit],
    log: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, log = log)
  
    __obj.asInstanceOf[Logger]
  }
}

