package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typings.phaser.Phaser.Tilemaps.LayerData
import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typings.phaser.Phaser.Tilemaps.Tileset
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tilemaps {
  
  @js.native
  trait FilteringOptions extends StObject {
    
    /**
      * If true, only return tiles that have at least one interesting face.
      */
    var hasInterestingFace: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, only return tiles that collide on at least one side.
      */
    var isColliding: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, only return tiles that don't have -1 for an index.
      */
    var isNotEmpty: js.UndefOr[Boolean] = js.native
  }
  object FilteringOptions {
    
    @scala.inline
    def apply(): FilteringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilteringOptions]
    }
    
    @scala.inline
    implicit class FilteringOptionsMutableBuilder[Self <: FilteringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasInterestingFace(value: Boolean): Self = StObject.set(x, "hasInterestingFace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasInterestingFaceUndefined: Self = StObject.set(x, "hasInterestingFace", js.undefined)
      
      @scala.inline
      def setIsColliding(value: Boolean): Self = StObject.set(x, "isColliding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollidingUndefined: Self = StObject.set(x, "isColliding", js.undefined)
      
      @scala.inline
      def setIsNotEmpty(value: Boolean): Self = StObject.set(x, "isNotEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNotEmptyUndefined: Self = StObject.set(x, "isNotEmpty", js.undefined)
    }
  }
  
  @js.native
  trait GIDData extends StObject {
    
    /**
      * Is flipped?
      */
    var flipped: Boolean = js.native
    
    /**
      * Diagonal flip flag.
      */
    var flippedAntiDiagonal: Boolean = js.native
    
    /**
      * Horizontal flip flag.
      */
    var flippedHorizontal: Boolean = js.native
    
    /**
      * Vertical flip flag.
      */
    var flippedVertical: Boolean = js.native
    
    /**
      * The Tiled GID.
      */
    var gid: Double = js.native
    
    /**
      * Amount of rotation.
      */
    var rotation: Double = js.native
  }
  object GIDData {
    
    @scala.inline
    def apply(
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
    implicit class GIDDataMutableBuilder[Self <: GIDData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlipped(value: Boolean): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlippedAntiDiagonal(value: Boolean): Self = StObject.set(x, "flippedAntiDiagonal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlippedHorizontal(value: Boolean): Self = StObject.set(x, "flippedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlippedVertical(value: Boolean): Self = StObject.set(x, "flippedVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetTilesWithinFilteringOptions extends StObject {
    
    /**
      * If true, only return tiles that have at least one interesting face.
      */
    var hasInterestingFace: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, only return tiles that collide on at least one side.
      */
    var isColliding: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, only return tiles that don't have -1 for an index.
      */
    var isNotEmpty: js.UndefOr[Boolean] = js.native
  }
  object GetTilesWithinFilteringOptions {
    
    @scala.inline
    def apply(): GetTilesWithinFilteringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTilesWithinFilteringOptions]
    }
    
    @scala.inline
    implicit class GetTilesWithinFilteringOptionsMutableBuilder[Self <: GetTilesWithinFilteringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasInterestingFace(value: Boolean): Self = StObject.set(x, "hasInterestingFace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasInterestingFaceUndefined: Self = StObject.set(x, "hasInterestingFace", js.undefined)
      
      @scala.inline
      def setIsColliding(value: Boolean): Self = StObject.set(x, "isColliding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollidingUndefined: Self = StObject.set(x, "isColliding", js.undefined)
      
      @scala.inline
      def setIsNotEmpty(value: Boolean): Self = StObject.set(x, "isNotEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNotEmptyUndefined: Self = StObject.set(x, "isNotEmpty", js.undefined)
    }
  }
  
  @js.native
  trait LayerDataConfig extends StObject {
    
    /**
      * The alpha value of the layer.
      */
    var alpha: js.UndefOr[Double] = js.native
    
    /**
      * The base tile height.
      */
    var baseTileHeight: js.UndefOr[Double] = js.native
    
    /**
      * The base tile width.
      */
    var baseTileWidth: js.UndefOr[Double] = js.native
    
    /**
      * An array of physics bodies.
      */
    var bodies: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * An array of callbacks.
      */
    var callbacks: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Tile Collision ID index map.
      */
    var collideIndexes: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * An array of the tile data indexes.
      */
    var data: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The height of the layer in tiles.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The height in pixels of the entire layer.
      */
    var heightInPixels: js.UndefOr[Double] = js.native
    
    /**
      * Tile ID index map.
      */
    var indexes: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The name of the layer, if specified in Tiled.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Layer specific properties (can be specified in Tiled)
      */
    var properties: js.UndefOr[js.Array[js.Object]] = js.native
    
    /**
      * The pixel height of the tiles.
      */
    var tileHeight: js.UndefOr[Double] = js.native
    
    /**
      * The pixel width of the tiles.
      */
    var tileWidth: js.UndefOr[Double] = js.native
    
    /**
      * A reference to the Tilemap layer that owns this data.
      */
    var tilemapLayer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer] = js.native
    
    /**
      * Is the layer visible or not?
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * The width of the layer in tiles.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * The width in pixels of the entire layer.
      */
    var widthInPixels: js.UndefOr[Double] = js.native
    
    /**
      * The x offset of where to draw from the top left.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The y offset of where to draw from the top left.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object LayerDataConfig {
    
    @scala.inline
    def apply(): LayerDataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerDataConfig]
    }
    
    @scala.inline
    implicit class LayerDataConfigMutableBuilder[Self <: LayerDataConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setBaseTileHeight(value: Double): Self = StObject.set(x, "baseTileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseTileHeightUndefined: Self = StObject.set(x, "baseTileHeight", js.undefined)
      
      @scala.inline
      def setBaseTileWidth(value: Double): Self = StObject.set(x, "baseTileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseTileWidthUndefined: Self = StObject.set(x, "baseTileWidth", js.undefined)
      
      @scala.inline
      def setBodies(value: js.Array[_]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodiesUndefined: Self = StObject.set(x, "bodies", js.undefined)
      
      @scala.inline
      def setBodiesVarargs(value: js.Any*): Self = StObject.set(x, "bodies", js.Array(value :_*))
      
      @scala.inline
      def setCallbacks(value: js.Array[_]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCallbacksVarargs(value: js.Any*): Self = StObject.set(x, "callbacks", js.Array(value :_*))
      
      @scala.inline
      def setCollideIndexes(value: js.Array[_]): Self = StObject.set(x, "collideIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollideIndexesUndefined: Self = StObject.set(x, "collideIndexes", js.undefined)
      
      @scala.inline
      def setCollideIndexesVarargs(value: js.Any*): Self = StObject.set(x, "collideIndexes", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightInPixels(value: Double): Self = StObject.set(x, "heightInPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightInPixelsUndefined: Self = StObject.set(x, "heightInPixels", js.undefined)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndexes(value: js.Array[_]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      @scala.inline
      def setIndexesVarargs(value: js.Any*): Self = StObject.set(x, "indexes", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[js.Object]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: js.Object*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      @scala.inline
      def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      @scala.inline
      def setTilemapLayer(value: DynamicTilemapLayer | StaticTilemapLayer): Self = StObject.set(x, "tilemapLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilemapLayerUndefined: Self = StObject.set(x, "tilemapLayer", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthInPixels(value: Double): Self = StObject.set(x, "widthInPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthInPixelsUndefined: Self = StObject.set(x, "widthInPixels", js.undefined)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait MapDataConfig extends StObject {
    
    /**
      * An object of Tiled Object Layers.
      */
    var collision: js.UndefOr[js.Object] = js.native
    
    /**
      * The format of the Tilemap, as defined in Tiled.
      */
    var format: js.UndefOr[integer] = js.native
    
    /**
      * The height of the entire tilemap.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The height in pixels of the entire tilemap.
      */
    var heightInPixels: js.UndefOr[Double] = js.native
    
    /**
      * The collection of images the map uses(specified in Tiled).
      */
    var imageCollections: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * An array with all the layers configured to the MapData.
      */
    var images: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The layers of the tilemap.
      */
    var layers: js.UndefOr[js.Array[LayerData]] = js.native
    
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * An array of Tiled Image Layers.
      */
    var objects: js.UndefOr[js.Object] = js.native
    
    /**
      * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
      */
    var orientation: js.UndefOr[String] = js.native
    
    /**
      * Map specific properties (can be specified in Tiled).
      */
    var properties: js.UndefOr[Double] = js.native
    
    /**
      * Determines the draw order of tilemap. Default is right-down.
      */
    var renderOrder: js.UndefOr[String] = js.native
    
    /**
      * The height of the tiles.
      */
    var tileHeight: js.UndefOr[Double] = js.native
    
    /**
      * The width of the tiles.
      */
    var tileWidth: js.UndefOr[Double] = js.native
    
    /**
      * Array of Tile instances.
      */
    var tiles: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The tilesets the map uses.
      */
    var tilesets: js.UndefOr[js.Array[Tileset]] = js.native
    
    /**
      * The version of Tiled the map uses.
      */
    var version: js.UndefOr[Double] = js.native
    
    /**
      * The width of the entire tilemap.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * The width in pixels of the entire tilemap.
      */
    var widthInPixels: js.UndefOr[Double] = js.native
  }
  object MapDataConfig {
    
    @scala.inline
    def apply(): MapDataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapDataConfig]
    }
    
    @scala.inline
    implicit class MapDataConfigMutableBuilder[Self <: MapDataConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollision(value: js.Object): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
      
      @scala.inline
      def setFormat(value: integer): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightInPixels(value: Double): Self = StObject.set(x, "heightInPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightInPixelsUndefined: Self = StObject.set(x, "heightInPixels", js.undefined)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageCollections(value: js.Array[_]): Self = StObject.set(x, "imageCollections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageCollectionsUndefined: Self = StObject.set(x, "imageCollections", js.undefined)
      
      @scala.inline
      def setImageCollectionsVarargs(value: js.Any*): Self = StObject.set(x, "imageCollections", js.Array(value :_*))
      
      @scala.inline
      def setImages(value: js.Array[_]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setImagesVarargs(value: js.Any*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setLayers(value: js.Array[LayerData]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: LayerData*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setObjects(value: js.Object): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setProperties(value: Double): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRenderOrder(value: String): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderOrderUndefined: Self = StObject.set(x, "renderOrder", js.undefined)
      
      @scala.inline
      def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      @scala.inline
      def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      @scala.inline
      def setTiles(value: js.Array[_]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
      
      @scala.inline
      def setTilesVarargs(value: js.Any*): Self = StObject.set(x, "tiles", js.Array(value :_*))
      
      @scala.inline
      def setTilesets(value: js.Array[Tileset]): Self = StObject.set(x, "tilesets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilesetsUndefined: Self = StObject.set(x, "tilesets", js.undefined)
      
      @scala.inline
      def setTilesetsVarargs(value: Tileset*): Self = StObject.set(x, "tilesets", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthInPixels(value: Double): Self = StObject.set(x, "widthInPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthInPixelsUndefined: Self = StObject.set(x, "widthInPixels", js.undefined)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ObjectLayerConfig extends StObject {
    
    /**
      * The name of the Object Layer.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * An array of all objects on this Object Layer.
      */
    var objects: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * The opacity of the layer, between 0 and 1.
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * The custom properties defined on the Object Layer, keyed by their name.
      */
    var properties: js.UndefOr[js.Any] = js.native
    
    /**
      * The type of each custom property defined on the Object Layer, keyed by its name.
      */
    var propertytypes: js.UndefOr[js.Any] = js.native
    
    /**
      * The type of the layer, which should be `objectgroup`.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Whether the layer is shown (`true`) or hidden (`false`).
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object ObjectLayerConfig {
    
    @scala.inline
    def apply(): ObjectLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectLayerConfig]
    }
    
    @scala.inline
    implicit class ObjectLayerConfigMutableBuilder[Self <: ObjectLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertytypes(value: js.Any): Self = StObject.set(x, "propertytypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertytypesUndefined: Self = StObject.set(x, "propertytypes", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait StyleConfig extends StObject {
    
    /**
      * Color to use for drawing a filled rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
      */
    var collidingTileColor: js.UndefOr[Color | Double | Null] = js.native
    
    /**
      * Color to use for drawing a line at interesting tile faces. If set to null, interesting tile faces will not be drawn.
      */
    var faceColor: js.UndefOr[Color | Double | Null] = js.native
    
    /**
      * Color to use for drawing a filled rectangle at non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
      */
    var tileColor: js.UndefOr[Color | Double | Null] = js.native
  }
  object StyleConfig {
    
    @scala.inline
    def apply(): StyleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleConfig]
    }
    
    @scala.inline
    implicit class StyleConfigMutableBuilder[Self <: StyleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollidingTileColor(value: Color | Double): Self = StObject.set(x, "collidingTileColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollidingTileColorNull: Self = StObject.set(x, "collidingTileColor", null)
      
      @scala.inline
      def setCollidingTileColorUndefined: Self = StObject.set(x, "collidingTileColor", js.undefined)
      
      @scala.inline
      def setFaceColor(value: Color | Double): Self = StObject.set(x, "faceColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceColorNull: Self = StObject.set(x, "faceColor", null)
      
      @scala.inline
      def setFaceColorUndefined: Self = StObject.set(x, "faceColor", js.undefined)
      
      @scala.inline
      def setTileColor(value: Color | Double): Self = StObject.set(x, "tileColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileColorNull: Self = StObject.set(x, "tileColor", null)
      
      @scala.inline
      def setTileColorUndefined: Self = StObject.set(x, "tileColor", js.undefined)
    }
  }
  
  @js.native
  trait TiledObject extends StObject {
    
    /**
      * Only set, and set to `true`, if a ellipse object.
      */
    var ellipse: js.UndefOr[Boolean] = js.native
    
    /**
      * Only set if a tile object. The diagonal flip value.
      */
    var flippedAntiDiagonal: js.UndefOr[Boolean] = js.native
    
    /**
      * Only set if a tile object. The horizontal flip value.
      */
    var flippedHorizontal: js.UndefOr[Boolean] = js.native
    
    /**
      * Only set if a tile object. The vertical flip value.
      */
    var flippedVertical: js.UndefOr[Boolean] = js.native
    
    /**
      * Only set if of type 'tile'.
      */
    var gid: js.UndefOr[integer] = js.native
    
    /**
      * The height of this object, in pixels.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The unique object ID.
      */
    var id: integer = js.native
    
    /**
      * The name this object was assigned in Tiled.
      */
    var name: String = js.native
    
    /**
      * Only set, and set to `true`, if a point object.
      */
    var point: js.UndefOr[Boolean] = js.native
    
    /**
      * Only set if a polygon object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
      */
    var polygon: js.UndefOr[js.Array[Vector2Like]] = js.native
    
    /**
      * Only set if a polyline object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
      */
    var polyline: js.UndefOr[js.Array[Vector2Like]] = js.native
    
    /**
      * Custom properties object.
      */
    var properties: js.UndefOr[js.Any] = js.native
    
    /**
      * Only set, and set to `true`, if a rectangle object.
      */
    var rectangle: js.UndefOr[Boolean] = js.native
    
    /**
      * The rotation of the object in clockwise degrees.
      */
    var rotation: js.UndefOr[Double] = js.native
    
    /**
      * Only set if a text object. Contains the text objects properties.
      */
    var text: js.UndefOr[js.Any] = js.native
    
    /**
      * The type, as assigned in Tiled.
      */
    var `type`: String = js.native
    
    /**
      * The visible state of this object.
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * The width of this object, in pixels.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * The horizontal position of this object, in pixels, relative to the tilemap.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The vertical position of this object, in pixels, relative to the tilemap.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object TiledObject {
    
    @scala.inline
    def apply(id: integer, name: String, `type`: String): TiledObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TiledObject]
    }
    
    @scala.inline
    implicit class TiledObjectMutableBuilder[Self <: TiledObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipse(value: Boolean): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      @scala.inline
      def setFlippedAntiDiagonal(value: Boolean): Self = StObject.set(x, "flippedAntiDiagonal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlippedAntiDiagonalUndefined: Self = StObject.set(x, "flippedAntiDiagonal", js.undefined)
      
      @scala.inline
      def setFlippedHorizontal(value: Boolean): Self = StObject.set(x, "flippedHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlippedHorizontalUndefined: Self = StObject.set(x, "flippedHorizontal", js.undefined)
      
      @scala.inline
      def setFlippedVertical(value: Boolean): Self = StObject.set(x, "flippedVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlippedVerticalUndefined: Self = StObject.set(x, "flippedVertical", js.undefined)
      
      @scala.inline
      def setGid(value: integer): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: Boolean): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setPolygon(value: js.Array[Vector2Like]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      @scala.inline
      def setPolygonVarargs(value: Vector2Like*): Self = StObject.set(x, "polygon", js.Array(value :_*))
      
      @scala.inline
      def setPolyline(value: js.Array[Vector2Like]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
      
      @scala.inline
      def setPolylineVarargs(value: Vector2Like*): Self = StObject.set(x, "polyline", js.Array(value :_*))
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRectangle(value: Boolean): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait TilemapConfig extends StObject {
    
    /**
      * Instead of loading from the cache, you can also load directly from a 2D array of tile indexes.
      */
    var data: js.UndefOr[js.Array[js.Array[integer]]] = js.native
    
    /**
      * The height of the map in tiles.
      */
    var height: js.UndefOr[integer] = js.native
    
    /**
      * Controls how empty tiles, tiles with an index of -1,
      * in the map data are handled. If `true`, empty locations will get a value of `null`. If `false`,
      * empty location will get a Tile object with an index of -1. If you've a large sparsely populated
      * map and the tile data doesn't need to change then setting this value to `true` will help with
      * memory consumption. However if your map is small or you need to update the tiles dynamically,
      * then leave the default value set.
      */
    var insertNull: js.UndefOr[Boolean] = js.native
    
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * The height of a tile in pixels.
      */
    var tileHeight: js.UndefOr[integer] = js.native
    
    /**
      * The width of a tile in pixels.
      */
    var tileWidth: js.UndefOr[integer] = js.native
    
    /**
      * The width of the map in tiles.
      */
    var width: js.UndefOr[integer] = js.native
  }
  object TilemapConfig {
    
    @scala.inline
    def apply(): TilemapConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TilemapConfig]
    }
    
    @scala.inline
    implicit class TilemapConfigMutableBuilder[Self <: TilemapConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[js.Array[integer]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Array[integer]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInsertNull(value: Boolean): Self = StObject.set(x, "insertNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertNullUndefined: Self = StObject.set(x, "insertNull", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTileHeight(value: integer): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      @scala.inline
      def setTileWidth(value: integer): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
