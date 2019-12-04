package typings.poseDashCore

import typings.poseDashCore.libTypesMod.PoseMap
import typings.poseDashCore.libTypesMod.TransitionMap
import typings.poseDashCore.libTypesMod.TransitionMapFactory
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/factories/transitions", JSImport.Namespace)
@js.native
object libFactoriesTransitionsMod extends js.Object {
  def default[A, TD](
    poses: PoseMap[A, TD],
    defaultTransitions: Map[String, (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])]
  ): PoseMap[A, TD] = js.native
}

