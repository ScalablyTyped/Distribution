package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "PathConstraintMixTimeline")
@js.native
open class PathConstraintMixTimeline protected () extends CurveTimeline {
  def this(frameCount: Double, bezierCount: Double, pathConstraintIndex: Double) = this()
  
  /** The index of the path constraint slot in {@link Skeleton#getPathConstraints()} that will be changed. */
  var pathConstraintIndex: Double = js.native
  
  def setFrame(frame: Double, time: Double, mixRotate: Double, mixX: Double, mixY: Double): Unit = js.native
}
