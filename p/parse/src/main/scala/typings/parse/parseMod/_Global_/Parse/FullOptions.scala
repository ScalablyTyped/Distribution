package typings.parse.parseMod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullOptions extends js.Object {
  var error: js.UndefOr[js.Function] = js.undefined
  var installationId: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[js.Function] = js.undefined
  var sessionToken: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function] = js.undefined
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}

object FullOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    installationId: String = null,
    progress: js.Function = null,
    sessionToken: String = null,
    success: js.Function = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): FullOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullOptions]
  }
}

