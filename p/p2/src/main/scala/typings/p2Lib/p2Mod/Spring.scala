package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Spring")
@js.native
class Spring protected () extends js.Object {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: SpringOptions) = this()
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var damping: scala.Double = js.native
  var stiffness: scala.Double = js.native
  def applyForce(): scala.Unit = js.native
}

