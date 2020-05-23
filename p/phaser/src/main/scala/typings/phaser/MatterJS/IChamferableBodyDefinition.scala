package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChamferableBodyDefinition extends IBodyDefinition {
  var chamfer: js.UndefOr[IChamfer] = js.undefined
}

object IChamferableBodyDefinition {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    angularSpeed: js.UndefOr[Double] = js.undefined,
    angularVelocity: js.UndefOr[Double] = js.undefined,
    area: js.UndefOr[Double] = js.undefined,
    axes: js.Array[Vector] = null,
    bounds: IBound = null,
    chamfer: IChamfer = null,
    collisionFilter: ICollisionFilter = null,
    density: js.UndefOr[Double] = js.undefined,
    force: Vector = null,
    friction: js.UndefOr[Double] = js.undefined,
    frictionAir: js.UndefOr[Double] = js.undefined,
    frictionStatic: js.UndefOr[Double] = js.undefined,
    gameObject: js.Any = null,
    gravityScale: Vector = null,
    ignoreGravity: js.UndefOr[Boolean] = js.undefined,
    ignorePointer: js.UndefOr[Boolean] = js.undefined,
    inertia: js.UndefOr[Double] = js.undefined,
    inverseInertia: js.UndefOr[Double] = js.undefined,
    inverseMass: js.UndefOr[Double] = js.undefined,
    isSensor: js.UndefOr[Boolean] = js.undefined,
    isSleeping: js.UndefOr[Boolean] = js.undefined,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    mass: js.UndefOr[Double] = js.undefined,
    motion: js.UndefOr[Double] = js.undefined,
    onCollideActiveCallback: js.Function = null,
    onCollideCallback: js.Function = null,
    onCollideEndCallback: js.Function = null,
    onCollideWith: js.Any = null,
    parent: BodyType = null,
    parts: js.Array[BodyType] = null,
    position: Vector = null,
    render: IBodyRenderOptions = null,
    restitution: js.UndefOr[Double] = js.undefined,
    sleepThreshold: js.UndefOr[Double] = js.undefined,
    slop: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    timeScale: js.UndefOr[Double] = js.undefined,
    torque: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    velocity: Vector = null,
    vertices: js.Array[Vector] = null
  ): IChamferableBodyDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularSpeed)) __obj.updateDynamic("angularSpeed")(angularSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularVelocity)) __obj.updateDynamic("angularVelocity")(angularVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(area)) __obj.updateDynamic("area")(area.get.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (chamfer != null) __obj.updateDynamic("chamfer")(chamfer.asInstanceOf[js.Any])
    if (collisionFilter != null) __obj.updateDynamic("collisionFilter")(collisionFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(density)) __obj.updateDynamic("density")(density.get.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionAir)) __obj.updateDynamic("frictionAir")(frictionAir.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionStatic)) __obj.updateDynamic("frictionStatic")(frictionStatic.get.asInstanceOf[js.Any])
    if (gameObject != null) __obj.updateDynamic("gameObject")(gameObject.asInstanceOf[js.Any])
    if (gravityScale != null) __obj.updateDynamic("gravityScale")(gravityScale.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreGravity)) __obj.updateDynamic("ignoreGravity")(ignoreGravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePointer)) __obj.updateDynamic("ignorePointer")(ignorePointer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverseInertia)) __obj.updateDynamic("inverseInertia")(inverseInertia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverseMass)) __obj.updateDynamic("inverseMass")(inverseMass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSensor)) __obj.updateDynamic("isSensor")(isSensor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSleeping)) __obj.updateDynamic("isSleeping")(isSleeping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motion)) __obj.updateDynamic("motion")(motion.get.asInstanceOf[js.Any])
    if (onCollideActiveCallback != null) __obj.updateDynamic("onCollideActiveCallback")(onCollideActiveCallback.asInstanceOf[js.Any])
    if (onCollideCallback != null) __obj.updateDynamic("onCollideCallback")(onCollideCallback.asInstanceOf[js.Any])
    if (onCollideEndCallback != null) __obj.updateDynamic("onCollideEndCallback")(onCollideEndCallback.asInstanceOf[js.Any])
    if (onCollideWith != null) __obj.updateDynamic("onCollideWith")(onCollideWith.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepThreshold)) __obj.updateDynamic("sleepThreshold")(sleepThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slop)) __obj.updateDynamic("slop")(slop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeScale)) __obj.updateDynamic("timeScale")(timeScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(torque)) __obj.updateDynamic("torque")(torque.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChamferableBodyDefinition]
  }
}

