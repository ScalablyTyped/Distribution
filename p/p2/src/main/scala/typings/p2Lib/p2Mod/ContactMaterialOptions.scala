package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactMaterialOptions extends js.Object {
  var friction: js.UndefOr[scala.Double] = js.undefined
  var frictionRelaxation: js.UndefOr[scala.Double] = js.undefined
  var frictionStiffness: js.UndefOr[scala.Double] = js.undefined
  var relaxation: js.UndefOr[scala.Double] = js.undefined
  var restitution: js.UndefOr[scala.Double] = js.undefined
  var stiffness: js.UndefOr[scala.Double] = js.undefined
  var surfaceVelocity: js.UndefOr[scala.Double] = js.undefined
}

object ContactMaterialOptions {
  @scala.inline
  def apply(
    friction: scala.Int | scala.Double = null,
    frictionRelaxation: scala.Int | scala.Double = null,
    frictionStiffness: scala.Int | scala.Double = null,
    relaxation: scala.Int | scala.Double = null,
    restitution: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null,
    surfaceVelocity: scala.Int | scala.Double = null
  ): ContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (frictionRelaxation != null) __obj.updateDynamic("frictionRelaxation")(frictionRelaxation.asInstanceOf[js.Any])
    if (frictionStiffness != null) __obj.updateDynamic("frictionStiffness")(frictionStiffness.asInstanceOf[js.Any])
    if (relaxation != null) __obj.updateDynamic("relaxation")(relaxation.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (surfaceVelocity != null) __obj.updateDynamic("surfaceVelocity")(surfaceVelocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMaterialOptions]
  }
}

