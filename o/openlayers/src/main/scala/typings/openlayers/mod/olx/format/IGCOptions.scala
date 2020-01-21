package typings.openlayers.mod.olx.format

import typings.openlayers.mod.format.IGCZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:interface-name */
trait IGCOptions extends js.Object {
  var altitudeMode: js.UndefOr[IGCZ] = js.undefined
}

object IGCOptions {
  @scala.inline
  def apply(altitudeMode: IGCZ = null): IGCOptions = {
    val __obj = js.Dynamic.literal()
    if (altitudeMode != null) __obj.updateDynamic("altitudeMode")(altitudeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGCOptions]
  }
}

