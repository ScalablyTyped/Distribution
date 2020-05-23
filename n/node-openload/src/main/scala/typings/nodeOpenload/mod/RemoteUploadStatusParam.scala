package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteUploadStatusParam extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object RemoteUploadStatusParam {
  @scala.inline
  def apply(id: String = null, limit: js.UndefOr[Double] = js.undefined): RemoteUploadStatusParam = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteUploadStatusParam]
  }
}

