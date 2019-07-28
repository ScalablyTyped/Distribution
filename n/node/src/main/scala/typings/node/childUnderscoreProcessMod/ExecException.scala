package typings.node.childUnderscoreProcessMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecException extends Error {
  var cmd: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[Double] = js.undefined
  var killed: js.UndefOr[Boolean] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
}

object ExecException {
  @scala.inline
  def apply(
    cmd: java.lang.String = null,
    code: Int | Double = null,
    killed: js.UndefOr[Boolean] = js.undefined,
    signal: java.lang.String = null,
    stack: java.lang.String = null
  ): ExecException = {
    val __obj = js.Dynamic.literal()
    if (cmd != null) __obj.updateDynamic("cmd")(cmd)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(killed)) __obj.updateDynamic("killed")(killed)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExecException]
  }
}

