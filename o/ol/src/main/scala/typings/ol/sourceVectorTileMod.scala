package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.olTileMod.UrlFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceVectorTileMod {
  
  @JSImport("ol/source/VectorTile", JSImport.Default)
  @js.native
  class default protected () extends VectorTile {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/VectorTile", "defaultLoadFunction")
  @js.native
  def defaultLoadFunction(tile: typings.ol.olVectorTileMod.default, url: String): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var format: js.UndefOr[typings.ol.featureMod.default] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var overlaps: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var tileClass: js.UndefOr[typings.ol.olVectorTileMod.default] = js.native
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
    
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.native
    
    var tileSize: js.UndefOr[Double | Size] = js.native
    
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
    
    var transition: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var urls: js.UndefOr[js.Array[String]] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zDirection: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setFormat(value: typings.ol.featureMod.default): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTileClass(value: typings.ol.olVectorTileMod.default): Self = StObject.set(x, "tileClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileClassUndefined: Self = StObject.set(x, "tileClass", js.undefined)
      
      @scala.inline
      def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      @scala.inline
      def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      @scala.inline
      def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      @scala.inline
      def setTileUrlFunction(
        value: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typings.ol.projectionMod.default) => js.UndefOr[String]
      ): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
      
      @scala.inline
      def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      @scala.inline
      def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  @js.native
  trait VectorTile
    extends typings.ol.urlTileMod.default {
    
    /**
      * Get features whose bounding box intersects the provided extent. Only features for cached
      * tiles for the last rendered zoom level are available in the source. So this method is only
      * suitable for requesting tiles for extents that are currently rendered.
      * Features are returned in random tile order and as they are included in the tiles. This means
      * they can be clipped, duplicated across tiles, and simplified to the render resolution.
      */
    def getFeaturesInExtent(extent: Extent): js.Array[FeatureLike] = js.native
    
    def getOverlaps(): Boolean = js.native
    
    def getSourceTiles(
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default,
      tile: typings.ol.vectorRenderTileMod.default
    ): js.Array[typings.ol.olVectorTileMod.default] = js.native
    
    var tileClass: typings.ol.olVectorTileMod.default = js.native
  }
}
