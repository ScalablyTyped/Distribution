package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOptions extends js.Object {
  var allowSleep: js.UndefOr[scala.Boolean] = js.undefined
  var angle: js.UndefOr[scala.Double] = js.undefined
  var angularForce: js.UndefOr[scala.Double] = js.undefined
  var angularVelocity: js.UndefOr[scala.Double] = js.undefined
  var ccdIterations: js.UndefOr[scala.Double] = js.undefined
  var ccdSpeedThreshold: js.UndefOr[scala.Double] = js.undefined
  var collisionResponse: js.UndefOr[scala.Boolean] = js.undefined
  var fixedRotation: js.UndefOr[scala.Boolean] = js.undefined
  var fixedX: js.UndefOr[scala.Boolean] = js.undefined
  var fixedY: js.UndefOr[scala.Boolean] = js.undefined
  var force: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var gravityScale: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  var mass: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var sleepSpeedLimit: js.UndefOr[scala.Double] = js.undefined
  var sleepTimeLimit: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object BodyOptions {
  @scala.inline
  def apply(
    allowSleep: js.UndefOr[scala.Boolean] = js.undefined,
    angle: scala.Int | scala.Double = null,
    angularForce: scala.Int | scala.Double = null,
    angularVelocity: scala.Int | scala.Double = null,
    ccdIterations: scala.Int | scala.Double = null,
    ccdSpeedThreshold: scala.Int | scala.Double = null,
    collisionResponse: js.UndefOr[scala.Boolean] = js.undefined,
    fixedRotation: js.UndefOr[scala.Boolean] = js.undefined,
    fixedX: js.UndefOr[scala.Boolean] = js.undefined,
    fixedY: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.Tuple2[scala.Double, scala.Double] = null,
    gravityScale: scala.Int | scala.Double = null,
    id: scala.Int | scala.Double = null,
    mass: scala.Int | scala.Double = null,
    position: js.Tuple2[scala.Double, scala.Double] = null,
    sleepSpeedLimit: scala.Int | scala.Double = null,
    sleepTimeLimit: scala.Int | scala.Double = null,
    velocity: js.Tuple2[scala.Double, scala.Double] = null
  ): BodyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSleep)) __obj.updateDynamic("allowSleep")(allowSleep)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (angularForce != null) __obj.updateDynamic("angularForce")(angularForce.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (ccdIterations != null) __obj.updateDynamic("ccdIterations")(ccdIterations.asInstanceOf[js.Any])
    if (ccdSpeedThreshold != null) __obj.updateDynamic("ccdSpeedThreshold")(ccdSpeedThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse)
    if (!js.isUndefined(fixedRotation)) __obj.updateDynamic("fixedRotation")(fixedRotation)
    if (!js.isUndefined(fixedX)) __obj.updateDynamic("fixedX")(fixedX)
    if (!js.isUndefined(fixedY)) __obj.updateDynamic("fixedY")(fixedY)
    if (force != null) __obj.updateDynamic("force")(force)
    if (gravityScale != null) __obj.updateDynamic("gravityScale")(gravityScale.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (sleepSpeedLimit != null) __obj.updateDynamic("sleepSpeedLimit")(sleepSpeedLimit.asInstanceOf[js.Any])
    if (sleepTimeLimit != null) __obj.updateDynamic("sleepTimeLimit")(sleepTimeLimit.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity)
    __obj.asInstanceOf[BodyOptions]
  }
}

