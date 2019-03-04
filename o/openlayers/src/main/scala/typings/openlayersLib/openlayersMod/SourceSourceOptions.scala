package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSourceOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var projection: ProjectionLike
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object SourceSourceOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike,
    attributions: AttributionLike = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    state: openlayersLib.openlayersMod.sourceNs.State = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): SourceSourceOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[SourceSourceOptions]
  }
}

