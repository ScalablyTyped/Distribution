package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceHostedMediaConfig extends MediaConfig {
  var preFetchMedia: js.UndefOr[js.Array[MediaInfo]] = js.undefined
}

object ServiceHostedMediaConfig {
  @scala.inline
  def apply(preFetchMedia: js.Array[MediaInfo] = null): ServiceHostedMediaConfig = {
    val __obj = js.Dynamic.literal()
    if (preFetchMedia != null) __obj.updateDynamic("preFetchMedia")(preFetchMedia.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHostedMediaConfig]
  }
}

