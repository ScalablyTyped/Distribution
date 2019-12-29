package typings.parse.parseMod._Global_.Parse.Object

import typings.parse.parseMod._Global_.Parse.BatchSizeOption
import typings.parse.parseMod._Global_.Parse.SessionTokenOption
import typings.parse.parseMod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyAllOptions
  extends BatchSizeOption
     with SessionTokenOption
     with UseMasterKeyOption

object DestroyAllOptions {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): DestroyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyAllOptions]
  }
}

