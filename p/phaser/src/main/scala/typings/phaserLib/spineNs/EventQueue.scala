package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.EventQueue")
@js.native
class EventQueue protected () extends js.Object {
  def this(animState: AnimationState) = this()
  var animState: AnimationState = js.native
  var drainDisabled: scala.Boolean = js.native
  var objects: js.Array[_] = js.native
  def clear(): scala.Unit = js.native
  def complete(entry: TrackEntry): scala.Unit = js.native
  def dispose(entry: TrackEntry): scala.Unit = js.native
  def drain(): scala.Unit = js.native
  def end(entry: TrackEntry): scala.Unit = js.native
  def event(entry: TrackEntry, event: Event): scala.Unit = js.native
  def interrupt(entry: TrackEntry): scala.Unit = js.native
  def start(entry: TrackEntry): scala.Unit = js.native
}

