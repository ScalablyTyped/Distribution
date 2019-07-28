package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
class EventQueue protected () extends js.Object {
  def this(animState: AnimationState) = this()
  var animState: AnimationState = js.native
  var drainDisabled: Boolean = js.native
  var objects: js.Array[_] = js.native
  def clear(): Unit = js.native
  def complete(entry: TrackEntry): Unit = js.native
  def deprecateStuff(): Boolean = js.native
  def dispose(entry: TrackEntry): Unit = js.native
  def drain(): Unit = js.native
  def end(entry: TrackEntry): Unit = js.native
  def event(entry: TrackEntry, event: Event): Unit = js.native
  def interrupt(entry: TrackEntry): Unit = js.native
  def start(entry: TrackEntry): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
object EventQueue extends js.Object {
  var deprecatedWarning1: js.Any = js.native
}

