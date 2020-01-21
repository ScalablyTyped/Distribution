package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMulti extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
}

object AnonMulti {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined): AnonMulti = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMulti]
  }
}

