package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RayOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, scala.Unit]] = js.undefined
  var checkCollisionResponse: js.UndefOr[scala.Boolean] = js.undefined
  var collisionGroup: js.UndefOr[scala.Double] = js.undefined
  var collisionMask: js.UndefOr[scala.Double] = js.undefined
  var from: js.Tuple2[scala.Double, scala.Double]
  var mode: js.UndefOr[scala.Double] = js.undefined
  var skipBackfaces: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.Tuple2[scala.Double, scala.Double]
}

object RayOptions {
  @scala.inline
  def apply(
    from: js.Tuple2[scala.Double, scala.Double],
    to: js.Tuple2[scala.Double, scala.Double],
    callback: js.Function1[/* result */ RaycastResult, scala.Unit] = null,
    checkCollisionResponse: js.UndefOr[scala.Boolean] = js.undefined,
    collisionGroup: scala.Int | scala.Double = null,
    collisionMask: scala.Int | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    skipBackfaces: js.UndefOr[scala.Boolean] = js.undefined
  ): RayOptions = {
    val __obj = js.Dynamic.literal(from = from, to = to)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(checkCollisionResponse)) __obj.updateDynamic("checkCollisionResponse")(checkCollisionResponse)
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipBackfaces)) __obj.updateDynamic("skipBackfaces")(skipBackfaces)
    __obj.asInstanceOf[RayOptions]
  }
}

