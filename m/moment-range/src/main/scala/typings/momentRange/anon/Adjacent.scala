package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adjacent extends js.Object {
  var adjacent: js.UndefOr[Boolean] = js.undefined
}

object Adjacent {
  @scala.inline
  def apply(adjacent: js.UndefOr[Boolean] = js.undefined): Adjacent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjacent)) __obj.updateDynamic("adjacent")(adjacent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjacent]
  }
}

