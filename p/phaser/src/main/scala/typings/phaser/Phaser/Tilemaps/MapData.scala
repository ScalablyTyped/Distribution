package typings.phaser.Phaser.Tilemaps

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
  * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
  * itself.
  */
@js.native
trait MapData extends js.Object {
  
  /**
    * An object of collision data. Must be created as physics object or will return undefined.
    */
  var collision: js.Object = js.native
  
  /**
    * The format of the map data.
    */
  var format: integer = js.native
  
  /**
    * The height of the entire tilemap.
    */
  var height: Double = js.native
  
  /**
    * The height in pixels of the entire tilemap.
    */
  var heightInPixels: Double = js.native
  
  /**
    * The collection of images the map uses(specified in Tiled)
    */
  var imageCollections: js.Array[_] = js.native
  
  /**
    * An array of Tiled Image Layers.
    */
  var images: js.Array[_] = js.native
  
  /**
    * If the map is infinite or not.
    */
  var infinite: Boolean = js.native
  
  /**
    * An array with all the layers configured to the MapData.
    */
  var layers: js.Array[LayerData] | ObjectLayer = js.native
  
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var name: String = js.native
  
  /**
    * An object of Tiled Object Layers.
    */
  var objects: js.Object = js.native
  
  /**
    * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
    */
  var orientation: String = js.native
  
  /**
    * Map specific properties (can be specified in Tiled)
    */
  var properties: js.Object = js.native
  
  /**
    * Determines the draw order of tilemap. Default is right-down
    * 
    * 0, or 'right-down'
    * 1, or 'left-down'
    * 2, or 'right-up'
    * 3, or 'left-up'
    */
  var renderOrder: String = js.native
  
  /**
    * The height of the tiles.
    */
  var tileHeight: Double = js.native
  
  /**
    * The width of the tiles.
    */
  var tileWidth: Double = js.native
  
  /**
    * An array of tile instances.
    */
  var tiles: js.Array[_] = js.native
  
  /**
    * An array of Tilesets.
    */
  var tilesets: js.Array[Tileset] = js.native
  
  /**
    * The version of the map data (as specified in Tiled).
    */
  var version: String = js.native
  
  /**
    * The width of the entire tilemap.
    */
  var width: Double = js.native
  
  /**
    * The width in pixels of the entire tilemap.
    */
  var widthInPixels: Double = js.native
}
object MapData {
  
  @scala.inline
  def apply(
    collision: js.Object,
    format: integer,
    height: Double,
    heightInPixels: Double,
    imageCollections: js.Array[_],
    images: js.Array[_],
    infinite: Boolean,
    layers: js.Array[LayerData] | ObjectLayer,
    name: String,
    objects: js.Object,
    orientation: String,
    properties: js.Object,
    renderOrder: String,
    tileHeight: Double,
    tileWidth: Double,
    tiles: js.Array[_],
    tilesets: js.Array[Tileset],
    version: String,
    width: Double,
    widthInPixels: Double
  ): MapData = {
    val __obj = js.Dynamic.literal(collision = collision.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], imageCollections = imageCollections.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], tilesets = tilesets.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapData]
  }
  
  @scala.inline
  implicit class MapDataOps[Self <: MapData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollision(value: js.Object): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: integer): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightInPixels(value: Double): Self = this.set("heightInPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageCollectionsVarargs(value: js.Any*): Self = this.set("imageCollections", js.Array(value :_*))
    
    @scala.inline
    def setImageCollections(value: js.Array[_]): Self = this.set("imageCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: LayerData*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[LayerData] | ObjectLayer): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjects(value: js.Object): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOrder(value: String): Self = this.set("renderOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesVarargs(value: js.Any*): Self = this.set("tiles", js.Array(value :_*))
    
    @scala.inline
    def setTiles(value: js.Array[_]): Self = this.set("tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesetsVarargs(value: Tileset*): Self = this.set("tilesets", js.Array(value :_*))
    
    @scala.inline
    def setTilesets(value: js.Array[Tileset]): Self = this.set("tilesets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthInPixels(value: Double): Self = this.set("widthInPixels", value.asInstanceOf[js.Any])
  }
}
