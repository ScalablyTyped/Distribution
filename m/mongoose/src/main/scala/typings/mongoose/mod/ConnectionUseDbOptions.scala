package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionUseDbOptions extends js.Object {
  /**
    * If true, cache results so calling `useDb()` multiple times with the same name only creates 1 connection object.
    */
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object ConnectionUseDbOptions {
  @scala.inline
  def apply(useCache: js.UndefOr[Boolean] = js.undefined): ConnectionUseDbOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionUseDbOptions]
  }
}

