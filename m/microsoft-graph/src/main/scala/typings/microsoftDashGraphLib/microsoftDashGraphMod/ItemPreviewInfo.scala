package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPreviewInfo extends js.Object {
  var getUrl: js.UndefOr[java.lang.String] = js.undefined
  var postParameters: js.UndefOr[java.lang.String] = js.undefined
  var postUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ItemPreviewInfo {
  @scala.inline
  def apply(
    getUrl: java.lang.String = null,
    postParameters: java.lang.String = null,
    postUrl: java.lang.String = null
  ): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (postParameters != null) __obj.updateDynamic("postParameters")(postParameters)
    if (postUrl != null) __obj.updateDynamic("postUrl")(postUrl)
    __obj.asInstanceOf[ItemPreviewInfo]
  }
}

