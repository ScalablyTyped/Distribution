package typings.nodemailerDashSesDashTransport.nodemailerDashSesDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SesOptions extends js.Object {
  var SES: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.SES */ js.Any
  var component: js.UndefOr[String] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var sendingRate: js.UndefOr[Double] = js.undefined
}

object SesOptions {
  @scala.inline
  def apply(
    SES: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.SES */ js.Any,
    component: String = null,
    maxConnections: Int | Double = null,
    sendingRate: Int | Double = null
  ): SesOptions = {
    val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (sendingRate != null) __obj.updateDynamic("sendingRate")(sendingRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SesOptions]
  }
}

