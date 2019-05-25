package typings
package olLib.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var state: js.UndefOr[olLib.sourceStateMod.State] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    projection: olLib.projMod.ProjectionLike = null,
    resolutions: js.Array[scala.Double] = null,
    state: olLib.sourceStateMod.State = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Options]
  }
}

