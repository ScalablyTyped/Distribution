package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerDataConfig extends js.Object {
  /**
    * The alpha value of the layer.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The base tile height.
    */
  var baseTileHeight: js.UndefOr[Double] = js.native
  /**
    * The base tile width.
    */
  var baseTileWidth: js.UndefOr[Double] = js.native
  /**
    * An array of physics bodies.
    */
  var bodies: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of callbacks.
    */
  var callbacks: js.UndefOr[js.Array[_]] = js.native
  /**
    * Tile Collision ID index map.
    */
  var collideIndexes: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of the tile data indexes.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * The height of the layer in tiles.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The height in pixels of the entire layer.
    */
  var heightInPixels: js.UndefOr[Double] = js.native
  /**
    * Tile ID index map.
    */
  var indexes: js.UndefOr[js.Array[_]] = js.native
  /**
    * The name of the layer, if specified in Tiled.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Layer specific properties (can be specified in Tiled)
    */
  var properties: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * The pixel height of the tiles.
    */
  var tileHeight: js.UndefOr[Double] = js.native
  /**
    * The pixel width of the tiles.
    */
  var tileWidth: js.UndefOr[Double] = js.native
  /**
    * A reference to the Tilemap layer that owns this data.
    */
  var tilemapLayer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer] = js.native
  /**
    * Is the layer visible or not?
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * The width of the layer in tiles.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The width in pixels of the entire layer.
    */
  var widthInPixels: js.UndefOr[Double] = js.native
  /**
    * The x offset of where to draw from the top left.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y offset of where to draw from the top left.
    */
  var y: js.UndefOr[Double] = js.native
}

object LayerDataConfig {
  @scala.inline
  def apply(): LayerDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerDataConfig]
  }
  @scala.inline
  implicit class LayerDataConfigOps[Self <: LayerDataConfig] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setBaseTileHeight(value: Double): Self = this.set("baseTileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTileHeight: Self = this.set("baseTileHeight", js.undefined)
    @scala.inline
    def setBaseTileWidth(value: Double): Self = this.set("baseTileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTileWidth: Self = this.set("baseTileWidth", js.undefined)
    @scala.inline
    def setBodiesVarargs(value: js.Any*): Self = this.set("bodies", js.Array(value :_*))
    @scala.inline
    def setBodies(value: js.Array[_]): Self = this.set("bodies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodies: Self = this.set("bodies", js.undefined)
    @scala.inline
    def setCallbacksVarargs(value: js.Any*): Self = this.set("callbacks", js.Array(value :_*))
    @scala.inline
    def setCallbacks(value: js.Array[_]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setCollideIndexesVarargs(value: js.Any*): Self = this.set("collideIndexes", js.Array(value :_*))
    @scala.inline
    def setCollideIndexes(value: js.Array[_]): Self = this.set("collideIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollideIndexes: Self = this.set("collideIndexes", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightInPixels(value: Double): Self = this.set("heightInPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightInPixels: Self = this.set("heightInPixels", js.undefined)
    @scala.inline
    def setIndexesVarargs(value: js.Any*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[_]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: js.Object*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[js.Object]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    @scala.inline
    def setTilemapLayer(value: DynamicTilemapLayer | StaticTilemapLayer): Self = this.set("tilemapLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilemapLayer: Self = this.set("tilemapLayer", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthInPixels(value: Double): Self = this.set("widthInPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthInPixels: Self = this.set("widthInPixels", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

