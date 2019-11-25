package typings.nodeDashOpenload.nodeDashOpenloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteUploadParam extends js.Object {
  var folder: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var url: String
}

object RemoteUploadParam {
  @scala.inline
  def apply(url: String, folder: String = null, headers: String = null): RemoteUploadParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteUploadParam]
  }
}

