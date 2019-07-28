package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ordered extends js.Object {
  var ordered: js.UndefOr[Boolean] = js.undefined
  var rawResult: js.UndefOr[Boolean] = js.undefined
}

object Anon_Ordered {
  @scala.inline
  def apply(ordered: js.UndefOr[Boolean] = js.undefined, rawResult: js.UndefOr[Boolean] = js.undefined): Anon_Ordered = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult)
    __obj.asInstanceOf[Anon_Ordered]
  }
}

