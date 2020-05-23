package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: Double
  var count: Double
  var indexed: js.UndefOr[Boolean] = js.undefined
  var `type`: Double
}

object Base {
  @scala.inline
  def apply(base: Double, count: Double, `type`: Double, indexed: js.UndefOr[Boolean] = js.undefined): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

