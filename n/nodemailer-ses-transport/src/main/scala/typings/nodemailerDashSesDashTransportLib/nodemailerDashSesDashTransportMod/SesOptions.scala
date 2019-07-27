package typings
package nodemailerDashSesDashTransportLib.nodemailerDashSesDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SesOptions extends js.Object {
  var SES: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.SES */ js.Any
  var component: js.UndefOr[java.lang.String] = js.undefined
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  var sendingRate: js.UndefOr[scala.Double] = js.undefined
}

object SesOptions {
  @scala.inline
  def apply(
    SES: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.SES */ js.Any,
    component: java.lang.String = null,
    maxConnections: scala.Int | scala.Double = null,
    sendingRate: scala.Int | scala.Double = null
  ): SesOptions = {
    val __obj = js.Dynamic.literal(SES = SES)
    if (component != null) __obj.updateDynamic("component")(component)
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (sendingRate != null) __obj.updateDynamic("sendingRate")(sendingRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SesOptions]
  }
}

