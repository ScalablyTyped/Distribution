package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var collideConnected: scala.Boolean
  var equeations: js.Array[Equation]
  var `type`: scala.Double
  def setRelaxation(relaxation: scala.Double): scala.Unit
  def setStiffness(stiffness: scala.Double): scala.Unit
  def update(): scala.Unit
}

