package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "RaycastResult")
@js.native
class RaycastResult () extends js.Object {
  var body: Body = js.native
  var faceIndex: scala.Double = js.native
  var fraction: scala.Double = js.native
  var isStopped: scala.Boolean = js.native
  var normal: js.Tuple2[scala.Double, scala.Double] = js.native
  var shape: Shape = js.native
  def getHitDistance(ray: Ray): scala.Double = js.native
  def getHitPoint(out: js.Tuple2[scala.Double, scala.Double], ray: Ray): scala.Unit = js.native
  def hasHit(): scala.Boolean = js.native
  def reset(): scala.Unit = js.native
  def set(
    normal: js.Tuple2[scala.Double, scala.Double],
    shape: Shape,
    body: Body,
    friction: scala.Double,
    faceIndex: scala.Double
  ): scala.Unit = js.native
  def shouldStop(ray: Ray): scala.Boolean = js.native
  def stop(): scala.Unit = js.native
}

