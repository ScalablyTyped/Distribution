package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSingle extends js.Object {
  var single: js.UndefOr[Boolean] = js.undefined
}

object AnonSingle {
  @scala.inline
  def apply(single: js.UndefOr[Boolean] = js.undefined): AnonSingle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSingle]
  }
}

