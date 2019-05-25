package typings
package olLib.formatTopoJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataProjection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var layerName: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataProjection: olLib.projMod.ProjectionLike = null,
    layerName: java.lang.String = null,
    layers: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[Options]
  }
}

