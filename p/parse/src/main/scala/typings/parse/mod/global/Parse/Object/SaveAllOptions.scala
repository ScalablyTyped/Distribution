package typings.parse.mod.global.Parse.Object

import typings.parse.mod.global.Parse.BatchSizeOption
import typings.parse.mod.global.Parse.SessionTokenOption
import typings.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAllOptions
  extends BatchSizeOption
     with SessionTokenOption
     with UseMasterKeyOption

object SaveAllOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[Double] = js.undefined,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): SaveAllOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAllOptions]
  }
}

