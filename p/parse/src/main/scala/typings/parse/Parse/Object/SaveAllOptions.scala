package typings.parse.Parse.Object

import typings.parse.Parse.BatchSizeOption
import typings.parse.Parse.SessionTokenOption
import typings.parse.Parse.UseMasterKeyOption
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
    batchSize: Int | Double = null,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): SaveAllOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAllOptions]
  }
}

