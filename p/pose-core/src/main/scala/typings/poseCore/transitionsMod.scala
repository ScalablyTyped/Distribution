package typings.poseCore

import typings.poseCore.typesMod.PoseMap
import typings.poseCore.typesMod.TransitionMap
import typings.poseCore.typesMod.TransitionMapFactory
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/factories/transitions", JSImport.Namespace)
@js.native
object transitionsMod extends js.Object {
  def default[A, TD](
    poses: PoseMap[A, TD],
    defaultTransitions: Map[String, (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])]
  ): PoseMap[A, TD] = js.native
}

