package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: Double
  var count: Double
  var indexed: js.UndefOr[Boolean] = js.undefined
  var `type`: Double
}

object Anon_Base {
  @scala.inline
  def apply(base: Double, count: Double, `type`: Double, indexed: js.UndefOr[Boolean] = js.undefined): Anon_Base = {
    val __obj = js.Dynamic.literal(base = base, count = count)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    __obj.asInstanceOf[Anon_Base]
  }
}

