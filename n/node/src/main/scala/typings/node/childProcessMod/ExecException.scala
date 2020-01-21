package typings.node.childProcessMod

import typings.node.NodeJS.Signals
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecException extends Error {
  var cmd: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[Double] = js.undefined
  var killed: js.UndefOr[Boolean] = js.undefined
  var signal: js.UndefOr[Signals] = js.undefined
}

object ExecException {
  @scala.inline
  def apply(
    message: String,
    name: String,
    cmd: String = null,
    code: Int | Double = null,
    killed: js.UndefOr[Boolean] = js.undefined,
    signal: Signals = null,
    stack: String = null
  ): ExecException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (cmd != null) __obj.updateDynamic("cmd")(cmd.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(killed)) __obj.updateDynamic("killed")(killed.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecException]
  }
}

