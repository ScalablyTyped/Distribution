package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorldDefinition extends ICompositeDefinition {
  var bounds: js.UndefOr[IBound] = js.undefined
  var gravity: js.UndefOr[Gravity] = js.undefined
}

object IWorldDefinition {
  @scala.inline
  def apply(
    bodies: js.Array[BodyType] = null,
    bounds: IBound = null,
    composites: js.Array[CompositeType] = null,
    constraints: js.Array[ConstraintType] = null,
    gravity: Gravity = null,
    id: Int | Double = null,
    isModified: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    parent: CompositeType = null,
    `type`: String = null
  ): IWorldDefinition = {
    val __obj = js.Dynamic.literal()
    if (bodies != null) __obj.updateDynamic("bodies")(bodies.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (composites != null) __obj.updateDynamic("composites")(composites.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isModified)) __obj.updateDynamic("isModified")(isModified.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorldDefinition]
  }
}

