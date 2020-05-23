package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facebook extends js.Object {
  var appId: js.UndefOr[Double] = js.undefined
}

object Facebook {
  @scala.inline
  def apply(appId: js.UndefOr[Double] = js.undefined): Facebook = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appId)) __obj.updateDynamic("appId")(appId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facebook]
  }
}

