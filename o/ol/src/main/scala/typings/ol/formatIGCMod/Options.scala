package typings.ol.formatIGCMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var altitudeMode: js.UndefOr[IGCZ | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(altitudeMode: IGCZ | String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (altitudeMode != null) __obj.updateDynamic("altitudeMode")(altitudeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

