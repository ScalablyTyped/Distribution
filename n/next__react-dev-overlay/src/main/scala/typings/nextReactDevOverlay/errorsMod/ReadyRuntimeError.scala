package typings.nextReactDevOverlay.errorsMod

import typings.nextReactDevOverlay.nextReactDevOverlayBooleans.`true`
import typings.nextReactDevOverlay.stackFrameMod.OriginalStackFrame
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyRuntimeError extends js.Object {
  var error: Error
  var frames: js.Array[OriginalStackFrame]
  var id: Double
  var runtime: `true`
}

object ReadyRuntimeError {
  @scala.inline
  def apply(error: Error, frames: js.Array[OriginalStackFrame], id: Double, runtime: `true`): ReadyRuntimeError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyRuntimeError]
  }
}

