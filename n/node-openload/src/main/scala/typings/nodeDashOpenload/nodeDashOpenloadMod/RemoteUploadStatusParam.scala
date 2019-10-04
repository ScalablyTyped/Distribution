package typings.nodeDashOpenload.nodeDashOpenloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteUploadStatusParam extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object RemoteUploadStatusParam {
  @scala.inline
  def apply(id: String = null, limit: Int | Double = null): RemoteUploadStatusParam = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteUploadStatusParam]
  }
}

