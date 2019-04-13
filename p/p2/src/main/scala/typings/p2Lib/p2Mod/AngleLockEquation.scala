package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "AngleLockEquation")
@js.native
class AngleLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: AngleLockEquationOptions) = this()
  var angle: scala.Double = js.native
  var ratio: scala.Double = js.native
  def setMaxTorque(torque: scala.Double): scala.Unit = js.native
  def setRatio(ratio: scala.Double): scala.Double = js.native
}

