package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.PathConstraint")
@js.native
class PathConstraint protected ()
  extends typings.phaser.spine.PathConstraint {
  def this(data: typings.phaser.spine.PathConstraintData, skeleton: typings.phaser.spine.Skeleton) = this()
}

/* static members */
@JSGlobal("spine.PathConstraint")
@js.native
object PathConstraint extends js.Object {
  var AFTER: Double = js.native
  var BEFORE: Double = js.native
  var NONE: Double = js.native
  var epsilon: Double = js.native
}

