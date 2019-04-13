package typings
package atPhenomnomnominalTsqueryLib.distSrcTsqueryDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQueryOptions extends js.Object {
  var visitAllChildren: js.UndefOr[scala.Boolean] = js.undefined
}

object TSQueryOptions {
  @scala.inline
  def apply(visitAllChildren: js.UndefOr[scala.Boolean] = js.undefined): TSQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visitAllChildren)) __obj.updateDynamic("visitAllChildren")(visitAllChildren)
    __obj.asInstanceOf[TSQueryOptions]
  }
}

