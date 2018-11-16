package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContactEquation extends Equation {
  var contactPointA: js.Array[scala.Double]
  var contactPointB: js.Array[scala.Double]
  var firstImpact: scala.Boolean
  var normalA: js.Array[scala.Double]
  var penetrationVec: js.Array[scala.Double]
  var restitution: scala.Double
  var shapeA: Shape
  var shapeB: Shape
}

