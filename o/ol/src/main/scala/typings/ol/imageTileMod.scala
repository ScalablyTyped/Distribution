package typings.ol

import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageTileMod {
  
  @JSImport("ol/ImageTile", JSImport.Default)
  @js.native
  class default protected () extends ImageTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
  @js.native
  trait ImageTile
    extends typings.ol.olTileMod.default {
    
    /**
      * Get the HTML image element for this tile (may be a Canvas, Image, or Video).
      */
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
  }
}
