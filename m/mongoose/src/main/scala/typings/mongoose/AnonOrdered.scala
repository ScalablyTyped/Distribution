package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrdered extends js.Object {
  var ordered: js.UndefOr[Boolean] = js.undefined
  var rawResult: js.UndefOr[Boolean] = js.undefined
}

object AnonOrdered {
  @scala.inline
  def apply(ordered: js.UndefOr[Boolean] = js.undefined, rawResult: js.UndefOr[Boolean] = js.undefined): AnonOrdered = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrdered]
  }
}

