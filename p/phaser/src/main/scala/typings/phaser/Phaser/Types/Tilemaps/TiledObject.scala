package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiledObject extends js.Object {
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
  implicit class TiledObjectOps[Self <: TiledObject] (val x: Self) extends AnyVal {
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
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipse(value: Boolean): Self = this.set("ellipse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipse: Self = this.set("ellipse", js.undefined)
    @scala.inline
    def setFlippedAntiDiagonal(value: Boolean): Self = this.set("flippedAntiDiagonal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlippedAntiDiagonal: Self = this.set("flippedAntiDiagonal", js.undefined)
    @scala.inline
    def setFlippedHorizontal(value: Boolean): Self = this.set("flippedHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlippedHorizontal: Self = this.set("flippedHorizontal", js.undefined)
    @scala.inline
    def setFlippedVertical(value: Boolean): Self = this.set("flippedVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlippedVertical: Self = this.set("flippedVertical", js.undefined)
    @scala.inline
    def setGid(value: integer): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPoint(value: Boolean): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPolygonVarargs(value: Vector2Like*): Self = this.set("polygon", js.Array(value :_*))
    @scala.inline
    def setPolygon(value: js.Array[Vector2Like]): Self = this.set("polygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygon: Self = this.set("polygon", js.undefined)
    @scala.inline
    def setPolylineVarargs(value: Vector2Like*): Self = this.set("polyline", js.Array(value :_*))
    @scala.inline
    def setPolyline(value: js.Array[Vector2Like]): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRectangle(value: Boolean): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setText(value: js.Any): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

