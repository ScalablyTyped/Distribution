package typings.plotlyJs.mod

import typings.plotlyJs.anon.Outlinecolor
import typings.plotlyJs.anon.PartialMapboxSymbolIcon
import typings.plotlyJs.anon.PartialShapeLine
import typings.plotlyJs.anon.Radius
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

@js.native
trait MapboxLayers extends js.Object {
  var below: String = js.native
  var circle: Radius = js.native
  var color: Color = js.native
  var coordinates: Double | String = js.native
  var fill: Outlinecolor = js.native
  var line: PartialShapeLine = js.native
  var maxzoom: Double = js.native
  var minzoom: Double = js.native
  var name: String = js.native
  var opacity: Double = js.native
  var source: Double | String = js.native
  var sourceattribution: String = js.native
  var sourcelayer: String = js.native
  var sourcetype: geojson | vecotr | raster | image = js.native
  var symbol: PartialMapboxSymbolIcon = js.native
  var templateitemname: String = js.native
  var `type`: circle | line | fill | symbol | raster = js.native
  var visible: `true` = js.native
}

object MapboxLayers {
  @scala.inline
  def apply(
    below: String,
    circle: Radius,
    color: Color,
    coordinates: Double | String,
    fill: Outlinecolor,
    line: PartialShapeLine,
    maxzoom: Double,
    minzoom: Double,
    name: String,
    opacity: Double,
    source: Double | String,
    sourceattribution: String,
    sourcelayer: String,
    sourcetype: geojson | vecotr | raster | image,
    symbol: PartialMapboxSymbolIcon,
    templateitemname: String,
    `type`: circle | line | fill | symbol | raster,
    visible: `true`
  ): MapboxLayers = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceattribution = sourceattribution.asInstanceOf[js.Any], sourcelayer = sourcelayer.asInstanceOf[js.Any], sourcetype = sourcetype.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxLayers]
  }
  @scala.inline
  implicit class MapboxLayersOps[Self <: MapboxLayers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBelow(value: String): Self = this.set("below", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircle(value: Radius): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoordinates(value: Double | String): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: Outlinecolor): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: PartialShapeLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinzoom(value: Double): Self = this.set("minzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Double | String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceattribution(value: String): Self = this.set("sourceattribution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcelayer(value: String): Self = this.set("sourcelayer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcetype(value: geojson | vecotr | raster | image): Self = this.set("sourcetype", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: PartialMapboxSymbolIcon): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateitemname(value: String): Self = this.set("templateitemname", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: circle | line | fill | symbol | raster): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: `true`): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

