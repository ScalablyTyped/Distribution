package typings
package olLib.formatFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var dataProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var featureProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    dataProjection: olLib.projMod.ProjectionLike = null,
    extent: olLib.extentMod.Extent = null,
    featureProjection: olLib.projMod.ProjectionLike = null
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

