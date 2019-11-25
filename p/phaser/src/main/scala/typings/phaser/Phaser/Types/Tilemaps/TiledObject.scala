package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiledObject extends js.Object {
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
  var gid: js.UndefOr[integer] = js.undefined
  /**
    * The height of this object, in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The unique object ID.
    */
  var id: integer
  /**
    * The name this object was assigned in Tiled.
    */
  var name: String
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
  var properties: js.UndefOr[js.Any] = js.undefined
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
  var text: js.UndefOr[js.Any] = js.undefined
  /**
    * The type, as assigned in Tiled.
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
  @scala.inline
  def apply(
    id: integer,
    name: String,
    `type`: String,
    ellipse: js.UndefOr[Boolean] = js.undefined,
    flippedAntiDiagonal: js.UndefOr[Boolean] = js.undefined,
    flippedHorizontal: js.UndefOr[Boolean] = js.undefined,
    flippedVertical: js.UndefOr[Boolean] = js.undefined,
    gid: Int | Double = null,
    height: Int | Double = null,
    polygon: js.Array[Vector2Like] = null,
    polyline: js.Array[Vector2Like] = null,
    properties: js.Any = null,
    rectangle: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    text: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): TiledObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipse)) __obj.updateDynamic("ellipse")(ellipse.asInstanceOf[js.Any])
    if (!js.isUndefined(flippedAntiDiagonal)) __obj.updateDynamic("flippedAntiDiagonal")(flippedAntiDiagonal.asInstanceOf[js.Any])
    if (!js.isUndefined(flippedHorizontal)) __obj.updateDynamic("flippedHorizontal")(flippedHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(flippedVertical)) __obj.updateDynamic("flippedVertical")(flippedVertical.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(rectangle)) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledObject]
  }
}

