package typings.p2.mod

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
    angle: js.UndefOr[Double] = js.undefined,
    angularDamping: js.UndefOr[Double] = js.undefined,
    angularForce: js.UndefOr[Double] = js.undefined,
    angularVelocity: js.UndefOr[Double] = js.undefined,
    ccdIterations: js.UndefOr[Double] = js.undefined,
    ccdSpeedThreshold: js.UndefOr[Double] = js.undefined,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    fixedRotation: js.UndefOr[Boolean] = js.undefined,
    fixedX: js.UndefOr[Boolean] = js.undefined,
    fixedY: js.UndefOr[Boolean] = js.undefined,
    force: js.Tuple2[Double, Double] = null,
    gravityScale: js.UndefOr[Double] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    sleepSpeedLimit: js.UndefOr[Double] = js.undefined,
    sleepTimeLimit: js.UndefOr[Double] = js.undefined,
    velocity: js.Tuple2[Double, Double] = null
  ): BodyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSleep)) __obj.updateDynamic("allowSleep")(allowSleep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularDamping)) __obj.updateDynamic("angularDamping")(angularDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularForce)) __obj.updateDynamic("angularForce")(angularForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularVelocity)) __obj.updateDynamic("angularVelocity")(angularVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ccdIterations)) __obj.updateDynamic("ccdIterations")(ccdIterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ccdSpeedThreshold)) __obj.updateDynamic("ccdSpeedThreshold")(ccdSpeedThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRotation)) __obj.updateDynamic("fixedRotation")(fixedRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedX)) __obj.updateDynamic("fixedX")(fixedX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedY)) __obj.updateDynamic("fixedY")(fixedY.get.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(gravityScale)) __obj.updateDynamic("gravityScale")(gravityScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepSpeedLimit)) __obj.updateDynamic("sleepSpeedLimit")(sleepSpeedLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepTimeLimit)) __obj.updateDynamic("sleepTimeLimit")(sleepTimeLimit.get.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOptions]
  }
}

