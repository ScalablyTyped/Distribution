package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.EventQueue")
@js.native
class EventQueue protected () extends js.Object {
  def this(animState: AnimationState) = this()
  var animState: AnimationState = js.native
  var drainDisabled: Boolean = js.native
  var objects: js.Array[_] = js.native
  def clear(): Unit = js.native
  def complete(entry: TrackEntry): Unit = js.native
  def dispose(entry: TrackEntry): Unit = js.native
  def drain(): Unit = js.native
  def end(entry: TrackEntry): Unit = js.native
  def event(entry: TrackEntry, event: Event): Unit = js.native
  def interrupt(entry: TrackEntry): Unit = js.native
  def start(entry: TrackEntry): Unit = js.native
}

