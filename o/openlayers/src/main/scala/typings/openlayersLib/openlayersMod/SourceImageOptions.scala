package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceImageOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var projection: ProjectionLike
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var state: js.UndefOr[openlayersLib.openlayersMod.sourceNs.State] = js.undefined
}

object SourceImageOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike,
    attributions: AttributionLike = null,
    extent: Extent = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    resolutions: js.Array[scala.Double] = null,
    state: openlayersLib.openlayersMod.sourceNs.State = null
  ): SourceImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[SourceImageOptions]
  }
}

