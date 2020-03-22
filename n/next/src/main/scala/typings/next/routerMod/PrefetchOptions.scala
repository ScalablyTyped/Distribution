package typings.next.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefetchOptions extends js.Object {
  var priority: js.UndefOr[Boolean] = js.undefined
}

object PrefetchOptions {
  @scala.inline
  def apply(priority: js.UndefOr[Boolean] = js.undefined): PrefetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchOptions]
  }
}

