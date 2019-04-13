package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "LockConstraint")
@js.native
class LockConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double) = this()
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double, options: LockConstraintOptions) = this()
  def getMaxForce(): scala.Double = js.native
  def setMaxForce(force: scala.Double): scala.Unit = js.native
}

