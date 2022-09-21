package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "RGBATimeline")
@js.native
open class RGBATimeline protected ()
  extends CurveTimeline
     with SlotTimeline {
  def this(frameCount: Double, bezierCount: Double, slotIndex: Double) = this()
  
  /** Sets the time in seconds, red, green, blue, and alpha for the specified key frame. */
  def setFrame(frame: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  /* CompleteClass */
  var slotIndex: Double = js.native
}
