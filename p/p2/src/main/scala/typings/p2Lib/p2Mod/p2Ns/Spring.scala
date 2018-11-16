package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Spring extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var damping: scala.Double
  var stiffness: scala.Double
  def applyForce(): scala.Unit
}

