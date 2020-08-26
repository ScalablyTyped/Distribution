package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Tilemaps.LayerData
import typings.phaser.Phaser.Tilemaps.Tileset
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapDataConfig extends js.Object {
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
  implicit class MapDataConfigOps[Self <: MapDataConfig] (val x: Self) extends AnyVal {
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
    def deleteCollision: Self = this.set("collision", js.undefined)
    @scala.inline
    def setFormat(value: integer): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightInPixels(value: Double): Self = this.set("heightInPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightInPixels: Self = this.set("heightInPixels", js.undefined)
    @scala.inline
    def setImageCollectionsVarargs(value: js.Any*): Self = this.set("imageCollections", js.Array(value :_*))
    @scala.inline
    def setImageCollections(value: js.Array[_]): Self = this.set("imageCollections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageCollections: Self = this.set("imageCollections", js.undefined)
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setLayersVarargs(value: LayerData*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[LayerData]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObjects(value: js.Object): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setProperties(value: Double): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRenderOrder(value: String): Self = this.set("renderOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderOrder: Self = this.set("renderOrder", js.undefined)
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    @scala.inline
    def setTilesVarargs(value: js.Any*): Self = this.set("tiles", js.Array(value :_*))
    @scala.inline
    def setTiles(value: js.Array[_]): Self = this.set("tiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiles: Self = this.set("tiles", js.undefined)
    @scala.inline
    def setTilesetsVarargs(value: Tileset*): Self = this.set("tilesets", js.Array(value :_*))
    @scala.inline
    def setTilesets(value: js.Array[Tileset]): Self = this.set("tilesets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilesets: Self = this.set("tilesets", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthInPixels(value: Double): Self = this.set("widthInPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthInPixels: Self = this.set("widthInPixels", js.undefined)
  }
  
}

