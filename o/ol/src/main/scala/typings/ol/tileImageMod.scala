package typings.ol

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StringDictionary
import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.olTileMod.UrlFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileImageMod {
  
  @JSImport("ol/source/TileImage", JSImport.Default)
  @js.native
  open class default protected () extends TileImage {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var tileClass: js.UndefOr[
        Instantiable6[
          /* tileCoord */ TileCoord, 
          /* state */ TileState, 
          /* src */ String, 
          /* crossOrigin */ String, 
          /* tileLoadFunction */ LoadFunction, 
          /* opt_options */ js.UndefOr[typings.ol.olTileMod.Options], 
          typings.ol.imageTileMod.default
        ]
      ] = js.undefined
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    var zDirection: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
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
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTileClass(
        value: Instantiable6[
              /* tileCoord */ TileCoord, 
              /* state */ TileState, 
              /* src */ String, 
              /* crossOrigin */ String, 
              /* tileLoadFunction */ LoadFunction, 
              /* opt_options */ js.UndefOr[typings.ol.olTileMod.Options], 
              typings.ol.imageTileMod.default
            ]
      ): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      inline def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTileUrlFunction(
        value: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typings.ol.projectionMod.default) => js.UndefOr[String]
      ): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
      
      inline def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  @js.native
  trait TileImage
    extends typings.ol.urlTileMod.default {
    
    /* protected */ var crossOrigin: String = js.native
    
    def getGutter(): Double = js.native
    
    /* protected */ def getTileInternal(z: Double, x: Double, y: Double, pixelRatio: Double, projection: typings.ol.projectionMod.default): typings.ol.olTileMod.default = js.native
    
    /**
      * Sets whether to render reprojection edges or not (usually for debugging).
      */
    def setRenderReprojectionEdges(render: Boolean): Unit = js.native
    
    /**
      * Sets the tile grid to use when reprojecting the tiles to the given
      * projection instead of the default tile grid for the projection.
      * This can be useful when the default tile grid cannot be created
      * (e.g. projection has no extent defined) or
      * for optimization reasons (custom tile size, resolutions, ...).
      */
    def setTileGridForProjection(projection: ProjectionLike, tilegrid: typings.ol.tilegridTileGridMod.default): Unit = js.native
    
    /* protected */ var tileCacheForProjection: StringDictionary[typings.ol.tileCacheMod.default] = js.native
    
    /* protected */ var tileClass: Instantiable6[
        /* tileCoord */ TileCoord, 
        /* state */ TileState, 
        /* src */ String, 
        /* crossOrigin */ String, 
        /* tileLoadFunction */ LoadFunction, 
        /* opt_options */ js.UndefOr[typings.ol.olTileMod.Options], 
        typings.ol.imageTileMod.default
      ] = js.native
    
    /* protected */ var tileGridForProjection: StringDictionary[typings.ol.tilegridTileGridMod.default] = js.native
  }
}
