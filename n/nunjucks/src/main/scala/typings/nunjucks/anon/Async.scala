package typings.nunjucks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Async extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object Async {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, useCache: js.UndefOr[Boolean] = js.undefined): Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
}

