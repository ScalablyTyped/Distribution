package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tilemaps.Parsers")
@js.native
object ParsersNs extends js.Object {
  def Parse(
    name: java.lang.String,
    mapFormat: phaserLib.integer,
    data: java.lang.String,
    tileWidth: phaserLib.integer,
    tileHeight: phaserLib.integer,
    insertNull: scala.Boolean
  ): phaserLib.PhaserNs.TilemapsNs.MapData = js.native
  /**
    * Parses raw data of a given Tilemap format into a new MapData object. If no recognized data format
    * is found, returns `null`. When loading from CSV or a 2D array, you should specify the tileWidth &
    * tileHeight. When parsing from a map from Tiled, the tileWidth & tileHeight will be pulled from
    * the map data.
    * @param name The name of the tilemap, used to set the name on the MapData.
    * @param mapFormat See ../Formats.js.
    * @param data 2D array, CSV string or Tiled JSON object.
    * @param tileWidth The width of a tile in pixels. Required for 2D array and CSV, but
    * ignored for Tiled JSON.
    * @param tileHeight The height of a tile in pixels. Required for 2D array and CSV, but
    * ignored for Tiled JSON.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
    * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set.
    */
  def Parse(
    name: java.lang.String,
    mapFormat: phaserLib.integer,
    data: js.Array[js.Array[phaserLib.integer]],
    tileWidth: phaserLib.integer,
    tileHeight: phaserLib.integer,
    insertNull: scala.Boolean
  ): phaserLib.PhaserNs.TilemapsNs.MapData = js.native
  def Parse(
    name: java.lang.String,
    mapFormat: phaserLib.integer,
    data: js.Object,
    tileWidth: phaserLib.integer,
    tileHeight: phaserLib.integer,
    insertNull: scala.Boolean
  ): phaserLib.PhaserNs.TilemapsNs.MapData = js.native
  /**
    * Parses a 2D array of tile indexes into a new MapData object with a single layer.
    * @param name The name of the tilemap, used to set the name on the MapData.
    * @param data 2D array, CSV string or Tiled JSON object.
    * @param tileWidth The width of a tile in pixels.
    * @param tileHeight The height of a tile in pixels.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
    * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set.
    */
  def Parse2DArray(
    name: java.lang.String,
    data: js.Array[js.Array[phaserLib.integer]],
    tileWidth: phaserLib.integer,
    tileHeight: phaserLib.integer,
    insertNull: scala.Boolean
  ): phaserLib.PhaserNs.TilemapsNs.MapData = js.native
  /**
    * Parses a CSV string of tile indexes into a new MapData object with a single layer.
    * @param name The name of the tilemap, used to set the name on the MapData.
    * @param data CSV string of tile indexes.
    * @param tileWidth The width of a tile in pixels.
    * @param tileHeight The height of a tile in pixels.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
    * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set.
    */
  def ParseCSV(
    name: java.lang.String,
    data: java.lang.String,
    tileWidth: phaserLib.integer,
    tileHeight: phaserLib.integer,
    insertNull: scala.Boolean
  ): phaserLib.PhaserNs.TilemapsNs.MapData = js.native
  @JSName("Impact")
  @js.native
  object ImpactNs extends js.Object {
    /**
      * [description]
      * @param json [description]
      * @param insertNull [description]
      */
    def ParseTileLayers(json: js.Object, insertNull: scala.Boolean): js.Array[_] = js.native
    /**
      * [description]
      * @param json [description]
      */
    def ParseTilesets(json: js.Object): js.Array[_] = js.native
    /**
      * Parses a Weltmeister JSON object into a new MapData object.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param json The Weltmeister JSON object.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def ParseWeltmeister(name: java.lang.String, json: js.Object, insertNull: scala.Boolean): js.Object = js.native
  }
  
  @JSName("Tiled")
  @js.native
  object TiledNs extends js.Object {
    /**
      * Copy properties from tileset to tiles.
      * @param mapData [description]
      */
    def AssignTileProperties(mapData: phaserLib.PhaserNs.TilemapsNs.MapData): scala.Unit = js.native
    /**
      * Decode base-64 encoded data, for example as exported by Tiled.
      * @param data Base-64 encoded data to decode.
      */
    def Base64Decode(data: js.Object): js.Array[_] = js.native
    /**
      * Master list of tiles -> x, y, index in tileset.
      * @param mapData [description]
      */
    def BuildTilesetIndex(mapData: phaserLib.PhaserNs.TilemapsNs.MapData): js.Array[_] = js.native
    /**
      * See Tiled documentation on tile flipping:
      * http://docs.mapeditor.org/en/latest/reference/tmx-map-format/
      * @param gid [description]
      */
    def ParseGID(gid: scala.Double): js.Object = js.native
    /**
      * [description]
      * @param json [description]
      */
    def ParseImageLayers(json: js.Object): js.Array[_] = js.native
    /**
      * Parses a Tiled JSON object into a new MapData object.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param json The Tiled JSON object.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def ParseJSONTiled(name: java.lang.String, json: js.Object, insertNull: scala.Boolean): phaserLib.PhaserNs.TilemapsNs.MapData = js.native
    /**
      * Convert a Tiled object to an internal parsed object normalising and copying properties over, while applying optional x and y offsets. The parsed object will always have the properties `id`, `name`, `type`, `rotation`, `properties`, `visible`, `x`, `y`, `width` and `height`. Other properties will be added according to the object type (such as text, polyline, gid etc.)
      * @param tiledObject Tiled object to convert to an internal parsed object normalising and copying properties over.
      * @param offsetX Optional additional offset to apply to the object's x property. Defaults to 0. Default 0.
      * @param offsetY Optional additional offset to apply to the object's y property. Defaults to 0. Default 0.
      */
    def ParseObject(tiledObject: js.Object): js.Object = js.native
    def ParseObject(tiledObject: js.Object, offsetX: scala.Double): js.Object = js.native
    def ParseObject(tiledObject: js.Object, offsetX: scala.Double, offsetY: scala.Double): js.Object = js.native
    /**
      * Parses a Tiled JSON object into an array of ObjectLayer objects.
      * @param json The Tiled JSON object.
      */
    def ParseObjectLayers(json: js.Object): js.Array[_] = js.native
    /**
      * [description]
      * @param json [description]
      * @param insertNull [description]
      */
    def ParseTileLayers(json: js.Object, insertNull: scala.Boolean): js.Array[_] = js.native
    /**
      * Tilesets and Image Collections
      * @param json [description]
      */
    def ParseTilesets(json: js.Object): js.Object = js.native
  }
  
}

