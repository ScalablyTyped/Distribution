package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
  var installationId: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[js.Function] = js.undefined
  var sessionToken: js.UndefOr[String] = js.undefined
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[Double] = js.undefined,
    include: String | js.Array[String] = null,
    installationId: String = null,
    progress: js.Function = null,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

