package typings.phaser.Phaser.Tilemaps

import typings.phaser.EachTileCallback
import typings.phaser.FindTileCallback
import typings.phaser.Phaser.Cameras.Scene2D.Camera
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
import typings.phaser.TilemapFilterCallback
import typings.phaser.TilemapFindCallback
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Tilemap is a container for Tilemap data. This isn't a display object, rather, it holds data
  * about the map and allows you to add tilesets and tilemap layers to it. A map can have one or
  * more tilemap layers (StaticTilemapLayer or DynamicTilemapLayer), which are the display
  * objects that actually render tiles.
  * 
  * The Tilemap data be parsed from a Tiled JSON file, a CSV file or a 2D array. Tiled is a free
  * software package specifically for creating tile maps, and is available from:
  * http://www.mapeditor.org
  * 
  * A Tilemap has handy methods for getting & manipulating the tiles within a layer. You can only
  * use the methods that change tiles (e.g. removeTileAt) on a DynamicTilemapLayer.
  * 
  * Note that all Tilemaps use a base tile size to calculate dimensions from, but that a
  * StaticTilemapLayer or DynamicTilemapLayer may have its own unique tile size that overrides
  * it.
  * 
  * As of Phaser 3.21.0, if your tilemap includes layer groups (a feature of Tiled 1.2.0+) these
  * will be traversed and the following properties will affect children:
  * - opacity (blended with parent) and visibility (parent overrides child)
  * - Vertical and horizontal offset
  * The grouping hierarchy is not preserved and all layers will be flattened into a single array.
  * Group layers are parsed during Tilemap construction but are discarded after parsing so dynamic
  * layers will NOT continue to be affected by a parent.
  * 
  * To avoid duplicate layer names, a layer that is a child of a group layer will have its parent
  * group name prepended with a '/'.  For example, consider a group called 'ParentGroup' with a
  * child called 'Layer 1'. In the Tilemap object, 'Layer 1' will have the name
  * 'ParentGroup/Layer 1'.
  */
