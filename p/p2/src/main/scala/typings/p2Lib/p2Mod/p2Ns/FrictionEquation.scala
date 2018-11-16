package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FrictionEquation extends Equation {
  var contactPointA: js.Array[scala.Double]
  var contactPointB: js.Array[scala.Double]
  var frictionCoefficient: scala.Double
  var shapeA: Shape
  var shapeB: Shape
  var t: js.Array[scala.Double]
  def getSlipForce(): scala.Double
  def setSlipForce(slipForce: scala.Double): scala.Double
}

