package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInfo extends js.Object {
  var resourceId: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object MediaInfo {
  @scala.inline
  def apply(resourceId: String = null, uri: String = null): MediaInfo = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInfo]
  }
}

