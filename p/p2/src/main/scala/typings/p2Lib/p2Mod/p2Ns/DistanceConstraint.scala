package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DistanceConstraint extends Constraint {
  var distance: scala.Double
  var localAnchorA: js.Array[scala.Double]
  var localAnchorB: js.Array[scala.Double]
  var lowerLimit: scala.Double
  var lowerLimitEnabled: scala.Boolean
  var maxForce: scala.Double
  var position: scala.Double
  var upperLimit: scala.Double
  var upperLimitEnabled: scala.Boolean
  def getMaxForce(): scala.Double
  def setMaxForce(f: scala.Double): scala.Unit
}

