package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterSetBodyConfig extends js.Object {
  /**
    * Should the new body be automatically added to the world?
    */
  var addToWorld: js.UndefOr[Boolean] = js.undefined
  /**
    * Used by the `fromVerts` shape. Flag internal edges (coincident part edges)
    */
  var flagInternal: js.UndefOr[Boolean] = js.undefined
  /**
    * The height of the body.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The max sizes of the body. Used by the `circle` shape.
    */
  var maxSides: js.UndefOr[Double] = js.undefined
  /**
    * Used by the `fromVerts` shape. During decomposition discard parts that have an area less than this.
    */
  var minimumArea: js.UndefOr[Double] = js.undefined
  /**
    * The radius of the body. Used by `circle` and `polygon` shapes.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * Used by the `fromVerts` shape. Whether Matter.js will discard collinear edges (to improve performance).
    */
  var removeCollinear: js.UndefOr[Double] = js.undefined
  /**
    * Used by the `polygon` shape. The number of sides the polygon will have.
    */
  var sides: js.UndefOr[Double] = js.undefined
  /**
    * Used by the `trapezoid` shape. The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    */
  var slope: js.UndefOr[Double] = js.undefined
  /**
    * The shape type. Either `rectangle`, `circle`, `trapezoid`, `polygon`, `fromVertices`, `fromVerts` or `fromPhysicsEditor`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Used by the `fromVerts` shape. The vertices data. Either a path string or an array of vertices.
    */
  var verts: js.UndefOr[String | js.Array[_]] = js.undefined
  /**
    * The width of the body.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal world position to place the body at.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The vertical world position to place the body at.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object MatterSetBodyConfig {
  @scala.inline
  def apply(
    addToWorld: js.UndefOr[Boolean] = js.undefined,
    flagInternal: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    maxSides: js.UndefOr[Double] = js.undefined,
    minimumArea: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    removeCollinear: js.UndefOr[Double] = js.undefined,
    sides: js.UndefOr[Double] = js.undefined,
    slope: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    verts: String | js.Array[_] = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): MatterSetBodyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToWorld)) __obj.updateDynamic("addToWorld")(addToWorld.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flagInternal)) __obj.updateDynamic("flagInternal")(flagInternal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSides)) __obj.updateDynamic("maxSides")(maxSides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumArea)) __obj.updateDynamic("minimumArea")(minimumArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeCollinear)) __obj.updateDynamic("removeCollinear")(removeCollinear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sides)) __obj.updateDynamic("sides")(sides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slope)) __obj.updateDynamic("slope")(slope.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verts != null) __obj.updateDynamic("verts")(verts.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterSetBodyConfig]
  }
}

