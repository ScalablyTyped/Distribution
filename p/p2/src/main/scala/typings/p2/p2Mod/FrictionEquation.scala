package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "FrictionEquation")
@js.native
class FrictionEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body, slipForce: Double) = this()
  var contactEquations: js.Array[ContactEquation] = js.native
  var contactPointA: js.Tuple2[Double, Double] = js.native
  var contactPointB: js.Tuple2[Double, Double] = js.native
  var frictionCoefficient: Double = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  var t: js.Tuple2[Double, Double] = js.native
  def getSlipForce(): Double = js.native
  def setSlipForce(slipForce: Double): Unit = js.native
}

