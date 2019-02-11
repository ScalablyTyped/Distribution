package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrictionEquation extends Equation {
  var contactEquations: js.Array[ContactEquation]
  var contactPointA: js.Tuple2[scala.Double, scala.Double]
  var contactPointB: js.Tuple2[scala.Double, scala.Double]
  var frictionCoefficient: scala.Double
  var shapeA: Shape
  var shapeB: Shape
  var t: js.Tuple2[scala.Double, scala.Double]
  def getSlipForce(): scala.Double
  def setSlipForce(slipForce: scala.Double): scala.Unit
}

