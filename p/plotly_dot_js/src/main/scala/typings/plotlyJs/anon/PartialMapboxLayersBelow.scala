package typings.plotlyJs.anon

import typings.plotlyJs.mod.MapboxSymbol
import typings.plotlyJs.mod.ShapeLine
import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.fill
import typings.plotlyJs.plotlyJsStrings.geojson
import typings.plotlyJs.plotlyJsStrings.image
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.raster
import typings.plotlyJs.plotlyJsStrings.symbol
import typings.plotlyJs.plotlyJsStrings.vecotr
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.MapboxLayers> */
@js.native
trait PartialMapboxLayersBelow extends StObject {
  
  var below: js.UndefOr[String] = js.native
  
  var circle: js.UndefOr[Radius] = js.native
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var coordinates: js.UndefOr[Double | String] = js.native
  
  var fill: js.UndefOr[Outlinecolor] = js.native
  
  var line: js.UndefOr[Partial[ShapeLine]] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Double | String] = js.native
  
  var sourceattribution: js.UndefOr[String] = js.native
  
  var sourcelayer: js.UndefOr[String] = js.native
  
  var sourcetype: js.UndefOr[geojson | vecotr | raster | image] = js.native
  
  var symbol: js.UndefOr[Partial[MapboxSymbol]] = js.native
  
  var templateitemname: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[circle | line | fill | symbol | raster] = js.native
  
  var visible: js.UndefOr[`true`] = js.native
}
object PartialMapboxLayersBelow {
  
  @scala.inline
  def apply(): PartialMapboxLayersBelow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapboxLayersBelow]
  }
  
  @scala.inline
  implicit class PartialMapboxLayersBelowMutableBuilder[Self <: PartialMapboxLayersBelow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBelow(value: String): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelowUndefined: Self = StObject.set(x, "below", js.undefined)
    
    @scala.inline
    def setCircle(value: Radius): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: Double | String): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setFill(value: Outlinecolor): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setLine(value: Partial[ShapeLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSource(value: Double | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceattribution(value: String): Self = StObject.set(x, "sourceattribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceattributionUndefined: Self = StObject.set(x, "sourceattribution", js.undefined)
    
    @scala.inline
    def setSourcelayer(value: String): Self = StObject.set(x, "sourcelayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcelayerUndefined: Self = StObject.set(x, "sourcelayer", js.undefined)
    
    @scala.inline
    def setSourcetype(value: geojson | vecotr | raster | image): Self = StObject.set(x, "sourcetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcetypeUndefined: Self = StObject.set(x, "sourcetype", js.undefined)
    
    @scala.inline
    def setSymbol(value: Partial[MapboxSymbol]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    @scala.inline
    def setType(value: circle | line | fill | symbol | raster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: `true`): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
