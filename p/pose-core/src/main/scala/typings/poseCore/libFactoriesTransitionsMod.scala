package typings.poseCore

import typings.poseCore.libTypesMod.PoseMap
import typings.poseCore.libTypesMod.TransitionMap
import typings.poseCore.libTypesMod.TransitionMapFactory
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesTransitionsMod {
  
  @JSImport("pose-core/lib/factories/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, TD](
    poses: PoseMap[A, TD],
    defaultTransitions: Map[String, (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])]
  ): PoseMap[A, TD] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(poses.asInstanceOf[js.Any], defaultTransitions.asInstanceOf[js.Any])).asInstanceOf[PoseMap[A, TD]]
}
