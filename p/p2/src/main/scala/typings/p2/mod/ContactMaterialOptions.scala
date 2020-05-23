package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactMaterialOptions extends js.Object {
  var friction: js.UndefOr[Double] = js.undefined
  var frictionRelaxation: js.UndefOr[Double] = js.undefined
  var frictionStiffness: js.UndefOr[Double] = js.undefined
  var relaxation: js.UndefOr[Double] = js.undefined
  var restitution: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var surfaceVelocity: js.UndefOr[Double] = js.undefined
}

object ContactMaterialOptions {
  @scala.inline
  def apply(
    friction: js.UndefOr[Double] = js.undefined,
    frictionRelaxation: js.UndefOr[Double] = js.undefined,
    frictionStiffness: js.UndefOr[Double] = js.undefined,
    relaxation: js.UndefOr[Double] = js.undefined,
    restitution: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    surfaceVelocity: js.UndefOr[Double] = js.undefined
  ): ContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionRelaxation)) __obj.updateDynamic("frictionRelaxation")(frictionRelaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionStiffness)) __obj.updateDynamic("frictionStiffness")(frictionStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relaxation)) __obj.updateDynamic("relaxation")(relaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(surfaceVelocity)) __obj.updateDynamic("surfaceVelocity")(surfaceVelocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMaterialOptions]
  }
}

