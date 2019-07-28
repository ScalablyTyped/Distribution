package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunningScriptOptions extends BaseOptions {
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RunningScriptOptions {
  @scala.inline
  def apply(
    columnOffset: Int | Double = null,
    displayErrors: js.UndefOr[Boolean] = js.undefined,
    filename: java.lang.String = null,
    lineOffset: Int | Double = null,
    timeout: Int | Double = null
  ): RunningScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (columnOffset != null) __obj.updateDynamic("columnOffset")(columnOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(displayErrors)) __obj.updateDynamic("displayErrors")(displayErrors)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunningScriptOptions]
  }
}

