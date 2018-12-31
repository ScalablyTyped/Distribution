package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismaticConstraint extends Constraint {
  var localAnchorA: js.Array[scala.Double]
  var localAnchorB: js.Array[scala.Double]
  var localAxisA: js.Array[scala.Double]
  var lowerLimit: scala.Double
  var lowerLimitEnabled: scala.Boolean
  var lowerLimitEquation: ContactEquation
  var motorEnabled: scala.Boolean
  var motorEquation: Equation
  var motorSpeed: scala.Double
  var position: scala.Double
  var upperLimit: scala.Double
  var upperLimitEnabled: scala.Boolean
  var upperLimitEquation: ContactEquation
  var velocity: scala.Double
  def disableMotor(): scala.Unit
  def enableMotor(): scala.Unit
  def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit
}

