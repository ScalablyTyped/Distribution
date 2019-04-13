package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "PrismaticConstraint")
@js.native
class PrismaticConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: PrismaticConstraintOptions) = this()
  var localAnchorA: js.Tuple2[scala.Double, scala.Double] = js.native
  var localAnchorB: js.Tuple2[scala.Double, scala.Double] = js.native
  var localAxisA: js.Tuple2[scala.Double, scala.Double] = js.native
  var lowerLimit: scala.Double = js.native
  var lowerLimitEnabled: scala.Boolean = js.native
  var lowerLimitEquation: ContactEquation = js.native
  var motorEnabled: scala.Boolean = js.native
  var motorEquation: Equation = js.native
  var motorSpeed: scala.Double = js.native
  var position: scala.Double = js.native
  var upperLimit: scala.Double = js.native
  var upperLimitEnabled: scala.Boolean = js.native
  var upperLimitEquation: ContactEquation = js.native
  var velocity: scala.Double = js.native
  def disableMotor(): scala.Unit = js.native
  def enableMotor(): scala.Unit = js.native
  def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit = js.native
}

