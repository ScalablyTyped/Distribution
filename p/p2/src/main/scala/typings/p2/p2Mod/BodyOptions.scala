package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOptions extends js.Object {
  var allowSleep: js.UndefOr[Boolean] = js.undefined
  var angle: js.UndefOr[Double] = js.undefined
  var angularDamping: js.UndefOr[Double] = js.undefined
  var angularForce: js.UndefOr[Double] = js.undefined
  var angularVelocity: js.UndefOr[Double] = js.undefined
  var ccdIterations: js.UndefOr[Double] = js.undefined
  var ccdSpeedThreshold: js.UndefOr[Double] = js.undefined
  var collisionResponse: js.UndefOr[Boolean] = js.undefined
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  var fixedX: js.UndefOr[Boolean] = js.undefined
  var fixedY: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var gravityScale: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var sleepSpeedLimit: js.UndefOr[Double] = js.undefined
  var sleepTimeLimit: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object BodyOptions {
  @scala.inline
  def apply(
    allowSleep: js.UndefOr[Boolean] = js.undefined,
    angle: Int | Double = null,
    angularDamping: Int | Double = null,
    angularForce: Int | Double = null,
    angularVelocity: Int | Double = null,
    ccdIterations: Int | Double = null,
    ccdSpeedThreshold: Int | Double = null,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    fixedRotation: js.UndefOr[Boolean] = js.undefined,
    fixedX: js.UndefOr[Boolean] = js.undefined,
    fixedY: js.UndefOr[Boolean] = js.undefined,
    force: js.Tuple2[Double, Double] = null,
    gravityScale: Int | Double = null,
    id: Int | Double = null,
    mass: Int | Double = null,
    position: js.Tuple2[Double, Double] = null,
    sleepSpeedLimit: Int | Double = null,
    sleepTimeLimit: Int | Double = null,
    velocity: js.Tuple2[Double, Double] = null
  ): BodyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSleep)) __obj.updateDynamic("allowSleep")(allowSleep.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (angularDamping != null) __obj.updateDynamic("angularDamping")(angularDamping.asInstanceOf[js.Any])
    if (angularForce != null) __obj.updateDynamic("angularForce")(angularForce.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (ccdIterations != null) __obj.updateDynamic("ccdIterations")(ccdIterations.asInstanceOf[js.Any])
    if (ccdSpeedThreshold != null) __obj.updateDynamic("ccdSpeedThreshold")(ccdSpeedThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRotation)) __obj.updateDynamic("fixedRotation")(fixedRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedX)) __obj.updateDynamic("fixedX")(fixedX.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedY)) __obj.updateDynamic("fixedY")(fixedY.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (gravityScale != null) __obj.updateDynamic("gravityScale")(gravityScale.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sleepSpeedLimit != null) __obj.updateDynamic("sleepSpeedLimit")(sleepSpeedLimit.asInstanceOf[js.Any])
    if (sleepTimeLimit != null) __obj.updateDynamic("sleepTimeLimit")(sleepTimeLimit.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOptions]
  }
}

