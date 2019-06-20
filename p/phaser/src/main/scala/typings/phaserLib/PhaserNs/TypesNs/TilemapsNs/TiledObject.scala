package typings
package phaserLib.PhaserNs.TypesNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiledObject extends js.Object {
  /**
    * Only set, and set to `true`, if a ellipse object.
    */
  var ellipse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only set if a tile object. The diagonal flip value.
    */
  var flippedAntiDiagonal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only set if a tile object. The horizontal flip value.
    */
  var flippedHorizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only set if a tile object. The vertical flip value.
    */
  var flippedVertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Only set if of type 'tile'.
    */
  var gid: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The height of this object, in pixels.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The unique object ID.
    */
  var id: phaserLib.integer
  /**
    * The name this object was assigned in Tiled.
    */
  var name: java.lang.String
  /**
    * Only set if a polygon object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
    */
  var polygon: js.UndefOr[js.Array[phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like]] = js.undefined
  /**
    * Only set if a polyline object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
    */
  var polyline: js.UndefOr[js.Array[phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like]] = js.undefined
  /**
    * Custom properties object.
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * Only set, and set to `true`, if a rectangle object.
    */
  var rectangle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The rotation of the object in clockwise degrees.
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only set if a text object. Contains the text objects properties.
    */
  var text: js.UndefOr[js.Any] = js.undefined
  /**
    * The type, as assigned in Tiled.
    */
  var `type`: java.lang.String
  /**
    * The visible state of this object.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width of this object, in pixels.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The horizontal position of this object, in pixels, relative to the tilemap.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical position of this object, in pixels, relative to the tilemap.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object TiledObject {
  @scala.inline
  def apply(
    id: phaserLib.integer,
    name: java.lang.String,
    `type`: java.lang.String,
    ellipse: js.UndefOr[scala.Boolean] = js.undefined,
    flippedAntiDiagonal: js.UndefOr[scala.Boolean] = js.undefined,
    flippedHorizontal: js.UndefOr[scala.Boolean] = js.undefined,
    flippedVertical: js.UndefOr[scala.Boolean] = js.undefined,
    gid: js.UndefOr[phaserLib.integer] = js.undefined,
    height: scala.Int | scala.Double = null,
    polygon: js.Array[phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like] = null,
    polyline: js.Array[phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like] = null,
    properties: js.Any = null,
    rectangle: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    text: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): TiledObject = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(ellipse)) __obj.updateDynamic("ellipse")(ellipse)
    if (!js.isUndefined(flippedAntiDiagonal)) __obj.updateDynamic("flippedAntiDiagonal")(flippedAntiDiagonal)
    if (!js.isUndefined(flippedHorizontal)) __obj.updateDynamic("flippedHorizontal")(flippedHorizontal)
    if (!js.isUndefined(flippedVertical)) __obj.updateDynamic("flippedVertical")(flippedVertical)
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon)
    if (polyline != null) __obj.updateDynamic("polyline")(polyline)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(rectangle)) __obj.updateDynamic("rectangle")(rectangle)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledObject]
  }
}

