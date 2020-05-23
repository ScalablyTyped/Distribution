package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multi extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
}

object Multi {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined): Multi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multi]
  }
}

