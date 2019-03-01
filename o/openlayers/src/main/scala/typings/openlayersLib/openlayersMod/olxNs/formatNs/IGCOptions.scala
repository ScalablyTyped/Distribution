package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:interface-name */
trait IGCOptions extends js.Object {
  var altitudeMode: js.UndefOr[openlayersLib.openlayersMod.formatNs.IGCZ] = js.undefined
}

object IGCOptions {
  @scala.inline
  def apply(altitudeMode: openlayersLib.openlayersMod.formatNs.IGCZ = null): IGCOptions = {
    val __obj = js.Dynamic.literal()
    if (altitudeMode != null) __obj.updateDynamic("altitudeMode")(altitudeMode)
    __obj.asInstanceOf[IGCOptions]
  }
}

