package typings.ol

import typings.ol.pluggableMapMod.FrameState
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileJSONMod {
  
  @JSImport("ol/source/TileJSON", JSImport.Default)
  @js.native
  open class default protected () extends TileJSON {
    def this(options: Options) = this()
  }
  
  trait Config extends StObject {
    
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
    
    inline def apply(tiles: js.Array[String]): Config = {
      val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGrids(value: js.Array[String]): Self = StObject.set(x, "grids", value.asInstanceOf[js.Any])
      
      inline def setGridsUndefined: Self = StObject.set(x, "grids", js.undefined)
      
      inline def setGridsVarargs(value: String*): Self = StObject.set(x, "grids", js.Array(value*))
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
      
      inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
      
      inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
      
      inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var tileJSON: js.UndefOr[Config] = js.undefined
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setTileJSON(value: Config): Self = StObject.set(x, "tileJSON", value.asInstanceOf[js.Any])
      
      inline def setTileJSONUndefined: Self = StObject.set(x, "tileJSON", js.undefined)
      
      inline def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  @js.native
  trait TileJSON
    extends typings.ol.sourceTileImageMod.default {
    
    def getTileJSON(): Config = js.native
    
    /* protected */ def handleTileJSONError(): Unit = js.native
    
    /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
  }
}
