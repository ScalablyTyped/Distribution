package typings.nextDashSeo.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facebook extends js.Object {
  var appId: js.UndefOr[Double] = js.undefined
}

object Facebook {
  @scala.inline
  def apply(appId: Int | Double = null): Facebook = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facebook]
  }
}

