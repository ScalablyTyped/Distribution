package typings.phaser.Phaser.Tilemaps

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.Alpha
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.ComputedSize
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.GameObjects.Sprite
import typings.phaser.Phaser.Geom.Circle
import typings.phaser.Phaser.Geom.Line
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Geom.Triangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.Sprite.SpriteConfig
import typings.phaser.Phaser.Types.Tilemaps.FilteringOptions
import typings.phaser.Phaser.Types.Tilemaps.StyleConfig
import typings.phaser.integer
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
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
trait StaticTilemapLayer
  extends GameObject
     with Alpha
     with BlendMode
     with ComputedSize
     with Depth
     with Flip
     with GetBounds
     with Origin
     with Pipeline
     with Transform
     with Visible
     with ScrollFactor {
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
  var cullPaddingX: integer = js.native
  /**
    * Canvas only.
    * 
    * The amount of extra tiles to add into the cull rectangle when calculating its vertical size.
    * 
    * See the method `setCullPadding` for more details.
    */
  var cullPaddingY: integer = js.native
  /**
    * Used internally by the Canvas renderer.
    * This holds the tiles that are visible within the camera in the last frame.
    */
  var culledTiles: js.Array[_] = js.native
  /**
    * An array holding the mapping between the tile indexes and the tileset they belong to.
    */
  var gidMap: js.Array[Tileset] = js.native
  /**
    * Used internally by physics system to perform fast type checks.
    */
  val isTilemap: Boolean = js.native
  /**
    * The LayerData associated with this layer. LayerData can only be associated with one
    * tilemap layer.
    */
  var layer: LayerData = js.native
  /**
    * The index of the LayerData associated with this layer.
    */
  var layerIndex: integer = js.native
  /**
    * Canvas only.
    * 
    * You can control if the Cameras should cull tiles before rendering them or not.
    * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
    * 
    * However, there are some instances when you may wish to disable this, and toggling this flag allows
    * you to do so. Also see `setSkipCull` for a chainable method that does the same thing.
    */
  var skipCull: Boolean = js.native
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
  val tilesDrawn: integer = js.native
  /**
    * Canvas only.
    * 
    * The total number of tiles in this layer. Updated every frame.
    */
  val tilesTotal: integer = js.native
  /**
    * The Tileset/s associated with this layer.
    * 
    * As of Phaser 3.14 this property is now an array of Tileset objects, previously it was a single reference.
    */
  var tileset: js.Array[Tileset] = js.native
  /**
    * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
    * faces are used internally for optimizing collisions against tiles. This method is mostly used
    * internally to optimize recalculating faces when only one tile has been changed.
    * @param tileX The x coordinate.
    * @param tileY The y coordinate.
    */
  def calculateFacesAt(tileX: integer, tileY: integer): StaticTilemapLayer = js.native
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
  def calculateFacesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer
  ): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: js.UndefOr[scala.Nothing], tileY: js.UndefOr[scala.Nothing], width: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: integer,
    height: integer
  ): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: js.UndefOr[scala.Nothing], tileY: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: integer,
    width: js.UndefOr[scala.Nothing],
    height: integer
  ): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: js.UndefOr[scala.Nothing], tileY: integer, width: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: js.UndefOr[scala.Nothing], tileY: integer, width: integer, height: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(
    tileX: integer,
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer
  ): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer, tileY: js.UndefOr[scala.Nothing], width: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer, tileY: js.UndefOr[scala.Nothing], width: integer, height: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer, tileY: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer, tileY: integer, width: js.UndefOr[scala.Nothing], height: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer, tileY: integer, width: integer): StaticTilemapLayer = js.native
  def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer): StaticTilemapLayer = js.native
  def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: js.Array[_],
    spriteConfig: SpriteConfig,
    scene: js.UndefOr[scala.Nothing],
    camera: Camera
  ): js.Array[Sprite] = js.native
  def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: js.Array[_],
    spriteConfig: SpriteConfig,
    scene: Scene,
    camera: Camera
  ): js.Array[Sprite] = js.native
  def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: integer,
    spriteConfig: SpriteConfig,
    scene: js.UndefOr[scala.Nothing],
    camera: Camera
  ): js.Array[Sprite] = js.native
  def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: js.Array[_],
    replacements: integer,
    spriteConfig: SpriteConfig,
    scene: Scene,
    camera: Camera
  ): js.Array[Sprite] = js.native
  def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: integer,
    replacements: js.Array[_],
    spriteConfig: SpriteConfig,
    scene: js.UndefOr[scala.Nothing],
    camera: Camera
  ): js.Array[Sprite] = js.native
  def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: integer,
    replacements: js.Array[_],
    spriteConfig: SpriteConfig,
    scene: Scene,
    camera: Camera
  ): js.Array[Sprite] = js.native
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
  def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
  def createFromTiles(
    indexes: integer,
    replacements: integer,
    spriteConfig: SpriteConfig,
    scene: js.UndefOr[scala.Nothing],
    camera: Camera
  ): js.Array[Sprite] = js.native
  def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
  def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
  /**
    * Returns the tiles in the given layer that are within the cameras viewport.
    * This is used internally.
    * @param camera The Camera to run the cull check against.
    */
  def cull(): js.Array[Tile] = js.native
  def cull(camera: Camera): js.Array[Tile] = js.native
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
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions]
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
  def findByIndex(index: integer): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: Boolean): Tile = js.native
  def findByIndex(index: integer, skip: integer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: Boolean): Tile = js.native
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
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions]
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
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions]
  ): StaticTilemapLayer = js.native
  /**
    * Gets a tile at the given tile coordinates from the given layer.
    * @param tileX X position to get the tile from (given in tile units, not pixels).
    * @param tileY Y position to get the tile from (given in tile units, not pixels).
    * @param nonNull If true getTile won't return null for empty tiles, but a Tile
    * object with an index of -1. Default false.
    */
  def getTileAt(tileX: integer, tileY: integer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean): Tile = js.native
  /**
    * Gets a tile at the given world coordinates from the given layer.
    * @param worldX X position to get the tile from (given in pixels)
    * @param worldY Y position to get the tile from (given in pixels)
    * @param nonNull If true, function won't return null for empty tiles, but a Tile
    * object with an index of -1. Default false.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: js.UndefOr[scala.Nothing], camera: Camera): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
  /**
    * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
    * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    */
  def getTilesWithin(): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: js.UndefOr[scala.Nothing], tileY: js.UndefOr[scala.Nothing], width: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: integer,
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: integer,
    height: integer
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: js.UndefOr[scala.Nothing],
    width: integer,
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: js.UndefOr[scala.Nothing], tileY: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: integer,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: integer,
    width: js.UndefOr[scala.Nothing],
    height: integer
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: integer,
    width: js.UndefOr[scala.Nothing],
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: js.UndefOr[scala.Nothing], tileY: integer, width: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: integer,
    width: integer,
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: js.UndefOr[scala.Nothing], tileY: integer, width: integer, height: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: js.UndefOr[scala.Nothing],
    tileY: integer,
    width: integer,
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer
  ): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer, tileY: js.UndefOr[scala.Nothing], width: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: js.UndefOr[scala.Nothing],
    width: integer,
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer, tileY: js.UndefOr[scala.Nothing], width: integer, height: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: js.UndefOr[scala.Nothing],
    width: integer,
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer, tileY: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: integer,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer, tileY: integer, width: js.UndefOr[scala.Nothing], height: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: integer,
    width: js.UndefOr[scala.Nothing],
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer, tileY: integer, width: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: js.UndefOr[scala.Nothing],
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  def getTilesWithin(tileX: integer, tileY: integer, width: integer, height: integer): js.Array[Tile] = js.native
  def getTilesWithin(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    filteringOptions: FilteringOptions
  ): js.Array[Tile] = js.native
  /**
    * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
    * Line, Rectangle or Triangle. The shape should be in world coordinates.
    * @param shape A shape in world (pixel) coordinates
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def getTilesWithinShape(shape: Circle): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Circle, filteringOptions: js.UndefOr[scala.Nothing], camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Line): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Line, filteringOptions: js.UndefOr[scala.Nothing], camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Rectangle): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Rectangle, filteringOptions: js.UndefOr[scala.Nothing], camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Triangle): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Triangle, filteringOptions: js.UndefOr[scala.Nothing], camera: Camera): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
  def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
  /**
    * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
    * @param worldX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter.
    * @param worldY The topmost tile index (in tile coordinates) to use as the origin of the area to filter.
    * @param width How many tiles wide from the `tileX` index the area will be.
    * @param height How many tiles high from the `tileY` index the area will be.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
    */
  def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: Camera
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: Camera
  ): js.Array[Tile] = js.native
  /**
    * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
    * false if there is no tile or if the tile at that location has an index of -1.
    * @param tileX X position to get the tile from in tile coordinates.
    * @param tileY Y position to get the tile from in tile coordinates.
    */
  def hasTileAt(tileX: integer, tileY: integer): Boolean = js.native
  /**
    * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
    * false if there is no tile or if the tile at that location has an index of -1.
    * @param worldX The X coordinate of the world position.
    * @param worldY The Y coordinate of the world position.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
  /**
    * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
    * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
    * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
    * wherever you want on the screen.
    * @param graphics The target Graphics object to draw upon.
    * @param styleConfig An object specifying the colors to use for the debug drawing.
    */
  def renderDebug(graphics: Graphics, styleConfig: StyleConfig): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_]): StaticTilemapLayer = js.native
  def setCollision(
    indexes: js.Array[_],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    updateLayer: Boolean
  ): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_], collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollision(
    indexes: js.Array[_],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    updateLayer: Boolean
  ): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_], collides: Boolean): StaticTilemapLayer = js.native
  def setCollision(
    indexes: js.Array[_],
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    updateLayer: Boolean
  ): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): StaticTilemapLayer = js.native
  /**
    * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
    * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
    * collision will be enabled (true) or disabled (false).
    * @param indexes Either a single tile index, or an array of tile indexes.
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    * @param updateLayer If true, updates the current tiles on the layer. Set to
    * false if no tiles have been placed for significant performance boost. Default true.
    */
  def setCollision(indexes: integer): StaticTilemapLayer = js.native
  def setCollision(
    indexes: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    updateLayer: Boolean
  ): StaticTilemapLayer = js.native
  def setCollision(indexes: integer, collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollision(
    indexes: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    updateLayer: Boolean
  ): StaticTilemapLayer = js.native
  def setCollision(indexes: integer, collides: Boolean): StaticTilemapLayer = js.native
  def setCollision(
    indexes: integer,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    updateLayer: Boolean
  ): StaticTilemapLayer = js.native
  def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): StaticTilemapLayer = js.native
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
  def setCollisionBetween(start: integer, stop: integer): StaticTilemapLayer = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: Boolean): StaticTilemapLayer = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
  /**
    * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
    * the given array. The `collides` parameter controls if collision will be enabled (true) or
    * disabled (false). Tile indexes not currently in the layer are not affected.
    * @param indexes An array of the tile indexes to not be counted for collision.
    * @param collides If true it will enable collision. If false it will clear
    * collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the
    * update. Default true.
    */
  def setCollisionByExclusion(indexes: js.Array[integer]): StaticTilemapLayer = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean): StaticTilemapLayer = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
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
  def setCollisionByProperty(properties: js.Object, collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean): StaticTilemapLayer = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
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
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): StaticTilemapLayer = js.native
  def setCollisionFromCollisionGroup(collides: Boolean): StaticTilemapLayer = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
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
  def setCullPadding(paddingX: js.UndefOr[scala.Nothing], paddingY: integer): this.type = js.native
  def setCullPadding(paddingX: integer): this.type = js.native
  def setCullPadding(paddingX: integer, paddingY: integer): this.type = js.native
  def setRenderOrder(renderOrder: String): this.type = js.native
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
  def setRenderOrder(renderOrder: integer): this.type = js.native
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
  def setSkipCull(value: Boolean): this.type = js.native
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
  def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object): StaticTilemapLayer = js.native
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
  def setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: js.Function): StaticTilemapLayer = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.Object
  ): StaticTilemapLayer = js.native
  /**
    * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
    * layers position, scale and scroll.
    * @param tileX The X coordinate, in tile coordinates.
    * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
    */
  def tileToWorldX(tileX: integer): Double = js.native
  def tileToWorldX(tileX: integer, camera: Camera): Double = js.native
  /**
    * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
    * layers position, scale and scroll. This will return a new Vector2 object or update the given
    * `point` object.
    * @param tileX The X coordinate, in tile coordinates.
    * @param tileY The Y coordinate, in tile coordinates.
    * @param point A Vector2 to store the coordinates in. If not given, a new Vector2 is created.
    * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
    */
  def tileToWorldXY(tileX: integer, tileY: integer): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: js.UndefOr[scala.Nothing], camera: Camera): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera): Vector2 = js.native
  /**
    * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
    * layers position, scale and scroll.
    * @param tileY The Y coordinate, in tile coordinates.
    * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
    */
  def tileToWorldY(tileY: integer): Double = js.native
  def tileToWorldY(tileY: integer, camera: Camera): Double = js.native
  /**
    * Upload the tile data to a VBO.
    * @param camera The camera to render to.
    * @param tilesetIndex The tileset index.
    */
  def upload(camera: Camera, tilesetIndex: integer): StaticTilemapLayer = js.native
  /**
    * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
    * layers position, scale and scroll.
    * @param worldX The X coordinate, in world pixels.
    * @param snapToFloor Whether or not to round the tile coordinate down to the
    * nearest integer. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values.] Default main camera.
    */
  def worldToTileX(worldX: Double): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
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
  def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], point: Vector2): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: Camera
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2, camera: Camera): Vector2 = js.native
  /**
    * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
    * layers position, scale and scroll.
    * @param worldY The Y coordinate, in world pixels.
    * @param snapToFloor Whether or not to round the tile coordinate down to the
    * nearest integer. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    */
  def worldToTileY(worldY: Double): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
}

