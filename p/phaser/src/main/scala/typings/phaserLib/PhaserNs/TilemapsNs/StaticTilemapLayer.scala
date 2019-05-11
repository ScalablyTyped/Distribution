package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Static Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
  * with one, or more, Tilesets.
  * 
  * A Static Tilemap Layer is optimized for rendering speed over flexibility. You cannot apply per-tile
  * effects like tint or alpha, or change the tiles or tilesets the layer uses.
  * 
  * Use a Static Tilemap Layer instead of a Dynamic Tilemap Layer when you don't need tile manipulation features.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs._ArcadeColliderType because Already inherited */ @JSGlobal("Phaser.Tilemaps.StaticTilemapLayer")
@js.native
class StaticTilemapLayer protected ()
  extends phaserLib.PhaserNs.GameObjectsNs.GameObject
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ComputedSize
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Depth
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Flip
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.GetBounds
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Origin
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Pipeline
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Transform
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs.
    * @param tilemap The Tilemap this layer is a part of.
    * @param layerIndex The index of the LayerData associated with this layer.
    * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
    * @param x The world x position where the top left of this layer will be placed. Default 0.
    * @param y The world y position where the top left of this layer will be placed. Default 0.
    */
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: js.Array[java.lang.String | Tileset]) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: Tileset) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: java.lang.String, x: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: js.Array[java.lang.String | Tileset], x: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: Tileset, x: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: java.lang.String, x: scala.Double, y: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: js.Array[java.lang.String | Tileset], x: scala.Double, y: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, tilemap: Tilemap, layerIndex: phaserLib.integer, tileset: Tileset, x: scala.Double, y: scala.Double) = this()
  /**
    * Canvas only.
    * 
    * The callback that is invoked when the tiles are culled.
    * 
    * By default it will call `TilemapComponents.CullTiles` but you can override this to call any function you like.
    * 
    * It will be sent 3 arguments:
    * 
    * 1. The Phaser.Tilemaps.LayerData object for this Layer
    * 2. The Camera that is culling the layer. You can check its `dirty` property to see if it has changed since the last cull.
    * 3. A reference to the `culledTiles` array, which should be used to store the tiles you want rendered.
    * 
    * See the `TilemapComponents.CullTiles` source code for details on implementing your own culling system.
    */
  var cullCallback: js.Function = js.native
  /**
    * Canvas only.
    * 
    * The amount of extra tiles to add into the cull rectangle when calculating its horizontal size.
    * 
    * See the method `setCullPadding` for more details.
    */
  var cullPaddingX: phaserLib.integer = js.native
  /**
    * Canvas only.
    * 
    * The amount of extra tiles to add into the cull rectangle when calculating its vertical size.
    * 
    * See the method `setCullPadding` for more details.
    */
  var cullPaddingY: phaserLib.integer = js.native
  /**
    * Used internally by the Canvas renderer.
    * This holds the tiles that are visible within the camera in the last frame.
    */
  var culledTiles: js.Array[_] = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: scala.Double = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: scala.Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: scala.Double = js.native
  /**
    * The horizontally flipped state of the Game Object.
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    */
  /* CompleteClass */
  override var flipX: scala.Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    */
  /* CompleteClass */
  override var flipY: scala.Boolean = js.native
  /**
    * An array holding the mapping between the tile indexes and the tileset they belong to.
    */
  var gidMap: js.Array[Tileset] = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**
    * Used internally by physics system to perform fast type checks.
    */
  val isTilemap: scala.Boolean = js.native
  /**
    * The LayerData associated with this layer. LayerData can only be associated with one
    * tilemap layer.
    */
  var layer: LayerData = js.native
  /**
    * The index of the LayerData associated with this layer.
    */
  var layerIndex: phaserLib.integer = js.native
  /**
    * Canvas only.
    * 
    * You can control if the Cameras should cull tiles before rendering them or not.
    * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
    * 
    * However, there are some instances when you may wish to disable this, and toggling this flag allows
    * you to do so. Also see `setSkipCull` for a chainable method that does the same thing.
    */
  var skipCull: scala.Boolean = js.native
  /**
    * The Tilemap that this layer is a part of.
    */
  var tilemap: Tilemap = js.native
  /**
    * Canvas only.
    * 
    * The total number of tiles drawn by the renderer in the last frame.
    * 
    * This only works when rending with Canvas.
    */
  val tilesDrawn: phaserLib.integer = js.native
  /**
    * Canvas only.
    * 
    * The total number of tiles in this layer. Updated every frame.
    */
  val tilesTotal: phaserLib.integer = js.native
  /**
    * The Tileset/s associated with this layer.
    * 
    * As of Phaser 3.14 this property is now an array of Tileset objects, previously it was a single reference.
    */
  var tileset: js.Array[Tileset] = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
    * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
    * faces are used internally for optimizing collisions against tiles. This method is mostly used
    * internally to optimize recalculating faces when only one tile has been changed.
    * @param tileX The x coordinate.
    * @param tileY The y coordinate.
    */
  def calculateFacesAt(tileX: phaserLib.integer, tileY: phaserLib.integer): StaticTilemapLayer = js.native
  /**
    * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
    * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
    * is mostly used internally.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    */
  def calculateFacesWithin(): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: phaserLib.integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: phaserLib.integer, tileY: phaserLib.integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: phaserLib.integer, tileY: phaserLib.integer, width: phaserLib.integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(
    tileX: phaserLib.integer,
    tileY: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer
  ): StaticTilemapLayer = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: js.Array[_],
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: js.Array[_],
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: js.Array[_],
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: phaserLib.integer,
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: phaserLib.integer,
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: phaserLib.integer,
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: phaserLib.integer,
    replacements: js.Array[_],
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: phaserLib.integer,
    replacements: js.Array[_],
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: phaserLib.integer,
    replacements: js.Array[_],
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  /**
    * Creates a Sprite for every object matching the given tile indexes in the layer. You can
    * optionally specify if each tile will be replaced with a new tile after the Sprite has been
    * created. This is useful if you want to lay down special tiles in a level that are converted to
    * Sprites, but want to replace the tile itself with a floor tile or similar once converted.
    * @param indexes The tile index, or array of indexes, to create Sprites from.
    * @param replacements The tile index, or array of indexes, to change a converted
    * tile to. Set to `null` to leave the tiles unchanged. If an array is given, it is assumed to be a
    * one-to-one mapping with the indexes array.
    * @param spriteConfig The config object to pass into the Sprite creator (i.e.
    * scene.make.sprite).
    * @param scene The Scene to create the Sprites within. Default scene the map is within.
    * @param camera The Camera to use when determining the world XY Default main camera.
    */
  def createFromTiles(
    indexes: phaserLib.integer,
    replacements: phaserLib.integer,
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: phaserLib.integer,
    replacements: phaserLib.integer,
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  def createFromTiles(
    indexes: phaserLib.integer,
    replacements: phaserLib.integer,
    spriteConfig: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig,
    scene: phaserLib.PhaserNs.Scene,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[phaserLib.PhaserNs.GameObjectsNs.Sprite] = js.native
  /**
    * Returns the tiles in the given layer that are within the cameras viewport.
    * This is used internally.
    * @param camera The Camera to run the cull check against.
    */
  def cull(): js.Array[Tile] = js.native
  def cull(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): js.Array[Tile] = js.native
  /**
    * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
    * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
    * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
    * @param callback The callback. Each tile in the given area will be passed to this
    * callback as the first and only parameter. The callback should return true for tiles that pass the
    * filter.
    * @param context The context under which the callback should be run.
    * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    */
  def filterTiles(
    callback: js.Function,
    context: js.UndefOr[js.Object],
    tileX: js.UndefOr[phaserLib.integer],
    tileY: js.UndefOr[phaserLib.integer],
    width: js.UndefOr[phaserLib.integer],
    height: js.UndefOr[phaserLib.integer],
    filteringOptions: js.UndefOr[phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions]
  ): js.Array[Tile] = js.native
  /**
    * Searches the entire map layer for the first tile matching the given index, then returns that Tile
    * object. If no match is found, it returns null. The search starts from the top-left tile and
    * continues horizontally until it hits the end of the row, then it drops down to the next column.
    * If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to
    * the top-left.
    * @param index The tile index value to search for.
    * @param skip The number of times to skip a matching tile before returning. Default 0.
    * @param reverse If true it will scan the layer in reverse, starting at the
    * bottom-right. Otherwise it scans from the top-left. Default false.
    */
  def findByIndex(index: phaserLib.integer): Tile = js.native
  def findByIndex(index: phaserLib.integer, skip: phaserLib.integer): Tile = js.native
  def findByIndex(index: phaserLib.integer, skip: phaserLib.integer, reverse: scala.Boolean): Tile = js.native
  /**
    * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
    * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
    * true. Similar to Array.prototype.find in vanilla JS.
    * @param callback The callback. Each tile in the given area will be passed to this
    * callback as the first and only parameter.
    * @param context The context under which the callback should be run.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    */
  def findTile(
    callback: js.Function,
    context: js.UndefOr[js.Object],
    tileX: js.UndefOr[phaserLib.integer],
    tileY: js.UndefOr[phaserLib.integer],
    width: js.UndefOr[phaserLib.integer],
    height: js.UndefOr[phaserLib.integer],
    filteringOptions: js.UndefOr[phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions]
  ): Tile = js.native
  /**
    * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
    * callback. Similar to Array.prototype.forEach in vanilla JS.
    * @param callback The callback. Each tile in the given area will be passed to this
    * callback as the first and only parameter.
    * @param context The context under which the callback should be run.
    * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    */
  def forEachTile(
    callback: js.Function,
    context: js.UndefOr[js.Object],
    tileX: js.UndefOr[phaserLib.integer],
    tileY: js.UndefOr[phaserLib.integer],
    width: js.UndefOr[phaserLib.integer],
    height: js.UndefOr[phaserLib.integer],
    filteringOptions: js.UndefOr[phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions]
  ): StaticTilemapLayer = js.native
  /**
    * Gets a tile at the given tile coordinates from the given layer.
    * @param tileX X position to get the tile from (given in tile units, not pixels).
    * @param tileY Y position to get the tile from (given in tile units, not pixels).
    * @param nonNull If true getTile won't return null for empty tiles, but a Tile
    * object with an index of -1. Default false.
    */
  def getTileAt(tileX: phaserLib.integer, tileY: phaserLib.integer): Tile = js.native
  def getTileAt(tileX: phaserLib.integer, tileY: phaserLib.integer, nonNull: scala.Boolean): Tile = js.native
  /**
    * Gets a tile at the given world coordinates from the given layer.
    * @param worldX X position to get the tile from (given in pixels)
    * @param worldY Y position to get the tile from (given in pixels)
    * @param nonNull If true, function won't return null for empty tiles, but a Tile
    * object with an index of -1. Default false.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def getTileAtWorldXY(worldX: scala.Double, worldY: scala.Double): Tile = js.native
  def getTileAtWorldXY(worldX: scala.Double, worldY: scala.Double, nonNull: scala.Boolean): Tile = js.native
  def getTileAtWorldXY(
    worldX: scala.Double,
    worldY: scala.Double,
    nonNull: scala.Boolean,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): Tile = js.native
  /**
    * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
    * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    */
  def getTilesWithin(): js.Array[Tile] = js.native
  def getTilesWithin(tileX: phaserLib.integer): js.Array[Tile] = js.native
  def getTilesWithin(tileX: phaserLib.integer, tileY: phaserLib.integer): js.Array[Tile] = js.native
  def getTilesWithin(tileX: phaserLib.integer, tileY: phaserLib.integer, width: phaserLib.integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: phaserLib.integer,
    tileY: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: phaserLib.integer,
    tileY: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions
  ): js.Array[Tile] = js.native
  /**
    * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
    * Line, Rectangle or Triangle. The shape should be in world coordinates.
    * @param shape A shape in world (pixel) coordinates
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def getTilesWithinShape(shape: phaserLib.PhaserNs.GeomNs.Circle): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Circle,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Circle,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: phaserLib.PhaserNs.GeomNs.Line): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Line,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Line,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: phaserLib.PhaserNs.GeomNs.Rectangle): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Rectangle,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Rectangle,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: phaserLib.PhaserNs.GeomNs.Triangle): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Triangle,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithinShape(
    shape: phaserLib.PhaserNs.GeomNs.Triangle,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[Tile] = js.native
  /**
    * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
    * @param worldX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter.
    * @param worldY The topmost tile index (in tile coordinates) to use as the origin of the area to filter.
    * @param width How many tiles wide from the `tileX` index the area will be.
    * @param height How many tiles high from the `tileY` index the area will be.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
    */
  def getTilesWithinWorldXY(worldX: scala.Double, worldY: scala.Double, width: scala.Double, height: scala.Double): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: scala.Double,
    worldY: scala.Double,
    width: scala.Double,
    height: scala.Double,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: scala.Double,
    worldY: scala.Double,
    width: scala.Double,
    height: scala.Double,
    filteringOptions: phaserLib.PhaserNs.TypesNs.TilemapsNs.FilteringOptions,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): js.Array[Tile] = js.native
  /**
    * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
    * false if there is no tile or if the tile at that location has an index of -1.
    * @param tileX X position to get the tile from in tile coordinates.
    * @param tileY Y position to get the tile from in tile coordinates.
    */
  def hasTileAt(tileX: phaserLib.integer, tileY: phaserLib.integer): scala.Boolean = js.native
  /**
    * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
    * false if there is no tile or if the tile at that location has an index of -1.
    * @param worldX The X coordinate of the world position.
    * @param worldY The Y coordinate of the world position.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def hasTileAtWorldXY(worldX: scala.Double, worldY: scala.Double): scala.Boolean = js.native
  def hasTileAtWorldXY(worldX: scala.Double, worldY: scala.Double, camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Boolean = js.native
  /**
    * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
    * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
    * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
    * wherever you want on the screen.
    * @param graphics The target Graphics object to draw upon.
    * @param styleConfig An object specifying the colors to use for the debug drawing.
    */
  def renderDebug(
    graphics: phaserLib.PhaserNs.GameObjectsNs.Graphics,
    styleConfig: phaserLib.PhaserNs.TypesNs.TilemapsNs.StyleConfig
  ): StaticTilemapLayer = js.native
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  def setCollision(indexes: js.Array[_]): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_], collides: scala.Boolean): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_], collides: scala.Boolean, recalculateFaces: scala.Boolean): StaticTilemapLayer = js.native
  /**
    * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
    * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
    * collision will be enabled (true) or disabled (false).
    * @param indexes Either a single tile index, or an array of tile indexes.
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    */
  def setCollision(indexes: phaserLib.integer): StaticTilemapLayer = js.native
  def setCollision(indexes: phaserLib.integer, collides: scala.Boolean): StaticTilemapLayer = js.native
  def setCollision(indexes: phaserLib.integer, collides: scala.Boolean, recalculateFaces: scala.Boolean): StaticTilemapLayer = js.native
  /**
    * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
    * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
    * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
    * enabled (true) or disabled (false).
    * @param start The first index of the tile to be set for collision.
    * @param stop The last index of the tile to be set for collision.
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    */
  def setCollisionBetween(start: phaserLib.integer, stop: phaserLib.integer): StaticTilemapLayer = js.native
  def setCollisionBetween(start: phaserLib.integer, stop: phaserLib.integer, collides: scala.Boolean): StaticTilemapLayer = js.native
  def setCollisionBetween(
    start: phaserLib.integer,
    stop: phaserLib.integer,
    collides: scala.Boolean,
    recalculateFaces: scala.Boolean
  ): StaticTilemapLayer = js.native
  /**
    * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
    * the given array. The `collides` parameter controls if collision will be enabled (true) or
    * disabled (false).
    * @param indexes An array of the tile indexes to not be counted for collision.
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    */
  def setCollisionByExclusion(indexes: js.Array[phaserLib.integer]): StaticTilemapLayer = js.native
  def setCollisionByExclusion(indexes: js.Array[phaserLib.integer], collides: scala.Boolean): StaticTilemapLayer = js.native
  def setCollisionByExclusion(indexes: js.Array[phaserLib.integer], collides: scala.Boolean, recalculateFaces: scala.Boolean): StaticTilemapLayer = js.native
  /**
    * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
    * that matches the given properties object, its collision flag will be set. The `collides`
    * parameter controls if collision will be enabled (true) or disabled (false). Passing in
    * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
    * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
    * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
    * "types" property that matches any of those values, its collision flag will be updated.
    * @param properties An object with tile properties and corresponding values that should
    * be checked.
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    */
  def setCollisionByProperty(properties: js.Object): StaticTilemapLayer = js.native
  def setCollisionByProperty(properties: js.Object, collides: scala.Boolean): StaticTilemapLayer = js.native
  def setCollisionByProperty(properties: js.Object, collides: scala.Boolean, recalculateFaces: scala.Boolean): StaticTilemapLayer = js.native
  /**
    * Sets collision on the tiles within a layer by checking each tiles collision group data
    * (typically defined in Tiled within the tileset collision editor). If any objects are found within
    * a tiles collision group, the tile's colliding information will be set. The `collides` parameter
    * controls if collision will be enabled (true) or disabled (false).
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    */
  def setCollisionFromCollisionGroup(): StaticTilemapLayer = js.native
  def setCollisionFromCollisionGroup(collides: scala.Boolean): StaticTilemapLayer = js.native
  def setCollisionFromCollisionGroup(collides: scala.Boolean, recalculateFaces: scala.Boolean): StaticTilemapLayer = js.native
  /**
    * Canvas only.
    * 
    * When a Camera culls the tiles in this layer it does so using its view into the world, building up a
    * rectangle inside which the tiles must exist or they will be culled. Sometimes you may need to expand the size
    * of this 'cull rectangle', especially if you plan on rotating the Camera viewing the layer. Do so
    * by providing the padding values. The values given are in tiles, not pixels. So if the tile width was 32px
    * and you set `paddingX` to be 4, it would add 32px x 4 to the cull rectangle (adjusted for scale)
    * @param paddingX The amount of extra horizontal tiles to add to the cull check padding. Default 1.
    * @param paddingY The amount of extra vertical tiles to add to the cull check padding. Default 1.
    */
  def setCullPadding(): this.type = js.native
  def setCullPadding(paddingX: phaserLib.integer): this.type = js.native
  def setCullPadding(paddingX: phaserLib.integer, paddingY: phaserLib.integer): this.type = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: phaserLib.integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: scala.Boolean, y: scala.Boolean): this.type = js.native
  /**
    * Sets the horizontal flipped state of this Game Object.
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
  def setRenderOrder(renderOrder: java.lang.String): this.type = js.native
  /**
    * Sets the rendering (draw) order of the tiles in this layer.
    * 
    * The default is 'right-down', meaning it will order the tiles starting from the top-left,
    * drawing to the right and then moving down to the next row.
    * 
    * The draw orders are:
    * 
    * 0 = right-down
    * 1 = left-down
    * 2 = right-up
    * 3 = left-up
    * 
    * Setting the render order does not change the tiles or how they are stored in the layer,
    * it purely impacts the order in which they are rendered.
    * 
    * You can provide either an integer (0 to 3), or the string version of the order.
    * @param renderOrder The render (draw) order value. Either an integer between 0 and 3, or a string: 'right-down', 'left-down', 'right-up' or 'left-up'.
    */
  def setRenderOrder(renderOrder: phaserLib.integer): this.type = js.native
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setSize(width: scala.Double, height: scala.Double): this.type = js.native
  /**
    * Canvas only.
    * 
    * You can control if the Cameras should cull tiles before rendering them or not.
    * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
    * 
    * However, there are some instances when you may wish to disable this.
    * @param value Set to `true` to stop culling tiles. Set to `false` to enable culling again. Default true.
    */
  def setSkipCull(): this.type = js.native
  def setSkipCull(value: scala.Boolean): this.type = js.native
  def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object): StaticTilemapLayer = js.native
  /**
    * Sets a global collision callback for the given tile index within the layer. This will affect all
    * tiles on this layer that have the same index. If a callback is already set for the tile index it
    * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
    * at a specific location on the map then see setTileLocationCallback.
    * @param indexes Either a single tile index, or an array of tile indexes to have a
    * collision callback set for.
    * @param callback The callback that will be invoked when the tile is collided with.
    * @param callbackContext The context under which the callback is called.
    */
  def setTileIndexCallback(indexes: phaserLib.integer, callback: js.Function, callbackContext: js.Object): StaticTilemapLayer = js.native
  /**
    * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
    * If a callback is already set for the tile index it will be replaced. Set the callback to null to
    * remove it.
    * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area.
    * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area.
    * @param width How many tiles wide from the `tileX` index the area will be.
    * @param height How many tiles tall from the `tileY` index the area will be.
    * @param callback The callback that will be invoked when the tile is collided with.
    * @param callbackContext The context under which the callback is called.
    */
  def setTileLocationCallback(
    tileX: phaserLib.integer,
    tileY: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    callback: js.Function
  ): StaticTilemapLayer = js.native
  def setTileLocationCallback(
    tileX: phaserLib.integer,
    tileY: phaserLib.integer,
    width: phaserLib.integer,
    height: phaserLib.integer,
    callback: js.Function,
    callbackContext: js.Object
  ): StaticTilemapLayer = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
  /**
    * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
    * layers position, scale and scroll.
    * @param tileX The X coordinate, in tile coordinates.
    * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
    */
  def tileToWorldX(tileX: phaserLib.integer): scala.Double = js.native
  def tileToWorldX(tileX: phaserLib.integer, camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
  /**
    * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
    * layers position, scale and scroll. This will return a new Vector2 object or update the given
    * `point` object.
    * @param tileX The X coordinate, in tile coordinates.
    * @param tileY The Y coordinate, in tile coordinates.
    * @param point A Vector2 to store the coordinates in. If not given, a new Vector2 is created.
    * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
    */
  def tileToWorldXY(tileX: phaserLib.integer, tileY: phaserLib.integer): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def tileToWorldXY(tileX: phaserLib.integer, tileY: phaserLib.integer, point: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def tileToWorldXY(
    tileX: phaserLib.integer,
    tileY: phaserLib.integer,
    point: phaserLib.PhaserNs.MathNs.Vector2,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
    * layers position, scale and scroll.
    * @param tileY The Y coordinate, in tile coordinates.
    * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
    */
  def tileToWorldY(tileY: phaserLib.integer): scala.Double = js.native
  def tileToWorldY(tileY: phaserLib.integer, camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): scala.Double = js.native
  /**
    * Toggles the horizontal flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
  /**
    * Upload the tile data to a VBO.
    * @param camera The camera to render to.
    * @param tilesetIndex The tileset index.
    */
  def upload(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, tilesetIndex: phaserLib.integer): StaticTilemapLayer = js.native
  /**
    * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
    * layers position, scale and scroll.
    * @param worldX The X coordinate, in world pixels.
    * @param snapToFloor Whether or not to round the tile coordinate down to the
    * nearest integer. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values.] Default main camera.
    */
  def worldToTileX(worldX: scala.Double): scala.Double = js.native
  def worldToTileX(worldX: scala.Double, snapToFloor: scala.Boolean): scala.Double = js.native
  def worldToTileX(
    worldX: scala.Double,
    snapToFloor: scala.Boolean,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Double = js.native
  /**
    * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
    * layers position, scale and scroll. This will return a new Vector2 object or update the given
    * `point` object.
    * @param worldX The X coordinate, in world pixels.
    * @param worldY The Y coordinate, in world pixels.
    * @param snapToFloor Whether or not to round the tile coordinate down to the
    * nearest integer. Default true.
    * @param point A Vector2 to store the coordinates in. If not given, a new Vector2 is created.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def worldToTileXY(worldX: scala.Double, worldY: scala.Double): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def worldToTileXY(worldX: scala.Double, worldY: scala.Double, snapToFloor: scala.Boolean): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def worldToTileXY(
    worldX: scala.Double,
    worldY: scala.Double,
    snapToFloor: scala.Boolean,
    point: phaserLib.PhaserNs.MathNs.Vector2
  ): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  def worldToTileXY(
    worldX: scala.Double,
    worldY: scala.Double,
    snapToFloor: scala.Boolean,
    point: phaserLib.PhaserNs.MathNs.Vector2,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
    * layers position, scale and scroll.
    * @param worldY The Y coordinate, in world pixels.
    * @param snapToFloor Whether or not to round the tile coordinate down to the
    * nearest integer. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def worldToTileY(worldY: scala.Double): scala.Double = js.native
  def worldToTileY(worldY: scala.Double, snapToFloor: scala.Boolean): scala.Double = js.native
  def worldToTileY(
    worldY: scala.Double,
    snapToFloor: scala.Boolean,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera
  ): scala.Double = js.native
}

