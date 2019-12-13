package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationStateAdapter")
@js.native
abstract class AnimationStateAdapter () extends AnimationStateListener {
  @JSName("complete")
  def complete_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  @JSName("dispose")
  def dispose_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  @JSName("end")
  def end_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  @JSName("event")
  def event_MAnimationStateAdapter(entry: TrackEntry, event: Event): Unit = js.native
  @JSName("interrupt")
  def interrupt_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  @JSName("start")
  def start_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
}

