package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.ArrayLike2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "DeformTimeline")
@js.native
open class DeformTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  
  var attachment: VertexAttachment = js.native
  
  var frameVertices: js.Array[ArrayLike2[Double]] = js.native
  
  var frames: ArrayLike2[Double] = js.native
  
  /** Sets the time of the specified keyframe. */
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike2[Double]): Unit = js.native
  
  var slotIndex: Double = js.native
}
