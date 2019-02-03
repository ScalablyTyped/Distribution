package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Constraint")
@js.native
class Constraint protected ()
  extends p2Lib.p2Mod.p2Ns.Constraint {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, `type`: scala.Double) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, `type`: scala.Double, options: p2Lib.Anon_CollideConnected) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var collideConnected: scala.Boolean = js.native
  /* CompleteClass */
  override var equeations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
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

