package typings.nextReactDevOverlay.busMod

import typings.stacktraceParser.mod.StackFrame
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nextReactDevOverlay.busMod.BuildOk
  - typings.nextReactDevOverlay.busMod.BuildError
  - typings.nextReactDevOverlay.busMod.FastRefresh
  - typings.nextReactDevOverlay.busMod.UnhandledError
  - typings.nextReactDevOverlay.busMod.UnhandledRejection
*/
trait BusEvent extends js.Object
object BusEvent {
  
  @scala.inline
  def FastRefresh(`type`: /* "fast-refresh" */ String): BusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusEvent]
  }
  
  @scala.inline
  def BuildOk(`type`: /* "build-ok" */ String): BusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusEvent]
  }
  
  @scala.inline
  def UnhandledError(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-error" */ String): BusEvent = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusEvent]
  }
  
  @scala.inline
  def UnhandledRejection(frames: js.Array[StackFrame], reason: Error, `type`: /* "unhandled-rejection" */ String): BusEvent = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusEvent]
  }
  
  @scala.inline
  def BuildError(message: String, `type`: /* "build-error" */ String): BusEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusEvent]
  }
}
