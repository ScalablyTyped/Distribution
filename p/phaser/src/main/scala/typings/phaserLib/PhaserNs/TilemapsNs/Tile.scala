package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Tile is a representation of a single tile within the Tilemap. This is a lightweight data
  * representation, so its position information is stored without factoring in scroll, layer
  * scale or layer position.
  */
@JSGlobal("Phaser.Tilemaps.Tile")
@js.native
class Tile protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Flip
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
  /**
    * 
    * @param layer The LayerData object in the Tilemap that this tile belongs to.
    * @param index The unique index of this tile within the map.
    * @param x The x coordinate of this tile in tile coordinates.
    * @param y The y coordinate of this tile in tile coordinates.
    * @param width Width of the tile in pixels.
    * @param height Height of the tile in pixels.
    * @param baseWidth The base width a tile in the map (in pixels). Tiled maps support
    * multiple tileset sizes within one map, but they are still placed at intervals of the base
    * tile width.
    * @param baseHeight The base height of the tile in pixels (in pixels). Tiled maps
    * support multiple tileset sizes within one map, but they are still placed at intervals of the
    * base tile height.
    */
  def this(layer: LayerData, index: phaserLib.integer, x: phaserLib.integer, y: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer, baseWidth: phaserLib.integer, baseHeight: phaserLib.integer) = this()
  /**
    * The map's base height of a tile in pixels. Tiled maps support multiple tileset sizes
    * within one map, but they are still placed at intervals of the base tile size.
    */
  var baseHeight: phaserLib.integer = js.native
  /**
    * The map's base width of a tile in pixels. Tiled maps support multiple tileset sizes
    * within one map, but they are still placed at intervals of the base tile size.
    */
  var baseWidth: phaserLib.integer = js.native
  /**
    * True if this tile can collide on any of its faces or has a collision callback set.
    */
  val canCollide: scala.Boolean = js.native
  /**
    * Whether the tile should collide with any object on the bottom side.
    */
  var collideDown: scala.Boolean = js.native
  /**
    * Whether the tile should collide with any object on the left side.
    */
  var collideLeft: scala.Boolean = js.native
  /**
    * Whether the tile should collide with any object on the right side.
    */
  var collideRight: scala.Boolean = js.native
  /**
    * Whether the tile should collide with any object on the top side.
    */
  var collideUp: scala.Boolean = js.native
  /**
    * True if this tile can collide on any of its faces.
    */
  val collides: scala.Boolean = js.native
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
  var faceBottom: scala.Boolean = js.native
  /**
    * Whether the tile's left edge is interesting for collisions.
    */
  var faceLeft: scala.Boolean = js.native
  /**
    * Whether the tile's right edge is interesting for collisions.
    */
  var faceRight: scala.Boolean = js.native
  /**
    * Whether the tile's top edge is interesting for collisions.
    */
  var faceTop: scala.Boolean = js.native
  /**
    * The horizontally flipped state of the Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override var flipX: scala.Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    * 
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override var flipY: scala.Boolean = js.native
  /**
    * True if this tile has any interesting faces.
    */
  val hasInterestingFace: scala.Boolean = js.native
  /**
    * The height of the tile in pixels.
    */
  var height: phaserLib.integer = js.native
  /**
    * The index of this tile within the map data corresponding to the tileset, or -1 if this
    * represents a blank tile.
    */
  var index: phaserLib.integer = js.native
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
  var pixelX: scala.Double = js.native
  /**
    * The y coordinate of the top left of this tile in pixels. This is relative to the top left
    * of the layer this tile is being rendered within. This property does NOT factor in camera
    * scroll, layer scale or layer position.
    */
  var pixelY: scala.Double = js.native
  /**
    * Tile specific properties. These usually come from Tiled.
    */
  var properties: js.Any = js.native
  /**
    * The rotation angle of this tile.
    */
  var rotation: scala.Double = js.native
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
  var tint: scala.Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The width of the tile in pixels.
    */
  var width: phaserLib.integer = js.native
  /**
    * The x map coordinate of this tile in tile units.
    */
  var x: phaserLib.integer = js.native
  /**
    * The y map coordinate of this tile in tile units.
    */
  var y: phaserLib.integer = js.native
  /**
    * Check if the given x and y world coordinates are within this Tile. This does not factor in
    * camera scroll, layer scale or layer position.
    * @param x The x coordinate to test.
    * @param y The y coordinate to test.
    */
  def containsPoint(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
    * Copies the tile data & properties from the given tile to this tile. This copies everything
    * except for position and interesting faces.
    * @param tile The tile to copy from.
    */
  def copy(tile: Tile): Tile = js.native
  /**
    * Clean up memory.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Gets the world Y position of the bottom side of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getBottom(): scala.Double = js.native
  def getBottom(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
  /**
    * Gets the world rectangle bounding box for the tile, factoring in the layers position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    * @param output [description]
    */
  def getBounds(): phaserLib.PhaserNs.GeomNs.Rectangle | js.Object = js.native
  def getBounds(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): phaserLib.PhaserNs.GeomNs.Rectangle | js.Object = js.native
  def getBounds(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, output: js.Object): phaserLib.PhaserNs.GeomNs.Rectangle | js.Object = js.native
  /**
    * Gets the world X position of the center of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getCenterX(): scala.Double = js.native
  def getCenterX(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
  /**
    * Gets the world Y position of the center of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getCenterY(): scala.Double = js.native
  def getCenterY(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
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
  def getLeft(): scala.Double = js.native
  def getLeft(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
  /**
    * Gets the world X position of the right side of the tile, factoring in the layer's position,
    * scale and scroll.
    * @param camera The Camera to use to perform the check.
    */
  def getRight(): scala.Double = js.native
  def getRight(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
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
  def getTop(): scala.Double = js.native
  def getTop(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
  /**
    * Check for intersection with this tile. This does not factor in camera scroll, layer scale or
    * layer position.
    * @param x The x axis in pixels.
    * @param y The y axis in pixels.
    * @param right The right point.
    * @param bottom The bottom point.
    */
  def intersects(x: scala.Double, y: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  /**
    * Checks if the tile is interesting.
    * @param collides If true, will consider the tile interesting if it collides on any side.
    * @param faces If true, will consider the tile interesting if it has an interesting face.
    */
  def isInteresting(collides: scala.Boolean, faces: scala.Boolean): scala.Boolean = js.native
  /**
    * Reset collision status flags.
    * @param recalculateFaces Whether or not to recalculate interesting faces for this tile and its neighbors. Default true.
    */
  def resetCollision(): Tile = js.native
  def resetCollision(recalculateFaces: scala.Boolean): Tile = js.native
  /**
    * Reset faces.
    */
  def resetFaces(): Tile = js.native
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  /**
    * Sets the collision flags for each side of this tile and updates the interesting faces list.
    * @param left Indicating collide with any object on the left.
    * @param right Indicating collide with any object on the right.
    * @param up Indicating collide with any object on the top.
    * @param down Indicating collide with any object on the bottom.
    * @param recalculateFaces Whether or not to recalculate interesting faces
    * for this tile and its neighbors. Default true.
    */
  def setCollision(left: scala.Boolean): Tile = js.native
  def setCollision(left: scala.Boolean, right: scala.Boolean): Tile = js.native
  def setCollision(left: scala.Boolean, right: scala.Boolean, up: scala.Boolean): Tile = js.native
  def setCollision(left: scala.Boolean, right: scala.Boolean, up: scala.Boolean, down: scala.Boolean): Tile = js.native
  def setCollision(
    left: scala.Boolean,
    right: scala.Boolean,
    up: scala.Boolean,
    down: scala.Boolean,
    recalculateFaces: scala.Boolean
  ): Tile = js.native
  /**
    * Set a callback to be called when this tile is hit by an object. The callback must true for
    * collision processing to take place.
    * @param callback Callback function.
    * @param context Callback will be called within this context.
    */
  def setCollisionCallback(callback: js.Function, context: js.Object): Tile = js.native
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * 
    * A Game Object that is flipped will render inversed on the flipped axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: scala.Boolean, y: scala.Boolean): this.type = js.native
  /**
    * Sets the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: scala.Boolean): this.type = js.native
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: scala.Boolean): this.type = js.native
  /**
    * Sets the size of the tile and updates its pixelX and pixelY.
    * @param tileWidth The width of the tile in pixels.
    * @param tileHeight The height of the tile in pixels.
    * @param baseWidth The base width a tile in the map (in pixels).
    * @param baseHeight The base height of the tile in pixels (in pixels).
    */
  def setSize(
    tileWidth: phaserLib.integer,
    tileHeight: phaserLib.integer,
    baseWidth: phaserLib.integer,
    baseHeight: phaserLib.integer
  ): Tile = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
  /**
    * Toggles the horizontal flipped state of this Game Object.
    * 
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
  /**
    * Used internally. Updates the tile's world XY position based on the current tile size.
    */
  def updatePixelXY(): Tile = js.native
}

