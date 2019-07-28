package typings.openlayers.openlayersMod.olxNs.formatNs

import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var dataProjection: ProjectionLike
  var decimals: js.UndefOr[Double] = js.undefined
  var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
  var rightHanded: js.UndefOr[Boolean] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    dataProjection: ProjectionLike,
    decimals: Int | Double = null,
    featureProjection: ProjectionLike = null,
    rightHanded: js.UndefOr[Boolean] = js.undefined
  ): WriteOptions = {
    val __obj = js.Dynamic.literal(dataProjection = dataProjection.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    if (!js.isUndefined(rightHanded)) __obj.updateDynamic("rightHanded")(rightHanded)
    __obj.asInstanceOf[WriteOptions]
  }
}