@js.native
trait Tilemap extends js.Object {
  /**
    * The index of the currently selected LayerData object.
    */
  var currentLayerIndex: integer = js.native
  /**
    * The format of the map data.
    */
  var format: Double = js.native
  /**
    * The height of the map (in tiles).
    */
  var height: Double = js.native
  /**
    * The height of the map in pixels based on height * tileHeight.
    */
  var heightInPixels: Double = js.native
  var imageCollections: js.Array[ImageCollection] = js.native
  /**
    * An array of Tiled Image Layers.
    */
  var images: js.Array[_] = js.native
  /**
    * The LayerData object that is currently selected in the map. You can set this property using
    * any type supported by setLayer.
    */
  var layer: LayerData = js.native
  /**
    * An array of Tilemap layer data.
    */
  var layers: js.Array[LayerData] = js.native
  /**
    * An array of ObjectLayer instances parsed from Tiled object layers.
    */
  var objects: js.Array[ObjectLayer] = js.native
  /**
    * The orientation of the map data (as specified in Tiled), usually 'orthogonal'.
    */
  var orientation: String = js.native
  /**
    * Map specific properties as specified in Tiled.
    */
  var properties: js.Object = js.native
  /**
    * The render (draw) order of the map data (as specified in Tiled), usually 'right-down'.
    * 
    * The draw orders are:
    * 
    * right-down
    * left-down
    * right-up
    * left-up
    * 
    * This can be changed via the `setRenderOrder` method.
    */
  var renderOrder: String = js.native
  var scene: Scene = js.native
  /**
    * The base height of a tile in pixels. Note that individual layers may have a different
    * tile height.
    */
  var tileHeight: integer = js.native
  /**
    * The base width of a tile in pixels. Note that individual layers may have a different tile
    * width.
    */
  var tileWidth: integer = js.native
  /**
    * An array of Tilesets used in the map.
    */
  var tilesets: js.Array[Tileset] = js.native
  /**
    * The version of the map data (as specified in Tiled, usually 1).
    */
  var version: Double = js.native
  /**
    * The width of the map (in tiles).
    */
  var width: Double = js.native
  /**
    * The width of the map in pixels based on width * tileWidth.
    */
  var widthInPixels: Double = js.native
  /**
    * Adds an image to the map to be used as a tileset. A single map may use multiple tilesets.
    * Note that the tileset name can be found in the JSON file exported from Tiled, or in the Tiled
    * editor.
    * @param tilesetName The name of the tileset as specified in the map data.
    * @param key The key of the Phaser.Cache image used for this tileset. If
    * `undefined` or `null` it will look for an image with a key matching the tilesetName parameter.
    * @param tileWidth The width of the tile (in pixels) in the Tileset Image. If not
    * given it will default to the map's tileWidth value, or the tileWidth specified in the Tiled
    * JSON file.
    * @param tileHeight The height of the tiles (in pixels) in the Tileset Image. If
    * not given it will default to the map's tileHeight value, or the tileHeight specified in the
    * Tiled JSON file.
    * @param tileMargin The margin around the tiles in the sheet (in pixels). If not
    * specified, it will default to 0 or the value specified in the Tiled JSON file.
    * @param tileSpacing The spacing between each the tile in the sheet (in pixels).
    * If not specified, it will default to 0 or the value specified in the Tiled JSON file.
    * @param gid If adding multiple tilesets to a blank map, specify the starting
    * GID this set will use here. Default 0.
    */
  def addTilesetImage(
    tilesetName: String,
    key: js.UndefOr[String],
    tileWidth: js.UndefOr[integer],
    tileHeight: js.UndefOr[integer],
    tileMargin: js.UndefOr[integer],
    tileSpacing: js.UndefOr[integer],
    gid: js.UndefOr[integer]
  ): Tileset = js.native
  /**
    * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
    * faces are used internally for optimizing collisions against tiles. This method is mostly used
    * internally to optimize recalculating faces when only one tile has been changed.
    * 
    * If no layer specified, the maps current layer is used.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def calculateFacesAt(tileX: integer, tileY: integer): Tilemap = js.native
  def calculateFacesAt(tileX: integer, tileY: integer, layer: String): Tilemap = js.native
  def calculateFacesAt(tileX: integer, tileY: integer, layer: DynamicTilemapLayer): Tilemap = js.native
  def calculateFacesAt(tileX: integer, tileY: integer, layer: StaticTilemapLayer): Tilemap = js.native
  def calculateFacesAt(tileX: integer, tileY: integer, layer: integer): Tilemap = js.native
  /**
    * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
    * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
    * is mostly used internally.
    * 
    * If no layer specified, the map's current layer is used.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def calculateFacesWithin(
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Turns the DynamicTilemapLayer associated with the given layer into a StaticTilemapLayer. If
    * no layer specified, the map's current layer is used. This is useful if you want to manipulate
    * a map at the start of a scene, but then make it non-manipulable and optimize it for speed.
    * Note: the DynamicTilemapLayer passed in is destroyed, so make sure to store the value
    * returned from this method if you want to manipulate the new StaticTilemapLayer.
    * @param layer The name of the layer from Tiled, the
    * index of the layer in the map, or a DynamicTilemapLayer.
    */
  def convertLayerToStatic(): StaticTilemapLayer = js.native
  def convertLayerToStatic(layer: String): StaticTilemapLayer = js.native
  def convertLayerToStatic(layer: DynamicTilemapLayer): StaticTilemapLayer = js.native
  def convertLayerToStatic(layer: integer): StaticTilemapLayer = js.native
  /**
    * Copies the tiles in the source rectangular area to a new destination (all specified in tile
    * coordinates) within the layer. This copies all tile properties & recalculates collision
    * information in the destination region.
    * 
    * If no layer specified, the map's current layer is used. This cannot be applied to StaticTilemapLayers.
    * @param srcTileX The x coordinate of the area to copy from, in tiles, not pixels.
    * @param srcTileY The y coordinate of the area to copy from, in tiles, not pixels.
    * @param width The width of the area to copy, in tiles, not pixels.
    * @param height The height of the area to copy, in tiles, not pixels.
    * @param destTileX The x coordinate of the area to copy to, in tiles, not pixels.
    * @param destTileY The y coordinate of the area to copy to, in tiles, not pixels.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: Boolean
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: Boolean,
    layer: String
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def copy(
    srcTileX: integer,
    srcTileY: integer,
    width: integer,
    height: integer,
    destTileX: integer,
    destTileY: integer,
    recalculateFaces: Boolean,
    layer: integer
  ): Tilemap = js.native
  /**
    * Creates a new and empty DynamicTilemapLayer. The currently selected layer in the map is set to this new layer.
    * @param name The name of this layer. Must be unique within the map.
    * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
    * @param x The world x position where the top left of this layer will be placed. Default 0.
    * @param y The world y position where the top left of this layer will be placed. Default 0.
    * @param width The width of the layer in tiles. If not specified, it will default to the map's width.
    * @param height The height of the layer in tiles. If not specified, it will default to the map's height.
    * @param tileWidth The width of the tiles the layer uses for calculations. If not specified, it will default to the map's tileWidth.
    * @param tileHeight The height of the tiles the layer uses for calculations. If not specified, it will default to the map's tileHeight.
    */
  def createBlankDynamicLayer(
    name: String,
    tileset: String | (js.Array[String | Tileset]) | Tileset,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    tileWidth: js.UndefOr[integer],
    tileHeight: js.UndefOr[integer]
  ): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: String): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: String, x: js.UndefOr[scala.Nothing], y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: String, x: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: String, x: Double, y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset]): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset], x: js.UndefOr[scala.Nothing], y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double, y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: Tileset): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: Tileset, x: js.UndefOr[scala.Nothing], y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: Tileset, x: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: String, tileset: Tileset, x: Double, y: Double): DynamicTilemapLayer = js.native
  /**
    * Creates a new DynamicTilemapLayer that renders the LayerData associated with the given
    * `layerID`. The currently selected layer in the map is set to this new layer.
    * 
    * The `layerID` is important. If you've created your map in Tiled then you can get this by
    * looking in Tiled and looking at the layer name. Or you can open the JSON file it exports and
    * look at the layers[].name value. Either way it must match.
    * 
    * Unlike a static layer, a dynamic layer can be modified. See DynamicTilemapLayer for more
    * information.
    * @param layerID The layer array index value, or if a string is given, the layer name from Tiled.
    * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
    * @param x The x position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
    * @param y The y position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
    */
  def createDynamicLayer(layerID: integer, tileset: String): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: String, x: js.UndefOr[scala.Nothing], y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: String, x: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: String, x: Double, y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset]): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset], x: js.UndefOr[scala.Nothing], y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double, y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: Tileset): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: Tileset, x: js.UndefOr[scala.Nothing], y: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: Tileset, x: Double): DynamicTilemapLayer = js.native
  def createDynamicLayer(layerID: integer, tileset: Tileset, x: Double, y: Double): DynamicTilemapLayer = js.native
  def createFromObjects(name: String, id: String, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
  def createFromObjects(name: String, id: String, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
  /**
    * Creates a Sprite for every object matching the given gid in the map data. All properties from
    * the map data objectgroup are copied into the `spriteConfig`, so you can use this as an easy
    * way to configure Sprite properties from within the map editor. For example giving an object a
    * property of alpha: 0.5 in the map editor will duplicate that when the Sprite is created.
    * 
    * Custom object properties not sharing names with the Sprite's own properties are copied to the
    * Sprite's {@link Phaser.GameObjects.Sprite#data data store}.
    * @param name The name of the object layer (from Tiled) to create Sprites from.
    * @param id Either the id (object), gid (tile object) or name (object or
    * tile object) from Tiled. Ids are unique in Tiled, but a gid is shared by all tile objects
    * with the same graphic. The same name can be used on multiple objects.
    * @param spriteConfig The config object to pass into the Sprite creator (i.e.
    * scene.make.sprite).
    * @param scene The Scene to create the Sprites within. Default the scene the map is within.
    */
  def createFromObjects(name: String, id: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
  def createFromObjects(name: String, id: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
  /**
    * Creates a Sprite for every object matching the given tile indexes in the layer. You can
    * optionally specify if each tile will be replaced with a new tile after the Sprite has been
    * created. This is useful if you want to lay down special tiles in a level that are converted to
    * Sprites, but want to replace the tile itself with a floor tile or similar once converted.
    * @param indexes The tile index, or array of indexes, to create Sprites from.
    * @param replacements The tile index, or array of indexes, to change a converted
    * tile to. Set to `null` to leave the tiles unchanged. If an array is given, it is assumed to be a
    * one-to-one mapping with the indexes array.
    * @param spriteConfig The config object to pass into the Sprite creator (i.e. scene.make.sprite).
    * @param scene The Scene to create the Sprites within. Default scene the map is within.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def createFromTiles(
    indexes: integer | js.Array[_],
    replacements: integer | js.Array[_],
    spriteConfig: SpriteConfig,
    scene: js.UndefOr[Scene],
    camera: js.UndefOr[Camera],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): js.Array[Sprite] = js.native
  def createStaticLayer(layerID: String, tileset: String): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: String, x: js.UndefOr[scala.Nothing], y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: String, x: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: String, x: Double, y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset]): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset], x: js.UndefOr[scala.Nothing], y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double, y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: Tileset): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: Tileset, x: js.UndefOr[scala.Nothing], y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: Tileset, x: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: String, tileset: Tileset, x: Double, y: Double): StaticTilemapLayer = js.native
  /**
    * Creates a new StaticTilemapLayer that renders the LayerData associated with the given
    * `layerID`. The currently selected layer in the map is set to this new layer.
    * 
    * The `layerID` is important. If you've created your map in Tiled then you can get this by
    * looking in Tiled and looking at the layer name. Or you can open the JSON file it exports and
    * look at the layers[].name value. Either way it must match.
    * 
    * It's important to remember that a static layer cannot be modified. See StaticTilemapLayer for
    * more information.
    * @param layerID The layer array index value, or if a string is given, the layer name from Tiled.
    * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
    * @param x The x position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
    * @param y The y position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
    */
  def createStaticLayer(layerID: integer, tileset: String): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: String, x: js.UndefOr[scala.Nothing], y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: String, x: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: String, x: Double, y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset]): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset], x: js.UndefOr[scala.Nothing], y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double, y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: Tileset): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: Tileset, x: js.UndefOr[scala.Nothing], y: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: Tileset, x: Double): StaticTilemapLayer = js.native
  def createStaticLayer(layerID: integer, tileset: Tileset, x: Double, y: Double): StaticTilemapLayer = js.native
  /**
    * Removes all layer data from this Tilemap and nulls the scene reference. This will destroy any
    * StaticTilemapLayers or DynamicTilemapLayers that have been linked to LayerData.
    */
  def destroy(): Unit = js.native
  /**
    * Destroys the given TilemapLayer and removes it from this Tilemap.
    * 
    * If no layer specified, the map's current layer is used.
    * @param layer The tile layer to be destroyed.
    */
  def destroyLayer(): Tilemap = js.native
  def destroyLayer(layer: String): Tilemap = js.native
  def destroyLayer(layer: DynamicTilemapLayer): Tilemap = js.native
  def destroyLayer(layer: StaticTilemapLayer): Tilemap = js.native
  def destroyLayer(layer: integer): Tilemap = js.native
  /**
    * Sets the tiles in the given rectangular area (in tile coordinates) of the layer with the
    * specified index. Tiles will be set to collide if the given index is a colliding index.
    * Collision information in the region will be recalculated.
    * 
    * If no layer specified, the map's current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param index The tile index to fill the area with.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def fill(
    index: integer,
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    recalculateFaces: js.UndefOr[Boolean],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  def filterObjects(objectLayer: String, callback: TilemapFilterCallback): js.Array[GameObject] = js.native
  def filterObjects(objectLayer: String, callback: TilemapFilterCallback, context: js.Object): js.Array[GameObject] = js.native
  /**
    * For each object in the given object layer, run the given filter callback function. Any
    * objects that pass the filter test (i.e. where the callback returns true) will returned as a
    * new array. Similar to Array.prototype.Filter in vanilla JS.
    * @param objectLayer The name of an object layer (from Tiled) or an ObjectLayer instance.
    * @param callback The callback. Each object in the given area will be passed to this callback as the first and only parameter.
    * @param context The context under which the callback should be run.
    */
  def filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback): js.Array[GameObject] = js.native
  def filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback, context: js.Object): js.Array[GameObject] = js.native
  /**
    * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
    * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
    * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
    * If no layer specified, the map's current layer is used.
    * @param callback The callback. Each tile in the given area will be passed to this
    * callback as the first and only parameter. The callback should return true for tiles that pass the
    * filter.
    * @param context The context under which the callback should be run.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def filterTiles(
    callback: js.Function,
    context: js.UndefOr[js.Object],
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): js.Array[Tile] = js.native
  /**
    * Searches the entire map layer for the first tile matching the given index, then returns that Tile
    * object. If no match is found, it returns null. The search starts from the top-left tile and
    * continues horizontally until it hits the end of the row, then it drops down to the next column.
    * If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to
    * the top-left.
    * If no layer specified, the map's current layer is used.
    * @param index The tile index value to search for.
    * @param skip The number of times to skip a matching tile before returning. Default 0.
    * @param reverse If true it will scan the layer in reverse, starting at the bottom-right. Otherwise it scans from the top-left. Default false.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def findByIndex(index: integer): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: js.UndefOr[scala.Nothing], layer: String): Tile = js.native
  def findByIndex(
    index: integer,
    skip: js.UndefOr[scala.Nothing],
    reverse: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def findByIndex(
    index: integer,
    skip: js.UndefOr[scala.Nothing],
    reverse: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def findByIndex(
    index: integer,
    skip: js.UndefOr[scala.Nothing],
    reverse: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: Boolean): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: Boolean, layer: String): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: Boolean, layer: DynamicTilemapLayer): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: Boolean, layer: StaticTilemapLayer): Tile = js.native
  def findByIndex(index: integer, skip: js.UndefOr[scala.Nothing], reverse: Boolean, layer: integer): Tile = js.native
  def findByIndex(index: integer, skip: integer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: js.UndefOr[scala.Nothing], layer: String): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: js.UndefOr[scala.Nothing], layer: DynamicTilemapLayer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: js.UndefOr[scala.Nothing], layer: integer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: Boolean): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: String): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: DynamicTilemapLayer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: StaticTilemapLayer): Tile = js.native
  def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: integer): Tile = js.native
  def findObject(objectLayer: String, callback: TilemapFindCallback): GameObject = js.native
  def findObject(objectLayer: String, callback: TilemapFindCallback, context: js.Object): GameObject = js.native
  /**
    * Find the first object in the given object layer that satisfies the provided testing function.
    * I.e. finds the first object for which `callback` returns true. Similar to
    * Array.prototype.find in vanilla JS.
    * @param objectLayer The name of an object layer (from Tiled) or an ObjectLayer instance.
    * @param callback The callback. Each object in the given area will be passed to this callback as the first and only parameter.
    * @param context The context under which the callback should be run.
    */
  def findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback): GameObject = js.native
  def findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback, context: js.Object): GameObject = js.native
  /**
    * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
    * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
    * true. Similar to Array.prototype.find in vanilla JS.
    * If no layer specified, the maps current layer is used.
    * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
    * @param context The context under which the callback should be run.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param layer The Tile layer to run the search on. If not provided will use the current layer.
    */
  def findTile(
    callback: FindTileCallback,
    context: js.UndefOr[js.Object],
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tile = js.native
  /**
    * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
    * callback. Similar to Array.prototype.forEach in vanilla JS.
    * 
    * If no layer specified, the map's current layer is used.
    * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
    * @param context The context under which the callback should be run.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param layer The Tile layer to run the search on. If not provided will use the current layer.
    */
  def forEachTile(
    callback: EachTileCallback,
    context: js.UndefOr[js.Object],
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Gets the image layer index based on its name.
    * @param name The name of the image to get.
    */
  def getImageIndex(name: String): integer = js.native
  /**
    * Return a list of all valid imagelayer names loaded in this Tilemap.
    */
  def getImageLayerNames(): js.Array[String] = js.native
  /**
    * Internally used. Returns the index of the object in one of the Tilemaps arrays whose name
    * property matches the given `name`.
    * @param location The Tilemap array to search.
    * @param name The name of the array element to get.
    */
  def getIndex(location: js.Array[_], name: String): Double = js.native
  /**
    * Gets the LayerData from this.layers that is associated with `layer`, or null if an invalid
    * `layer` is given.
    * @param layer The name of the
    * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
    * StaticTilemapLayer. If not given will default to the maps current layer index.
    */
  def getLayer(): LayerData = js.native
  def getLayer(layer: String): LayerData = js.native
  def getLayer(layer: DynamicTilemapLayer): LayerData = js.native
  def getLayer(layer: StaticTilemapLayer): LayerData = js.native
  def getLayer(layer: integer): LayerData = js.native
  /**
    * Gets the LayerData index of the given `layer` within this.layers, or null if an invalid
    * `layer` is given.
    * @param layer The name of the
    * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
    * StaticTilemapLayer. If not given will default to the map's current layer index.
    */
  def getLayerIndex(): integer = js.native
  def getLayerIndex(layer: String): integer = js.native
  def getLayerIndex(layer: DynamicTilemapLayer): integer = js.native
  def getLayerIndex(layer: StaticTilemapLayer): integer = js.native
  def getLayerIndex(layer: integer): integer = js.native
  /**
    * Gets the index of the LayerData within this.layers that has the given `name`, or null if an
    * invalid `name` is given.
    * @param name The name of the layer to get.
    */
  def getLayerIndexByName(name: String): integer = js.native
  /**
    * Gets the ObjectLayer from this.objects that has the given `name`, or null if no ObjectLayer
    * is found with that name.
    * @param name The name of the object layer from Tiled.
    */
  def getObjectLayer(): ObjectLayer = js.native
  def getObjectLayer(name: String): ObjectLayer = js.native
  /**
    * Return a list of all valid objectgroup names loaded in this Tilemap.
    */
  def getObjectLayerNames(): js.Array[String] = js.native
  /**
    * Gets a tile at the given tile coordinates from the given layer.
    * If no layer specified, the map's current layer is used.
    * @param tileX X position to get the tile from (given in tile units, not pixels).
    * @param tileY Y position to get the tile from (given in tile units, not pixels).
    * @param nonNull If true getTile won't return null for empty tiles, but a Tile object with an index of -1. Default false.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def getTileAt(tileX: integer, tileY: integer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: js.UndefOr[scala.Nothing], layer: String): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: js.UndefOr[scala.Nothing], layer: DynamicTilemapLayer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: js.UndefOr[scala.Nothing], layer: integer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: String): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: DynamicTilemapLayer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: StaticTilemapLayer): Tile = js.native
  def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: integer): Tile = js.native
  /**
    * Gets a tile at the given world coordinates from the given layer.
    * If no layer specified, the map's current layer is used.
    * @param worldX X position to get the tile from (given in pixels)
    * @param worldY Y position to get the tile from (given in pixels)
    * @param nonNull If true, function won't return null for empty tiles, but a Tile object with an index of -1. Default false.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: js.UndefOr[scala.Nothing], camera: Camera): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: js.UndefOr[scala.Nothing], camera: Camera, layer: String): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: js.UndefOr[scala.Nothing], camera: Camera, layer: integer): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: js.UndefOr[scala.Nothing], layer: String): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def getTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    nonNull: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: String): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: DynamicTilemapLayer): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: StaticTilemapLayer): Tile = js.native
  def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: integer): Tile = js.native
  /**
    * Return a list of all valid tilelayer names loaded in this Tilemap.
    */
  def getTileLayerNames(): js.Array[String] = js.native
  /**
    * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
    * If no layer specified, the maps current layer is used.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def getTilesWithin(
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    filteringOptions: js.UndefOr[FilteringOptions],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): js.Array[Tile] = js.native
  /**
    * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
    * Line, Rectangle or Triangle. The shape should be in world coordinates.
    * If no layer specified, the maps current layer is used.
    * @param shape A shape in world (pixel) coordinates
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def getTilesWithinShape(
    shape: Circle | Line | Rectangle | Triangle,
    filteringOptions: js.UndefOr[FilteringOptions],
    camera: js.UndefOr[Camera],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): js.Array[Tile] = js.native
  /**
    * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
    * If no layer specified, the maps current layer is used.
    * @param worldX The world x coordinate for the top-left of the area.
    * @param worldY The world y coordinate for the top-left of the area.
    * @param width The width of the area.
    * @param height The height of the area.
    * @param filteringOptions Optional filters to apply when getting the tiles.
    * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: Camera
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: Camera
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: String
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: StaticTilemapLayer
  ): js.Array[Tile] = js.native
  def getTilesWithinWorldXY(
    worldX: Double,
    worldY: Double,
    width: Double,
    height: Double,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: integer
  ): js.Array[Tile] = js.native
  /**
    * Gets the Tileset that has the given `name`, or null if an invalid `name` is given.
    * @param name The name of the Tileset to get.
    */
  def getTileset(name: String): Tileset = js.native
  /**
    * Gets the index of the Tileset within this.tilesets that has the given `name`, or null if an
    * invalid `name` is given.
    * @param name The name of the Tileset to get.
    */
  def getTilesetIndex(name: String): integer = js.native
  /**
    * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
    * false if there is no tile or if the tile at that location has an index of -1.
    * 
    * If no layer specified, the map's current layer is used.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def hasTileAt(tileX: integer, tileY: integer): Boolean = js.native
  def hasTileAt(tileX: integer, tileY: integer, layer: String): Boolean = js.native
  def hasTileAt(tileX: integer, tileY: integer, layer: DynamicTilemapLayer): Boolean = js.native
  def hasTileAt(tileX: integer, tileY: integer, layer: StaticTilemapLayer): Boolean = js.native
  def hasTileAt(tileX: integer, tileY: integer, layer: integer): Boolean = js.native
  /**
    * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
    * false if there is no tile or if the tile at that location has an index of -1.
    * 
    * If no layer specified, the maps current layer is used.
    * @param worldX The x coordinate, in pixels.
    * @param worldY The y coordinate, in pixels.
    * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: js.UndefOr[scala.Nothing], layer: String): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: js.UndefOr[scala.Nothing], layer: DynamicTilemapLayer): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: js.UndefOr[scala.Nothing], layer: integer): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: String): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: DynamicTilemapLayer): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: StaticTilemapLayer): Boolean = js.native
  def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: integer): Boolean = js.native
  def putTileAt(tile: Tile, tileX: integer, tileY: integer): Tile = js.native
  def putTileAt(
    tile: Tile,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def putTileAt(
    tile: Tile,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAt(
    tile: Tile,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAt(
    tile: Tile,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean): Tile = js.native
  def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: String): Tile = js.native
  def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tile = js.native
  def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tile = js.native
  def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: integer): Tile = js.native
  /**
    * Puts a tile at the given tile coordinates in the specified layer. You can pass in either an index
    * or a Tile object. If you pass in a Tile, all attributes will be copied over to the specified
    * location. If you pass in an index, only the index at the specified location will be changed.
    * Collision information will be recalculated at the specified location.
    * 
    * If no layer specified, the maps current layer is used.
    * 
    * This cannot be applied to StaticTilemapLayers.
    * @param tile The index of this tile to set or a Tile object.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def putTileAt(tile: integer, tileX: integer, tileY: integer): Tile = js.native
  def putTileAt(
    tile: integer,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def putTileAt(
    tile: integer,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAt(
    tile: integer,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAt(
    tile: integer,
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean): Tile = js.native
  def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: String): Tile = js.native
  def putTileAt(
    tile: integer,
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAt(
    tile: integer,
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: integer): Tile = js.native
  def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): Tile = js.native
  def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: Tile,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: integer
  ): Tile = js.native
  /**
    * Puts a tile at the given world coordinates (pixels) in the specified layer. You can pass in either
    * an index or a Tile object. If you pass in a Tile, all attributes will be copied over to the
    * specified location. If you pass in an index, only the index at the specified location will be
    * changed. Collision information will be recalculated at the specified location.
    * 
    * If no layer specified, the maps current layer is used. This
    * cannot be applied to StaticTilemapLayers.
    * @param tile The index of this tile to set or a Tile object.
    * @param worldX The x coordinate, in pixels.
    * @param worldY The y coordinate, in pixels.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): Tile = js.native
  def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: String
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def putTileAtWorldXY(
    tile: integer,
    worldX: Double,
    worldY: Double,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: integer
  ): Tile = js.native
  /**
    * Puts an array of tiles or a 2D array of tiles at the given tile coordinates in the specified
    * layer. The array can be composed of either tile indexes or Tile objects. If you pass in a Tile,
    * all attributes will be copied over to the specified location. If you pass in an index, only the
    * index at the specified location will be changed. Collision information will be recalculated
    * within the region tiles were changed.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param tile A row (array) or grid (2D array) of Tiles or tile indexes to place.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def putTilesAt(tile: js.Array[(js.Array[Tile | integer]) | Tile | integer], tileX: integer, tileY: integer): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean,
    layer: String
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def putTilesAt(
    tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
    tileX: integer,
    tileY: integer,
    recalculateFaces: Boolean,
    layer: integer
  ): Tilemap = js.native
  /**
    * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
    * specified layer. Each tile will receive a new index. If an array of indexes is passed in, then
    * those will be used for randomly assigning new tile indexes. If an array is not provided, the
    * indexes found within the region (excluding -1) will be used for randomly assigning new tile
    * indexes. This method only modifies tile indexes and does not change collision information.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param indexes An array of indexes to randomly draw from during randomization.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def randomize(
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    indexes: js.UndefOr[js.Array[integer]],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Removes all layers from this Tilemap and destroys any associated StaticTilemapLayers or
    * DynamicTilemapLayers.
    */
  def removeAllLayers(): Tilemap = js.native
  /**
    * Removes the given TilemapLayer from this Tilemap without destroying it.
    * 
    * If no layer specified, the map's current layer is used.
    * @param layer The tile layer to be removed.
    */
  def removeLayer(): Tilemap = js.native
  def removeLayer(layer: String): Tilemap = js.native
  def removeLayer(layer: DynamicTilemapLayer): Tilemap = js.native
  def removeLayer(layer: StaticTilemapLayer): Tilemap = js.native
  def removeLayer(layer: integer): Tilemap = js.native
  def removeTile(tiles: js.Array[Tile]): js.Array[Tile] = js.native
  def removeTile(tiles: js.Array[Tile], replaceIndex: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): js.Array[Tile] = js.native
  def removeTile(tiles: js.Array[Tile], replaceIndex: integer): js.Array[Tile] = js.native
  def removeTile(tiles: js.Array[Tile], replaceIndex: integer, recalculateFaces: Boolean): js.Array[Tile] = js.native
  /**
    * Removes the given Tile, or an array of Tiles, from the layer to which they belong,
    * and optionally recalculates the collision information.
    * 
    * This cannot be applied to Tiles that belong to Static Tilemap Layers.
    * @param tiles The Tile to remove, or an array of Tiles.
    * @param replaceIndex After removing the Tile, insert a brand new Tile into its location with the given index. Leave as -1 to just remove the tile. Default -1.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    */
  def removeTile(tiles: Tile): js.Array[Tile] = js.native
  def removeTile(tiles: Tile, replaceIndex: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): js.Array[Tile] = js.native
  def removeTile(tiles: Tile, replaceIndex: integer): js.Array[Tile] = js.native
  def removeTile(tiles: Tile, replaceIndex: integer, recalculateFaces: Boolean): js.Array[Tile] = js.native
  /**
    * Removes the tile at the given tile coordinates in the specified layer and updates the layer's
    * collision information.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def removeTileAt(tileX: integer, tileY: integer): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: String
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: integer
  ): Tile = js.native
  def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
  def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean, recalculateFaces: Boolean, layer: String): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAt(
    tileX: integer,
    tileY: integer,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    layer: integer
  ): Tile = js.native
  /**
    * Removes the tile at the given world coordinates in the specified layer and updates the layer's
    * collision information.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param worldX The x coordinate, in pixels.
    * @param worldY The y coordinate, in pixels.
    * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
    * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def removeTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: Camera
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: Camera,
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    camera: Camera,
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: Camera
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: String
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: StaticTilemapLayer
  ): Tile = js.native
  def removeTileAtWorldXY(
    worldX: Double,
    worldY: Double,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: integer
  ): Tile = js.native
  /**
    * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
    * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
    * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
    * wherever you want on the screen.
    * 
    * If no layer specified, the maps current layer is used.
    * @param graphics The target Graphics object to draw upon.
    * @param styleConfig An object specifying the colors to use for the debug drawing.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def renderDebug(graphics: Graphics, styleConfig: StyleConfig): Tilemap = js.native
  def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: String): Tilemap = js.native
  def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: DynamicTilemapLayer): Tilemap = js.native
  def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: StaticTilemapLayer): Tilemap = js.native
  def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: integer): Tilemap = js.native
  /**
    * Draws a debug representation of all layers within this Tilemap to the given Graphics object.
    * 
    * This is helpful when you want to get a quick idea of which of your tiles are colliding and which
    * have interesting faces. The tiles are drawn starting at (0, 0) in the Graphics, allowing you to
    * place the debug representation wherever you want on the screen.
    * @param graphics The target Graphics object to draw upon.
    * @param styleConfig An object specifying the colors to use for the debug drawing.
    */
  def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig): Tilemap = js.native
  /**
    * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
    * `findIndex` and updates their index to match `newIndex`. This only modifies the index and does
    * not change collision information.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param findIndex The index of the tile to search for.
    * @param newIndex The index of the tile to replace it with.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def replaceByIndex(
    findIndex: integer,
    newIndex: integer,
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Sets the base tile size for the map. Note: this does not necessarily match the tileWidth and
    * tileHeight for all layers. This also updates the base size on all tiles across all layers.
    * @param tileWidth The width of the tiles the map uses for calculations.
    * @param tileHeight The height of the tiles the map uses for calculations.
    */
  def setBaseTileSize(tileWidth: integer, tileHeight: integer): Tilemap = js.native
  /**
    * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
    * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
    * collision will be enabled (true) or disabled (false).
    * 
    * If no layer specified, the map's current layer is used.
    * @param indexes Either a single tile index, or an array of tile indexes.
    * @param collides If true it will enable collision. If false it will clear collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    * @param updateLayer If true, updates the current tiles on the layer. Set to false if no tiles have been placed for significant performance boost. Default true.
    */
  def setCollision(
    indexes: integer | js.Array[_],
    collides: js.UndefOr[Boolean],
    recalculateFaces: js.UndefOr[Boolean],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer],
    updateLayer: js.UndefOr[Boolean]
  ): Tilemap = js.native
  /**
    * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
    * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
    * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
    * enabled (true) or disabled (false).
    * 
    * If no layer specified, the map's current layer is used.
    * @param start The first index of the tile to be set for collision.
    * @param stop The last index of the tile to be set for collision.
    * @param collides If true it will enable collision. If false it will clear collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def setCollisionBetween(start: integer, stop: integer): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: String
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: integer
  ): Tilemap = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: Boolean): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(
    start: integer,
    stop: integer,
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
  /**
    * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
    * the given array. The `collides` parameter controls if collision will be enabled (true) or
    * disabled (false). Tile indexes not currently in the layer are not affected.
    * 
    * If no layer specified, the map's current layer is used.
    * @param indexes An array of the tile indexes to not be counted for collision.
    * @param collides If true it will enable collision. If false it will clear collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def setCollisionByExclusion(indexes: js.Array[integer]): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: String
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: integer
  ): Tilemap = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(
    indexes: js.Array[integer],
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
  /**
    * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
    * that matches the given properties object, its collision flag will be set. The `collides`
    * parameter controls if collision will be enabled (true) or disabled (false). Passing in
    * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
    * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
    * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
    * "types" property that matches any of those values, its collision flag will be updated.
    * 
    * If no layer specified, the map's current layer is used.
    * @param properties An object with tile properties and corresponding values that should be checked.
    * @param collides If true it will enable collision. If false it will clear collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def setCollisionByProperty(properties: js.Object): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: String
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: Boolean,
    layer: integer
  ): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionByProperty(
    properties: js.Object,
    collides: Boolean,
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
  def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
  /**
    * Sets collision on the tiles within a layer by checking each tile's collision group data
    * (typically defined in Tiled within the tileset collision editor). If any objects are found within
    * a tile's collision group, the tile's colliding information will be set. The `collides` parameter
    * controls if collision will be enabled (true) or disabled (false).
    * 
    * If no layer specified, the map's current layer is used.
    * @param collides If true it will enable collision. If false it will clear collision. Default true.
    * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def setCollisionFromCollisionGroup(): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: js.UndefOr[scala.Nothing], layer: String): Tilemap = js.native
  def setCollisionFromCollisionGroup(
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setCollisionFromCollisionGroup(
    collides: js.UndefOr[scala.Nothing],
    recalculateFaces: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: js.UndefOr[scala.Nothing], layer: integer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean, layer: String): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: js.UndefOr[scala.Nothing], recalculateFaces: Boolean, layer: integer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: js.UndefOr[scala.Nothing], layer: String): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: js.UndefOr[scala.Nothing], layer: DynamicTilemapLayer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: js.UndefOr[scala.Nothing], layer: integer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
  def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
  /**
    * Sets the current layer to the LayerData associated with `layer`.
    * @param layer The name of the
    * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
    * StaticTilemapLayer. If not given will default to the map's current layer index.
    */
  def setLayer(): Tilemap = js.native
  def setLayer(layer: String): Tilemap = js.native
  def setLayer(layer: DynamicTilemapLayer): Tilemap = js.native
  def setLayer(layer: StaticTilemapLayer): Tilemap = js.native
  def setLayer(layer: integer): Tilemap = js.native
  /**
    * Sets the tile size for a specific `layer`. Note: this does not necessarily match the map's
    * tileWidth and tileHeight for all layers. This will set the tile size for the layer and any
    * tiles the layer has.
    * @param tileWidth The width of the tiles (in pixels) in the layer.
    * @param tileHeight The height of the tiles (in pixels) in the layer.
    * @param layer The name of the
    * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
    * StaticTilemapLayer. If not given will default to the map's current layer index.
    */
  def setLayerTileSize(tileWidth: integer, tileHeight: integer): Tilemap = js.native
  def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: String): Tilemap = js.native
  def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: DynamicTilemapLayer): Tilemap = js.native
  def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: StaticTilemapLayer): Tilemap = js.native
  def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: integer): Tilemap = js.native
  def setRenderOrder(renderOrder: String): this.type = js.native
  /**
    * Sets the rendering (draw) order of the tiles in this map.
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
    * 
    * Calling this method _after_ creating Static or Dynamic Tilemap Layers will **not** automatically
    * update them to use the new render order. If you call this method after creating layers, use their
    * own `setRenderOrder` methods to change them as needed.
    * @param renderOrder The render (draw) order value. Either an integer between 0 and 3, or a string: 'right-down', 'left-down', 'right-up' or 'left-up'.
    */
  def setRenderOrder(renderOrder: integer): this.type = js.native
  def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object): Tilemap = js.native
  def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object, layer: String): Tilemap = js.native
  def setTileIndexCallback(
    indexes: js.Array[_],
    callback: js.Function,
    callbackContext: js.Object,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object, layer: StaticTilemapLayer): Tilemap = js.native
  def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object, layer: integer): Tilemap = js.native
  /**
    * Sets a global collision callback for the given tile index within the layer. This will affect all
    * tiles on this layer that have the same index. If a callback is already set for the tile index it
    * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
    * at a specific location on the map then see setTileLocationCallback.
    * 
    * If no layer specified, the map's current layer is used.
    * @param indexes Either a single tile index, or an array of tile indexes to have a collision callback set for.
    * @param callback The callback that will be invoked when the tile is collided with.
    * @param callbackContext The context under which the callback is called.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object): Tilemap = js.native
  def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: String): Tilemap = js.native
  def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: DynamicTilemapLayer): Tilemap = js.native
  def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: StaticTilemapLayer): Tilemap = js.native
  def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: integer): Tilemap = js.native
  /**
    * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
    * If a callback is already set for the tile index it will be replaced. Set the callback to null to
    * remove it.
    * 
    * If no layer specified, the map's current layer is used.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
    * @param width How many tiles wide from the `tileX` index the area will be.
    * @param height How many tiles tall from the `tileY` index the area will be.
    * @param callback The callback that will be invoked when the tile is collided with.
    * @param callbackContext The context under which the callback is called.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: js.Function): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.UndefOr[scala.Nothing],
    layer: String
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.UndefOr[scala.Nothing],
    layer: integer
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.Object
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.Object,
    layer: String
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.Object,
    layer: DynamicTilemapLayer
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.Object,
    layer: StaticTilemapLayer
  ): Tilemap = js.native
  def setTileLocationCallback(
    tileX: integer,
    tileY: integer,
    width: integer,
    height: integer,
    callback: js.Function,
    callbackContext: js.Object,
    layer: integer
  ): Tilemap = js.native
  /**
    * Shuffles the tiles in a rectangular region (specified in tile coordinates) within the given
    * layer. It will only randomize the tiles in that area, so if they're all the same nothing will
    * appear to have changed! This method only modifies tile indexes and does not change collision
    * information.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def shuffle(
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
    * `indexA` and swaps then with `indexB`. This only modifies the index and does not change collision
    * information.
    * 
    * If no layer specified, the maps current layer is used.
    * This cannot be applied to StaticTilemapLayers.
    * @param tileA First tile index.
    * @param tileB Second tile index.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def swapByIndex(
    tileA: integer,
    tileB: integer,
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
    * layers position, scale and scroll.
    * 
    * If no layer specified, the maps current layer is used.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def tileToWorldX(tileX: integer): Double = js.native
  def tileToWorldX(tileX: integer, camera: js.UndefOr[scala.Nothing], layer: String): Double = js.native
  def tileToWorldX(tileX: integer, camera: js.UndefOr[scala.Nothing], layer: DynamicTilemapLayer): Double = js.native
  def tileToWorldX(tileX: integer, camera: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Double = js.native
  def tileToWorldX(tileX: integer, camera: js.UndefOr[scala.Nothing], layer: integer): Double = js.native
  def tileToWorldX(tileX: integer, camera: Camera): Double = js.native
  def tileToWorldX(tileX: integer, camera: Camera, layer: String): Double = js.native
  def tileToWorldX(tileX: integer, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
  def tileToWorldX(tileX: integer, camera: Camera, layer: StaticTilemapLayer): Double = js.native
  def tileToWorldX(tileX: integer, camera: Camera, layer: integer): Double = js.native
  /**
    * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
    * layers position, scale and scroll. This will return a new Vector2 object or update the given
    * `point` object.
    * 
    * If no layer specified, the maps current layer is used.
    * @param tileX The x coordinate, in tiles, not pixels.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def tileToWorldXY(tileX: integer, tileY: integer): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: js.UndefOr[scala.Nothing], camera: Camera): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: js.UndefOr[scala.Nothing], camera: Camera, layer: String): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: js.UndefOr[scala.Nothing], camera: Camera, layer: integer): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: js.UndefOr[scala.Nothing], layer: String): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def tileToWorldXY(
    tileX: integer,
    tileY: integer,
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: js.UndefOr[scala.Nothing], layer: integer): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: String): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: DynamicTilemapLayer): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: StaticTilemapLayer): Vector2 = js.native
  def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: integer): Vector2 = js.native
  /**
    * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
    * layers position, scale and scroll.
    * 
    * If no layer specified, the maps current layer is used.
    * @param tileY The y coordinate, in tiles, not pixels.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer
    * to use. If not given the current layer is used.
    */
  def tileToWorldY(tileY: integer): Double = js.native
  def tileToWorldY(tileY: integer, camera: js.UndefOr[scala.Nothing], layer: String): Double = js.native
  def tileToWorldY(tileY: integer, camera: js.UndefOr[scala.Nothing], layer: DynamicTilemapLayer): Double = js.native
  def tileToWorldY(tileY: integer, camera: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Double = js.native
  def tileToWorldY(tileY: integer, camera: js.UndefOr[scala.Nothing], layer: integer): Double = js.native
  def tileToWorldY(tileY: integer, camera: Camera): Double = js.native
  def tileToWorldY(tileY: integer, camera: Camera, layer: String): Double = js.native
  def tileToWorldY(tileY: integer, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
  def tileToWorldY(tileY: integer, camera: Camera, layer: StaticTilemapLayer): Double = js.native
  def tileToWorldY(tileY: integer, camera: Camera, layer: integer): Double = js.native
  /**
    * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
    * specified layer. Each tile will receive a new index. New indexes are drawn from the given
    * weightedIndexes array. An example weighted array:
    * 
    * [
    *  { index: 6, weight: 4 },    // Probability of index 6 is 4 / 8
    *  { index: 7, weight: 2 },    // Probability of index 7 would be 2 / 8
    *  { index: 8, weight: 1.5 },  // Probability of index 8 would be 1.5 / 8
    *  { index: 26, weight: 0.5 }  // Probability of index 27 would be 0.5 / 8
    * ]
    * 
    * The probability of any index being choose is (the index's weight) / (sum of all weights). This
    * method only modifies tile indexes and does not change collision information.
    * 
    * If no layer specified, the map's current layer is used. This
    * cannot be applied to StaticTilemapLayers.
    * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
    * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
    * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
    * @param weightedIndexes An array of objects to randomly draw from during
    * randomization. They should be in the form: { index: 0, weight: 4 } or
    * { index: [0, 1], weight: 4 } if you wish to draw from multiple tile indexes.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def weightedRandomize(
    tileX: js.UndefOr[integer],
    tileY: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    weightedIndexes: js.UndefOr[js.Array[js.Object]],
    layer: js.UndefOr[String | integer | DynamicTilemapLayer | StaticTilemapLayer]
  ): Tilemap = js.native
  /**
    * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
    * layers position, scale and scroll.
    * 
    * If no layer specified, the maps current layer is used.
    * @param worldX The x coordinate to be converted, in pixels, not tiles.
    * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer
    * to use. If not given the current layer is used.
    */
  def worldToTileX(worldX: Double): Double = js.native
  def worldToTileX(
    worldX: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Double = js.native
  def worldToTileX(
    worldX: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Double = js.native
  def worldToTileX(
    worldX: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Double = js.native
  def worldToTileX(
    worldX: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: String): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: DynamicTilemapLayer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: StaticTilemapLayer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: integer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: js.UndefOr[scala.Nothing], layer: String): Double = js.native
  def worldToTileX(
    worldX: Double,
    snapToFloor: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: js.UndefOr[scala.Nothing], layer: integer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: String): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: StaticTilemapLayer): Double = js.native
  def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: integer): Double = js.native
  /**
    * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
    * layers position, scale and scroll. This will return a new Vector2 object or update the given
    * `point` object.
    * 
    * If no layer specified, the maps current layer is used.
    * @param worldX The x coordinate to be converted, in pixels, not tiles.
    * @param worldY The y coordinate to be converted, in pixels, not tiles.
    * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
    * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], point: Vector2): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: Camera
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: Camera,
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: Camera,
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    point: Vector2,
    camera: Camera,
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: Camera
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: js.UndefOr[scala.Nothing],
    camera: Camera,
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Vector2 = js.native
  def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2, camera: Camera): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: String
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: DynamicTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: StaticTilemapLayer
  ): Vector2 = js.native
  def worldToTileXY(
    worldX: Double,
    worldY: Double,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: integer
  ): Vector2 = js.native
  /**
    * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
    * layers position, scale and scroll.
    * 
    * If no layer specified, the maps current layer is used.
    * @param worldY The y coordinate to be converted, in pixels, not tiles.
    * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
    * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
    * @param layer The tile layer to use. If not given the current layer is used.
    */
  def worldToTileY(worldY: Double): Double = js.native
  def worldToTileY(
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: String
  ): Double = js.native
  def worldToTileY(
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Double = js.native
  def worldToTileY(
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: StaticTilemapLayer
  ): Double = js.native
  def worldToTileY(
    worldY: Double,
    snapToFloor: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[scala.Nothing],
    layer: integer
  ): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: String): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: DynamicTilemapLayer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: StaticTilemapLayer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: js.UndefOr[scala.Nothing], camera: Camera, layer: integer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: js.UndefOr[scala.Nothing], layer: String): Double = js.native
  def worldToTileY(
    worldY: Double,
    snapToFloor: Boolean,
    camera: js.UndefOr[scala.Nothing],
    layer: DynamicTilemapLayer
  ): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: js.UndefOr[scala.Nothing], layer: StaticTilemapLayer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: js.UndefOr[scala.Nothing], layer: integer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: String): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: StaticTilemapLayer): Double = js.native
  def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: integer): Double = js.native
}

