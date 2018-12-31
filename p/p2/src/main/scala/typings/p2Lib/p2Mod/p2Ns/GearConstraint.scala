package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GearConstraint extends Constraint {
  var angle: scala.Double
  var ratio: scala.Double
  def getMaxTorque(): scala.Double
  def setMaxTorque(torque: scala.Double): scala.Unit
}

