package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "IkConstraintTimeline")
@js.native
open class IkConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: Double, bezierCount: Double, ikConstraintIndex: Double) = this()
  
  /** The index of the IK constraint slot in {@link Skeleton#ikConstraints} that will be changed. */
  var ikConstraintIndex: Double = js.native
  
  /** Sets the time in seconds, mix, softness, bend direction, compress, and stretch for the specified key frame. */
  def setFrame(
    frame: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit = js.native
}
