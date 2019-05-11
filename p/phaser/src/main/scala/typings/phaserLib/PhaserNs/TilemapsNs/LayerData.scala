package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
  * etc. into this format. Tilemap, StaticTilemapLayer and DynamicTilemapLayer have a reference
  * to this data and use it to look up and perform operations on tiles.
  */
@JSGlobal("Phaser.Tilemaps.LayerData")
@js.native
/**
  * 
  * @param config [description]
  */
class LayerData () extends js.Object {
  def this(config: js.Object) = this()
  /**
    * [description]
    */
  var alpha: scala.Double = js.native
  /**
    * [description]
    */
  var baseTileHeight: scala.Double = js.native
  /**
    * [description]
    */
  var baseTileWidth: scala.Double = js.native
  /**
    * [description]
    */
  var bodies: js.Array[_] = js.native
  /**
    * [description]
    */
  var callbacks: js.Array[_] = js.native
  /**
    * [description]
    */
  var collideIndexes: js.Array[_] = js.native
  /**
    * An array of the tile indexes
    */
  var data: js.Array[scala.Double] = js.native
  /**
    * The height in tiles of the layer.
    */
  var height: scala.Double = js.native
  /**
    * The height in pixels of the entire layer.
    */
  var heightInPixels: scala.Double = js.native
  /**
    * [description]
    */
  var indexes: js.Array[_] = js.native
  /**
    * The name of the layer, if specified in Tiled.
    */
  var name: java.lang.String = js.native
  /**
    * Layer specific properties (can be specified in Tiled)
    */
  var properties: js.Object = js.native
  /**
    * The pixel height of the tiles.
    */
  var tileHeight: scala.Double = js.native
  /**
    * The pixel width of the tiles.
    */
  var tileWidth: scala.Double = js.native
  /**
    * [description]
    */
  var tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer = js.native
  /**
    * [description]
    */
  var visible: scala.Boolean = js.native
  /**
    * The width in tile of the layer.
    */
  var width: scala.Double = js.native
  /**
    * The width in pixels of the entire layer.
    */
  var widthInPixels: scala.Double = js.native
  /**
    * The x offset of where to draw from the top left
    */
  var x: scala.Double = js.native
  /**
    * The y offset of where to draw from the top left
    */
  var y: scala.Double = js.native
}

