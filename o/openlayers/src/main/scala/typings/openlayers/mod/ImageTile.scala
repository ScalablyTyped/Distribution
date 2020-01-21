package typings.openlayers.mod

import typings.openlayers.mod.Tile.State
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "ImageTile")
@js.native
class ImageTile protected () extends Tile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Image source URI.
    * @param crossOrigin Cross origin.
    * @param tileLoadFunction Tile load function.
    */
  def this(tileCoord: TileCoord, state: State, src: String) = this()
  def this(tileCoord: TileCoord, state: State, src: String, crossOrigin: String) = this()
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    crossOrigin: String,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
  /**
    * Get the image element for this tile.
    * @inheritDoc
    * @api
    */
  def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
  def getImage(opt_context: GlobalObject): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
}

