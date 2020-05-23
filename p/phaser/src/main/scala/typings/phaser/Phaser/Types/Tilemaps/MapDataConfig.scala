package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Tilemaps.LayerData
import typings.phaser.Phaser.Tilemaps.Tileset
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDataConfig extends js.Object {
  /**
    * An object of Tiled Object Layers.
    */
  var collision: js.UndefOr[js.Object] = js.undefined
  /**
    * The format of the Tilemap, as defined in Tiled.
    */
  var format: js.UndefOr[integer] = js.undefined
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
  var imageCollections: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array with all the layers configured to the MapData.
    */
  var images: js.UndefOr[js.Array[_]] = js.undefined
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
  var orientation: js.UndefOr[String] = js.undefined
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
  var tiles: js.UndefOr[js.Array[_]] = js.undefined
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
  @scala.inline
  def apply(
    collision: js.Object = null,
    format: js.UndefOr[integer] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    heightInPixels: js.UndefOr[Double] = js.undefined,
    imageCollections: js.Array[_] = null,
    images: js.Array[_] = null,
    layers: js.Array[LayerData] = null,
    name: String = null,
    objects: js.Object = null,
    orientation: String = null,
    properties: js.UndefOr[Double] = js.undefined,
    renderOrder: String = null,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    tiles: js.Array[_] = null,
    tilesets: js.Array[Tileset] = null,
    version: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    widthInPixels: js.UndefOr[Double] = js.undefined
  ): MapDataConfig = {
    val __obj = js.Dynamic.literal()
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightInPixels)) __obj.updateDynamic("heightInPixels")(heightInPixels.get.asInstanceOf[js.Any])
    if (imageCollections != null) __obj.updateDynamic("imageCollections")(imageCollections.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(properties)) __obj.updateDynamic("properties")(properties.get.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(renderOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (tilesets != null) __obj.updateDynamic("tilesets")(tilesets.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthInPixels)) __obj.updateDynamic("widthInPixels")(widthInPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataConfig]
  }
}

