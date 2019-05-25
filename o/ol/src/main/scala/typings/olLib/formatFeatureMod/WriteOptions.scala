package typings
package olLib.formatFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends js.Object {
  var dataProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var decimals: js.UndefOr[scala.Double] = js.undefined
  var featureProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var rightHanded: js.UndefOr[scala.Boolean] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    dataProjection: olLib.projMod.ProjectionLike = null,
    decimals: scala.Int | scala.Double = null,
    featureProjection: olLib.projMod.ProjectionLike = null,
    rightHanded: js.UndefOr[scala.Boolean] = js.undefined
  ): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    if (!js.isUndefined(rightHanded)) __obj.updateDynamic("rightHanded")(rightHanded)
    __obj.asInstanceOf[WriteOptions]
  }
}

