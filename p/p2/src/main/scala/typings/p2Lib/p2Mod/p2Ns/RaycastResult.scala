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

object RaycastResult {
  @scala.inline
  def apply(
    body: Body,
    faceIndex: scala.Double,
    fraction: scala.Double,
    getHitDistance: Ray => scala.Double,
    getHitPoint: (js.Tuple2[scala.Double, scala.Double], Ray) => scala.Unit,
    hasHit: () => scala.Boolean,
    isStopped: scala.Boolean,
    normal: js.Tuple2[scala.Double, scala.Double],
    reset: () => scala.Unit,
    set: (js.Tuple2[scala.Double, scala.Double], Shape, Body, scala.Double, scala.Double) => scala.Unit,
    shape: Shape,
    shouldStop: Ray => scala.Boolean,
    stop: () => scala.Unit
  ): RaycastResult = {
    val __obj = js.Dynamic.literal(body = body, faceIndex = faceIndex, fraction = fraction, getHitDistance = js.Any.fromFunction1(getHitDistance), getHitPoint = js.Any.fromFunction2(getHitPoint), hasHit = js.Any.fromFunction0(hasHit), isStopped = isStopped, normal = normal, reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction5(set), shape = shape, shouldStop = js.Any.fromFunction1(shouldStop), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[RaycastResult]
  }
}

