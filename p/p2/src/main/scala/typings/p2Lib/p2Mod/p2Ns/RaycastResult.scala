package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaycastResult extends js.Object {
  var body: Body
  var faceIndex: scala.Double
  var fraction: scala.Double
  var isStopped: scala.Boolean
  var normal: js.Tuple2[scala.Double, scala.Double]
  var shape: Shape
  def getHitDistance(ray: Ray): scala.Double
  def getHitPoint(out: js.Tuple2[scala.Double, scala.Double], ray: Ray): scala.Unit
  def hasHit(): scala.Boolean
  def reset(): scala.Unit
  def set(
    normal: js.Tuple2[scala.Double, scala.Double],
    shape: Shape,
    body: Body,
    friction: scala.Double,
    faceIndex: scala.Double
  ): scala.Unit
  def shouldStop(ray: Ray): scala.Boolean
  def stop(): scala.Unit
}

