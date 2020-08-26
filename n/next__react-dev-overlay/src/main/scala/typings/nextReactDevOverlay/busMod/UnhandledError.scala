package typings.nextReactDevOverlay.busMod

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnhandledError extends BusEvent {
  var frames: js.Array[StackFrame] = js.native
  var reason: Error = js.native
  var `type`: /* "unhandled-error" */ String = js.native
}

object UnhandledError {
  @scala.inline
  def apply(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-error" */ String): UnhandledError = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnhandledError]
  }
  @scala.inline
  implicit class UnhandledErrorOps[Self <: UnhandledError] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: StackFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[StackFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: Error): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: /* "unhandled-error" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

