package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPreviewInfo extends js.Object {
  var getUrl: js.UndefOr[String] = js.undefined
  var postParameters: js.UndefOr[String] = js.undefined
  var postUrl: js.UndefOr[String] = js.undefined
}

object ItemPreviewInfo {
  @scala.inline
  def apply(getUrl: String = null, postParameters: String = null, postUrl: String = null): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl.asInstanceOf[js.Any])
    if (postParameters != null) __obj.updateDynamic("postParameters")(postParameters.asInstanceOf[js.Any])
    if (postUrl != null) __obj.updateDynamic("postUrl")(postUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPreviewInfo]
  }
}

