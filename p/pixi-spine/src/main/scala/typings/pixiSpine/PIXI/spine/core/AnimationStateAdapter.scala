package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateAdapter extends AnimationStateListener {
  @JSName("complete")
  def complete_MAnimationStateAdapter(entry: TrackEntry): Unit
  @JSName("dispose")
  def dispose_MAnimationStateAdapter(entry: TrackEntry): Unit
  @JSName("end")
  def end_MAnimationStateAdapter(entry: TrackEntry): Unit
  @JSName("event")
  def event_MAnimationStateAdapter(entry: TrackEntry, event: Event): Unit
  @JSName("interrupt")
  def interrupt_MAnimationStateAdapter(entry: TrackEntry): Unit
  @JSName("start")
  def start_MAnimationStateAdapter(entry: TrackEntry): Unit
}

object AnimationStateAdapter {
  @scala.inline
  def apply(
    complete: TrackEntry => Unit,
    dispose: TrackEntry => Unit,
    end: TrackEntry => Unit,
    event: (TrackEntry, Event) => Unit,
    interrupt: TrackEntry => Unit,
    start: TrackEntry => Unit
  ): AnimationStateAdapter = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), dispose = js.Any.fromFunction1(dispose), end = js.Any.fromFunction1(end), event = js.Any.fromFunction2(event), interrupt = js.Any.fromFunction1(interrupt), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[AnimationStateAdapter]
  }
}

