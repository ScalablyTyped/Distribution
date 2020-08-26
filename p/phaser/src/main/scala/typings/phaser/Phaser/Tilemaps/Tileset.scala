package typings.phaser.Phaser.Tilemaps

import typings.phaser.Phaser.Textures.Texture
import typings.phaser.integer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Tileset is a combination of an image containing the tiles and a container for data about
  * each tile.
  */
@js.native
trait Tileset extends js.Object {
  /**
    * The number of tile columns in the tileset.
    */
  val columns: integer = js.native
  /**
    * The starting index of the first tile index this Tileset contains.
    */
  var firstgid: integer = js.native
  /**
    * The gl texture used by the WebGL renderer.
    */
  val glTexture: WebGLTexture = js.native
  /**
    * The cached image that contains the individual tiles. Use setImage to set.
    */
  val image: Texture = js.native
  /**
    * The name of the Tileset.
    */
  var name: String = js.native
  /**
    * The number of tile rows in the the tileset.
    */
  val rows: integer = js.native
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
  val tileHeight: integer = js.native
  /**
    * The margin around the tiles in the sheet (in pixels). Use `setSpacing` to change.
    */
  val tileMargin: integer = js.native
  /**
    * Tileset-specific properties per tile that are typically defined in the Tiled editor in the
    * Tileset editor.
    */
  var tileProperties: js.Object = js.native
  /**
    * The spacing between each the tile in the sheet (in pixels). Use `setSpacing` to change.
    */
  val tileSpacing: integer = js.native
  /**
    * The width of each tile (in pixels). Use setTileSize to change.
    */
  val tileWidth: integer = js.native
  /**
    * The total number of tiles in the tileset.
    */
  val total: integer = js.native
  /**
    * Returns true if and only if this Tileset contains the given tile index.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def containsTileIndex(tileIndex: integer): Boolean = js.native
  /**
    * Get a tile's collision group that is stored in the Tileset. Returns null if tile index is not
    * contained in this Tileset. This is typically defined within Tiled's tileset collision editor.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileCollisionGroup(tileIndex: integer): js.Object = js.native
  /**
    * Get a tile's data that is stored in the Tileset. Returns null if tile index is not contained
    * in this Tileset. This is typically defined in Tiled and will contain both Tileset collision
    * info and terrain mapping.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileData(tileIndex: integer): js.UndefOr[js.Object] = js.native
  /**
    * Get a tiles properties that are stored in the Tileset. Returns null if tile index is not
    * contained in this Tileset. This is typically defined in Tiled under the Tileset editor.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileProperties(tileIndex: integer): js.UndefOr[js.Object] = js.native
  /**
    * Returns the texture coordinates (UV in pixels) in the Tileset image for the given tile index.
    * Returns null if tile index is not contained in this Tileset.
    * @param tileIndex The unique id of the tile across all tilesets in the map.
    */
  def getTileTextureCoordinates(tileIndex: integer): js.Object = js.native
  /**
    * Sets the image associated with this Tileset and updates the tile data (rows, columns, etc.).
    * @param texture The image that contains the tiles.
    */
  def setImage(texture: Texture): Tileset = js.native
  /**
    * Sets the tile margin & spacing and updates the tile data (rows, columns, etc.).
    * @param margin The margin around the tiles in the sheet (in pixels).
    * @param spacing The spacing between the tiles in the sheet (in pixels).
    */
  def setSpacing(): Tileset = js.native
  def setSpacing(margin: js.UndefOr[scala.Nothing], spacing: integer): Tileset = js.native
  def setSpacing(margin: integer): Tileset = js.native
  def setSpacing(margin: integer, spacing: integer): Tileset = js.native
  /**
    * Sets the tile width & height and updates the tile data (rows, columns, etc.).
    * @param tileWidth The width of a tile in pixels.
    * @param tileHeight The height of a tile in pixels.
    */
  def setTileSize(): Tileset = js.native
  def setTileSize(tileWidth: js.UndefOr[scala.Nothing], tileHeight: integer): Tileset = js.native
  def setTileSize(tileWidth: integer): Tileset = js.native
  def setTileSize(tileWidth: integer, tileHeight: integer): Tileset = js.native
  /**
    * Updates tile texture coordinates and tileset data.
    * @param imageWidth The (expected) width of the image to slice.
    * @param imageHeight The (expected) height of the image to slice.
    */
  def updateTileData(imageWidth: integer, imageHeight: integer): Tileset = js.native
}

