package typings
package openlayersLib.openlayersMod

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
  def this(tileCoord: TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String) = this()
  def this(tileCoord: TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String, crossOrigin: java.lang.String) = this()
  def this(tileCoord: TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String, crossOrigin: java.lang.String, tileLoadFunction: TileLoadFunctionType) = this()
  /**
    * Get the image element for this tile.
    * @inheritDoc
    * @api
    */
  def getImage(): stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement = js.native
  def getImage(opt_context: GlobalObject): stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement = js.native
}

