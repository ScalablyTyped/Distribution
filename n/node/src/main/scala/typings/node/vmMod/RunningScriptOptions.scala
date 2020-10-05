package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunningScriptOptions extends BaseOptions {
  /**
    * If `true`, the execution will be terminated when `SIGINT` (Ctrl+C) is received.
    * Existing handlers for the event that have been attached via `process.on('SIGINT')` will be disabled during script execution, but will continue to work after that.
    * If execution is terminated, an `Error` will be thrown.
    * Default: `false`.
    */
  var breakOnSigint: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, if an `Error` occurs while compiling the `code`, the line of code causing the error is attached to the stack trace.
    * Default: `true`.
    */
  var displayErrors: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the number of milliseconds to execute code before terminating execution.
    * If execution is terminated, an `Error` will be thrown. This value must be a strictly positive integer.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object RunningScriptOptions {
  @scala.inline
  def apply(): RunningScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunningScriptOptions]
  }
  @scala.inline
  implicit class RunningScriptOptionsOps[Self <: RunningScriptOptions] (val x: Self) extends AnyVal {
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
    def setBreakOnSigint(value: Boolean): Self = this.set("breakOnSigint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakOnSigint: Self = this.set("breakOnSigint", js.undefined)
    @scala.inline
    def setDisplayErrors(value: Boolean): Self = this.set("displayErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayErrors: Self = this.set("displayErrors", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

