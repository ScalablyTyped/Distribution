package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "DistanceConstraint")
@js.native
class DistanceConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double) = this()
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double, options: DistanceConstraintOptions) = this()
  var distance: scala.Double = js.native
  var localAnchorA: js.Tuple2[scala.Double, scala.Double] = js.native
  var localAnchorB: js.Tuple2[scala.Double, scala.Double] = js.native
  var lowerLimit: scala.Double = js.native
  var lowerLimitEnabled: scala.Boolean = js.native
  var maxForce: scala.Double = js.native
  var position: scala.Double = js.native
  var upperLimit: scala.Double = js.native
  var upperLimitEnabled: scala.Boolean = js.native
  def getMaxForce(): scala.Double = js.native
  def setMaxForce(maxForce: scala.Double): scala.Unit = js.native
}

