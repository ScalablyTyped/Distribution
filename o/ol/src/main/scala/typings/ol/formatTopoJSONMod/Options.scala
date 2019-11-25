package typings.ol.formatTopoJSONMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
  var layerName: js.UndefOr[String] = js.undefined
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(dataProjection: ProjectionLike = null, layerName: String = null, layers: js.Array[String] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

