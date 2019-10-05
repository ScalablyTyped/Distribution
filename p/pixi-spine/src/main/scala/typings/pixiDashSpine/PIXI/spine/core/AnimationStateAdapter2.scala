package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationStateAdapter2")
@js.native
abstract class AnimationStateAdapter2 () extends AnimationStateListener2 {
  @JSName("complete")
  def complete_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  @JSName("dispose")
  def dispose_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  @JSName("end")
  def end_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  @JSName("event")
  def event_MAnimationStateAdapter2(entry: TrackEntry, event: Event): Unit = js.native
  @JSName("interrupt")
  def interrupt_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  @JSName("start")
  def start_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
}

