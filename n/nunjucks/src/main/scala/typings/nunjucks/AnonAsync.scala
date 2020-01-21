package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsync extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object AnonAsync {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, useCache: js.UndefOr[Boolean] = js.undefined): AnonAsync = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsync]
  }
}

