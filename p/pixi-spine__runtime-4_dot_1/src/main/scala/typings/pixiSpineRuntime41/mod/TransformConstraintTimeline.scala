package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "TransformConstraintTimeline")
@js.native
open class TransformConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: Double, bezierCount: Double, transformConstraintIndex: Double) = this()
  
  /** The time in seconds, rotate mix, translate mix, scale mix, and shear mix for the specified key frame. */
  def setFrame(
    frame: Double,
    time: Double,
    mixRotate: Double,
    mixX: Double,
    mixY: Double,
    mixScaleX: Double,
    mixScaleY: Double,
    mixShearY: Double
  ): Unit = js.native
  
  /** The index of the transform constraint slot in {@link Skeleton#transformConstraints} that will be changed. */
  var transformConstraintIndex: Double = js.native
}
