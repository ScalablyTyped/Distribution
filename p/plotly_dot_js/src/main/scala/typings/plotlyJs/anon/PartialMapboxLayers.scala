package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.fill
import typings.plotlyJs.plotlyJsStrings.geojson
import typings.plotlyJs.plotlyJsStrings.image
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.raster
import typings.plotlyJs.plotlyJsStrings.symbol
import typings.plotlyJs.plotlyJsStrings.vecotr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.MapboxLayers> */
trait PartialMapboxLayers extends js.Object {
  var below: js.UndefOr[String] = js.undefined
  var circle: js.UndefOr[Radius] = js.undefined
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var coordinates: js.UndefOr[Double | String] = js.undefined
  var fill: js.UndefOr[Outlinecolor] = js.undefined
  var line: js.UndefOr[PartialShapeLine] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Double | String] = js.undefined
  var sourceattribution: js.UndefOr[String] = js.undefined
  var sourcelayer: js.UndefOr[String] = js.undefined
  var sourcetype: js.UndefOr[geojson | vecotr | raster | image] = js.undefined
  var symbol: js.UndefOr[PartialMapboxSymbol] = js.undefined
  var templateitemname: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[circle | line | fill | symbol | raster] = js.undefined
  var visible: js.UndefOr[`true`] = js.undefined
}

object PartialMapboxLayers {
  @scala.inline
  def apply(
    below: String = null,
    circle: Radius = null,
    color: typings.plotlyJs.mod.Color = null,
    coordinates: Double | String = null,
    fill: Outlinecolor = null,
    line: PartialShapeLine = null,
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    source: Double | String = null,
    sourceattribution: String = null,
    sourcelayer: String = null,
    sourcetype: geojson | vecotr | raster | image = null,
    symbol: PartialMapboxSymbol = null,
    templateitemname: String = null,
    `type`: circle | line | fill | symbol | raster = null,
    visible: `true` = null
  ): PartialMapboxLayers = {
    val __obj = js.Dynamic.literal()
    if (below != null) __obj.updateDynamic("below")(below.asInstanceOf[js.Any])
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceattribution != null) __obj.updateDynamic("sourceattribution")(sourceattribution.asInstanceOf[js.Any])
    if (sourcelayer != null) __obj.updateDynamic("sourcelayer")(sourcelayer.asInstanceOf[js.Any])
    if (sourcetype != null) __obj.updateDynamic("sourcetype")(sourcetype.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (templateitemname != null) __obj.updateDynamic("templateitemname")(templateitemname.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMapboxLayers]
  }
}

