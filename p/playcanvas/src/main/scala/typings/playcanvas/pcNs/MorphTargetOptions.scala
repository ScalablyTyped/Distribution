package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphTargetOptions extends js.Object {
  var aabb: js.UndefOr[BoundingBox] = js.undefined
  var deltaNormals: js.UndefOr[js.Array[Double]] = js.undefined
  var deltaPositions: js.Array[Double]
  var deltaTangents: js.UndefOr[js.Array[Double]] = js.undefined
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object MorphTargetOptions {
  @scala.inline
  def apply(
    deltaPositions: js.Array[Double],
    aabb: BoundingBox = null,
    deltaNormals: js.Array[Double] = null,
    deltaTangents: js.Array[Double] = null,
    indices: js.Array[Double] = null,
    name: String = null
  ): MorphTargetOptions = {
    val __obj = js.Dynamic.literal(deltaPositions = deltaPositions)
    if (aabb != null) __obj.updateDynamic("aabb")(aabb)
    if (deltaNormals != null) __obj.updateDynamic("deltaNormals")(deltaNormals)
    if (deltaTangents != null) __obj.updateDynamic("deltaTangents")(deltaTangents)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MorphTargetOptions]
  }
}

