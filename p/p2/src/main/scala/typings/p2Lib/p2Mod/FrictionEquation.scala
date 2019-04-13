package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "FrictionEquation")
@js.native
class FrictionEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, slipForce: scala.Double) = this()
  var contactEquations: js.Array[ContactEquation] = js.native
  var contactPointA: js.Tuple2[scala.Double, scala.Double] = js.native
  var contactPointB: js.Tuple2[scala.Double, scala.Double] = js.native
  var frictionCoefficient: scala.Double = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  var t: js.Tuple2[scala.Double, scala.Double] = js.native
  def getSlipForce(): scala.Double = js.native
  def setSlipForce(slipForce: scala.Double): scala.Unit = js.native
}

