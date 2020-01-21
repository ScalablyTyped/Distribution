package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: Double
  var count: Double
  var indexed: js.UndefOr[Boolean] = js.undefined
  var `type`: Double
}

object AnonBase {
  @scala.inline
  def apply(base: Double, count: Double, `type`: Double, indexed: js.UndefOr[Boolean] = js.undefined): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
}

