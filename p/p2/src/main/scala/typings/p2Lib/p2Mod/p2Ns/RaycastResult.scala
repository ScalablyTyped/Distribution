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
    getHitDistance: js.Function1[Ray, scala.Double],
    getHitPoint: js.Function2[js.Tuple2[scala.Double, scala.Double], Ray, scala.Unit],
    hasHit: js.Function0[scala.Boolean],
    isStopped: scala.Boolean,
    normal: js.Tuple2[scala.Double, scala.Double],
    reset: js.Function0[scala.Unit],
    set: js.Function5[js.Tuple2[scala.Double, scala.Double], Shape, Body, scala.Double, scala.Double, scala.Unit],
    shape: Shape,
    shouldStop: js.Function1[Ray, scala.Boolean],
    stop: js.Function0[scala.Unit]
  ): RaycastResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("faceIndex")(faceIndex)
    __obj.updateDynamic("fraction")(fraction)
    __obj.updateDynamic("getHitDistance")(getHitDistance)
    __obj.updateDynamic("getHitPoint")(getHitPoint)
    __obj.updateDynamic("hasHit")(hasHit)
    __obj.updateDynamic("isStopped")(isStopped)
    __obj.updateDynamic("normal")(normal)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("shape")(shape)
    __obj.updateDynamic("shouldStop")(shouldStop)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[RaycastResult]
  }
}

