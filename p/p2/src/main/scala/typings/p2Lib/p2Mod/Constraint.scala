package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Constraint")
@js.native
class Constraint protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double) = this()
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double, options: ConstraintOptions) = this()
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collideConnected: scala.Boolean = js.native
  var equeations: js.Array[Equation] = js.native
  var `type`: scala.Double = js.native
  def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "Constraint")
@js.native
object Constraint extends js.Object {
  var DISTANCE: scala.Double = js.native
  var GEAR: scala.Double = js.native
  var LOCK: scala.Double = js.native
  var PRISMATIC: scala.Double = js.native
  var REVOLUTE: scala.Double = js.native
}

