package typings.parse.Parse

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
    batchSize: Int | Double = null,
    include: String | js.Array[String] = null,
    installationId: String = null,
    progress: js.Function = null,
    sessionToken: String = null,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[RequestOptions]
  }
}

