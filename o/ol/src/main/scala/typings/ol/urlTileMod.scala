package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.tileloadend
import typings.ol.olStrings.tileloaderror
import typings.ol.olStrings.tileloadstart
import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Tile
import typings.ol.olTileMod.UrlFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceTileMod.TileSourceEvent
import typings.ol.stateMod.State
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlTileMod {
  
  @JSImport("ol/source/UrlTile", JSImport.Default)
  @js.native
  class default protected () extends UrlTile {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var opaque: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
    
    def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    
    var tilePixelRatio: js.UndefOr[Double] = js.native
    
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
    
    var transition: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var urls: js.UndefOr[js.Array[String]] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zDirection: js.UndefOr[Double] = js.native
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
    /* protected */ def handleTileChange(event: typings.ol.eventMod.default): Unit = js.native
    
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
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    
    def tileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typings.ol.projectionMod.default): js.UndefOr[String] = js.native
    
    @JSName("un")
    def un_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    
    var urls: js.Array[String] = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      */
    def useTile(z: Double, x: Double, y: Double): Unit = js.native
  }
}
