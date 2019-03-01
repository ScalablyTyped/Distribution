package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneParameters extends js.Object {
  var ammo: js.UndefOr[java.lang.String] = js.undefined
  var fixedTimeStep: js.UndefOr[scala.Double] = js.undefined
  var rateLimit: js.UndefOr[scala.Boolean] = js.undefined
}

object SceneParameters {
  @scala.inline
  def apply(
    ammo: java.lang.String = null,
    fixedTimeStep: scala.Int | scala.Double = null,
    rateLimit: js.UndefOr[scala.Boolean] = js.undefined
  ): SceneParameters = {
    val __obj = js.Dynamic.literal()
    if (ammo != null) __obj.updateDynamic("ammo")(ammo)
    if (fixedTimeStep != null) __obj.updateDynamic("fixedTimeStep")(fixedTimeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit)
    __obj.asInstanceOf[SceneParameters]
  }
}

