package typings
package phaserLib.PhaserNs.TypesNs.TilemapsNs

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
  var format: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The height of the entire tilemap.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height in pixels of the entire tilemap.
    */
  var heightInPixels: js.UndefOr[scala.Double] = js.undefined
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
  var layers: js.UndefOr[js.Array[phaserLib.PhaserNs.TilemapsNs.LayerData]] = js.undefined
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of Tiled Image Layers.
    */
  var objects: js.UndefOr[js.Object] = js.undefined
  /**
    * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Map specific properties (can be specified in Tiled).
    */
  var properties: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines the draw order of tilemap. Default is right-down.
    */
  var renderOrder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the tiles.
    */
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the tiles.
    */
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * [description]
    */
  var tiles: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The tilesets the map uses.
    */
  var tilesets: js.UndefOr[js.Array[phaserLib.PhaserNs.TilemapsNs.Tileset]] = js.undefined
  /**
    * The version of Tiled the map uses.
    */
  var version: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the entire tilemap.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width in pixels of the entire tilemap.
    */
  var widthInPixels: js.UndefOr[scala.Double] = js.undefined
}

object MapDataConfig {
  @scala.inline
  def apply(
    collision: js.Object = null,
    format: js.UndefOr[phaserLib.integer] = js.undefined,
    height: scala.Int | scala.Double = null,
    heightInPixels: scala.Int | scala.Double = null,
    imageCollections: js.Array[_] = null,
    images: js.Array[_] = null,
    layers: js.Array[phaserLib.PhaserNs.TilemapsNs.LayerData] = null,
    name: java.lang.String = null,
    objects: js.Object = null,
    orientation: java.lang.String = null,
    properties: scala.Int | scala.Double = null,
    renderOrder: java.lang.String = null,
    tileHeight: scala.Int | scala.Double = null,
    tileWidth: scala.Int | scala.Double = null,
    tiles: js.Array[_] = null,
    tilesets: js.Array[phaserLib.PhaserNs.TilemapsNs.Tileset] = null,
    version: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    widthInPixels: scala.Int | scala.Double = null
  ): MapDataConfig = {
    val __obj = js.Dynamic.literal()
    if (collision != null) __obj.updateDynamic("collision")(collision)
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightInPixels != null) __obj.updateDynamic("heightInPixels")(heightInPixels.asInstanceOf[js.Any])
    if (imageCollections != null) __obj.updateDynamic("imageCollections")(imageCollections)
    if (images != null) __obj.updateDynamic("images")(images)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(renderOrder)
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles)
    if (tilesets != null) __obj.updateDynamic("tilesets")(tilesets)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthInPixels != null) __obj.updateDynamic("widthInPixels")(widthInPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataConfig]
  }
}

