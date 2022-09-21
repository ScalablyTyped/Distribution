package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "DeformTimeline")
@js.native
open class DeformTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  /** The attachment that will be deformed. */
  var attachment: VertexAttachment = js.native
  
  /** The vertices for each key frame. */
  var frameVertices: js.Array[ArrayLike2[Double]] = js.native
  
  /** The time in seconds for each key frame. */
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time in seconds and the vertices for the specified key frame.
    * @param vertices Vertex positions for an unweighted VertexAttachment, or deform offsets if it has weights. */
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike2[Double]): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#getSlots()} that will be changed. */
  var slotIndex: Double = js.native
}
