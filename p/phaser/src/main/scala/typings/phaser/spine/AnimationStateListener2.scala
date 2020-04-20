package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateListener2 extends js.Object {
  def complete(entry: TrackEntry): Unit
  def dispose(entry: TrackEntry): Unit
  def end(entry: TrackEntry): Unit
  def event(entry: TrackEntry, event: Event): Unit
  def interrupt(entry: TrackEntry): Unit
  def start(entry: TrackEntry): Unit
}

object AnimationStateListener2 {
  @scala.inline
  def apply(
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    start: TrackEntry => Unit
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[AnimationStateListener2]
  }
}

