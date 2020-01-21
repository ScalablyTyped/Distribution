package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RayOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* result */ RaycastResult, Unit]] = js.undefined
  var checkCollisionResponse: js.UndefOr[Boolean] = js.undefined
  var collisionGroup: js.UndefOr[Double] = js.undefined
  var collisionMask: js.UndefOr[Double] = js.undefined
  var from: js.Tuple2[Double, Double]
  var mode: js.UndefOr[Double] = js.undefined
  var skipBackfaces: js.UndefOr[Boolean] = js.undefined
  var to: js.Tuple2[Double, Double]
}

object RayOptions {
  @scala.inline
  def apply(
    from: js.Tuple2[Double, Double],
    to: js.Tuple2[Double, Double],
    callback: /* result */ RaycastResult => Unit = null,
    checkCollisionResponse: js.UndefOr[Boolean] = js.undefined,
    collisionGroup: Int | Double = null,
    collisionMask: Int | Double = null,
    mode: Int | Double = null,
    skipBackfaces: js.UndefOr[Boolean] = js.undefined
  ): RayOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(checkCollisionResponse)) __obj.updateDynamic("checkCollisionResponse")(checkCollisionResponse.asInstanceOf[js.Any])
    if (collisionGroup != null) __obj.updateDynamic("collisionGroup")(collisionGroup.asInstanceOf[js.Any])
    if (collisionMask != null) __obj.updateDynamic("collisionMask")(collisionMask.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipBackfaces)) __obj.updateDynamic("skipBackfaces")(skipBackfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[RayOptions]
  }
}

