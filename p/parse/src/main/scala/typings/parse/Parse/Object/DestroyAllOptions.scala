package typings.parse.Parse.Object

import typings.parse.Parse.BatchSizeOption
import typings.parse.Parse.ScopeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyAllOptions
  extends ScopeOptions
     with BatchSizeOption

object DestroyAllOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): DestroyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[DestroyAllOptions]
  }
}

