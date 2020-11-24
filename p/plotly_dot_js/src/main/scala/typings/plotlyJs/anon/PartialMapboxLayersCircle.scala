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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.MapboxLayers> */
@js.native
trait PartialMapboxLayersCircle extends js.Object {
  
  var below: js.UndefOr[String] = js.native
  
  var circle: js.UndefOr[Radius] = js.native
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var coordinates: js.UndefOr[Double | String] = js.native
  
  var fill: js.UndefOr[Outlinecolor] = js.native
  
  var line: js.UndefOr[PartialShapeLine] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Double | String] = js.native
  
  var sourceattribution: js.UndefOr[String] = js.native
  
  var sourcelayer: js.UndefOr[String] = js.native
  
  var sourcetype: js.UndefOr[geojson | vecotr | raster | image] = js.native
  
  var symbol: js.UndefOr[PartialMapboxSymbolIcon] = js.native
  
  var templateitemname: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[circle | line | fill | symbol | raster] = js.native
  
  var visible: js.UndefOr[`true`] = js.native
}
object PartialMapboxLayersCircle {
  
  @scala.inline
  def apply(): PartialMapboxLayersCircle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxLayersCircle]
  }
  
  @scala.inline
  implicit class PartialMapboxLayersCircleOps[Self <: PartialMapboxLayersCircle] (val x: Self) extends AnyVal {
    
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
    def deleteBelow: Self = this.set("below", js.undefined)
    
    @scala.inline
    def setCircle(value: Radius): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCoordinates(value: Double | String): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setFill(value: Outlinecolor): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setLine(value: PartialShapeLine): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxzoom: Self = this.set("maxzoom", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = this.set("minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinzoom: Self = this.set("minzoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSource(value: Double | String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceattribution(value: String): Self = this.set("sourceattribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceattribution: Self = this.set("sourceattribution", js.undefined)
    
    @scala.inline
    def setSourcelayer(value: String): Self = this.set("sourcelayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcelayer: Self = this.set("sourcelayer", js.undefined)
    
    @scala.inline
    def setSourcetype(value: geojson | vecotr | raster | image): Self = this.set("sourcetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcetype: Self = this.set("sourcetype", js.undefined)
    
    @scala.inline
    def setSymbol(value: PartialMapboxSymbolIcon): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setTemplateitemname(value: String): Self = this.set("templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateitemname: Self = this.set("templateitemname", js.undefined)
    
    @scala.inline
    def setType(value: circle | line | fill | symbol | raster): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: `true`): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
