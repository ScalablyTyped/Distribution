package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "ContactEquation")
@js.native
class ContactEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  var contactPointA: js.Tuple2[scala.Double, scala.Double] = js.native
  var contactPointB: js.Tuple2[scala.Double, scala.Double] = js.native
  var firstImpact: scala.Boolean = js.native
  var normalA: js.Tuple2[scala.Double, scala.Double] = js.native
  var penetrationVec: js.Tuple2[scala.Double, scala.Double] = js.native
  var restitution: scala.Double = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  def getVelocityAlongNormal(): scala.Double = js.native
}

