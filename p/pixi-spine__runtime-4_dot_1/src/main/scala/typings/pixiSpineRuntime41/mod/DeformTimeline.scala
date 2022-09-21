package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.NumberArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "DeformTimeline")
@js.native
open class DeformTimeline protected ()
  extends CurveTimeline
     with SlotTimeline {
  def this(frameCount: Double, bezierCount: Double, slotIndex: Double, attachment: VertexAttachment) = this()
  
  /** The attachment that will be deformed. */
  var attachment: VertexAttachment = js.native
  
  def getCurvePercent(time: Double, frame: Double): Double = js.native
  
  /** Sets the time in seconds and the vertices for the specified key frame.
    * @param vertices Vertex positions for an unweighted VertexAttachment, or deform offsets if it has weights. */
  def setFrame(frame: Double, time: Double, vertices: NumberArrayLike): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  /* CompleteClass */
  var slotIndex: Double = js.native
  
  /** The vertices for each key frame. */
  var vertices: js.Array[NumberArrayLike] = js.native
}
