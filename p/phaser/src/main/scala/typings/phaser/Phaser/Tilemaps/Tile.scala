package typings.phaser.Phaser.Tilemaps

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Tile is a representation of a single tile within the Tilemap. This is a lightweight data
  * representation, so its position information is stored without factoring in scroll, layer
  * scale or layer position.
  */
@js.native
trait Tile
  extends Alpha
     with Flip
     with Visible {
  /**
    * The map's base height of a tile in pixels. Tiled maps support multiple tileset sizes
    * within one map, but they are still placed at intervals of the base tile size.
    */
  var baseHeight: integer = js.native
  /**
    * The map's base width of a tile in pixels. Tiled maps support multiple tileset sizes
    * within one map, but they are still placed at intervals of the base tile size.
    */
  var baseWidth: integer = js.native
  /**
    * True if this tile can collide on any of its faces or has a collision callback set.
    */
  val canCollide: Boolean = js.native
  /**
    * Whether the tile should collide with any object on the bottom side.
    */
  var collideDown: Boolean = js.native
  /**
    * Whether the tile should collide with any object on the left side.
    */
  var collideLeft: Boolean = js.native
  /**
    * Whether the tile should collide with any object on the right side.
    */
  var collideRight: Boolean = js.native
  /**
    * Whether the tile should collide with any object on the top side.
    */
  var collideUp: Boolean = js.native
  /**
    * True if this tile can collide on any of its faces.
    */
  val collides: Boolean = js.native
  /**
    * Tile collision callback.
    */
  var collisionCallback: js.Function = js.native
  /**
    * The context in which the collision callback will be called.
    */
  var collisionCallbackContext: js.Object = js.native
  /**
    * Whether the tile's bottom edge is interesting for collisions.
    */
  var faceBottom: Boolean = js.native
  /**
    * Whether the tile's left edge is interesting for collisions.
    */
  var faceLeft: Boolean = js.native
  /**
    * Whether the tile's right edge is interesting for collisions.
    */
  var faceRight: Boolean = js.native
  /**
    * Whether the tile's top edge is interesting for collisions.
    */
  var faceTop: Boolean = js.native
  /**
    * True if this tile has any interesting faces.
    */
  val hasInterestingFace: Boolean = js.native
  /**
    * The height of the tile in pixels.
    */
  var height: integer = js.native
  /**
    * The index of this tile within the map data corresponding to the tileset, or -1 if this
    * represents a blank tile.
    */
  var index: integer = js.native
  /**
    * The LayerData in the Tilemap data that this tile belongs to.
    */
  var layer: LayerData = js.native
  /**
    * An empty object where physics-engine specific information (e.g. bodies) may be stored.
    */
  var physics: js.Object = js.native
  /**
    * The x coordinate of the top left of this tile in pixels. This is relative to the top left
    * of the layer this tile is being rendered within. This property does NOT factor in camera
    * scroll, layer scale or layer position.
    */
  var pixelX: Double = js.native
  /**
    * The y coordinate of the top left of this tile in pixels. This is relative to the top left
    * of the layer this tile is being rendered within. This property does NOT factor in camera
    * scroll, layer scale or layer position.
    */
  var pixelY: Double = js.native
  /**
    * Tile specific properties. These usually come from Tiled.
    */
  var properties: js.Any = js.native
  /**
    * The rotation angle of this tile.
    */
  var rotation: Double = js.native
  /**
    * The tilemap that contains this Tile. This will only return null if accessed from a LayerData
    * instance before the tile is placed within a StaticTilemapLayer or DynamicTilemapLayer.
    */
  val tilemap: Tilemap = js.native
  /**
    * The tilemap layer that contains this Tile. This will only return null if accessed from a
    * LayerData instance before the tile is placed within a StaticTilemapLayer or
    * DynamicTilemapLayer.
    */
  val tilemapLayer: StaticTilemapLayer | DynamicTilemapLayer = js.native
  /**
    * The tileset that contains this Tile. This is null if accessed from a LayerData instance
    * before the tile is placed in a StaticTilemapLayer or DynamicTilemapLayer, or if the tile has
    * an index that doesn't correspond to any of the map's tilesets.
    */
  val tileset: Tileset = js.native
  /**
    * The tint to apply to this tile. Note: tint is currently a single color value instead of
    * the 4 corner tint component on other GameObjects.
    */
  var tint: Double = js.native
  /**
    * The width of the tile in pixels.
    */
  var width: integer = js.native
  /**
    * The x map coordinate of this tile in tile units.
    */
  var x: integer = js.native
  /**
    * The y map coordinate of this tile in tile units.
    */
  var y: integer = js.native
  /**
    * Check if the given x and y world coordinates are within this Tile. This does not factor in
    * camera scroll, layer scale or layer position.
    * @param x The x coordinate to test.
    * @param y The y coordinate to test.
    */
  def containsPoint(x: Double, y: Double): Boolean = js.native
  /**
    * Copies the tile data & properties from the given tile to this tile. This copies everything
    * except for position and interesting faces.
    * @param tile The tile to copy from.
    */
  def copy(tile: Tile): Tile = js.native
  /**
    * Clean up memory.
    */
  def destroy(): Unit = js.native
  /**
    * Gets the world Y position of the bottom side of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getBottom(): Double = js.native
  def getBottom(camera: Camera): Double = js.native
  /**
    * Gets the world rectangle bounding box for the tile, factoring in the layers position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    * @param output Optional Rectangle object to store the results in.
    */
  def getBounds(): Rectangle | js.Object = js.native
  def getBounds(camera: Camera): Rectangle | js.Object = js.native
  def getBounds(camera: Camera, output: Rectangle): Rectangle | js.Object = js.native
  /**
    * Gets the world X position of the center of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getCenterX(): Double = js.native
  def getCenterX(camera: Camera): Double = js.native
  /**
    * Gets the world Y position of the center of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getCenterY(): Double = js.native
  def getCenterY(camera: Camera): Double = js.native
  /**
    * The collision group for this Tile, defined within the Tileset. This returns a reference to
    * the collision group stored within the Tileset, so any modification of the returned object
    * will impact all tiles that have the same index as this tile.
    */
  def getCollisionGroup(): js.Object = js.native
  /**
    * Gets the world X position of the left side of the tile, factoring in the layers position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getLeft(): Double = js.native
  def getLeft(camera: Camera): Double = js.native
  /**
    * Gets the world X position of the right side of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getRight(): Double = js.native
  def getRight(camera: Camera): Double = js.native
  /**
    * The tile data for this Tile, defined within the Tileset. This typically contains Tiled
    * collision data, tile animations and terrain information. This returns a reference to the tile
    * data stored within the Tileset, so any modification of the returned object will impact all
    * tiles that have the same index as this tile.
    */
  def getTileData(): js.Object = js.native
  /**
    * Gets the world Y position of the top side of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getTop(): Double = js.native
  def getTop(camera: Camera): Double = js.native
  /**
    * Check for intersection with this tile. This does not factor in camera scroll, layer scale or
    * layer position.
    * @param x The x axis in pixels.
    * @param y The y axis in pixels.
    * @param right The right point.
    * @param bottom The bottom point.
    */
  def intersects(x: Double, y: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Checks if the tile is interesting.
    * @param collides If true, will consider the tile interesting if it collides on any side.
    * @param faces If true, will consider the tile interesting if it has an interesting face.
    */
  def isInteresting(collides: Boolean, faces: Boolean): Boolean = js.native
  /**
    * Reset collision status flags.
    * @param recalculateFaces Whether or not to recalculate interesting faces for this tile and its neighbors. Default true.
    */
  def resetCollision(): Tile = js.native
  def resetCollision(recalculateFaces: Boolean): Tile = js.native
  /**
    * Reset faces.
    */
  def resetFaces(): Tile = js.native
  /**
    * Sets the collision flags for each side of this tile and updates the interesting faces list.
    * @param left Indicating collide with any object on the left.
    * @param right Indicating collide with any object on the right.
    * @param up Indicating collide with any object on the top.
    * @param down Indicating collide with any object on the bottom.
    * @param recalculateFaces Whether or not to recalculate interesting faces
    * for this tile and its neighbors. Default true.
    */
  def setCollision(left: Boolean): Tile = js.native
  def setCollision(left: Boolean, right: Boolean): Tile = js.native
  def setCollision(left: Boolean, right: Boolean, up: Boolean): Tile = js.native
  def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean): Tile = js.native
  def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean, recalculateFaces: Boolean): Tile = js.native
  /**
    * Set a callback to be called when this tile is hit by an object. The callback must true for
    * collision processing to take place.
    * @param callback Callback function.
    * @param context Callback will be called within this context.
    */
  def setCollisionCallback(callback: js.Function, context: js.Object): Tile = js.native
  /**
    * Sets the size of the tile and updates its pixelX and pixelY.
    * @param tileWidth The width of the tile in pixels.
    * @param tileHeight The height of the tile in pixels.
    * @param baseWidth The base width a tile in the map (in pixels).
    * @param baseHeight The base height of the tile in pixels (in pixels).
    */
  def setSize(tileWidth: integer, tileHeight: integer, baseWidth: integer, baseHeight: integer): Tile = js.native
  /**
    * Used internally. Updates the tile's world XY position based on the current tile size.
    */
  def updatePixelXY(): Tile = js.native
}

