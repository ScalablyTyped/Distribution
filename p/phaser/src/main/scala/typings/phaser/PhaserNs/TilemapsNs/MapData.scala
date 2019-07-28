package typings.phaser.PhaserNs.TilemapsNs

import typings.phaser.PhaserNs.TypesNs.TilemapsNs.MapDataConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
  * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
  * itself.
  */
@JSGlobal("Phaser.Tilemaps.MapData")
@js.native
/**
  * 
  * @param config The Map configuration object.
  */
class MapData () extends js.Object {
  def this(config: MapDataConfig) = this()
  /**
    * An object of collision data. Must be created as physics object or will return undefined.
    */
  var collision: js.Object = js.native
  /**
    * [description]
    */
  var format: integer = js.native
  /**
    * The height of the entire tilemap.
    */
  var height: Double = js.native
  /**
    * The height in pixels of the entire tilemap.
    */
  var heightInPixels: Double = js.native
  /**
    * The collection of images the map uses(specified in Tiled)
    */
  var imageCollections: js.Array[_] = js.native
  /**
    * An array of Tiled Image Layers.
    */
  var images: js.Array[_] = js.native
  /**
    * If the map is infinite or not.
    */
  var infinite: Boolean = js.native
  /**
    * An array with all the layers configured to the MapData.
    */
  var layers: js.Array[LayerData] | ObjectLayer = js.native
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var name: String = js.native
  /**
    * An object of Tiled Object Layers.
    */
  var objects: js.Object = js.native
  /**
    * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
    */
  var orientation: String = js.native
  /**
    * Map specific properties (can be specified in Tiled)
    */
  var properties: js.Object = js.native
  /**
    * Determines the draw order of tilemap. Default is right-down
    * 
    * 0, or 'right-down'
    * 1, or 'left-down'
    * 2, or 'right-up'
    * 3, or 'left-up'
    */
  var renderOrder: String = js.native
  /**
    * The height of the tiles.
    */
  var tileHeight: Double = js.native
  /**
    * The width of the tiles.
    */
  var tileWidth: Double = js.native
  /**
    * [description]
    */
  var tiles: js.Array[_] = js.native
  /**
    * An array of Tilesets.
    */
  var tilesets: js.Array[Tileset] = js.native
  /**
    * The version of the map data (as specified in Tiled).
    */
  var version: String = js.native
  /**
    * The width of the entire tilemap.
    */
  var width: Double = js.native
  /**
    * The width in pixels of the entire tilemap.
    */
  var widthInPixels: Double = js.native
}

