package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TilemapConfig extends js.Object {
  /**
    * Instead of loading from the cache, you can also load directly from a 2D array of tile indexes.
    */
  var data: js.UndefOr[js.Array[js.Array[integer]]] = js.native
  /**
    * The height of the map in tiles.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * Controls how empty tiles, tiles with an index of -1,
    * in the map data are handled. If `true`, empty locations will get a value of `null`. If `false`,
    * empty location will get a Tile object with an index of -1. If you've a large sparsely populated
    * map and the tile data doesn't need to change then setting this value to `true` will help with
    * memory consumption. However if your map is small or you need to update the tiles dynamically,
    * then leave the default value set.
    */
  var insertNull: js.UndefOr[Boolean] = js.native
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The height of a tile in pixels.
    */
  var tileHeight: js.UndefOr[integer] = js.native
  /**
    * The width of a tile in pixels.
    */
  var tileWidth: js.UndefOr[integer] = js.native
  /**
    * The width of the map in tiles.
    */
  var width: js.UndefOr[integer] = js.native
}

object TilemapConfig {
  @scala.inline
  def apply(): TilemapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TilemapConfig]
  }
  @scala.inline
  implicit class TilemapConfigOps[Self <: TilemapConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: js.Array[integer]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[integer]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInsertNull(value: Boolean): Self = this.set("insertNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertNull: Self = this.set("insertNull", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setTileHeight(value: integer): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    @scala.inline
    def setTileWidth(value: integer): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

