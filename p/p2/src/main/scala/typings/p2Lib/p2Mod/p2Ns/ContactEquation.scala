package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactEquation extends Equation {
  var contactPointA: js.Tuple2[scala.Double, scala.Double]
  var contactPointB: js.Tuple2[scala.Double, scala.Double]
  var firstImpact: scala.Boolean
  var normalA: js.Tuple2[scala.Double, scala.Double]
  var penetrationVec: js.Tuple2[scala.Double, scala.Double]
  var restitution: scala.Double
  var shapeA: Shape
  var shapeB: Shape
  def getVelocityAlongNormal(): scala.Double
}

