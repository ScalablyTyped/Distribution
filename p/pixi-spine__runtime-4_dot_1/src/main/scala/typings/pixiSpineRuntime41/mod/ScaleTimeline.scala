package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "ScaleTimeline")
@js.native
open class ScaleTimeline protected ()
  extends CurveTimeline2
     with BoneTimeline {
  def this(frameCount: Double, bezierCount: Double, boneIndex: Double) = this()
  
  /** The index of the bone in {@link Skeleton#bones} that will be changed. */
  /* CompleteClass */
  var boneIndex: Double = js.native
}
