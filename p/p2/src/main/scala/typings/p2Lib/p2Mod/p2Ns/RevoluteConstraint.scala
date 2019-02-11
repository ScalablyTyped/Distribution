package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevoluteConstraint extends Constraint {
  var angle: scala.Double
  var lowerLimit: scala.Double
  var lowerLimitEnabled: scala.Boolean
  var motorEnabled: scala.Boolean
  var motorMaxForce: scala.Double
  var motorSpeed: scala.Double
  var upperLimit: scala.Double
  var upperLimitEnabled: scala.Boolean
  def disableMotor(): scala.Unit
  def enableMotor(): scala.Unit
  def getMotorSpeed(): scala.Double
  def motorIsEnabled(): scala.Boolean
  def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit
  def setMotorSpeed(speed: scala.Double): scala.Unit
}

