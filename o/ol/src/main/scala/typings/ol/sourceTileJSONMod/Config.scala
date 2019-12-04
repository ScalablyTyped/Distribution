package typings.ol.sourceTileJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  var center: js.UndefOr[js.Array[Double]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var grids: js.UndefOr[js.Array[String]] = js.undefined
  var legend: js.UndefOr[String] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var tiles: js.Array[String]
  var version: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    tiles: js.Array[String],
    attribution: String = null,
    bounds: js.Array[Double] = null,
    center: js.Array[Double] = null,
    description: String = null,
    grids: js.Array[String] = null,
    legend: String = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    name: String = null,
    scheme: String = null,
    template: String = null,
    version: String = null
  ): Config = {
    val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (grids != null) __obj.updateDynamic("grids")(grids.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

