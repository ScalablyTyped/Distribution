package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.GameObjects.Container
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Tilemaps.LayerData
import typings.phaser.Phaser.Tilemaps.Orientation
import typings.phaser.Phaser.Tilemaps.TilemapLayer
import typings.phaser.Phaser.Tilemaps.Tileset
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tilemaps {
  
  trait CreateFromObjectLayerConfig extends StObject {
    
    /**
      * A custom class type to convert the objects in to. The default is {@link Phaser.GameObjects.Sprite}. A custom class should resemble Sprite or Image; see {@link Phaser.Types.Tilemaps.CreateFromObjectsClassTypeConstructor}.
      */
    var classType: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Optional Container to which the Game Objects are added.
      */
    var container: js.UndefOr[Container] = js.undefined
    
    /**
      * Optional name or index of the frame within the Texture. If omitted, the tileset index is used, assuming that spritesheet frames exactly match tileset indices & geometries -- if available.
      */
    var frame: js.UndefOr[String | Double] = js.undefined
    
    /**
      * An Object GID to convert.
      */
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      * A unique Object ID to convert.
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, gid-based objects copy properties and respect the type of the tile at that gid and treat the object as an override. If this is true, they don't, and use only the fields set on the object itself.
      */
    var ignoreTileset: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional key of a Texture to be used, as stored in the Texture Manager, or a Texture instance. If omitted, the object's gid's tileset key is used if available.
      */
    var key: js.UndefOr[String | Texture] = js.undefined
    
    /**
      * An Object Name to convert.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A Scene reference, passed to the Game Objects constructors.
      */
    var scene: js.UndefOr[Scene] = js.undefined
    
    /**
      * An Object Type to convert.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateFromObjectLayerConfig {
    
    inline def apply(): CreateFromObjectLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateFromObjectLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateFromObjectLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setClassType(value: js.Function): Self = StObject.set(x, "classType", value.asInstanceOf[js.Any])
      
      inline def setClassTypeUndefined: Self = StObject.set(x, "classType", js.undefined)
      
      inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIgnoreTileset(value: Boolean): Self = StObject.set(x, "ignoreTileset", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTilesetUndefined: Self = StObject.set(x, "ignoreTileset", js.undefined)
      
      inline def setKey(value: String | Texture): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type CreateFromObjectsClassTypeConstructor = js.Function1[/* scene */ Scene, Unit]
  
  trait DebugStyleOptions extends StObject {
    
    /**
      * Color to use for drawing a filled
      * rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
      */
    @JSName("styleConfig.collidingTileColor")
    var styleConfigDotcollidingTileColor: js.UndefOr[Color | Null] = js.undefined
    
    /**
      * Color to use for drawing a line at interesting
      * tile faces. If set to null, interesting tile faces will not be drawn.
      */
    @JSName("styleConfig.faceColor")
    var styleConfigDotfaceColor: js.UndefOr[Color | Null] = js.undefined
    
    /**
      * Color to use for drawing a filled rectangle at
      * non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
      */
    @JSName("styleConfig.tileColor")
    var styleConfigDottileColor: js.UndefOr[Color | Null] = js.undefined
  }
  object DebugStyleOptions {
    
    inline def apply(): DebugStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebugStyleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugStyleOptions] (val x: Self) extends AnyVal {
      
      inline def setStyleConfigDotcollidingTileColor(value: Color): Self = StObject.set(x, "styleConfig.collidingTileColor", value.asInstanceOf[js.Any])
      
      inline def setStyleConfigDotcollidingTileColorNull: Self = StObject.set(x, "styleConfig.collidingTileColor", null)
      
      inline def setStyleConfigDotcollidingTileColorUndefined: Self = StObject.set(x, "styleConfig.collidingTileColor", js.undefined)
      
      inline def setStyleConfigDotfaceColor(value: Color): Self = StObject.set(x, "styleConfig.faceColor", value.asInstanceOf[js.Any])
      
      inline def setStyleConfigDotfaceColorNull: Self = StObject.set(x, "styleConfig.faceColor", null)
      
      inline def setStyleConfigDotfaceColorUndefined: Self = StObject.set(x, "styleConfig.faceColor", js.undefined)
      
      inline def setStyleConfigDottileColor(value: Color): Self = StObject.set(x, "styleConfig.tileColor", value.asInstanceOf[js.Any])
      
      inline def setStyleConfigDottileColorNull: Self = StObject.set(x, "styleConfig.tileColor", null)
      
      inline def setStyleConfigDottileColorUndefined: Self = StObject.set(x, "styleConfig.tileColor", js.undefined)
    }
  }
  
  trait FilteringOptions extends StObject {
    
    /**
      * If true, only return tiles that have at least one interesting face.
      */
    var hasInterestingFace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, only return tiles that collide on at least one side.
      */
    var isColliding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, only return tiles that don't have -1 for an index.
      */
    var isNotEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object FilteringOptions {
    
    inline def apply(): FilteringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilteringOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilteringOptions] (val x: Self) extends AnyVal {
      
      inline def setHasInterestingFace(value: Boolean): Self = StObject.set(x, "hasInterestingFace", value.asInstanceOf[js.Any])
      
      inline def setHasInterestingFaceUndefined: Self = StObject.set(x, "hasInterestingFace", js.undefined)
      
      inline def setIsColliding(value: Boolean): Self = StObject.set(x, "isColliding", value.asInstanceOf[js.Any])
      
      inline def setIsCollidingUndefined: Self = StObject.set(x, "isColliding", js.undefined)
      
      inline def setIsNotEmpty(value: Boolean): Self = StObject.set(x, "isNotEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsNotEmptyUndefined: Self = StObject.set(x, "isNotEmpty", js.undefined)
    }
  }
  
  trait GIDData extends StObject {
    
    /**
      * Is flipped?
      */
    var flipped: Boolean
    
    /**
      * Diagonal flip flag.
      */
    var flippedAntiDiagonal: Boolean
    
    /**
      * Horizontal flip flag.
      */
    var flippedHorizontal: Boolean
    
    /**
      * Vertical flip flag.
      */
    var flippedVertical: Boolean
    
    /**
      * The Tiled GID.
      */
    var gid: Double
    
    /**
      * Amount of rotation.
      */
    var rotation: Double
  }
  object GIDData {
    
    inline def apply(
      flipped: Boolean,
      flippedAntiDiagonal: Boolean,
      flippedHorizontal: Boolean,
      flippedVertical: Boolean,
      gid: Double,
      rotation: Double
    ): GIDData = {
      val __obj = js.Dynamic.literal(flipped = flipped.asInstanceOf[js.Any], flippedAntiDiagonal = flippedAntiDiagonal.asInstanceOf[js.Any], flippedHorizontal = flippedHorizontal.asInstanceOf[js.Any], flippedVertical = flippedVertical.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[GIDData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GIDData] (val x: Self) extends AnyVal {
      
      inline def setFlipped(value: Boolean): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
      
      inline def setFlippedAntiDiagonal(value: Boolean): Self = StObject.set(x, "flippedAntiDiagonal", value.asInstanceOf[js.Any])
      
      inline def setFlippedHorizontal(value: Boolean): Self = StObject.set(x, "flippedHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlippedVertical(value: Boolean): Self = StObject.set(x, "flippedVertical", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayerDataConfig extends StObject {
    
    /**
      * The alpha value of the layer.
      */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * The base tile height.
      */
    var baseTileHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The base tile width.
      */
    var baseTileWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of physics bodies.
      */
    var bodies: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * An array of callbacks.
      */
    var callbacks: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Tile Collision ID index map.
      */
    var collideIndexes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * An array of the tile data indexes.
      */
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The height of the layer in tiles.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The height in pixels of the entire layer.
      */
    var heightInPixels: js.UndefOr[Double] = js.undefined
    
    /**
      * Tile ID index map.
      */
    var indexes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The name of the layer, if specified in Tiled.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Layer specific properties (can be specified in Tiled)
      */
    var properties: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * The pixel height of the tiles.
      */
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The pixel width of the tiles.
      */
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * A reference to the Tilemap layer that owns this data.
      */
    var tilemapLayer: js.UndefOr[TilemapLayer] = js.undefined
    
    /**
      * Is the layer visible or not?
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The width of the layer in tiles.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * The width in pixels of the entire layer.
      */
    var widthInPixels: js.UndefOr[Double] = js.undefined
    
    /**
      * The x offset of where to draw from the top left.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The y offset of where to draw from the top left.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object LayerDataConfig {
    
    inline def apply(): LayerDataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerDataConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerDataConfig] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBaseTileHeight(value: Double): Self = StObject.set(x, "baseTileHeight", value.asInstanceOf[js.Any])
      
      inline def setBaseTileHeightUndefined: Self = StObject.set(x, "baseTileHeight", js.undefined)
      
      inline def setBaseTileWidth(value: Double): Self = StObject.set(x, "baseTileWidth", value.asInstanceOf[js.Any])
      
      inline def setBaseTileWidthUndefined: Self = StObject.set(x, "baseTileWidth", js.undefined)
      
      inline def setBodies(value: js.Array[Any]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
      
      inline def setBodiesUndefined: Self = StObject.set(x, "bodies", js.undefined)
      
      inline def setBodiesVarargs(value: Any*): Self = StObject.set(x, "bodies", js.Array(value*))
      
      inline def setCallbacks(value: js.Array[Any]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCallbacksVarargs(value: Any*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setCollideIndexes(value: js.Array[Any]): Self = StObject.set(x, "collideIndexes", value.asInstanceOf[js.Any])
      
      inline def setCollideIndexesUndefined: Self = StObject.set(x, "collideIndexes", js.undefined)
      
      inline def setCollideIndexesVarargs(value: Any*): Self = StObject.set(x, "collideIndexes", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightInPixels(value: Double): Self = StObject.set(x, "heightInPixels", value.asInstanceOf[js.Any])
      
      inline def setHeightInPixelsUndefined: Self = StObject.set(x, "heightInPixels", js.undefined)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndexes(value: js.Array[Any]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      inline def setIndexesVarargs(value: Any*): Self = StObject.set(x, "indexes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: js.Array[js.Object]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: js.Object*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTilemapLayer(value: TilemapLayer): Self = StObject.set(x, "tilemapLayer", value.asInstanceOf[js.Any])
      
      inline def setTilemapLayerUndefined: Self = StObject.set(x, "tilemapLayer", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthInPixels(value: Double): Self = StObject.set(x, "widthInPixels", value.asInstanceOf[js.Any])
      
      inline def setWidthInPixelsUndefined: Self = StObject.set(x, "widthInPixels", js.undefined)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait MapDataConfig extends StObject {
    
    /**
      * An object of Tiled Object Layers.
      */
    var collision: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The format of the Tilemap, as defined in Tiled.
      */
    var format: js.UndefOr[Double] = js.undefined
    
    /**
      * The height of the entire tilemap.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The height in pixels of the entire tilemap.
      */
    var heightInPixels: js.UndefOr[Double] = js.undefined
    
    /**
      * The collection of images the map uses(specified in Tiled).
      */
    var imageCollections: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * An array with all the layers configured to the MapData.
      */
    var images: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The layers of the tilemap.
      */
    var layers: js.UndefOr[js.Array[LayerData]] = js.undefined
    
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * An array of Tiled Image Layers.
      */
    var objects: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
      */
    var orientation: js.UndefOr[String | Orientation] = js.undefined
    
    /**
      * Map specific properties (can be specified in Tiled).
      */
    var properties: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines the draw order of tilemap. Default is right-down.
      */
    var renderOrder: js.UndefOr[String] = js.undefined
    
    /**
      * The height of the tiles.
      */
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the tiles.
      */
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of Tile instances.
      */
    var tiles: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The tilesets the map uses.
      */
    var tilesets: js.UndefOr[js.Array[Tileset]] = js.undefined
    
    /**
      * The version of Tiled the map uses.
      */
    var version: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the entire tilemap.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * The width in pixels of the entire tilemap.
      */
    var widthInPixels: js.UndefOr[Double] = js.undefined
  }
  object MapDataConfig {
    
    inline def apply(): MapDataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapDataConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapDataConfig] (val x: Self) extends AnyVal {
      
      inline def setCollision(value: js.Object): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightInPixels(value: Double): Self = StObject.set(x, "heightInPixels", value.asInstanceOf[js.Any])
      
      inline def setHeightInPixelsUndefined: Self = StObject.set(x, "heightInPixels", js.undefined)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageCollections(value: js.Array[Any]): Self = StObject.set(x, "imageCollections", value.asInstanceOf[js.Any])
      
      inline def setImageCollectionsUndefined: Self = StObject.set(x, "imageCollections", js.undefined)
      
      inline def setImageCollectionsVarargs(value: Any*): Self = StObject.set(x, "imageCollections", js.Array(value*))
      
      inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setLayers(value: js.Array[LayerData]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: LayerData*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setObjects(value: js.Object): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setOrientation(value: String | Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setProperties(value: Double): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRenderOrder(value: String): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTiles(value: js.Array[Any]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
      
      inline def setTilesVarargs(value: Any*): Self = StObject.set(x, "tiles", js.Array(value*))
      
      inline def setTilesets(value: js.Array[Tileset]): Self = StObject.set(x, "tilesets", value.asInstanceOf[js.Any])
      
      inline def setTilesetsUndefined: Self = StObject.set(x, "tilesets", js.undefined)
      
      inline def setTilesetsVarargs(value: Tileset*): Self = StObject.set(x, "tilesets", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthInPixels(value: Double): Self = StObject.set(x, "widthInPixels", value.asInstanceOf[js.Any])
      
      inline def setWidthInPixelsUndefined: Self = StObject.set(x, "widthInPixels", js.undefined)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ObjectLayerConfig extends StObject {
    
    /**
      * The name of the Object Layer.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * An array of all objects on this Object Layer.
      */
    var objects: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The opacity of the layer, between 0 and 1.
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The custom properties defined on the Object Layer, keyed by their name.
      */
    var properties: js.UndefOr[Any] = js.undefined
    
    /**
      * The type of each custom property defined on the Object Layer, keyed by its name.
      */
    var propertytypes: js.UndefOr[Any] = js.undefined
    
    /**
      * The type of the layer, which should be `objectgroup`.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the layer is shown (`true`) or hidden (`false`).
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ObjectLayerConfig {
    
    inline def apply(): ObjectLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectLayerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectLayerConfig] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertytypes(value: Any): Self = StObject.set(x, "propertytypes", value.asInstanceOf[js.Any])
      
      inline def setPropertytypesUndefined: Self = StObject.set(x, "propertytypes", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait StyleConfig extends StObject {
    
    /**
      * Color to use for drawing a filled rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
      */
    var collidingTileColor: js.UndefOr[Color | Double | Null] = js.undefined
    
    /**
      * Color to use for drawing a line at interesting tile faces. If set to null, interesting tile faces will not be drawn.
      */
    var faceColor: js.UndefOr[Color | Double | Null] = js.undefined
    
    /**
      * Color to use for drawing a filled rectangle at non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
      */
    var tileColor: js.UndefOr[Color | Double | Null] = js.undefined
  }
  object StyleConfig {
    
    inline def apply(): StyleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleConfig] (val x: Self) extends AnyVal {
      
      inline def setCollidingTileColor(value: Color | Double): Self = StObject.set(x, "collidingTileColor", value.asInstanceOf[js.Any])
      
      inline def setCollidingTileColorNull: Self = StObject.set(x, "collidingTileColor", null)
      
      inline def setCollidingTileColorUndefined: Self = StObject.set(x, "collidingTileColor", js.undefined)
      
      inline def setFaceColor(value: Color | Double): Self = StObject.set(x, "faceColor", value.asInstanceOf[js.Any])
      
      inline def setFaceColorNull: Self = StObject.set(x, "faceColor", null)
      
      inline def setFaceColorUndefined: Self = StObject.set(x, "faceColor", js.undefined)
      
      inline def setTileColor(value: Color | Double): Self = StObject.set(x, "tileColor", value.asInstanceOf[js.Any])
      
      inline def setTileColorNull: Self = StObject.set(x, "tileColor", null)
      
      inline def setTileColorUndefined: Self = StObject.set(x, "tileColor", js.undefined)
    }
  }
  
  trait TiledObject extends StObject {
    
    /**
      * Only set, and set to `true`, if a ellipse object.
      */
    var ellipse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set if a tile object. The diagonal flip value.
      */
    var flippedAntiDiagonal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set if a tile object. The horizontal flip value.
      */
    var flippedHorizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set if a tile object. The vertical flip value.
      */
    var flippedVertical: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set if of type 'tile'.
      */
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      * The height of this object, in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The unique object ID.
      */
    var id: Double
    
    /**
      * The name this object was assigned in Tiled.
      */
    var name: String
    
    /**
      * Only set, and set to `true`, if a point object.
      */
    var point: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set if a polygon object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
      */
    var polygon: js.UndefOr[js.Array[Vector2Like]] = js.undefined
    
    /**
      * Only set if a polyline object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
      */
    var polyline: js.UndefOr[js.Array[Vector2Like]] = js.undefined
    
    /**
      * Custom properties object.
      */
    var properties: js.UndefOr[Any] = js.undefined
    
    /**
      * Only set, and set to `true`, if a rectangle object.
      */
    var rectangle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The rotation of the object in clockwise degrees.
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Only set if a text object. Contains the text objects properties.
      */
    var text: js.UndefOr[Any] = js.undefined
    
    /**
      * The string type of this instance, as assigned in Tiled. Tiled supports inheriting instance types from tilesets; in that case, the type will be set in the tile's data, but will be `''` here; use the `gid` to fetch the tile data or properties.
      */
    var `type`: String
    
    /**
      * The visible state of this object.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The width of this object, in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * The horizontal position of this object, in pixels, relative to the tilemap.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The vertical position of this object, in pixels, relative to the tilemap.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object TiledObject {
    
    inline def apply(id: Double, name: String, `type`: String): TiledObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TiledObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TiledObject] (val x: Self) extends AnyVal {
      
      inline def setEllipse(value: Boolean): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      inline def setFlippedAntiDiagonal(value: Boolean): Self = StObject.set(x, "flippedAntiDiagonal", value.asInstanceOf[js.Any])
      
      inline def setFlippedAntiDiagonalUndefined: Self = StObject.set(x, "flippedAntiDiagonal", js.undefined)
      
      inline def setFlippedHorizontal(value: Boolean): Self = StObject.set(x, "flippedHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlippedHorizontalUndefined: Self = StObject.set(x, "flippedHorizontal", js.undefined)
      
      inline def setFlippedVertical(value: Boolean): Self = StObject.set(x, "flippedVertical", value.asInstanceOf[js.Any])
      
      inline def setFlippedVerticalUndefined: Self = StObject.set(x, "flippedVertical", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setPolygon(value: js.Array[Vector2Like]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      inline def setPolygonVarargs(value: Vector2Like*): Self = StObject.set(x, "polygon", js.Array(value*))
      
      inline def setPolyline(value: js.Array[Vector2Like]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
      
      inline def setPolylineVarargs(value: Vector2Like*): Self = StObject.set(x, "polyline", js.Array(value*))
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRectangle(value: Boolean): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait TilemapConfig extends StObject {
    
    /**
      * Instead of loading from the cache, you can also load directly from a 2D array of tile indexes.
      */
    var data: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    /**
      * The height of the map in tiles.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls how empty tiles, tiles with an index of -1,
      * in the map data are handled. If `true`, empty locations will get a value of `null`. If `false`,
      * empty location will get a Tile object with an index of -1. If you've a large sparsely populated
      * map and the tile data doesn't need to change then setting this value to `true` will help with
      * memory consumption. However if your map is small or you need to update the tiles dynamically,
      * then leave the default value set.
      */
    var insertNull: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The height of a tile in pixels.
      */
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of a tile in pixels.
      */
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the map in tiles.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TilemapConfig {
    
    inline def apply(): TilemapConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TilemapConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TilemapConfig] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInsertNull(value: Boolean): Self = StObject.set(x, "insertNull", value.asInstanceOf[js.Any])
      
      inline def setInsertNullUndefined: Self = StObject.set(x, "insertNull", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
