package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SequenceMode extends StObject
@JSImport("@pixi-spine/runtime-4.1", "SequenceMode")
@js.native
object SequenceMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SequenceMode & Double] = js.native
  
  @js.native
  sealed trait hold
    extends StObject
       with SequenceMode
  /* 0 */ val hold: typings.pixiSpineRuntime41.mod.SequenceMode.hold & Double = js.native
  
  @js.native
  sealed trait loop
    extends StObject
       with SequenceMode
  /* 2 */ val loop: typings.pixiSpineRuntime41.mod.SequenceMode.loop & Double = js.native
  
  @js.native
  sealed trait loopReverse
    extends StObject
       with SequenceMode
  /* 5 */ val loopReverse: typings.pixiSpineRuntime41.mod.SequenceMode.loopReverse & Double = js.native
  
  @js.native
  sealed trait once
    extends StObject
       with SequenceMode
  /* 1 */ val once: typings.pixiSpineRuntime41.mod.SequenceMode.once & Double = js.native
  
  @js.native
  sealed trait onceReverse
    extends StObject
       with SequenceMode
  /* 4 */ val onceReverse: typings.pixiSpineRuntime41.mod.SequenceMode.onceReverse & Double = js.native
  
  @js.native
  sealed trait pingpong
    extends StObject
       with SequenceMode
  /* 3 */ val pingpong: typings.pixiSpineRuntime41.mod.SequenceMode.pingpong & Double = js.native
  
  @js.native
  sealed trait pingpongReverse
    extends StObject
       with SequenceMode
  /* 6 */ val pingpongReverse: typings.pixiSpineRuntime41.mod.SequenceMode.pingpongReverse & Double = js.native
}
