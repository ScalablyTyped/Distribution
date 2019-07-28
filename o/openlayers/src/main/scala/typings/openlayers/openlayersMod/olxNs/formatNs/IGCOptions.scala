package typings.openlayers.openlayersMod.olxNs.formatNs

import typings.openlayers.openlayersMod.formatNs.IGCZ
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
    if (altitudeMode != null) __obj.updateDynamic("altitudeMode")(altitudeMode)
    __obj.asInstanceOf[IGCOptions]
  }
}

