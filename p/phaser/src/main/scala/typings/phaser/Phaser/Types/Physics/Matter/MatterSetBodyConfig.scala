package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterSetBodyConfig extends js.Object {
  /**
    * Should the new body be automatically added to the world?
    */
  var addToWorld: js.UndefOr[Boolean] = js.native
  /**
    * Used by the `fromVerts` shape. Flag internal edges (coincident part edges)
    */
  var flagInternal: js.UndefOr[Boolean] = js.native
  /**
    * The height of the body.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The max sizes of the body. Used by the `circle` shape.
    */
  var maxSides: js.UndefOr[Double] = js.native
  /**
    * Used by the `fromVerts` shape. During decomposition discard parts that have an area less than this.
    */
  var minimumArea: js.UndefOr[Double] = js.native
  /**
    * The radius of the body. Used by `circle` and `polygon` shapes.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Used by the `fromVerts` shape. Whether Matter.js will discard collinear edges (to improve performance).
    */
  var removeCollinear: js.UndefOr[Double] = js.native
  /**
    * Used by the `polygon` shape. The number of sides the polygon will have.
    */
  var sides: js.UndefOr[Double] = js.native
  /**
    * Used by the `trapezoid` shape. The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    */
  var slope: js.UndefOr[Double] = js.native
  /**
    * The shape type. Either `rectangle`, `circle`, `trapezoid`, `polygon`, `fromVertices`, `fromVerts` or `fromPhysicsEditor`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Used by the `fromVerts` shape. The vertices data. Either a path string or an array of vertices.
    */
  var verts: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * The width of the body.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The horizontal world position to place the body at.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The vertical world position to place the body at.
    */
  var y: js.UndefOr[Double] = js.native
}

object MatterSetBodyConfig {
  @scala.inline
  def apply(): MatterSetBodyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterSetBodyConfig]
  }
  @scala.inline
  implicit class MatterSetBodyConfigOps[Self <: MatterSetBodyConfig] (val x: Self) extends AnyVal {
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
    def setAddToWorld(value: Boolean): Self = this.set("addToWorld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddToWorld: Self = this.set("addToWorld", js.undefined)
    @scala.inline
    def setFlagInternal(value: Boolean): Self = this.set("flagInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlagInternal: Self = this.set("flagInternal", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMaxSides(value: Double): Self = this.set("maxSides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSides: Self = this.set("maxSides", js.undefined)
    @scala.inline
    def setMinimumArea(value: Double): Self = this.set("minimumArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumArea: Self = this.set("minimumArea", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRemoveCollinear(value: Double): Self = this.set("removeCollinear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveCollinear: Self = this.set("removeCollinear", js.undefined)
    @scala.inline
    def setSides(value: Double): Self = this.set("sides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSides: Self = this.set("sides", js.undefined)
    @scala.inline
    def setSlope(value: Double): Self = this.set("slope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlope: Self = this.set("slope", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVertsVarargs(value: js.Any*): Self = this.set("verts", js.Array(value :_*))
    @scala.inline
    def setVerts(value: String | js.Array[_]): Self = this.set("verts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerts: Self = this.set("verts", js.undefined)
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

