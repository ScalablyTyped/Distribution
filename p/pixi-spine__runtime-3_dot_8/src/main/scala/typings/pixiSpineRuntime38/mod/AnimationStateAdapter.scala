package typings.pixiSpineRuntime38.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "AnimationStateAdapter")
@js.native
abstract class AnimationStateAdapter ()
  extends StObject
     with AnimationStateListener {
  
  @JSName("complete")
  def complete_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("dispose")
  def dispose_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("end")
  def end_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("event")
  def event_MAnimationStateAdapter(entry: TrackEntry, event: Event2): Unit = js.native
  
  @JSName("interrupt")
  def interrupt_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
  
  @JSName("start")
  def start_MAnimationStateAdapter(entry: TrackEntry): Unit = js.native
}
