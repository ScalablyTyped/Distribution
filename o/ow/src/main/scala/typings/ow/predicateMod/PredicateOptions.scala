package typings.ow.predicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredicateOptions extends js.Object {
  var optional: js.UndefOr[Boolean] = js.undefined
}

object PredicateOptions {
  @scala.inline
  def apply(optional: js.UndefOr[Boolean] = js.undefined): PredicateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateOptions]
  }
}

