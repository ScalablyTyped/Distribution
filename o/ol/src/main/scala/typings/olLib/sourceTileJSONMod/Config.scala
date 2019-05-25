package typings
package olLib.sourceTileJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var bounds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var grids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var legend: js.UndefOr[java.lang.String] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var minzoom: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var tiles: js.Array[java.lang.String]
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    tiles: js.Array[java.lang.String],
    attribution: java.lang.String = null,
    bounds: js.Array[scala.Double] = null,
    center: js.Array[scala.Double] = null,
    description: java.lang.String = null,
    grids: js.Array[java.lang.String] = null,
    legend: java.lang.String = null,
    maxzoom: scala.Int | scala.Double = null,
    minzoom: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    scheme: java.lang.String = null,
    template: java.lang.String = null,
    version: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal(tiles = tiles)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center)
    if (description != null) __obj.updateDynamic("description")(description)
    if (grids != null) __obj.updateDynamic("grids")(grids)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (template != null) __obj.updateDynamic("template")(template)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Config]
  }
}

