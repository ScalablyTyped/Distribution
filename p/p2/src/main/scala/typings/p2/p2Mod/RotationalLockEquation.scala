package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "RotationalLockEquation")
@js.native
class RotationalLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: RotationalLockEquationOptions) = this()
  var angle: Double = js.native
}

