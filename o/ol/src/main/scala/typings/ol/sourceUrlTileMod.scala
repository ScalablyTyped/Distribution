package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.tileloadend
import typings.ol.olStrings.tileloaderror
import typings.ol.olStrings.tileloadstart
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceStateMod.State
import typings.ol.sourceTileMod.TileSourceEvent
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceUrlTileMod {
  
  @JSImport("ol/source/UrlTile", JSImport.Default)
  @js.native
  open class default protected () extends UrlTile {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    def tileLoadFunction(p0: Tile, p1: String): Unit
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction
    
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    var zDirection: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(tileLoadFunction: (/* p0 */ Tile, /* p1 */ String) => Unit): Options = {
      val __obj = js.Dynamic.literal(tileLoadFunction = js.Any.fromFunction2(tileLoadFunction))
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
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTileLoadFunction(value: (/* p0 */ Tile, /* p1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTileUrlFunction(
        value: (/* p0 */ TileCoord, /* p1 */ Double, /* p2 */ typings.ol.projProjectionMod.default) => js.UndefOr[String]
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
  trait UrlTile
    extends typings.ol.sourceTileMod.default {
    
    /**
      * Return the tile load function of the source.
      */
    def getTileLoadFunction(): LoadFunction = js.native
    
    /**
      * Return the tile URL function of the source.
      */
    def getTileUrlFunction(): UrlFunction = js.native
    
    /**
      * Return the URLs used for this source.
      * When a tileUrlFunction is used instead of url or urls,
      * null will be returned.
      */
    def getUrls(): js.Array[String] | Null = js.native
    
    /**
      * Handle tile change events.
      */
    /* protected */ def handleTileChange(event: typings.ol.eventsEventMod.default): Unit = js.native
    
    @JSName("on")
    def on_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the tile load function of the source.
      */
    def setTileLoadFunction(tileLoadFunction: LoadFunction): Unit = js.native
    
    /**
      * Set the tile URL function of the source.
      */
    def setTileUrlFunction(tileUrlFunction: UrlFunction): Unit = js.native
    def setTileUrlFunction(tileUrlFunction: UrlFunction, key: String): Unit = js.native
    
    /**
      * Set the URL to use for requests.
      */
    def setUrl(url: String): Unit = js.native
    
    /**
      * Set the URLs to use for requests.
      */
    def setUrls(urls: js.Array[String]): Unit = js.native
    
    /* protected */ def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
    /* protected */ @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    
    def tileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typings.ol.projProjectionMod.default): js.UndefOr[String] = js.native
    
    @JSName("un")
    def un_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    
    /* protected */ var urls: js.Array[String] | Null = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      */
    def useTile(z: Double, x: Double, y: Double): Unit = js.native
  }
}
