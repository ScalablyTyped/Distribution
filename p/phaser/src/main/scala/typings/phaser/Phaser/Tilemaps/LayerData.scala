package typings.phaser.Phaser.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
  * etc. into this format. Tilemap, StaticTilemapLayer and DynamicTilemapLayer have a reference
  * to this data and use it to look up and perform operations on tiles.
  */
trait LayerData extends js.Object {
  /**
    * The alpha value of the layer.
    */
  var alpha: Double
  /**
    * The base tile height.
    */
  var baseTileHeight: Double
  /**
    * The base tile width.
    */
  var baseTileWidth: Double
  /**
    * An array of physics bodies.
    */
  var bodies: js.Array[_]
  /**
    * An array of callbacks.
    */
  var callbacks: js.Array[_]
  /**
    * Tile Collision ID index map.
    */
  var collideIndexes: js.Array[_]
  /**
    * An array of the tile data indexes.
    */
  var data: js.Array[js.Array[Tile]]
  /**
    * The height of the layer in tiles.
    */
  var height: Double
  /**
    * The height in pixels of the entire layer.
    */
  var heightInPixels: Double
  /**
    * Tile ID index map.
    */
  var indexes: js.Array[_]
  /**
    * The name of the layer, if specified in Tiled.
    */
  var name: String
  /**
    * Layer specific properties (can be specified in Tiled)
    */
  var properties: js.Array[js.Object]
  /**
    * The pixel height of the tiles.
    */
  var tileHeight: Double
  /**
    * The pixel width of the tiles.
    */
  var tileWidth: Double
  /**
    * A reference to the Tilemap layer that owns this data.
    */
  var tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer
  /**
    * Is the layer visible or not?
    */
  var visible: Boolean
  /**
    * The width of the layer in tiles.
    */
  var width: Double
  /**
    * The width in pixels of the entire layer.
    */
  var widthInPixels: Double
  /**
    * The x offset of where to draw from the top left.
    */
  var x: Double
  /**
    * The y offset of where to draw from the top left.
    */
  var y: Double
}

object LayerData {
  @scala.inline
  def apply(
    alpha: Double,
    baseTileHeight: Double,
    baseTileWidth: Double,
    bodies: js.Array[_],
    callbacks: js.Array[_],
    collideIndexes: js.Array[_],
    data: js.Array[js.Array[Tile]],
    height: Double,
    heightInPixels: Double,
    indexes: js.Array[_],
    name: String,
    properties: js.Array[js.Object],
    tileHeight: Double,
    tileWidth: Double,
    tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer,
    visible: Boolean,
    width: Double,
    widthInPixels: Double,
    x: Double,
    y: Double
  ): LayerData = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], baseTileHeight = baseTileHeight.asInstanceOf[js.Any], baseTileWidth = baseTileWidth.asInstanceOf[js.Any], bodies = bodies.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], collideIndexes = collideIndexes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tilemapLayer = tilemapLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerData]
  }
}

