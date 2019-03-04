package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphTargetOptions extends js.Object {
  var aabb: js.UndefOr[BoundingBox] = js.undefined
  var deltaNormals: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var deltaPositions: js.Array[scala.Double]
  var deltaTangents: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var indices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MorphTargetOptions {
  @scala.inline
  def apply(
    deltaPositions: js.Array[scala.Double],
    aabb: BoundingBox = null,
    deltaNormals: js.Array[scala.Double] = null,
    deltaTangents: js.Array[scala.Double] = null,
    indices: js.Array[scala.Double] = null,
    name: java.lang.String = null
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

