package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilemapConfig extends js.Object {
  /**
    * Instead of loading from the cache, you can also load directly from a 2D array of tile indexes.
    */
  var data: js.UndefOr[js.Array[js.Array[integer]]] = js.undefined
  /**
    * The height of the map in tiles.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * Controls how empty tiles, tiles with an index of -1,
    * in the map data are handled. If `true`, empty locations will get a value of `null`. If `false`,
    * empty location will get a Tile object with an index of -1. If you've a large sparsely populated
    * map and the tile data doesn't need to change then setting this value to `true` will help with
    * memory consumption. However if your map is small or you need to update the tiles dynamically,
    * then leave the default value set.
    */
  var insertNull: js.UndefOr[Boolean] = js.undefined
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The height of a tile in pixels.
    */
  var tileHeight: js.UndefOr[integer] = js.undefined
  /**
    * The width of a tile in pixels.
    */
  var tileWidth: js.UndefOr[integer] = js.undefined
  /**
    * The width of the map in tiles.
    */
  var width: js.UndefOr[integer] = js.undefined
}

object TilemapConfig {
  @scala.inline
  def apply(
    data: js.Array[js.Array[integer]] = null,
    height: Int | Double = null,
    insertNull: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    width: Int | Double = null
  ): TilemapConfig = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(insertNull)) __obj.updateDynamic("insertNull")(insertNull)
    if (key != null) __obj.updateDynamic("key")(key)
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilemapConfig]
  }
}

