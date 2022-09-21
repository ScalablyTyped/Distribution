package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "RGBA2Timeline")
@js.native
open class RGBA2Timeline protected ()
  extends CurveTimeline
     with SlotTimeline {
  def this(frameCount: Double, bezierCount: Double, slotIndex: Double) = this()
  
  /** Sets the time in seconds, light, and dark colors for the specified key frame. */
  def setFrame(
    frame: Double,
    time: Double,
    r: Double,
    g: Double,
    b: Double,
    a: Double,
    r2: Double,
    g2: Double,
    b2: Double
  ): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  /* CompleteClass */
  var slotIndex: Double = js.native
}
