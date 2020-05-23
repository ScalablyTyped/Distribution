package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunningScriptOptions extends BaseOptions {
  /**
    * If `true`, the execution will be terminated when `SIGINT` (Ctrl+C) is received.
    * Existing handlers for the event that have been attached via `process.on('SIGINT')` will be disabled during script execution, but will continue to work after that.
    * If execution is terminated, an `Error` will be thrown.
    * Default: `false`.
    */
  var breakOnSigint: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, if an `Error` occurs while compiling the `code`, the line of code causing the error is attached to the stack trace.
    * Default: `true`.
    */
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the number of milliseconds to execute code before terminating execution.
    * If execution is terminated, an `Error` will be thrown. This value must be a strictly positive integer.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object RunningScriptOptions {
  @scala.inline
  def apply(
    breakOnSigint: js.UndefOr[Boolean] = js.undefined,
    columnOffset: js.UndefOr[Double] = js.undefined,
    displayErrors: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    lineOffset: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): RunningScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakOnSigint)) __obj.updateDynamic("breakOnSigint")(breakOnSigint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnOffset)) __obj.updateDynamic("columnOffset")(columnOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayErrors)) __obj.updateDynamic("displayErrors")(displayErrors.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOffset)) __obj.updateDynamic("lineOffset")(lineOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunningScriptOptions]
  }
}

