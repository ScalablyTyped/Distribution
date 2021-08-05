package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.ImageTile
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.Tile.State
import typings.openlayers.mod.TileCoord
import typings.openlayers.mod.TileLoadFunctionType
import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.WMTSRequestEncoding
import typings.openlayers.mod.tilegrid.WMTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMTSOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var cacheSize: js.UndefOr[Double] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var dimensions: js.UndefOr[GlobalObject] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var layer: String
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var matrixSet: String
  
  var projection: ProjectionLike
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  
  var requestEncoding: js.UndefOr[WMTSRequestEncoding | String] = js.undefined
  
  var style: String
  
  var tileClass: js.UndefOr[
    js.Function6[
      /* n */ ImageTile, 
      /* coords */ TileCoord, 
      /* state */ State, 
      /* s1 */ String, 
      /* s2 */ String, 
      /* type */ TileLoadFunctionType, 
      js.Any
    ]
  ] = js.undefined
  
  var tileGrid: WMTS
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  
  var tilePixelRatio: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object WMTSOptions {
  
  inline def apply(layer: String, matrixSet: String, style: String, tileGrid: WMTS): WMTSOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], matrixSet = matrixSet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileGrid = tileGrid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMTSOptions]
  }
  
  extension [Self <: WMTSOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value :_*))
    
    inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDimensions(value: GlobalObject): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setMatrixSet(value: String): Self = StObject.set(x, "matrixSet", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    inline def setRequestEncoding(value: WMTSRequestEncoding | String): Self = StObject.set(x, "requestEncoding", value.asInstanceOf[js.Any])
    
    inline def setRequestEncodingUndefined: Self = StObject.set(x, "requestEncoding", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTileClass(
      value: (/* n */ ImageTile, /* coords */ TileCoord, /* state */ State, /* s1 */ String, /* s2 */ String, /* type */ TileLoadFunctionType) => js.Any
    ): Self = StObject.set(x, "tileClass", js.Any.fromFunction6(value))
    
    inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
    
    inline def setTileGrid(value: WMTS): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
    
    inline def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
