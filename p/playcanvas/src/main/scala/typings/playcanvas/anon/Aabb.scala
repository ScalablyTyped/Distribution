package typings.playcanvas.anon

import typings.playcanvas.pc.BoundingBox
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aabb extends js.Object {
  var aabb: js.UndefOr[BoundingBox] = js.undefined
  var defaultWeight: js.UndefOr[Double] = js.undefined
  var deltaNormals: js.UndefOr[ArrayBuffer] = js.undefined
  var deltaNormalsType: Double
  var deltaPositions: ArrayBuffer
  var deltaPositionsType: Double
  var name: js.UndefOr[String] = js.undefined
}

object Aabb {
  @scala.inline
  def apply(
    deltaNormalsType: Double,
    deltaPositions: ArrayBuffer,
    deltaPositionsType: Double,
    aabb: BoundingBox = null,
    defaultWeight: js.UndefOr[Double] = js.undefined,
    deltaNormals: ArrayBuffer = null,
    name: String = null
  ): Aabb = {
    val __obj = js.Dynamic.literal(deltaNormalsType = deltaNormalsType.asInstanceOf[js.Any], deltaPositions = deltaPositions.asInstanceOf[js.Any], deltaPositionsType = deltaPositionsType.asInstanceOf[js.Any])
    if (aabb != null) __obj.updateDynamic("aabb")(aabb.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWeight)) __obj.updateDynamic("defaultWeight")(defaultWeight.get.asInstanceOf[js.Any])
    if (deltaNormals != null) __obj.updateDynamic("deltaNormals")(deltaNormals.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aabb]
  }
}

