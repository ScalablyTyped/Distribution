package typings.playcanvas.anon

import typings.playcanvas.pc.BoundingBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aabb extends js.Object {
  var aabb: js.UndefOr[BoundingBox] = js.undefined
  var defaultWeight: js.UndefOr[Double] = js.undefined
  var deltaNormals: js.UndefOr[js.Array[Double]] = js.undefined
  var deltaPositions: js.Array[Double]
  var deltaTangents: js.UndefOr[js.Array[Double]] = js.undefined
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Aabb {
  @scala.inline
  def apply(
    deltaPositions: js.Array[Double],
    aabb: BoundingBox = null,
    defaultWeight: js.UndefOr[Double] = js.undefined,
    deltaNormals: js.Array[Double] = null,
    deltaTangents: js.Array[Double] = null,
    indices: js.Array[Double] = null,
    name: String = null
  ): Aabb = {
    val __obj = js.Dynamic.literal(deltaPositions = deltaPositions.asInstanceOf[js.Any])
    if (aabb != null) __obj.updateDynamic("aabb")(aabb.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWeight)) __obj.updateDynamic("defaultWeight")(defaultWeight.get.asInstanceOf[js.Any])
    if (deltaNormals != null) __obj.updateDynamic("deltaNormals")(deltaNormals.asInstanceOf[js.Any])
    if (deltaTangents != null) __obj.updateDynamic("deltaTangents")(deltaTangents.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aabb]
  }
}

