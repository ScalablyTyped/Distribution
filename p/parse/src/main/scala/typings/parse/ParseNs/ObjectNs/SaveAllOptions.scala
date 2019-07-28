package typings.parse.ParseNs.ObjectNs

import typings.parse.ParseNs.BatchSizeOption
import typings.parse.ParseNs.ScopeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAllOptions
  extends ScopeOptions
     with BatchSizeOption

object SaveAllOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): SaveAllOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[SaveAllOptions]
  }
}

