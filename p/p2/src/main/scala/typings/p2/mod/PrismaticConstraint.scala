package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "PrismaticConstraint")
@js.native
class PrismaticConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: PrismaticConstraintOptions) = this()
  var localAnchorA: js.Tuple2[Double, Double] = js.native
  var localAnchorB: js.Tuple2[Double, Double] = js.native
  var localAxisA: js.Tuple2[Double, Double] = js.native
  var lowerLimit: Double = js.native
  var lowerLimitEnabled: Boolean = js.native
  var lowerLimitEquation: ContactEquation = js.native
  var motorEnabled: Boolean = js.native
  var motorEquation: Equation = js.native
  var motorSpeed: Double = js.native
  var position: Double = js.native
  var upperLimit: Double = js.native
  var upperLimitEnabled: Boolean = js.native
  var upperLimitEquation: ContactEquation = js.native
  var velocity: Double = js.native
  def disableMotor(): Unit = js.native
  def enableMotor(): Unit = js.native
  def setLimits(lower: Double, upper: Double): Unit = js.native
}

