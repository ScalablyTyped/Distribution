package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBare extends js.Object {
  var bare: js.UndefOr[Boolean] = js.undefined
}

object AnonBare {
  @scala.inline
  def apply(bare: js.UndefOr[Boolean] = js.undefined): AnonBare = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bare)) __obj.updateDynamic("bare")(bare.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBare]
  }
}

