package typings
package olLib.formatIGCMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var altitudeMode: js.UndefOr[IGCZ | java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(altitudeMode: IGCZ | java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (altitudeMode != null) __obj.updateDynamic("altitudeMode")(altitudeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

