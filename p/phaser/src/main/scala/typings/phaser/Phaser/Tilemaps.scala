package typings.phaser.Phaser

import typings.phaser.EachTileCallback
import typings.phaser.FindTileCallback
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
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Types.GameObjects.Sprite.SpriteConfig
import typings.phaser.Phaser.Types.Tilemaps.CreateFromObjectLayerConfig
import typings.phaser.Phaser.Types.Tilemaps.FilteringOptions
import typings.phaser.Phaser.Types.Tilemaps.StyleConfig
import typings.phaser.Phaser.Types.Tilemaps.TiledObject
import typings.phaser.TilemapFilterCallback
import typings.phaser.TilemapFindCallback
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tilemaps {
  
  @js.native
  sealed trait Orientation extends StObject
  /**
    * Phaser Tilemap constants for orientation.
    */
  @JSGlobal("Phaser.Tilemaps.Orientation")
  @js.native
  object Orientation extends StObject {
    
    /**
      * Hexagonal Tilemap orientation constant.
      */
    @js.native
    sealed trait HEXAGONAL
      extends StObject
         with Orientation
    
    /**
      * Isometric Tilemap orientation constant.
      */
    @js.native
    sealed trait ISOMETRIC
      extends StObject
         with Orientation
    
    /**
      * Orthogonal Tilemap orientation constant.
      */
    @js.native
    sealed trait ORTHOGONAL
      extends StObject
         with Orientation
    
    /**
      * Staggered Tilemap orientation constant.
      */
    @js.native
    sealed trait STAGGERED
      extends StObject
         with Orientation
  }
  
  /**
    * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
    * 
    * Image Collections are normally created automatically when Tiled data is loaded.
    */
  trait ImageCollection extends StObject {
    
    /**
      * Add an image to this Image Collection.
      * @param gid The gid of the image in the Image Collection.
      * @param image The the key of the image in the Image Collection and in the cache.
      */
    def addImage(gid: Double, image: String): ImageCollection
    
    /**
      * Returns true if and only if this image collection contains the given image index.
      * @param imageIndex The image index to search for.
      */
    def containsImageIndex(imageIndex: Double): Boolean
    
    /**
      * The Tiled firstgid value.
      * This is the starting index of the first image index this Image Collection contains.
      */
    var firstgid: Double
    
    /**
      * The height of the tallest image (in pixels).
      */
    val imageHeight: Double
    
    /**
      * The margin around the images in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    val imageMarge: Double
    
    /**
      * The spacing between each image in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    val imageSpacing: Double
    
    /**
      * The width of the widest image (in pixels).
      */
    val imageWidth: Double
    
    /**
      * The cached images that are a part of this collection.
      */
    val images: js.Array[Any]
    
    /**
      * The name of the Image Collection.
      */
    var name: String
    
    /**
      * Image Collection-specific properties that are typically defined in the Tiled editor.
      */
    var properties: js.Object
    
    /**
      * The total number of images in the image collection.
      */
    val total: Double
  }
  object ImageCollection {
    
    inline def apply(
      addImage: (Double, String) => ImageCollection,
      containsImageIndex: Double => Boolean,
      firstgid: Double,
      imageHeight: Double,
      imageMarge: Double,
      imageSpacing: Double,
      imageWidth: Double,
      images: js.Array[Any],
      name: String,
      properties: js.Object,
      total: Double
    ): ImageCollection = {
      val __obj = js.Dynamic.literal(addImage = js.Any.fromFunction2(addImage), containsImageIndex = js.Any.fromFunction1(containsImageIndex), firstgid = firstgid.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageMarge = imageMarge.asInstanceOf[js.Any], imageSpacing = imageSpacing.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageCollection]
    }
    
    extension [Self <: ImageCollection](x: Self) {
      
      inline def setAddImage(value: (Double, String) => ImageCollection): Self = StObject.set(x, "addImage", js.Any.fromFunction2(value))
      
      inline def setContainsImageIndex(value: Double => Boolean): Self = StObject.set(x, "containsImageIndex", js.Any.fromFunction1(value))
      
      inline def setFirstgid(value: Double): Self = StObject.set(x, "firstgid", value.asInstanceOf[js.Any])
      
      inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageMarge(value: Double): Self = StObject.set(x, "imageMarge", value.asInstanceOf[js.Any])
      
      inline def setImageSpacing(value: Double): Self = StObject.set(x, "imageSpacing", value.asInstanceOf[js.Any])
      
      inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
    * etc. into this format. Tilemap and TilemapLayer objects have a reference
    * to this data and use it to look up and perform operations on tiles.
    */
  trait LayerData extends StObject {
    
    /**
      * The alpha value of the layer.
      */
    var alpha: Double
    
    /**
      * The base tile height.
      */
    var baseTileHeight: Double
    
    /**
      * The base tile width.
      */
    var baseTileWidth: Double
    
    /**
      * An array of physics bodies.
      */
    var bodies: js.Array[Any]
    
    /**
      * An array of callbacks.
      */
    var callbacks: js.Array[Any]
    
    /**
      * Tile Collision ID index map.
      */
    var collideIndexes: js.Array[Any]
    
    /**
      * An array of the tile data indexes.
      */
    var data: js.Array[js.Array[Tile]]
    
    /**
      * The height of the layer in tiles.
      */
    var height: Double
    
    /**
      * The height in pixels of the entire layer.
      */
    var heightInPixels: Double
    
    /**
      * The length of the horizontal sides of the hexagon.
      * Only used for hexagonal orientation Tilemaps.
      */
    var hexSideLength: Double
    
    /**
      * Tile ID index map.
      */
    var indexes: js.Array[Any]
    
    /**
      * The name of the layer, if specified in Tiled.
      */
    var name: String
    
    /**
      * The layers orientation, necessary to be able to determine a tiles pixelX and pixelY as well as the layers width and height.
      */
    var orientation: OrientationType
    
    /**
      * Layer specific properties (can be specified in Tiled)
      */
    var properties: js.Array[js.Object]
    
    /**
      * The pixel height of the tiles.
      */
    var tileHeight: Double
    
    /**
      * The pixel width of the tiles.
      */
    var tileWidth: Double
    
    /**
      * A reference to the Tilemap layer that owns this data.
      */
    var tilemapLayer: TilemapLayer
    
    /**
      * Is the layer visible or not?
      */
    var visible: Boolean
    
    /**
      * The width of the layer in tiles.
      */
    var width: Double
    
    /**
      * The width in pixels of the entire layer.
      */
    var widthInPixels: Double
    
    /**
      * The x offset of where to draw from the top left.
      */
    var x: Double
    
    /**
      * The y offset of where to draw from the top left.
      */
    var y: Double
  }
  object LayerData {
    
    inline def apply(
      alpha: Double,
      baseTileHeight: Double,
      baseTileWidth: Double,
      bodies: js.Array[Any],
      callbacks: js.Array[Any],
      collideIndexes: js.Array[Any],
      data: js.Array[js.Array[Tile]],
      height: Double,
      heightInPixels: Double,
      hexSideLength: Double,
      indexes: js.Array[Any],
      name: String,
      orientation: OrientationType,
      properties: js.Array[js.Object],
      tileHeight: Double,
      tileWidth: Double,
      tilemapLayer: TilemapLayer,
      visible: Boolean,
      width: Double,
      widthInPixels: Double,
      x: Double,
      y: Double
    ): LayerData = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], baseTileHeight = baseTileHeight.asInstanceOf[js.Any], baseTileWidth = baseTileWidth.asInstanceOf[js.Any], bodies = bodies.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], collideIndexes = collideIndexes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], hexSideLength = hexSideLength.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tilemapLayer = tilemapLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerData]
    }
    
    extension [Self <: LayerData](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBaseTileHeight(value: Double): Self = StObject.set(x, "baseTileHeight", value.asInstanceOf[js.Any])
      
      inline def setBaseTileWidth(value: Double): Self = StObject.set(x, "baseTileWidth", value.asInstanceOf[js.Any])
      
      inline def setBodies(value: js.Array[Any]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
      
      inline def setBodiesVarargs(value: Any*): Self = StObject.set(x, "bodies", js.Array(value*))
      
      inline def setCallbacks(value: js.Array[Any]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: Any*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setCollideIndexes(value: js.Array[Any]): Self = StObject.set(x, "collideIndexes", value.asInstanceOf[js.Any])
      
      inline def setCollideIndexesVarargs(value: Any*): Self = StObject.set(x, "collideIndexes", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[Tile]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[Tile]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightInPixels(value: Double): Self = StObject.set(x, "heightInPixels", value.asInstanceOf[js.Any])
      
      inline def setHexSideLength(value: Double): Self = StObject.set(x, "hexSideLength", value.asInstanceOf[js.Any])
      
      inline def setIndexes(value: js.Array[Any]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesVarargs(value: Any*): Self = StObject.set(x, "indexes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: OrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[js.Object]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: js.Object*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTilemapLayer(value: TilemapLayer): Self = StObject.set(x, "tilemapLayer", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthInPixels(value: Double): Self = StObject.set(x, "widthInPixels", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
    * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
    * itself.
    */
  trait MapData extends StObject {
    
    /**
      * An object of collision data. Must be created as physics object or will return undefined.
      */
    var collision: js.Object
    
    /**
      * The format of the map data.
      */
    var format: Double
    
    /**
      * The height of the entire tilemap.
      */
    var height: Double
    
    /**
      * The height in pixels of the entire tilemap.
      */
    var heightInPixels: Double
    
    /**
      * The length of the horizontal sides of the hexagon.
      * Only used for hexagonal orientation Tilemaps.
      */
    var hexSideLength: Double
    
    /**
      * The collection of images the map uses(specified in Tiled)
      */
    var imageCollections: js.Array[Any]
    
    /**
      * An array of Tiled Image Layers.
      */
    var images: js.Array[Any]
    
    /**
      * If the map is infinite or not.
      */
    var infinite: Boolean
    
    /**
      * An array with all the layers configured to the MapData.
      */
    var layers: js.Array[LayerData] | ObjectLayer
    
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    var name: String
    
    /**
      * An object of Tiled Object Layers.
      */
    var objects: js.Object
    
    /**
      * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
      */
    var orientation: OrientationType
    
    /**
      * Map specific properties (can be specified in Tiled)
      */
    var properties: js.Object
    
    /**
      * Determines the draw order of tilemap. Default is right-down
      * 
      * 0, or 'right-down'
      * 1, or 'left-down'
      * 2, or 'right-up'
      * 3, or 'left-up'
      */
    var renderOrder: String
    
    /**
      * The height of the tiles.
      */
    var tileHeight: Double
    
    /**
      * The width of the tiles.
      */
    var tileWidth: Double
    
    /**
      * An array of tile instances.
      */
    var tiles: js.Array[Any]
    
    /**
      * An array of Tilesets.
      */
    var tilesets: js.Array[Tileset]
    
    /**
      * The version of the map data (as specified in Tiled).
      */
    var version: String
    
    /**
      * The width of the entire tilemap.
      */
    var width: Double
    
    /**
      * The width in pixels of the entire tilemap.
      */
    var widthInPixels: Double
  }
  object MapData {
    
    inline def apply(
      collision: js.Object,
      format: Double,
      height: Double,
      heightInPixels: Double,
      hexSideLength: Double,
      imageCollections: js.Array[Any],
      images: js.Array[Any],
      infinite: Boolean,
      layers: js.Array[LayerData] | ObjectLayer,
      name: String,
      objects: js.Object,
      orientation: OrientationType,
      properties: js.Object,
      renderOrder: String,
      tileHeight: Double,
      tileWidth: Double,
      tiles: js.Array[Any],
      tilesets: js.Array[Tileset],
      version: String,
      width: Double,
      widthInPixels: Double
    ): MapData = {
      val __obj = js.Dynamic.literal(collision = collision.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], hexSideLength = hexSideLength.asInstanceOf[js.Any], imageCollections = imageCollections.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], tilesets = tilesets.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapData]
    }
    
    extension [Self <: MapData](x: Self) {
      
      inline def setCollision(value: js.Object): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightInPixels(value: Double): Self = StObject.set(x, "heightInPixels", value.asInstanceOf[js.Any])
      
      inline def setHexSideLength(value: Double): Self = StObject.set(x, "hexSideLength", value.asInstanceOf[js.Any])
      
      inline def setImageCollections(value: js.Array[Any]): Self = StObject.set(x, "imageCollections", value.asInstanceOf[js.Any])
      
      inline def setImageCollectionsVarargs(value: Any*): Self = StObject.set(x, "imageCollections", js.Array(value*))
      
      inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[LayerData] | ObjectLayer): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: LayerData*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: js.Object): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: OrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRenderOrder(value: String): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTiles(value: js.Array[Any]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setTilesVarargs(value: Any*): Self = StObject.set(x, "tiles", js.Array(value*))
      
      inline def setTilesets(value: js.Array[Tileset]): Self = StObject.set(x, "tilesets", value.asInstanceOf[js.Any])
      
      inline def setTilesetsVarargs(value: Tileset*): Self = StObject.set(x, "tilesets", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthInPixels(value: Double): Self = StObject.set(x, "widthInPixels", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A class for representing a Tiled object layer in a map. This mirrors the structure of a Tiled
    * object layer, except:
    *  - "x" & "y" properties are ignored since these cannot be changed in Tiled.
    *  - "offsetx" & "offsety" are applied to the individual object coordinates directly, so they
    *    are ignored as well.
    *  - "draworder" is ignored.
    */
  trait ObjectLayer extends StObject {
    
    /**
      * The name of the Object Layer.
      */
    var name: String
    
    /**
      * An array of all objects on this Object Layer.
      * 
      * Each Tiled object corresponds to a JavaScript object in this array. It has an `id` (unique),
      * `name` (as assigned in Tiled), `type` (as assigned in Tiled), `rotation` (in clockwise degrees),
      * `properties` (if any), `visible` state (`true` if visible, `false` otherwise),
      * `x` and `y` coordinates (in pixels, relative to the tilemap), and a `width` and `height` (in pixels).
      * 
      * An object tile has a `gid` property (GID of the represented tile), a `flippedHorizontal` property,
      * a `flippedVertical` property, and `flippedAntiDiagonal` property.
      * The {@link http://docs.mapeditor.org/en/latest/reference/tmx-map-format/|Tiled documentation} contains
      * information on flipping and rotation.
      * 
      * Polylines have a `polyline` property, which is an array of objects corresponding to points,
      * where each point has an `x` property and a `y` property. Polygons have an identically structured
      * array in their `polygon` property. Text objects have a `text` property with the text's properties.
      * 
      * Rectangles and ellipses have a `rectangle` or `ellipse` property set to `true`.
      */
    var objects: js.Array[TiledObject]
    
    /**
      * The opacity of the layer, between 0 and 1.
      */
    var opacity: Double
    
    /**
      * The custom properties defined on the Object Layer, keyed by their name.
      */
    var properties: js.Object
    
    /**
      * The type of each custom property defined on the Object Layer, keyed by its name.
      */
    var propertyTypes: js.Object
    
    /**
      * The type of the layer, which should be `objectgroup`.
      */
    var `type`: String
    
    /**
      * Whether the layer is shown (`true`) or hidden (`false`).
      */
    var visible: Boolean
  }
  object ObjectLayer {
    
    inline def apply(
      name: String,
      objects: js.Array[TiledObject],
      opacity: Double,
      properties: js.Object,
      propertyTypes: js.Object,
      `type`: String,
      visible: Boolean
    ): ObjectLayer = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], propertyTypes = propertyTypes.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectLayer]
    }
    
    extension [Self <: ObjectLayer](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObjects(value: js.Array[TiledObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: TiledObject*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertyTypes(value: js.Object): Self = StObject.set(x, "propertyTypes", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Phaser Tilemap constants for orientation.
    * 
    * To find out what each mode does please see [Phaser.Tilemaps.Orientation]{@link Phaser.Tilemaps.Orientation}.
    */
  type OrientationType = Orientation
  
  /**
    * A Tile is a representation of a single tile within the Tilemap. This is a lightweight data
    * representation, so its position information is stored without factoring in scroll, layer
    * scale or layer position.
    */
  @js.native
  trait Tile
    extends StObject
       with Alpha
       with Flip
       with Visible {
    
    /**
      * The maps base height of a tile in pixels. Tiled maps support multiple tileset sizes
      * within one map, but they are still placed at intervals of the base tile size.
      */
    var baseHeight: Double = js.native
    
    /**
      * The maps base width of a tile in pixels. Tiled maps support multiple tileset sizes
      * within one map, but they are still placed at intervals of the base tile size.
      */
    var baseWidth: Double = js.native
    
    /**
      * The bottom of the tile in pixels.
      * 
      * Set in the `updatePixelXY` method.
      */
    var bottom: Double = js.native
    
    /**
      * True if this tile can collide on any of its faces or has a collision callback set.
      */
    val canCollide: Boolean = js.native
    
    /**
      * Whether the tile should collide with any object on the bottom side.
      * 
      * This property is used by Arcade Physics only, however, you can also use it
      * in your own checks.
      */
    var collideDown: Boolean = js.native
    
    /**
      * Whether the tile should collide with any object on the left side.
      * 
      * This property is used by Arcade Physics only, however, you can also use it
      * in your own checks.
      */
    var collideLeft: Boolean = js.native
    
    /**
      * Whether the tile should collide with any object on the right side.
      * 
      * This property is used by Arcade Physics only, however, you can also use it
      * in your own checks.
      */
    var collideRight: Boolean = js.native
    
    /**
      * Whether the tile should collide with any object on the top side.
      * 
      * This property is used by Arcade Physics only, however, you can also use it
      * in your own checks.
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
    def copy(tile: Tile): this.type = js.native
    
    /**
      * Clean up memory.
      */
    def destroy(): Unit = js.native
    
    /**
      * Whether the tiles bottom edge is interesting for collisions.
      */
    var faceBottom: Boolean = js.native
    
    /**
      * Whether the tiles left edge is interesting for collisions.
      */
    var faceLeft: Boolean = js.native
    
    /**
      * Whether the tiles right edge is interesting for collisions.
      */
    var faceRight: Boolean = js.native
    
    /**
      * Whether the tiles top edge is interesting for collisions.
      */
    var faceTop: Boolean = js.native
    
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
    def getBounds(camera: Unit, output: Rectangle): Rectangle | js.Object = js.native
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
      * True if this tile has any interesting faces.
      */
    val hasInterestingFace: Boolean = js.native
    
    /**
      * The height of the tile in pixels.
      */
    var height: Double = js.native
    
    /**
      * The index of this tile within the map data corresponding to the tileset, or -1 if this
      * represents a blank tile.
      */
    var index: Double = js.native
    
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
    var properties: Any = js.native
    
    /**
      * Reset collision status flags.
      * @param recalculateFaces Whether or not to recalculate interesting faces for this tile and its neighbors. Default true.
      */
    def resetCollision(): this.type = js.native
    def resetCollision(recalculateFaces: Boolean): this.type = js.native
    
    /**
      * Reset faces.
      */
    def resetFaces(): this.type = js.native
    
    /**
      * The right of the tile in pixels.
      * 
      * Set in the `updatePixelXY` method.
      */
    var right: Double = js.native
    
    /**
      * The rotation angle of this tile.
      */
    var rotation: Double = js.native
    
    /**
      * Sets the collision flags for each side of this tile and updates the interesting faces list.
      * @param left Indicating collide with any object on the left.
      * @param right Indicating collide with any object on the right.
      * @param up Indicating collide with any object on the top.
      * @param down Indicating collide with any object on the bottom.
      * @param recalculateFaces Whether or not to recalculate interesting faces for this tile and its neighbors. Default true.
      */
    def setCollision(left: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Unit, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Unit, down: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Unit, down: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Boolean, up: Unit, down: Unit, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Boolean, down: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Boolean, down: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Boolean, down: Unit, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Unit, down: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Unit, down: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollision(left: Boolean, right: Unit, up: Unit, down: Unit, recalculateFaces: Boolean): this.type = js.native
    
    /**
      * Set a callback to be called when this tile is hit by an object. The callback must true for
      * collision processing to take place.
      * @param callback Callback function.
      * @param context Callback will be called within this context.
      */
    def setCollisionCallback(callback: js.Function, context: js.Object): this.type = js.native
    
    /**
      * Sets the size of the tile and updates its pixelX and pixelY.
      * @param tileWidth The width of the tile in pixels.
      * @param tileHeight The height of the tile in pixels.
      * @param baseWidth The base width a tile in the map (in pixels).
      * @param baseHeight The base height of the tile in pixels (in pixels).
      */
    def setSize(tileWidth: Double, tileHeight: Double, baseWidth: Double, baseHeight: Double): this.type = js.native
    
    /**
      * The tilemap that contains this Tile. This will only return null if accessed from a LayerData
      * instance before the tile is placed within a TilemapLayer.
      */
    val tilemap: Tilemap = js.native
    
    /**
      * The tilemap layer that contains this Tile. This will only return null if accessed from a
      * LayerData instance before the tile is placed within a TilemapLayer.
      */
    val tilemapLayer: TilemapLayer = js.native
    
    /**
      * The tileset that contains this Tile. This is null if accessed from a LayerData instance
      * before the tile is placed in a TilemapLayer, or if the tile has an index that doesn't correspond
      * to any of the maps tilesets.
      */
    val tileset: Tileset = js.native
    
    /**
      * The tint to apply to this tile. Note: tint is currently a single color value instead of
      * the 4 corner tint component on other GameObjects.
      */
    var tint: Double = js.native
    
    /**
      * Used internally. Updates the tiles world XY position based on the current tile size.
      */
    def updatePixelXY(): this.type = js.native
    
    /**
      * The width of the tile in pixels.
      */
    var width: Double = js.native
    
    /**
      * The x map coordinate of this tile in tile units.
      */
    var x: Double = js.native
    
    /**
      * The y map coordinate of this tile in tile units.
      */
    var y: Double = js.native
  }
  
  /**
    * A Tilemap is a container for Tilemap data. This isn't a display object, rather, it holds data
    * about the map and allows you to add tilesets and tilemap layers to it. A map can have one or
    * more tilemap layers, which are the display objects that actually render the tiles.
    * 
    * The Tilemap data can be parsed from a Tiled JSON file, a CSV file or a 2D array. Tiled is a free
    * software package specifically for creating tile maps, and is available from:
    * http://www.mapeditor.org
    * 
    * As of Phaser 3.50.0 the Tilemap API now supports the following types of map:
    * 
    * 1) Orthogonal
    * 2) Isometric
    * 3) Hexagonal
    * 4) Staggered
    * 
    * Prior to this release, only orthogonal maps were supported.
    * 
    * Another large change in 3.50 was the consolidation of Tilemap Layers. Previously, you created
    * either a Static or Dynamic Tilemap Layer. However, as of 3.50 the features of both have been
    * merged and the API simplified, so now there is just the single `TilemapLayer` class.
    * 
    * A Tilemap has handy methods for getting and manipulating the tiles within a layer, allowing
    * you to build or modify the tilemap data at runtime.
    * 
    * Note that all Tilemaps use a base tile size to calculate dimensions from, but that a
    * TilemapLayer may have its own unique tile size that overrides this.
    * 
    * As of Phaser 3.21.0, if your tilemap includes layer groups (a feature of Tiled 1.2.0+) these
    * will be traversed and the following properties will impact children:
    * 
    * - Opacity (blended with parent) and visibility (parent overrides child)
    * - Vertical and horizontal offset
    * 
    * The grouping hierarchy is not preserved and all layers will be flattened into a single array.
    * 
    * Group layers are parsed during Tilemap construction but are discarded after parsing so dynamic
    * layers will NOT continue to be affected by a parent.
    * 
    * To avoid duplicate layer names, a layer that is a child of a group layer will have its parent
    * group name prepended with a '/'.  For example, consider a group called 'ParentGroup' with a
    * child called 'Layer 1'. In the Tilemap object, 'Layer 1' will have the name
    * 'ParentGroup/Layer 1'.
    */
  @js.native
  trait Tilemap extends StObject {
    
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
      tileWidth: js.UndefOr[Double],
      tileHeight: js.UndefOr[Double],
      tileMargin: js.UndefOr[Double],
      tileSpacing: js.UndefOr[Double],
      gid: js.UndefOr[Double]
    ): Tileset = js.native
    
    /**
      * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
      * faces are used internally for optimizing collisions against tiles. This method is mostly used
      * internally to optimize recalculating faces when only one tile has been changed.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def calculateFacesAt(tileX: Double, tileY: Double): Tilemap = js.native
    def calculateFacesAt(tileX: Double, tileY: Double, layer: String): Tilemap = js.native
    def calculateFacesAt(tileX: Double, tileY: Double, layer: Double): Tilemap = js.native
    def calculateFacesAt(tileX: Double, tileY: Double, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
      * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
      * is mostly used internally.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def calculateFacesWithin(
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
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
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Boolean
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Boolean,
      layer: String
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Boolean,
      layer: Double
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Boolean,
      layer: TilemapLayer
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Unit,
      layer: String
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Unit,
      layer: Double
    ): Tilemap = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Unit,
      layer: TilemapLayer
    ): Tilemap = js.native
    
    /**
      * Creates a new and empty Tilemap Layer. The currently selected layer in the map is set to this new layer.
      * 
      * Prior to v3.50.0 this method was called `createBlankDynamicLayer`.
      * @param name The name of this layer. Must be unique within the map.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      * @param width The width of the layer in tiles. If not specified, it will default to the map's width.
      * @param height The height of the layer in tiles. If not specified, it will default to the map's height.
      * @param tileWidth The width of the tiles the layer uses for calculations. If not specified, it will default to the map's tileWidth.
      * @param tileHeight The height of the tiles the layer uses for calculations. If not specified, it will default to the map's tileHeight.
      */
    def createBlankLayer(
      name: String,
      tileset: String | (js.Array[String | Tileset]) | Tileset,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      tileWidth: js.UndefOr[Double],
      tileHeight: js.UndefOr[Double]
    ): TilemapLayer = js.native
    
    def createFromObjects(objectLayerName: String, config: js.Array[CreateFromObjectLayerConfig]): js.Array[GameObject] = js.native
    /**
      * This method will iterate through all of the objects defined in a Tiled Object Layer and then
      * convert the matching results into Phaser Game Objects (by default, Sprites)
      * 
      * Objects are matched on one of 3 criteria: The Object ID, the Object GID or the Object Name.
      * 
      * Within Tiled, Object IDs are unique per Object. Object GIDs, however, are shared by all objects
      * using the same image. Finally, Object Names are strings and the same name can be used on multiple
      * Objects in Tiled, they do not have to be unique.
      * 
      * You set the configuration parameter accordingly, based on which type of criteria you wish
      * to match against. For example, to convert all items on an Object Layer with a `gid` of 26:
      * 
      * ```javascript
      * createFromObjects(layerName, {
      *   gid: 26
      * });
      * ```
      * 
      * Or, to convert objects with the name 'bonus':
      * 
      * ```javascript
      * createFromObjects(layerName, {
      *   name: 'bonus'
      * });
      * ```
      * 
      * Or, to convert an object with a specific id:
      * 
      * ```javascript
      * createFromObjects(layerName, {
      *   id: 9
      * });
      * ```
      * 
      * You should only specify either `id`, `gid`, `name`, or none of them. Do not add more than
      * one criteria to your config. If you do not specify any criteria, then _all_ objects in the
      * Object Layer will be converted.
      * 
      * By default this method will convert objects into `Sprite` instances, but you can override
      * this by providing your own class type:
      * 
      * ```javascript
      * createFromObjects(layerName, {
      *   gid: 26,
      *   classType: Coin
      * });
      * ```
      * 
      * This will convert all Objects with a gid of 26 into your custom `Coin` class. You can pass
      * any class type here, but it _must_ extend `Phaser.GameObjects.GameObject` as its base class.
      * Your class will always be passed 1 parameter: `scene`, which is a reference to either the Scene
      * specified in the config object or, if not given, the Scene to which this Tilemap belongs.
      * 
      * All properties from object are copied into the Game Object, so you can use this as an easy
      * way to configure properties from within the map editor. For example giving an object a
      * property of `alpha: 0.5` in Tiled will be reflected in the Game Object that is created.
      * 
      * Custom object properties that do not exist as a Game Object property are set in the
      * Game Objects {@link Phaser.GameObjects.GameObject#data data store}.
      * 
      * You can use set a `container` property in the config. If given, the class will be added to
      * the Container instance instead of the Scene.
      * 
      * Finally, you can provide an array of config objects, to convert multiple types of object in
      * a single call:
      * 
      * ```javascript
      * createFromObjects(layerName, [
      *   {
      *     gid: 26,
      *     classType: Coin
      *   },
      *   {
      *     id: 9,
      *     classType: BossMonster
      *   },
      *   {
      *     name: 'lava',
      *     classType: LavaTile
      *   }
      * ]);
      * ```
      * 
      * The signature of this method changed significantly in v3.50.0. Prior to this, it did not take config objects.
      * @param objectLayerName The name of the Tiled object layer to create the Game Objects from.
      * @param config A CreateFromObjects configuration object, or an array of them.
      */
    def createFromObjects(objectLayerName: String, config: CreateFromObjectLayerConfig): js.Array[GameObject] = js.native
    
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
      * @param scene The Scene to create the Sprites within.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def createFromTiles(
      indexes: Double | js.Array[Any],
      replacements: Double | js.Array[Any],
      spriteConfig: SpriteConfig,
      scene: js.UndefOr[Scene],
      camera: js.UndefOr[Camera],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): js.Array[Sprite] = js.native
    
    def createLayer(layerID: String, tileset: String): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: String, x: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: String, x: Double, y: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: String, x: Unit, y: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: js.Array[String | Tileset]): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double, y: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: js.Array[String | Tileset], x: Unit, y: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: Tileset): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: Tileset, x: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: Tileset, x: Double, y: Double): TilemapLayer = js.native
    def createLayer(layerID: String, tileset: Tileset, x: Unit, y: Double): TilemapLayer = js.native
    /**
      * Creates a new Tilemap Layer that renders the LayerData associated with the given
      * `layerID`. The currently selected layer in the map is set to this new layer.
      * 
      * The `layerID` is important. If you've created your map in Tiled then you can get this by
      * looking in Tiled and looking at the layer name. Or you can open the JSON file it exports and
      * look at the layers[].name value. Either way it must match.
      * 
      * Prior to v3.50.0 this method was called `createDynamicLayer`.
      * @param layerID The layer array index value, or if a string is given, the layer name from Tiled.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The x position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
      * @param y The y position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
      */
    def createLayer(layerID: Double, tileset: String): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: String, x: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: String, x: Double, y: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: String, x: Unit, y: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: js.Array[String | Tileset]): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: js.Array[String | Tileset], x: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: js.Array[String | Tileset], x: Double, y: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: js.Array[String | Tileset], x: Unit, y: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: Tileset): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: Tileset, x: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: Tileset, x: Double, y: Double): TilemapLayer = js.native
    def createLayer(layerID: Double, tileset: Tileset, x: Unit, y: Double): TilemapLayer = js.native
    
    /**
      * The index of the currently selected LayerData object.
      */
    var currentLayerIndex: Double = js.native
    
    /**
      * Removes all layer data from this Tilemap and nulls the scene reference. This will destroy any
      * TilemapLayers that have been created.
      */
    def destroy(): Unit = js.native
    
    /**
      * Destroys the given TilemapLayer and removes it from this Tilemap.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param layer The tile layer to be destroyed.
      */
    def destroyLayer(): Tilemap = js.native
    def destroyLayer(layer: String): Tilemap = js.native
    def destroyLayer(layer: Double): Tilemap = js.native
    def destroyLayer(layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Sets the tiles in the given rectangular area (in tile coordinates) of the layer with the
      * specified index. Tiles will be set to collide if the given index is a colliding index.
      * Collision information in the region will be recalculated.
      * 
      * If no layer specified, the map's current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param index The tile index to fill the area with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def fill(
      index: Double,
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      recalculateFaces: js.UndefOr[Boolean],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    def filterObjects(objectLayer: String, callback: TilemapFilterCallback): js.Array[TiledObject] = js.native
    def filterObjects(objectLayer: String, callback: TilemapFilterCallback, context: js.Object): js.Array[TiledObject] = js.native
    /**
      * For each object in the given object layer, run the given filter callback function. Any
      * objects that pass the filter test (i.e. where the callback returns true) will returned as a
      * new array. Similar to Array.prototype.Filter in vanilla JS.
      * @param objectLayer The name of an object layer (from Tiled) or an ObjectLayer instance.
      * @param callback The callback. Each object in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      */
    def filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback): js.Array[TiledObject] = js.native
    def filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback, context: js.Object): js.Array[TiledObject] = js.native
    
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
      * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
      * If no layer specified, the map's current layer is used.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter. The callback should return true for tiles that pass the
      * filter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def filterTiles(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[String | Double | TilemapLayer]
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
    def findByIndex(index: Double): Tile = js.native
    def findByIndex(index: Double, skip: Double): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Boolean): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Boolean, layer: String): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Boolean, layer: Double): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Boolean, layer: TilemapLayer): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Unit, layer: String): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Unit, layer: Double): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Unit, layer: TilemapLayer): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Boolean): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Boolean, layer: String): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Boolean, layer: Double): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Boolean, layer: TilemapLayer): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Unit, layer: String): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Unit, layer: Double): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Unit, layer: TilemapLayer): Tile = js.native
    
    def findObject(objectLayer: String, callback: TilemapFindCallback): TiledObject = js.native
    def findObject(objectLayer: String, callback: TilemapFindCallback, context: js.Object): TiledObject = js.native
    /**
      * Find the first object in the given object layer that satisfies the provided testing function.
      * I.e. finds the first object for which `callback` returns true. Similar to
      * Array.prototype.find in vanilla JS.
      * @param objectLayer The name of an object layer (from Tiled) or an ObjectLayer instance.
      * @param callback The callback. Each object in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      */
    def findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback): TiledObject = js.native
    def findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback, context: js.Object): TiledObject = js.native
    
    /**
      * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
      * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
      * true. Similar to Array.prototype.find in vanilla JS.
      * If no layer specified, the maps current layer is used.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tile layer to run the search on. If not provided will use the current layer.
      */
    def findTile(
      callback: FindTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tile = js.native
    
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * callback. Similar to Array.prototype.forEach in vanilla JS.
      * 
      * If no layer specified, the map's current layer is used.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tile layer to run the search on. If not provided will use the current layer.
      */
    def forEachTile(
      callback: EachTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    /**
      * The format of the map data.
      */
    var format: Double = js.native
    
    /**
      * Gets the image layer index based on its name.
      * @param name The name of the image to get.
      */
    def getImageIndex(name: String): Double = js.native
    
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
    def getIndex(location: js.Array[Any], name: String): Double = js.native
    
    /**
      * Gets the LayerData from `this.layers` that is associated with the given `layer`, or null if the layer is invalid.
      * @param layer The name of the layer from Tiled, the index of the layer in the map or Tilemap Layer. If not given will default to the maps current layer index.
      */
    def getLayer(): LayerData = js.native
    def getLayer(layer: String): LayerData = js.native
    def getLayer(layer: Double): LayerData = js.native
    def getLayer(layer: TilemapLayer): LayerData = js.native
    
    /**
      * Gets the LayerData index of the given `layer` within this.layers, or null if an invalid
      * `layer` is given.
      * @param layer The name of the layer from Tiled, the index of the layer in the map or a Tilemap Layer. If not given will default to the map's current layer index.
      */
    def getLayerIndex(): Double = js.native
    def getLayerIndex(layer: String): Double = js.native
    def getLayerIndex(layer: Double): Double = js.native
    def getLayerIndex(layer: TilemapLayer): Double = js.native
    
    /**
      * Gets the index of the LayerData within this.layers that has the given `name`, or null if an
      * invalid `name` is given.
      * @param name The name of the layer to get.
      */
    def getLayerIndexByName(name: String): Double = js.native
    
    /**
      * Gets the ObjectLayer from `this.objects` that has the given `name`, or null if no ObjectLayer is found with that name.
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
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param nonNull If true getTile won't return null for empty tiles, but a Tile object with an index of -1.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTileAt(tileX: Double, tileY: Double): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Boolean): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Boolean, layer: String): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Boolean, layer: Double): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Boolean, layer: TilemapLayer): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Unit, layer: String): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Unit, layer: Double): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Unit, layer: TilemapLayer): Tile = js.native
    
    /**
      * Gets a tile at the given world coordinates from the given layer.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldX X position to get the tile from (given in pixels)
      * @param worldY Y position to get the tile from (given in pixels)
      * @param nonNull If true, function won't return null for empty tiles, but a Tile object with an index of -1.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Unit, layer: String): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Unit, layer: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Unit, layer: TilemapLayer): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: String): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: TilemapLayer): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Unit, layer: String): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Unit, layer: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Unit, layer: TilemapLayer): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Camera): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Camera, layer: String): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Camera, layer: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Camera, layer: TilemapLayer): Tile = js.native
    
    /**
      * Return a list of all valid tilelayer names loaded in this Tilemap.
      */
    def getTileLayerNames(): js.Array[String] = js.native
    
    /**
      * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTilesWithin(
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): js.Array[Tile] = js.native
    
    /**
      * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
      * Line, Rectangle or Triangle. The shape should be in world coordinates.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param shape A shape in world (pixel) coordinates
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTilesWithinShape(
      shape: Circle | Line | Rectangle | Triangle,
      filteringOptions: js.UndefOr[FilteringOptions],
      camera: js.UndefOr[Camera],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): js.Array[Tile] = js.native
    
    /**
      * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldX The world x coordinate for the top-left of the area.
      * @param worldY The world y coordinate for the top-left of the area.
      * @param width The width of the area.
      * @param height The height of the area.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Unit,
      layer: String
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Unit,
      layer: Double
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Unit,
      layer: TilemapLayer
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Camera
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Camera,
      layer: String
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Camera,
      layer: Double
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
      camera: Camera,
      layer: TilemapLayer
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Unit,
      layer: String
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Unit,
      layer: Double
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Unit,
      layer: TilemapLayer
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
      layer: Double
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: TilemapLayer
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
    def getTilesetIndex(name: String): Double = js.native
    
    /**
      * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def hasTileAt(tileX: Double, tileY: Double): Boolean = js.native
    def hasTileAt(tileX: Double, tileY: Double, layer: String): Boolean = js.native
    def hasTileAt(tileX: Double, tileY: Double, layer: Double): Boolean = js.native
    def hasTileAt(tileX: Double, tileY: Double, layer: TilemapLayer): Boolean = js.native
    
    /**
      * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param camera The Camera to use when factoring in which tiles to return.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Unit, layer: String): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Unit, layer: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Unit, layer: TilemapLayer): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: String): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: TilemapLayer): Boolean = js.native
    
    /**
      * The height of the map (in tiles).
      */
    var height: Double = js.native
    
    /**
      * The height of the map in pixels based on height * tileHeight.
      */
    var heightInPixels: Double = js.native
    
    /**
      * The length of the horizontal sides of the hexagon.
      * Only used for hexagonal orientation Tilemaps.
      */
    var hexSideLength: Double = js.native
    
    /**
      * A collection of Images, as parsed from Tiled map data.
      */
    var imageCollections: js.Array[ImageCollection] = js.native
    
    /**
      * An array of Tiled Image Layers.
      */
    var images: js.Array[Any] = js.native
    
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
      * Puts a tile at the given tile coordinates in the specified layer. You can pass in either an index
      * or a Tile object. If you pass in a Tile, all attributes will be copied over to the specified
      * location. If you pass in an index, only the index at the specified location will be changed.
      * Collision information will be recalculated at the specified location.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tile The index of this tile to set or a Tile object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def putTileAt(tile: Double, tileX: Double, tileY: Double): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Boolean, layer: String): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Boolean, layer: Double): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Boolean, layer: TilemapLayer): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Unit, layer: String): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Unit, layer: Double): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Unit, layer: TilemapLayer): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Boolean, layer: String): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Boolean, layer: Double): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Boolean, layer: TilemapLayer): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Unit, layer: String): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Unit, layer: Double): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Unit, layer: TilemapLayer): Tile = js.native
    
    /**
      * Puts a tile at the given world coordinates (pixels) in the specified layer. You can pass in either
      * an index or a Tile object. If you pass in a Tile, all attributes will be copied over to the
      * specified location. If you pass in an index, only the index at the specified location will be
      * changed. Collision information will be recalculated at the specified location.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tile The index of this tile to set or a Tile object.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: String
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: Double
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: Double
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Unit, layer: String): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Unit, layer: Double): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Unit,
      camera: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Camera): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Unit,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Unit,
      camera: Camera,
      layer: Double
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Unit,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Unit, layer: String): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Unit, layer: Double): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: TilemapLayer
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
      layer: Double
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Unit, layer: String): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Unit, layer: Double): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Unit,
      camera: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Camera): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Camera, layer: String): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Camera, layer: Double): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Unit,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    
    /**
      * Puts an array of tiles or a 2D array of tiles at the given tile coordinates in the specified
      * layer. The array can be composed of either tile indexes or Tile objects. If you pass in a Tile,
      * all attributes will be copied over to the specified location. If you pass in an index, only the
      * index at the specified location will be changed. Collision information will be recalculated
      * within the region tiles were changed.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tile A row (array) or grid (2D array) of Tiles or tile indexes to place.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def putTilesAt(tile: js.Array[(js.Array[Double | Tile]) | Double | Tile], tileX: Double, tileY: Double): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean,
      layer: String
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean,
      layer: Double
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean,
      layer: TilemapLayer
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Unit,
      layer: String
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Unit,
      layer: Double
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Unit,
      layer: TilemapLayer
    ): Tilemap = js.native
    
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. If an array of indexes is passed in, then
      * those will be used for randomly assigning new tile indexes. If an array is not provided, the
      * indexes found within the region (excluding -1) will be used for randomly assigning new tile
      * indexes. This method only modifies tile indexes and does not change collision information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param indexes An array of indexes to randomly draw from during randomization.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def randomize(
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      indexes: js.UndefOr[js.Array[Double]],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    /**
      * Removes all Tilemap Layers from this Tilemap and calls `destroy` on each of them.
      */
    def removeAllLayers(): this.type = js.native
    
    /**
      * Removes the given TilemapLayer from this Tilemap without destroying it.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param layer The tile layer to be removed.
      */
    def removeLayer(): Tilemap = js.native
    def removeLayer(layer: String): Tilemap = js.native
    def removeLayer(layer: Double): Tilemap = js.native
    def removeLayer(layer: TilemapLayer): Tilemap = js.native
    
    def removeTile(tiles: js.Array[Tile]): js.Array[Tile] = js.native
    def removeTile(tiles: js.Array[Tile], replaceIndex: Double): js.Array[Tile] = js.native
    def removeTile(tiles: js.Array[Tile], replaceIndex: Double, recalculateFaces: Boolean): js.Array[Tile] = js.native
    def removeTile(tiles: js.Array[Tile], replaceIndex: Unit, recalculateFaces: Boolean): js.Array[Tile] = js.native
    /**
      * Removes the given Tile, or an array of Tiles, from the layer to which they belong,
      * and optionally recalculates the collision information.
      * @param tiles The Tile to remove, or an array of Tiles.
      * @param replaceIndex After removing the Tile, insert a brand new Tile into its location with the given index. Leave as -1 to just remove the tile. Default -1.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def removeTile(tiles: Tile): js.Array[Tile] = js.native
    def removeTile(tiles: Tile, replaceIndex: Double): js.Array[Tile] = js.native
    def removeTile(tiles: Tile, replaceIndex: Double, recalculateFaces: Boolean): js.Array[Tile] = js.native
    def removeTile(tiles: Tile, replaceIndex: Unit, recalculateFaces: Boolean): js.Array[Tile] = js.native
    
    /**
      * Removes the tile at the given tile coordinates in the specified layer and updates the layers collision information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param replaceWithNull If `true` (the default), this will replace the tile at the specified location with null instead of a Tile with an index of -1.
      * @param recalculateFaces If `true` (the default), the faces data will be recalculated.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def removeTileAt(tileX: Double, tileY: Double): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean, layer: String): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean, layer: Double): Tile = js.native
    def removeTileAt(
      tileX: Double,
      tileY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean, recalculateFaces: Unit, layer: String): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean, recalculateFaces: Unit, layer: Double): Tile = js.native
    def removeTileAt(
      tileX: Double,
      tileY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Boolean): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Boolean, layer: String): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Boolean, layer: Double): Tile = js.native
    def removeTileAt(
      tileX: Double,
      tileY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Unit, layer: String): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Unit, layer: Double): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Unit, layer: TilemapLayer): Tile = js.native
    
    /**
      * Removes the tile at the given world coordinates in the specified layer and updates the layers collision information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param replaceWithNull If `true` (the default), this will replace the tile at the specified location with null instead of a Tile with an index of -1.
      * @param recalculateFaces If `true` (the default), the faces data will be recalculated.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def removeTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: TilemapLayer
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
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      camera: Unit,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      camera: Unit,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      camera: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Unit, camera: Camera): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      camera: Camera,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Unit,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Unit, recalculateFaces: Boolean): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      camera: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Unit, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Unit,
      camera: Unit,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Unit,
      camera: Unit,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Unit,
      camera: Unit,
      layer: TilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Unit, recalculateFaces: Unit, camera: Camera): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Unit,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Unit,
      camera: Camera,
      layer: Double
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Unit,
      recalculateFaces: Unit,
      camera: Camera,
      layer: TilemapLayer
    ): Tile = js.native
    
    /**
      * Draws a debug representation of the layer to the given Graphics object. This is helpful when you want to
      * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
      * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
      * wherever you want on the screen.
      * 
      * If no layer is specified, the maps current layer is used.
      * 
      * **Note:** This method currently only works with orthogonal tilemap layers.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def renderDebug(graphics: Graphics): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: Unit, layer: String): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: Unit, layer: Double): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: Unit, layer: TilemapLayer): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: String): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: Double): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Draws a debug representation of all layers within this Tilemap to the given Graphics object.
      * 
      * This is helpful when you want to get a quick idea of which of your tiles are colliding and which
      * have interesting faces. The tiles are drawn starting at (0, 0) in the Graphics, allowing you to
      * place the debug representation wherever you want on the screen.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      */
    def renderDebugFull(graphics: Graphics): this.type = js.native
    def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig): this.type = js.native
    
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
    
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `findIndex` and updates their index to match `newIndex`. This only modifies the index and does
      * not change collision information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param findIndex The index of the tile to search for.
      * @param newIndex The index of the tile to replace it with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def replaceByIndex(
      findIndex: Double,
      newIndex: Double,
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    var scene: Scene = js.native
    
    /**
      * Sets the base tile size for the map. Note: this does not necessarily match the tileWidth and
      * tileHeight for all layers. This also updates the base size on all tiles across all layers.
      * @param tileWidth The width of the tiles the map uses for calculations.
      * @param tileHeight The height of the tiles the map uses for calculations.
      */
    def setBaseTileSize(tileWidth: Double, tileHeight: Double): this.type = js.native
    
    /**
      * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
      * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
      * collision will be enabled (true) or disabled (false).
      * 
      * If no layer is specified, the maps current layer is used.
      * @param indexes Either a single tile index, or an array of tile indexes.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The tile layer to use. If not given the current layer is used.
      * @param updateLayer If true, updates the current tiles on the layer. Set to false if no tiles have been placed for significant performance boost. Default true.
      */
    def setCollision(
      indexes: Double | js.Array[Any],
      collides: js.UndefOr[Boolean],
      recalculateFaces: js.UndefOr[Boolean],
      layer: js.UndefOr[String | Double | TilemapLayer],
      updateLayer: js.UndefOr[Boolean]
    ): Tilemap = js.native
    
    /**
      * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
      * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
      * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
      * enabled (true) or disabled (false).
      * 
      * If no layer is specified, the maps current layer is used.
      * @param start The first index of the tile to be set for collision.
      * @param stop The last index of the tile to be set for collision.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionBetween(start: Double, stop: Double): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
      * the given array. The `collides` parameter controls if collision will be enabled (true) or
      * disabled (false). Tile indexes not currently in the layer are not affected.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param indexes An array of the tile indexes to not be counted for collision.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionByExclusion(indexes: js.Array[Double]): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
      * that matches the given properties object, its collision flag will be set. The `collides`
      * parameter controls if collision will be enabled (true) or disabled (false). Passing in
      * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
      * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
      * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
      * "types" property that matches any of those values, its collision flag will be updated.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param properties An object with tile properties and corresponding values that should be checked.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionByProperty(properties: js.Object): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Sets collision on the tiles within a layer by checking each tiles collision group data
      * (typically defined in Tiled within the tileset collision editor). If any objects are found within
      * a tiles collision group, the tiles colliding information will be set. The `collides` parameter
      * controls if collision will be enabled (true) or disabled (false).
      * 
      * If no layer is specified, the maps current layer is used.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionFromCollisionGroup(): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Boolean, layer: Double): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Boolean, layer: TilemapLayer): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Unit, layer: String): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Unit, layer: Double): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Unit, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Sets the current layer to the LayerData associated with `layer`.
      * @param layer The name of the layer from Tiled, the index of the layer in the map or a TilemapLayer. If not given will default to the maps current layer index.
      */
    def setLayer(): this.type = js.native
    def setLayer(layer: String): this.type = js.native
    def setLayer(layer: Double): this.type = js.native
    def setLayer(layer: TilemapLayer): this.type = js.native
    
    /**
      * Sets the tile size for a specific `layer`. Note: this does not necessarily match the maps
      * tileWidth and tileHeight for all layers. This will set the tile size for the layer and any
      * tiles the layer has.
      * @param tileWidth The width of the tiles (in pixels) in the layer.
      * @param tileHeight The height of the tiles (in pixels) in the layer.
      * @param layer The name of the layer from Tiled, the index of the layer in the map or a TilemapLayer. If not given will default to the maps current layer index.
      */
    def setLayerTileSize(tileWidth: Double, tileHeight: Double): this.type = js.native
    def setLayerTileSize(tileWidth: Double, tileHeight: Double, layer: String): this.type = js.native
    def setLayerTileSize(tileWidth: Double, tileHeight: Double, layer: Double): this.type = js.native
    def setLayerTileSize(tileWidth: Double, tileHeight: Double, layer: TilemapLayer): this.type = js.native
    
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
      * Calling this method _after_ creating Tilemap Layers will **not** automatically
      * update them to use the new render order. If you call this method after creating layers, use their
      * own `setRenderOrder` methods to change them as needed.
      * @param renderOrder The render (draw) order value. Either an integer between 0 and 3, or a string: 'right-down', 'left-down', 'right-up' or 'left-up'.
      */
    def setRenderOrder(renderOrder: Double): this.type = js.native
    
    def setTileIndexCallback(indexes: js.Array[Double], callback: js.Function, callbackContext: js.Object): Tilemap = js.native
    def setTileIndexCallback(indexes: js.Array[Double], callback: js.Function, callbackContext: js.Object, layer: String): Tilemap = js.native
    def setTileIndexCallback(indexes: js.Array[Double], callback: js.Function, callbackContext: js.Object, layer: Double): Tilemap = js.native
    def setTileIndexCallback(indexes: js.Array[Double], callback: js.Function, callbackContext: js.Object, layer: TilemapLayer): Tilemap = js.native
    /**
      * Sets a global collision callback for the given tile index within the layer. This will affect all
      * tiles on this layer that have the same index. If a callback is already set for the tile index it
      * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
      * at a specific location on the map then see `setTileLocationCallback`.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param indexes Either a single tile index, or an array of tile indexes to have a collision callback set for. All values should be integers.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setTileIndexCallback(indexes: Double, callback: js.Function, callbackContext: js.Object): Tilemap = js.native
    def setTileIndexCallback(indexes: Double, callback: js.Function, callbackContext: js.Object, layer: String): Tilemap = js.native
    def setTileIndexCallback(indexes: Double, callback: js.Function, callbackContext: js.Object, layer: Double): Tilemap = js.native
    def setTileIndexCallback(indexes: Double, callback: js.Function, callbackContext: js.Object, layer: TilemapLayer): Tilemap = js.native
    
    /**
      * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
      * If a callback is already set for the tile index it will be replaced. Set the callback to null to
      * remove it.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setTileLocationCallback(tileX: Double, tileY: Double, width: Double, height: Double, callback: js.Function): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: js.Object
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: js.Object,
      layer: String
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: js.Object,
      layer: Double
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: js.Object,
      layer: TilemapLayer
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: Unit,
      layer: String
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: Unit,
      layer: Double
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: Unit,
      layer: TilemapLayer
    ): Tilemap = js.native
    
    /**
      * Shuffles the tiles in a rectangular region (specified in tile coordinates) within the given
      * layer. It will only randomize the tiles in that area, so if they're all the same nothing will
      * appear to have changed! This method only modifies tile indexes and does not change collision
      * information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def shuffle(
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `indexA` and swaps then with `indexB`. This only modifies the index and does not change collision
      * information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileA First tile index.
      * @param tileB Second tile index.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def swapByIndex(
      tileA: Double,
      tileB: Double,
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    /**
      * The base height of a tile in pixels. Note that individual layers may have a different
      * tile height.
      */
    var tileHeight: Double = js.native
    
    /**
      * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def tileToWorldX(tileX: Double): Double = js.native
    def tileToWorldX(tileX: Double, camera: Unit, layer: String): Double = js.native
    def tileToWorldX(tileX: Double, camera: Unit, layer: Double): Double = js.native
    def tileToWorldX(tileX: Double, camera: Unit, layer: TilemapLayer): Double = js.native
    def tileToWorldX(tileX: Double, camera: Camera): Double = js.native
    def tileToWorldX(tileX: Double, camera: Camera, layer: String): Double = js.native
    def tileToWorldX(tileX: Double, camera: Camera, layer: Double): Double = js.native
    def tileToWorldX(tileX: Double, camera: Camera, layer: TilemapLayer): Double = js.native
    
    /**
      * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param vec2 A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def tileToWorldXY(tileX: Double, tileY: Double): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Unit, layer: String): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Unit, layer: Double): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Unit, layer: TilemapLayer): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Camera): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Camera, layer: String): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Camera, layer: Double): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Unit, camera: Camera, layer: TilemapLayer): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Unit, layer: String): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Unit, layer: Double): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Unit, layer: TilemapLayer): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Camera): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Camera, layer: String): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Camera, layer: Double): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, vec2: Vector2, camera: Camera, layer: TilemapLayer): Vector2 = js.native
    
    /**
      * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def tileToWorldY(tileY: Double): Double = js.native
    def tileToWorldY(tileY: Double, camera: Unit, layer: String): Double = js.native
    def tileToWorldY(tileY: Double, camera: Unit, layer: Double): Double = js.native
    def tileToWorldY(tileY: Double, camera: Unit, layer: TilemapLayer): Double = js.native
    def tileToWorldY(tileY: Double, camera: Camera): Double = js.native
    def tileToWorldY(tileY: Double, camera: Camera, layer: String): Double = js.native
    def tileToWorldY(tileY: Double, camera: Camera, layer: Double): Double = js.native
    def tileToWorldY(tileY: Double, camera: Camera, layer: TilemapLayer): Double = js.native
    
    /**
      * The base width of a tile in pixels. Note that individual layers may have a different tile
      * width.
      */
    var tileWidth: Double = js.native
    
    /**
      * An array of Tilesets used in the map.
      */
    var tilesets: js.Array[Tileset] = js.native
    
    /**
      * The version of the map data (as specified in Tiled, usually 1).
      */
    var version: Double = js.native
    
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
      * The probability of any index being picked is (the indexs weight) / (sum of all weights). This
      * method only modifies tile indexes and does not change collision information.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param weightedIndexes An array of objects to randomly draw from during randomization. They should be in the form: { index: 0, weight: 4 } or { index: [0, 1], weight: 4 } if you wish to draw from multiple tile indexes.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def weightedRandomize(
      weightedIndexes: js.Array[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      layer: js.UndefOr[String | Double | TilemapLayer]
    ): Tilemap = js.native
    
    /**
      * The width of the map (in tiles).
      */
    var width: Double = js.native
    
    /**
      * The width of the map in pixels based on width * tileWidth.
      */
    var widthInPixels: Double = js.native
    
    /**
      * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def worldToTileX(worldX: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Unit, layer: String): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Unit, layer: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Unit, layer: TilemapLayer): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: String): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: TilemapLayer): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Unit, layer: String): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Unit, layer: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Unit, layer: TilemapLayer): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Camera): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Camera, layer: String): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Camera, layer: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Camera, layer: TilemapLayer): Double = js.native
    
    /**
      * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param vec2 A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Unit, camera: Unit, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Unit, camera: Unit, layer: Double): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      vec2: Unit,
      camera: Unit,
      layer: TilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Unit, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Unit, camera: Camera, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Unit, camera: Camera, layer: Double): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      vec2: Unit,
      camera: Camera,
      layer: TilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Vector2, camera: Unit, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Vector2, camera: Unit, layer: Double): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      vec2: Vector2,
      camera: Unit,
      layer: TilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Vector2, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Vector2, camera: Camera, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, vec2: Vector2, camera: Camera, layer: Double): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      vec2: Vector2,
      camera: Camera,
      layer: TilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Unit, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Unit, layer: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Unit, layer: TilemapLayer): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Camera, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Camera, layer: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Unit, camera: Camera, layer: TilemapLayer): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Vector2, camera: Unit, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Vector2, camera: Unit, layer: Double): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Unit,
      vec2: Vector2,
      camera: Unit,
      layer: TilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Vector2, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Vector2, camera: Camera, layer: String): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, vec2: Vector2, camera: Camera, layer: Double): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Unit,
      vec2: Vector2,
      camera: Camera,
      layer: TilemapLayer
    ): Vector2 = js.native
    
    /**
      * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer is specified, the maps current layer is used.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def worldToTileY(worldY: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Unit, layer: String): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Unit, layer: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Unit, layer: TilemapLayer): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: String): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: TilemapLayer): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Unit, layer: String): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Unit, layer: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Unit, layer: TilemapLayer): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Camera): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Camera, layer: String): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Camera, layer: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Camera, layer: TilemapLayer): Double = js.native
  }
  
  /**
    * A Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
    * with one, or more, Tilesets.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
  trait TilemapLayer
    extends StObject
       with GameObject
       with Alpha
       with BlendMode
       with ComputedSize
       with Depth
       with Flip
       with GetBounds
       with Origin
       with Pipeline
       with ScrollFactor
       with Transform
       with Visible {
    
    /**
      * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
      * faces are used internally for optimizing collisions against tiles. This method is mostly used
      * internally to optimize recalculating faces when only one tile has been changed.
      * @param tileX The x coordinate.
      * @param tileY The y coordinate.
      */
    def calculateFacesAt(tileX: Double, tileY: Double): this.type = js.native
    
    /**
      * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
      * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
      * is mostly used internally.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      */
    def calculateFacesWithin(): this.type = js.native
    def calculateFacesWithin(tileX: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Double, width: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def calculateFacesWithin(tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * Copies the tiles in the source rectangular area to a new destination (all specified in tile
      * coordinates) within the layer. This copies all tile properties & recalculates collision
      * information in the destination region.
      * @param srcTileX The x coordinate of the area to copy from, in tiles, not pixels.
      * @param srcTileY The y coordinate of the area to copy from, in tiles, not pixels.
      * @param width The width of the area to copy, in tiles, not pixels.
      * @param height The height of the area to copy, in tiles, not pixels.
      * @param destTileX The x coordinate of the area to copy to, in tiles, not pixels.
      * @param destTileY The y coordinate of the area to copy to, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double
    ): this.type = js.native
    def copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Boolean
    ): this.type = js.native
    
    def createFromTiles(indexes: js.Array[Any], replacements: js.Array[Any]): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[Any],
      replacements: js.Array[Any],
      spriteConfig: Unit,
      scene: Unit,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: js.Array[Any], spriteConfig: Unit, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[Any],
      replacements: js.Array[Any],
      spriteConfig: Unit,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: js.Array[Any], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[Any],
      replacements: js.Array[Any],
      spriteConfig: SpriteConfig,
      scene: Unit,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: js.Array[Any], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[Any],
      replacements: js.Array[Any],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: Double): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: Double, spriteConfig: Unit, scene: Unit, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: Double, spriteConfig: Unit, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: Double, spriteConfig: Unit, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: Double, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[Any],
      replacements: Double,
      spriteConfig: SpriteConfig,
      scene: Unit,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[Any], replacements: Double, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[Any],
      replacements: Double,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: js.Array[Any]): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: js.Array[Any], spriteConfig: Unit, scene: Unit, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: js.Array[Any], spriteConfig: Unit, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: js.Array[Any], spriteConfig: Unit, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: js.Array[Any], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: Double,
      replacements: js.Array[Any],
      spriteConfig: SpriteConfig,
      scene: Unit,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: js.Array[Any], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: Double,
      replacements: js.Array[Any],
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
      * @param scene The Scene to create the Sprites within.
      * @param camera The Camera to use when determining the world XY
      */
    def createFromTiles(indexes: Double, replacements: Double): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: Unit, scene: Unit, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: Unit, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: Unit, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: SpriteConfig, scene: Unit, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: Double, replacements: Double, spriteConfig: SpriteConfig, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    
    /**
      * Returns the tiles in the given layer that are within the cameras viewport.
      * This is used internally during rendering.
      * @param camera The Camera to run the cull check against.
      */
    def cull(): js.Array[Tile] = js.native
    def cull(camera: Camera): js.Array[Tile] = js.native
    
    /**
      * The callback that is invoked when the tiles are culled.
      * 
      * It will call a different function based on the map orientation:
      * 
      * Orthogonal (the default) is `TilemapComponents.CullTiles`
      * Isometric is `TilemapComponents.IsometricCullTiles`
      * Hexagonal is `TilemapComponents.HexagonalCullTiles`
      * Staggered is `TilemapComponents.StaggeredCullTiles`
      * 
      * However, you can override this to call any function you like.
      * 
      * It will be sent 4 arguments:
      * 
      * 1. The Phaser.Tilemaps.LayerData object for this Layer
      * 2. The Camera that is culling the layer. You can check its `dirty` property to see if it has changed since the last cull.
      * 3. A reference to the `culledTiles` array, which should be used to store the tiles you want rendered.
      * 4. The Render Order constant.
      * 
      * See the `TilemapComponents.CullTiles` source code for details on implementing your own culling system.
      */
    var cullCallback: js.Function = js.native
    
    /**
      * The amount of extra tiles to add into the cull rectangle when calculating its horizontal size.
      * 
      * See the method `setCullPadding` for more details.
      */
    var cullPaddingX: Double = js.native
    
    /**
      * The amount of extra tiles to add into the cull rectangle when calculating its vertical size.
      * 
      * See the method `setCullPadding` for more details.
      */
    var cullPaddingY: Double = js.native
    
    /**
      * Used internally during rendering. This holds the tiles that are visible within the Camera.
      */
    var culledTiles: js.Array[Tile] = js.native
    
    /**
      * Sets the tiles in the given rectangular area (in tile coordinates) of the layer with the
      * specified index. Tiles will be set to collide if the given index is a colliding index.
      * Collision information in the region will be recalculated.
      * @param index The tile index to fill the area with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def fill(index: Double): this.type = js.native
    def fill(index: Double, tileX: Double): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Double): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Double, width: Double): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def fill(
      index: Double,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      recalculateFaces: Boolean
    ): this.type = js.native
    def fill(
      index: Double,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Unit,
      recalculateFaces: Boolean
    ): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def fill(
      index: Double,
      tileX: Double,
      tileY: Double,
      width: Unit,
      height: Double,
      recalculateFaces: Boolean
    ): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Double, width: Unit, height: Unit, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def fill(
      index: Double,
      tileX: Double,
      tileY: Unit,
      width: Double,
      height: Double,
      recalculateFaces: Boolean
    ): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Unit, width: Double, height: Unit, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Unit, width: Unit, height: Double, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Double, tileY: Unit, width: Unit, height: Unit, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def fill(
      index: Double,
      tileX: Unit,
      tileY: Double,
      width: Double,
      height: Double,
      recalculateFaces: Boolean
    ): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double, width: Double, height: Unit, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double, width: Unit, height: Double, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Double, width: Unit, height: Unit, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Double, height: Double, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Double, height: Unit, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Unit, height: Double, recalculateFaces: Boolean): this.type = js.native
    def fill(index: Double, tileX: Unit, tileY: Unit, width: Unit, height: Unit, recalculateFaces: Boolean): this.type = js.native
    
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
      * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter. The callback should return true for tiles that pass the
      * filter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def filterTiles(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
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
      * @param reverse If true it will scan the layer in reverse, starting at the bottom-right. Otherwise it scans from the top-left. Default false.
      */
    def findByIndex(index: Double): Tile = js.native
    def findByIndex(index: Double, skip: Double): Tile = js.native
    def findByIndex(index: Double, skip: Double, reverse: Boolean): Tile = js.native
    def findByIndex(index: Double, skip: Unit, reverse: Boolean): Tile = js.native
    
    /**
      * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
      * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
      * true. Similar to Array.prototype.find in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def findTile(
      callback: FindTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): Tile = js.native
    
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * callback. Similar to Array.prototype.forEach in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context, or scope, under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def forEachTile(
      callback: EachTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): this.type = js.native
    
    /**
      * Gets a tile at the given tile coordinates from the given layer.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param nonNull If true getTile won't return null for empty tiles, but a Tile object with an index of -1. Default false.
      */
    def getTileAt(tileX: Double, tileY: Double): Tile = js.native
    def getTileAt(tileX: Double, tileY: Double, nonNull: Boolean): Tile = js.native
    
    /**
      * Gets a tile at the given world coordinates from the given layer.
      * @param worldX X position to get the tile from (given in pixels)
      * @param worldY Y position to get the tile from (given in pixels)
      * @param nonNull If true, function won't return null for empty tiles, but a Tile object with an index of -1. Default false.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Unit, camera: Camera): Tile = js.native
    
    /**
      * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def getTilesWithin(): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Double, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Unit, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Unit, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Double, width: Unit, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Double, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Unit, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Unit, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Double, tileY: Unit, width: Unit, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Double, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Unit, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Unit, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Double, width: Unit, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Double, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Unit, height: Double): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Unit, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithin(tileX: Unit, tileY: Unit, width: Unit, height: Unit, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    
    /**
      * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
      * Line, Rectangle or Triangle. The shape should be in world coordinates.
      * @param shape A shape in world (pixel) coordinates
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return.
      */
    def getTilesWithinShape(shape: Circle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: Unit, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: Unit, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: Unit, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: Unit, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    
    /**
      * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
      * @param worldX The world x coordinate for the top-left of the area.
      * @param worldY The world y coordinate for the top-left of the area.
      * @param width The width of the area.
      * @param height The height of the area.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return.
      */
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: Unit,
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
      * An array holding the mapping between the tile indexes and the tileset they belong to.
      */
    var gidMap: js.Array[Tileset] = js.native
    
    /**
      * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      */
    def hasTileAt(tileX: Double, tileY: Double): Boolean = js.native
    
    /**
      * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param camera The Camera to use when factoring in which tiles to return.
      */
    def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
    
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
    var layerIndex: Double = js.native
    
    /**
      * Puts a tile at the given tile coordinates in the specified layer. You can pass in either an index
      * or a Tile object. If you pass in a Tile, all attributes will be copied over to the specified
      * location. If you pass in an index, only the index at the specified location will be changed.
      * Collision information will be recalculated at the specified location.
      * @param tile The index of this tile to set or a Tile object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def putTileAt(tile: Double, tileX: Double, tileY: Double): Tile = js.native
    def putTileAt(tile: Double, tileX: Double, tileY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double): Tile = js.native
    def putTileAt(tile: Tile, tileX: Double, tileY: Double, recalculateFaces: Boolean): Tile = js.native
    
    /**
      * Puts a tile at the given world coordinates (pixels) in the specified layer. You can pass in either
      * an index or a Tile object. If you pass in a Tile, all attributes will be copied over to the
      * specified location. If you pass in an index, only the index at the specified location will be
      * changed. Collision information will be recalculated at the specified location.
      * @param tile The index of this tile to set or a Tile object.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def putTileAtWorldXY(tile: Double, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Camera): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Unit, camera: Camera): Tile = js.native
    
    /**
      * Puts an array of tiles or a 2D array of tiles at the given tile coordinates in the specified
      * layer. The array can be composed of either tile indexes or Tile objects. If you pass in a Tile,
      * all attributes will be copied over to the specified location. If you pass in an index, only the
      * index at the specified location will be changed. Collision information will be recalculated
      * within the region tiles were changed.
      * @param tile A row (array) or grid (2D array) of Tiles or tile indexes to place.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def putTilesAt(tile: js.Array[(js.Array[Double | Tile]) | Double | Tile], tileX: Double, tileY: Double): this.type = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Double | Tile]) | Double | Tile],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean
    ): this.type = js.native
    
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. If an array of indexes is passed in, then
      * those will be used for randomly assigning new tile indexes. If an array is not provided, the
      * indexes found within the region (excluding -1) will be used for randomly assigning new tile
      * indexes. This method only modifies tile indexes and does not change collision information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param indexes An array of indexes to randomly draw from during randomization.
      */
    def randomize(): this.type = js.native
    def randomize(tileX: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Double, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Double, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Unit, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Double, width: Unit, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Double, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Double, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Unit, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Double, tileY: Unit, width: Unit, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Double, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Double, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Unit, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Double, width: Unit, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Double, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Double, height: Unit, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Unit, height: Double, indexes: js.Array[Double]): this.type = js.native
    def randomize(tileX: Unit, tileY: Unit, width: Unit, height: Unit, indexes: js.Array[Double]): this.type = js.native
    
    /**
      * Removes the tile at the given tile coordinates in the specified layer and updates the layers
      * collision information.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def removeTileAt(tileX: Double, tileY: Double): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAt(tileX: Double, tileY: Double, replaceWithNull: Unit, recalculateFaces: Boolean): Tile = js.native
    
    /**
      * Removes the tile at the given world coordinates in the specified layer and updates the layers
      * collision information.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def removeTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera
    ): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Unit, camera: Camera): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Unit, recalculateFaces: Boolean): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Unit, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Unit, recalculateFaces: Unit, camera: Camera): Tile = js.native
    
    /**
      * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
      * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
      * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
      * wherever you want on the screen.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      */
    def renderDebug(graphics: Graphics): this.type = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig): this.type = js.native
    
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `findIndex` and updates their index to match `newIndex`. This only modifies the index and does
      * not change collision information.
      * @param findIndex The index of the tile to search for.
      * @param newIndex The index of the tile to replace it with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      */
    def replaceByIndex(findIndex: Double, newIndex: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Double, width: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def replaceByIndex(findIndex: Double, newIndex: Double, tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    
    def setCollision(indexes: js.Array[Any]): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Boolean): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Boolean, recalculateFaces: Unit, updateLayer: Boolean): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Unit, recalculateFaces: Boolean): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Unit, recalculateFaces: Boolean, updateLayer: Boolean): this.type = js.native
    def setCollision(indexes: js.Array[Any], collides: Unit, recalculateFaces: Unit, updateLayer: Boolean): this.type = js.native
    /**
      * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
      * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
      * collision will be enabled (true) or disabled (false).
      * @param indexes Either a single tile index, or an array of tile indexes.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param updateLayer If true, updates the current tiles on the layer. Set to false if no tiles have been placed for significant performance boost. Default true.
      */
    def setCollision(indexes: Double): this.type = js.native
    def setCollision(indexes: Double, collides: Boolean): this.type = js.native
    def setCollision(indexes: Double, collides: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollision(indexes: Double, collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): this.type = js.native
    def setCollision(indexes: Double, collides: Boolean, recalculateFaces: Unit, updateLayer: Boolean): this.type = js.native
    def setCollision(indexes: Double, collides: Unit, recalculateFaces: Boolean): this.type = js.native
    def setCollision(indexes: Double, collides: Unit, recalculateFaces: Boolean, updateLayer: Boolean): this.type = js.native
    def setCollision(indexes: Double, collides: Unit, recalculateFaces: Unit, updateLayer: Boolean): this.type = js.native
    
    /**
      * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
      * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
      * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
      * enabled (true) or disabled (false).
      * @param start The first index of the tile to be set for collision.
      * @param stop The last index of the tile to be set for collision.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionBetween(start: Double, stop: Double): this.type = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean): this.type = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollisionBetween(start: Double, stop: Double, collides: Unit, recalculateFaces: Boolean): this.type = js.native
    
    /**
      * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
      * the given array. The `collides` parameter controls if collision will be enabled (true) or
      * disabled (false). Tile indexes not currently in the layer are not affected.
      * @param indexes An array of the tile indexes to not be counted for collision.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionByExclusion(indexes: js.Array[Double]): this.type = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean): this.type = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollisionByExclusion(indexes: js.Array[Double], collides: Unit, recalculateFaces: Boolean): this.type = js.native
    
    /**
      * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
      * that matches the given properties object, its collision flag will be set. The `collides`
      * parameter controls if collision will be enabled (true) or disabled (false). Passing in
      * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
      * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
      * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
      * "types" property that matches any of those values, its collision flag will be updated.
      * @param properties An object with tile properties and corresponding values that should be checked.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionByProperty(properties: js.Object): this.type = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean): this.type = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollisionByProperty(properties: js.Object, collides: Unit, recalculateFaces: Boolean): this.type = js.native
    
    /**
      * Sets collision on the tiles within a layer by checking each tiles collision group data
      * (typically defined in Tiled within the tileset collision editor). If any objects are found within
      * a tiles collision group, the tile's colliding information will be set. The `collides` parameter
      * controls if collision will be enabled (true) or disabled (false).
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionFromCollisionGroup(): this.type = js.native
    def setCollisionFromCollisionGroup(collides: Boolean): this.type = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): this.type = js.native
    def setCollisionFromCollisionGroup(collides: Unit, recalculateFaces: Boolean): this.type = js.native
    
    /**
      * When a Camera culls the tiles in this layer it does so using its view into the world, building up a
      * rectangle inside which the tiles must exist or they will be culled. Sometimes you may need to expand the size
      * of this 'cull rectangle', especially if you plan on rotating the Camera viewing the layer. Do so
      * by providing the padding values. The values given are in tiles, not pixels. So if the tile width was 32px
      * and you set `paddingX` to be 4, it would add 32px x 4 to the cull rectangle (adjusted for scale)
      * @param paddingX The amount of extra horizontal tiles to add to the cull check padding. Default 1.
      * @param paddingY The amount of extra vertical tiles to add to the cull check padding. Default 1.
      */
    def setCullPadding(): this.type = js.native
    def setCullPadding(paddingX: Double): this.type = js.native
    def setCullPadding(paddingX: Double, paddingY: Double): this.type = js.native
    def setCullPadding(paddingX: Unit, paddingY: Double): this.type = js.native
    
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
    def setRenderOrder(renderOrder: Double): this.type = js.native
    
    /**
      * You can control if the Cameras should cull tiles before rendering them or not.
      * 
      * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
      * 
      * However, there are some instances when you may wish to disable this.
      * @param value Set to `true` to stop culling tiles. Set to `false` to enable culling again. Default true.
      */
    def setSkipCull(): this.type = js.native
    def setSkipCull(value: Boolean): this.type = js.native
    
    def setTileIndexCallback(indexes: js.Array[Double], callback: js.Function, callbackContext: js.Object): this.type = js.native
    /**
      * Sets a global collision callback for the given tile index within the layer. This will affect all
      * tiles on this layer that have the same index. If a callback is already set for the tile index it
      * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
      * at a specific location on the map then see setTileLocationCallback.
      * @param indexes Either a single tile index, or an array of tile indexes to have a collision callback set for.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      */
    def setTileIndexCallback(indexes: Double, callback: js.Function, callbackContext: js.Object): this.type = js.native
    
    /**
      * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
      * If a callback is already set for the tile index it will be replaced. Set the callback to null to
      * remove it.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context, or scope, under which the callback is invoked.
      */
    def setTileLocationCallback(
      tileX: js.UndefOr[Double],
      tileY: js.UndefOr[Double],
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      callback: js.UndefOr[js.Function],
      callbackContext: js.UndefOr[js.Object]
    ): this.type = js.native
    
    /**
      * Shuffles the tiles in a rectangular region (specified in tile coordinates) within the given
      * layer. It will only randomize the tiles in that area, so if they're all the same nothing will
      * appear to have changed! This method only modifies tile indexes and does not change collision
      * information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      */
    def shuffle(): this.type = js.native
    def shuffle(tileX: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Double, width: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def shuffle(tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def shuffle(tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * You can control if the camera should cull tiles on this layer before rendering them or not.
      * 
      * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
      * 
      * However, there are some instances when you may wish to disable this, and toggling this flag allows
      * you to do so. Also see `setSkipCull` for a chainable method that does the same thing.
      */
    var skipCull: Boolean = js.native
    
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `indexA` and swaps then with `indexB`. This only modifies the index and does not change collision
      * information.
      * @param tileA First tile index.
      * @param tileB Second tile index.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      */
    def swapByIndex(tileA: Double, tileB: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Double, width: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def swapByIndex(tileA: Double, tileB: Double, tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def tileToWorldX(tileX: Double): Double = js.native
    def tileToWorldX(tileX: Double, camera: Camera): Double = js.native
    
    /**
      * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def tileToWorldXY(tileX: Double, tileY: Double): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, point: Unit, camera: Camera): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, point: Vector2): Vector2 = js.native
    def tileToWorldXY(tileX: Double, tileY: Double, point: Vector2, camera: Camera): Vector2 = js.native
    
    /**
      * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def tileToWorldY(tileY: Double): Double = js.native
    def tileToWorldY(tileY: Double, camera: Camera): Double = js.native
    
    /**
      * The Tilemap that this layer is a part of.
      */
    var tilemap: Tilemap = js.native
    
    /**
      * The total number of tiles drawn by the renderer in the last frame.
      */
    val tilesDrawn: Double = js.native
    
    /**
      * The total number of tiles in this layer. Updated every frame.
      */
    val tilesTotal: Double = js.native
    
    /**
      * An array of `Tileset` objects associated with this layer.
      */
    var tileset: js.Array[Tileset] = js.native
    
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
      * @param weightedIndexes An array of objects to randomly draw from during randomization. They should be in the form: { index: 0, weight: 4 } or { index: [0, 1], weight: 4 } if you wish to draw from multiple tile indexes.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      */
    def weightedRandomize(weightedIndexes: js.Array[js.Object]): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Double, width: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Double, width: Double, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Double, width: Unit, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Unit, width: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Unit, width: Double, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Double, tileY: Unit, width: Unit, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Double, width: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Double, width: Double, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Double, width: Unit, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Unit, width: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Unit, width: Double, height: Double): this.type = js.native
    def weightedRandomize(weightedIndexes: js.Array[js.Object], tileX: Unit, tileY: Unit, width: Unit, height: Double): this.type = js.native
    
    /**
      * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def worldToTileX(worldX: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Unit, camera: Camera): Double = js.native
    
    /**
      * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Unit, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, point: Unit, camera: Camera): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, point: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Unit, point: Vector2, camera: Camera): Vector2 = js.native
    
    /**
      * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      */
    def worldToTileY(worldY: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Unit, camera: Camera): Double = js.native
  }
  
  /**
    * A Tileset is a combination of an image containing the tiles and a container for data about
    * each tile.
    */
  @js.native
  trait Tileset extends StObject {
    
    /**
      * The number of tile columns in the tileset.
      */
    val columns: Double = js.native
    
    /**
      * Returns true if and only if this Tileset contains the given tile index.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def containsTileIndex(tileIndex: Double): Boolean = js.native
    
    /**
      * The starting index of the first tile index this Tileset contains.
      */
    var firstgid: Double = js.native
    
    /**
      * Get a tile's collision group that is stored in the Tileset. Returns null if tile index is not
      * contained in this Tileset. This is typically defined within Tiled's tileset collision editor.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileCollisionGroup(tileIndex: Double): js.Object = js.native
    
    /**
      * Get a tile's data that is stored in the Tileset. Returns null if tile index is not contained
      * in this Tileset. This is typically defined in Tiled and will contain both Tileset collision
      * info and terrain mapping.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileData(tileIndex: Double): js.UndefOr[js.Object] = js.native
    
    /**
      * Get a tiles properties that are stored in the Tileset. Returns null if tile index is not
      * contained in this Tileset. This is typically defined in Tiled under the Tileset editor.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileProperties(tileIndex: Double): js.UndefOr[js.Object] = js.native
    
    /**
      * Returns the texture coordinates (UV in pixels) in the Tileset image for the given tile index.
      * Returns null if tile index is not contained in this Tileset.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileTextureCoordinates(tileIndex: Double): js.Object = js.native
    
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
    val rows: Double = js.native
    
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
    def setSpacing(margin: Double): Tileset = js.native
    def setSpacing(margin: Double, spacing: Double): Tileset = js.native
    def setSpacing(margin: Unit, spacing: Double): Tileset = js.native
    
    /**
      * Sets the tile width & height and updates the tile data (rows, columns, etc.).
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      */
    def setTileSize(): Tileset = js.native
    def setTileSize(tileWidth: Double): Tileset = js.native
    def setTileSize(tileWidth: Double, tileHeight: Double): Tileset = js.native
    def setTileSize(tileWidth: Unit, tileHeight: Double): Tileset = js.native
    
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
    val tileHeight: Double = js.native
    
    /**
      * The margin around the tiles in the sheet (in pixels). Use `setSpacing` to change.
      */
    val tileMargin: Double = js.native
    
    /**
      * Tileset-specific properties per tile that are typically defined in the Tiled editor in the
      * Tileset editor.
      */
    var tileProperties: js.Object = js.native
    
    /**
      * The spacing between each the tile in the sheet (in pixels). Use `setSpacing` to change.
      */
    val tileSpacing: Double = js.native
    
    /**
      * The width of each tile (in pixels). Use setTileSize to change.
      */
    val tileWidth: Double = js.native
    
    /**
      * The total number of tiles in the tileset.
      */
    val total: Double = js.native
    
    /**
      * Updates tile texture coordinates and tileset data.
      * @param imageWidth The (expected) width of the image to slice.
      * @param imageHeight The (expected) height of the image to slice.
      */
    def updateTileData(imageWidth: Double, imageHeight: Double): Tileset = js.native
  }
}
