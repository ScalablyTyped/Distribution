package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Shape extends js.Object {
  var angle: scala.Double
  var area: scala.Double
  var boundingRadius: scala.Double
  var collisionGroup: scala.Double
  var collisionMask: scala.Double
  var collisionResponse: scala.Boolean
  var id: scala.Double
  var material: Material
  var position: js.Array[scala.Double]
  var sensor: scala.Boolean
  var `type`: scala.Double
  def computeAABB(out: AABB, position: js.Array[scala.Double], angle: scala.Double): scala.Unit
  def computeMomentOfInertia(mass: scala.Double): scala.Double
  def updateArea(): scala.Unit
  def updateBoundingRadius(): scala.Double
}

