package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
class EventQueue protected () extends js.Object {
  def this(animState: AnimationState) = this()
  var animState: AnimationState = js.native
  var drainDisabled: scala.Boolean = js.native
  var objects: js.Array[_] = js.native
  def clear(): scala.Unit = js.native
  def complete(entry: TrackEntry): scala.Unit = js.native
  def deprecateStuff(): scala.Boolean = js.native
  def dispose(entry: TrackEntry): scala.Unit = js.native
  def drain(): scala.Unit = js.native
  def end(entry: TrackEntry): scala.Unit = js.native
  def event(entry: TrackEntry, event: Event): scala.Unit = js.native
  def interrupt(entry: TrackEntry): scala.Unit = js.native
  def start(entry: TrackEntry): scala.Unit = js.native
}

@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
object EventQueue extends js.Object {
  var deprecatedWarning1: js.Any = js.native
}

