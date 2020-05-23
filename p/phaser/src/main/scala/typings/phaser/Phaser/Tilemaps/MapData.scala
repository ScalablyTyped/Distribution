package typings.phaser.Phaser.Tilemaps

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
  * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
  * itself.
  */
trait MapData extends js.Object {
  /**
    * An object of collision data. Must be created as physics object or will return undefined.
    */
  var collision: js.Object
  /**
    * The format of the map data.
    */
  var format: integer
  /**
    * The height of the entire tilemap.
    */
  var height: Double
  /**
    * The height in pixels of the entire tilemap.
    */
  var heightInPixels: Double
  /**
    * The collection of images the map uses(specified in Tiled)
    */
  var imageCollections: js.Array[_]
  /**
    * An array of Tiled Image Layers.
    */
  var images: js.Array[_]
  /**
    * If the map is infinite or not.
    */
  var infinite: Boolean
  /**
    * An array with all the layers configured to the MapData.
    */
  var layers: js.Array[LayerData] | ObjectLayer
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var name: String
  /**
    * An object of Tiled Object Layers.
    */
  var objects: js.Object
  /**
    * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
    */
  var orientation: String
  /**
    * Map specific properties (can be specified in Tiled)
    */
  var properties: js.Object
  /**
    * Determines the draw order of tilemap. Default is right-down
    * 
    * 0, or 'right-down'
    * 1, or 'left-down'
    * 2, or 'right-up'
    * 3, or 'left-up'
    */
  var renderOrder: String
  /**
    * The height of the tiles.
    */
  var tileHeight: Double
  /**
    * The width of the tiles.
    */
  var tileWidth: Double
  /**
    * An array of tile instances.
    */
  var tiles: js.Array[_]
  /**
    * An array of Tilesets.
    */
  var tilesets: js.Array[Tileset]
  /**
    * The version of the map data (as specified in Tiled).
    */
  var version: String
  /**
    * The width of the entire tilemap.
    */
  var width: Double
  /**
    * The width in pixels of the entire tilemap.
    */
  var widthInPixels: Double
}

object MapData {
  @scala.inline
  def apply(
    collision: js.Object,
    format: integer,
    height: Double,
    heightInPixels: Double,
    imageCollections: js.Array[_],
    images: js.Array[_],
    infinite: Boolean,
    layers: js.Array[LayerData] | ObjectLayer,
    name: String,
    objects: js.Object,
    orientation: String,
    properties: js.Object,
    renderOrder: String,
    tileHeight: Double,
    tileWidth: Double,
    tiles: js.Array[_],
    tilesets: js.Array[Tileset],
    version: String,
    width: Double,
    widthInPixels: Double
  ): MapData = {
    val __obj = js.Dynamic.literal(collision = collision.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], imageCollections = imageCollections.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], tilesets = tilesets.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapData]
  }
}

