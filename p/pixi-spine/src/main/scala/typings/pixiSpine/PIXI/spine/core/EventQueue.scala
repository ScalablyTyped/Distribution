package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventQueue extends js.Object {
  var animState: AnimationState
  var drainDisabled: Boolean
  var objects: js.Array[_]
  def clear(): Unit
  def complete(entry: TrackEntry): Unit
  def deprecateStuff(): Boolean
  def dispose(entry: TrackEntry): Unit
  def drain(): Unit
  def end(entry: TrackEntry): Unit
  def event(entry: TrackEntry, event: Event): Unit
  def interrupt(entry: TrackEntry): Unit
  def start(entry: TrackEntry): Unit
}

object EventQueue {
  @scala.inline
  def apply(
    animState: AnimationState,
    clear: () => Unit,
    complete: TrackEntry => Unit,
    deprecateStuff: () => Boolean,
    dispose: TrackEntry => Unit,
    drain: () => Unit,
    drainDisabled: Boolean,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    objects: js.Array[_],
    start: TrackEntry => Unit
  ): EventQueue = {
    val __obj = js.Dynamic.literal(animState = animState.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), complete = js.Any.fromFunction1(complete), deprecateStuff = js.Any.fromFunction0(deprecateStuff), dispose = js.Any.fromFunction1(dispose), drain = js.Any.fromFunction0(drain), drainDisabled = drainDisabled.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), objects = objects.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[EventQueue]
  }
}

