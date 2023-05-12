package typings.ol

import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tilecoordMod.TileCoord
import typings.ol.webglTileTextureMod.TileType
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageTileMod {
  
  @JSImport("ol/ImageTile", JSImport.Default)
  @js.native
  open class default protected ()
    extends ImageTile
       with TileType {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {string} src Image source URI.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("./Tile.js").LoadFunction} tileLoadFunction Tile load function.
      * @param {import("./Tile.js").Options} [options] Tile options.
      */
    def this(tileCoord: TileCoord, state: Any, src: String, crossOrigin: String, tileLoadFunction: LoadFunction) = this()
    def this(tileCoord: TileCoord, state: Any, src: String, crossOrigin: Null, tileLoadFunction: LoadFunction) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction,
      options: Options
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: Any,
      src: String,
      crossOrigin: Null,
      tileLoadFunction: LoadFunction,
      options: Options
    ) = this()
  }
  
  @js.native
  trait ImageTile
    extends typings.ol.tileMod.default {
    
    /**
      * @private
      * @type {?string}
      */
    /* private */ var crossOrigin_ : Any = js.native
    
    /**
      * Get the HTML image element for this tile (may be a Canvas, Image, or Video).
      * @return {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement} Image.
      * @api
      */
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /**
      * Tracks loading or read errors.
      *
      * @private
      */
    /* private */ var handleImageError_ : Any = js.native
    
    /**
      * Tracks successful image load.
      *
      * @private
      */
    /* private */ var handleImageLoad_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLImageElement|HTMLCanvasElement}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * Sets an HTML image element for this tile (may be a Canvas or preloaded Image).
      * @param {HTMLCanvasElement|HTMLImageElement} element Element.
      */
    def setImage(element: HTMLCanvasElement): Unit = js.native
    def setImage(element: HTMLImageElement): Unit = js.native
    
    /**
      * Image URI
      *
      * @private
      * @type {string}
      */
    /* private */ var src_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Tile.js").LoadFunction}
      */
    /* private */ var tileLoadFunction_ : Any = js.native
    
    /**
      * Discards event handlers which listen for load completion or errors.
      *
      * @private
      */
    /* private */ var unlistenImage_ : Any = js.native
    
    /**
      * @private
      * @type {?function():void}
      */
    /* private */ var unlisten_ : Any = js.native
  }
}
