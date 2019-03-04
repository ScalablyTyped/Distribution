package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshPrimitive extends js.Object {
  var base: scala.Double
  var count: scala.Double
  var indexed: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: scala.Double
}

object MeshPrimitive {
  @scala.inline
  def apply(
    base: scala.Double,
    count: scala.Double,
    `type`: scala.Double,
    indexed: js.UndefOr[scala.Boolean] = js.undefined
  ): MeshPrimitive = {
    val __obj = js.Dynamic.literal(base = base, count = count)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    __obj.asInstanceOf[MeshPrimitive]
  }
}

