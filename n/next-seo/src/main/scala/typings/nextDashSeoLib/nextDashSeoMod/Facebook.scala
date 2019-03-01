package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Facebook extends js.Object {
  var appId: js.UndefOr[scala.Double] = js.undefined
}

object Facebook {
  @scala.inline
  def apply(appId: scala.Int | scala.Double = null): Facebook = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facebook]
  }
}

