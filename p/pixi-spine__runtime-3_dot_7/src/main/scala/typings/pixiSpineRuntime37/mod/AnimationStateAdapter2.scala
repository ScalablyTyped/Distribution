package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "AnimationStateAdapter2")
@js.native
abstract class AnimationStateAdapter2 ()
  extends StObject
     with AnimationStateListener {
  
  @JSName("complete")
  def complete_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  
  @JSName("dispose")
  def dispose_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  
  @JSName("end")
  def end_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  
  @JSName("event")
  def event_MAnimationStateAdapter2(entry: TrackEntry, event: Event2): Unit = js.native
  
  @JSName("interrupt")
  def interrupt_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
  
  @JSName("start")
  def start_MAnimationStateAdapter2(entry: TrackEntry): Unit = js.native
}
