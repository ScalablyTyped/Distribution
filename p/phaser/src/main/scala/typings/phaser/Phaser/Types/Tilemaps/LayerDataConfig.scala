package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerDataConfig extends js.Object {
  /**
    * The alpha value of the layer.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The base tile height.
    */
  var baseTileHeight: js.UndefOr[Double] = js.undefined
  /**
    * The base tile width.
    */
  var baseTileWidth: js.UndefOr[Double] = js.undefined
  /**
    * An array of physics bodies.
    */
  var bodies: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of callbacks.
    */
  var callbacks: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Tile Collision ID index map.
    */
  var collideIndexes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of the tile data indexes.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The height of the layer in tiles.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The height in pixels of the entire layer.
    */
  var heightInPixels: js.UndefOr[Double] = js.undefined
  /**
    * Tile ID index map.
    */
  var indexes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The name of the layer, if specified in Tiled.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Layer specific properties (can be specified in Tiled)
    */
  var properties: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * The pixel height of the tiles.
    */
  var tileHeight: js.UndefOr[Double] = js.undefined
  /**
    * The pixel width of the tiles.
    */
  var tileWidth: js.UndefOr[Double] = js.undefined
  /**
    * A reference to the Tilemap layer that owns this data.
    */
  var tilemapLayer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer] = js.undefined
  /**
    * Is the layer visible or not?
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of the layer in tiles.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The width in pixels of the entire layer.
    */
  var widthInPixels: js.UndefOr[Double] = js.undefined
  /**
    * The x offset of where to draw from the top left.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y offset of where to draw from the top left.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object LayerDataConfig {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    baseTileHeight: js.UndefOr[Double] = js.undefined,
    baseTileWidth: js.UndefOr[Double] = js.undefined,
    bodies: js.Array[_] = null,
    callbacks: js.Array[_] = null,
    collideIndexes: js.Array[_] = null,
    data: js.Array[_] = null,
    height: js.UndefOr[Double] = js.undefined,
    heightInPixels: js.UndefOr[Double] = js.undefined,
    indexes: js.Array[_] = null,
    name: String = null,
    properties: js.Array[js.Object] = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    widthInPixels: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): LayerDataConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseTileHeight)) __obj.updateDynamic("baseTileHeight")(baseTileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseTileWidth)) __obj.updateDynamic("baseTileWidth")(baseTileWidth.get.asInstanceOf[js.Any])
    if (bodies != null) __obj.updateDynamic("bodies")(bodies.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (collideIndexes != null) __obj.updateDynamic("collideIndexes")(collideIndexes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightInPixels)) __obj.updateDynamic("heightInPixels")(heightInPixels.get.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tilemapLayer != null) __obj.updateDynamic("tilemapLayer")(tilemapLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthInPixels)) __obj.updateDynamic("widthInPixels")(widthInPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerDataConfig]
  }
}

