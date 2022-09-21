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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxLayers extends StObject {
  
  var below: String
  
  var circle: Radius
  
  var color: Color
  
  var coordinates: Double | String
  
  var fill: Outlinecolor
  
  var line: PartialShapeLine
  
  var maxzoom: Double
  
  var minzoom: Double
  
  var name: String
  
  var opacity: Double
  
  var source: Double | String
  
  var sourceattribution: String
  
  var sourcelayer: String
  
  var sourcetype: geojson | vecotr | raster | image
  
  var symbol: PartialMapboxSymbolIcon
  
  var templateitemname: String
  
  var `type`: circle | line | fill | symbol | raster
  
  var visible: `true`
}
object MapboxLayers {
  
  inline def apply(
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
    `type`: circle | line | fill | symbol | raster
  ): MapboxLayers = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], maxzoom = maxzoom.asInstanceOf[js.Any], minzoom = minzoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceattribution = sourceattribution.asInstanceOf[js.Any], sourcelayer = sourcelayer.asInstanceOf[js.Any], sourcetype = sourcetype.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = true)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxLayers]
  }
  
  extension [Self <: MapboxLayers](x: Self) {
    
    inline def setBelow(value: String): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
    
    inline def setCircle(value: Radius): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setCoordinates(value: Double | String): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Outlinecolor): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setLine(value: PartialShapeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Double | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceattribution(value: String): Self = StObject.set(x, "sourceattribution", value.asInstanceOf[js.Any])
    
    inline def setSourcelayer(value: String): Self = StObject.set(x, "sourcelayer", value.asInstanceOf[js.Any])
    
    inline def setSourcetype(value: geojson | vecotr | raster | image): Self = StObject.set(x, "sourcetype", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: PartialMapboxSymbolIcon): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setType(value: circle | line | fill | symbol | raster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: `true`): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
