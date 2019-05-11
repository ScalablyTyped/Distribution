package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Tileset is a combination of an image containing the tiles and a container for data about
  * each tile.
  */
@JSGlobal("Phaser.Tilemaps.Tileset")
@js.native
class Tileset protected () extends js.Object {
  /**
    * 
    * @param name The name of the tileset in the map data.
    * @param firstgid The first tile index this tileset contains.
    * @param tileWidth Width of each tile (in pixels). Default 32.
    * @param tileHeight Height of each tile (in pixels). Default 32.
    * @param tileMargin The margin around all tiles in the sheet (in pixels). Default 0.
    * @param tileSpacing The spacing between each tile in the sheet (in pixels). Default 0.
    * @param tileProperties Custom properties defined per tile in the Tileset.
    * These typically are custom properties created in Tiled when editing a tileset. Default {}.
    * @param tileData Data stored per tile. These typically are created in Tiled
    * when editing a tileset, e.g. from Tiled's tile collision editor or terrain editor. Default {}.
    */
  def this(name: java.lang.String, firstgid: phaserLib.integer, tileWidth: js.UndefOr[phaserLib.integer], tileHeight: js.UndefOr[phaserLib.integer], tileMargin: js.UndefOr[phaserLib.integer], tileSpacing: js.UndefOr[phaserLib.integer], tileProperties: js.UndefOr[js.Object], tileData: js.UndefOr[js.Object]) = this()
  /**
    * The number of tile columns in the tileset.
    */
  val columns: phaserLib.integer = js.native
  /**
    * The starting index of the first tile index this Tileset contains.
    */
  var firstgid: phaserLib.integer = js.native
  /**
    * The gl texture used by the WebGL renderer.
    */
  val glTexture: stdLib.WebGLTexture = js.native
  /**
    * The cached image that contains the individual tiles. Use setImage to set.
    */
  val image: phaserLib.PhaserNs.TexturesNs.Texture = js.native
  /**
    * The name of the Tileset.
    */
  var name: java.lang.String = js.native
  /**
    * The number of tile rows in the the tileset.
    */
  val rows: phaserLib.integer = js.native
  /**
    * The look-up table to specific tile image texture coordinates (UV in pixels). Each element
    * contains the coordinates for a tile in an object of the form {x, y}.
    */
  val texCoordinates: js.Array[js.Object] = js.native
  /**
    * Tileset-specific data per tile that are typically defined in the Tiled editor, e.g. within
    * the Tileset collision editor. This is where collision objects and terrain are stored.
    */
  var tileData: js.Object = js.native
  /**
    * The height of each tile (in pixels). Use setTileSize to change.
    */
  val tileHeight: phaserLib.integer = js.native
  /**
    * The margin around the tiles in the sheet (in pixels). Use `setSpacing` to change.
    */
  val tileMargin: phaserLib.integer = js.native
  /**
    * Tileset-specific properties per tile that are typically defined in the Tiled editor in the
    * Tileset editor.
    */
  var tileProperties: js.Object = js.native
  /**
    * The spacing between each the tile in the sheet (in pixels). Use `setSpacing` to change.
    */
  val tileSpacing: phaserLib.integer = js.native
  /**
    * The width of each tile (in pixels). Use setTileSize to change.
    */
  val tileWidth: phaserLib.integer = js.native
  /**
    * The total number of tiles in the tileset.
    */
  val total: phaserLib.integer = js.native
  /**
    * Returns true if and only if this Tileset contains the given tile index.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def containsTileIndex(tileIndex: phaserLib.integer): scala.Boolean = js.native
  /**
    * Get a tile's collision group that is stored in the Tileset. Returns null if tile index is not
    * contained in this Tileset. This is typically defined within Tiled's tileset collision editor.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileCollisionGroup(tileIndex: phaserLib.integer): js.Object = js.native
  /**
    * Get a tile's data that is stored in the Tileset. Returns null if tile index is not contained
    * in this Tileset. This is typically defined in Tiled and will contain both Tileset collision
    * info and terrain mapping.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileData(tileIndex: phaserLib.integer): js.UndefOr[js.Object] = js.native
  /**
    * Get a tiles properties that are stored in the Tileset. Returns null if tile index is not
    * contained in this Tileset. This is typically defined in Tiled under the Tileset editor.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileProperties(tileIndex: phaserLib.integer): js.UndefOr[js.Object] = js.native
  /**
    * Returns the texture coordinates (UV in pixels) in the Tileset image for the given tile index.
    * Returns null if tile index is not contained in this Tileset.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileTextureCoordinates(tileIndex: phaserLib.integer): js.Object = js.native
  /**
    * Sets the image associated with this Tileset and updates the tile data (rows, columns, etc.).
    * @param texture The image that contains the tiles.
    */
  def setImage(texture: phaserLib.PhaserNs.TexturesNs.Texture): Tileset = js.native
  /**
    * Sets the tile margin & spacing and updates the tile data (rows, columns, etc.).
    * @param margin The margin around the tiles in the sheet (in pixels).
    * @param spacing The spacing between the tiles in the sheet (in pixels).
    */
  def setSpacing(): Tileset = js.native
  def setSpacing(margin: phaserLib.integer): Tileset = js.native
  def setSpacing(margin: phaserLib.integer, spacing: phaserLib.integer): Tileset = js.native
  /**
    * Sets the tile width & height and updates the tile data (rows, columns, etc.).
    * @param tileWidth The width of a tile in pixels.
    * @param tileHeight The height of a tile in pixels.
    */
  def setTileSize(): Tileset = js.native
  def setTileSize(tileWidth: phaserLib.integer): Tileset = js.native
  def setTileSize(tileWidth: phaserLib.integer, tileHeight: phaserLib.integer): Tileset = js.native
  /**
    * Updates tile texture coordinates and tileset data.
    * @param imageWidth The (expected) width of the image to slice.
    * @param imageHeight The (expected) height of the image to slice.
    */
  def updateTileData(imageWidth: phaserLib.integer, imageHeight: phaserLib.integer): Tileset = js.native
}

