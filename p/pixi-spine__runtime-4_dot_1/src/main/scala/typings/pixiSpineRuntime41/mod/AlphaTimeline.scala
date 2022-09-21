package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "AlphaTimeline")
@js.native
open class AlphaTimeline protected ()
  extends CurveTimeline1
     with SlotTimeline {
  def this(frameCount: Double, bezierCount: Double, slotIndex: Double) = this()
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  /* CompleteClass */
  var slotIndex: Double = js.native
}
