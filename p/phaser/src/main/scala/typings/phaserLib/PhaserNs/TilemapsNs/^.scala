package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tilemaps")
@js.native
object ^ extends js.Object {
  /**
    * Create a Tilemap from the given key or data. If neither is given, make a blank Tilemap. When
    * loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing from
    * a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map data. For
    * an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param scene The Scene to which this Tilemap belongs.
    * @param key The key in the Phaser cache that corresponds to the loaded tilemap data.
    * @param tileWidth The width of a tile in pixels. Default 32.
    * @param tileHeight The height of a tile in pixels. Default 32.
    * @param width The width of the map in tiles. Default 10.
    * @param height The height of the map in tiles. Default 10.
    * @param data Instead of loading from the cache, you can also load directly from
    * a 2D array of tile indexes.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the
    * map data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set. Default false.
    */
  def ParseToTilemap(
    scene: phaserLib.PhaserNs.Scene,
    key: js.UndefOr[java.lang.String],
    tileWidth: js.UndefOr[phaserLib.integer],
    tileHeight: js.UndefOr[phaserLib.integer],
    width: js.UndefOr[phaserLib.integer],
    height: js.UndefOr[phaserLib.integer],
    data: js.UndefOr[js.Array[js.Array[phaserLib.integer]]],
    insertNull: js.UndefOr[scala.Boolean]
  ): Tilemap = js.native
}

