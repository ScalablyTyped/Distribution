package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "PathConstraintSpacingTimeline")
@js.native
open class PathConstraintSpacingTimeline protected () extends CurveTimeline1 {
  def this(frameCount: Double, bezierCount: Double, pathConstraintIndex: Double) = this()
  
  /** The index of the path constraint slot in {@link Skeleton#getPathConstraints()} that will be changed. */
  var pathConstraintIndex: Double = js.native
}
