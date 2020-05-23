package typings.nodemailerSesTransport.mod

import typings.awsSdk.mod.SES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SesOptions extends js.Object {
  var SES: typings.awsSdk.mod.SES
  var component: js.UndefOr[String] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var sendingRate: js.UndefOr[Double] = js.undefined
}

object SesOptions {
  @scala.inline
  def apply(
    SES: SES,
    component: String = null,
    maxConnections: js.UndefOr[Double] = js.undefined,
    sendingRate: js.UndefOr[Double] = js.undefined
  ): SesOptions = {
    val __obj = js.Dynamic.literal(SES = SES.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendingRate)) __obj.updateDynamic("sendingRate")(sendingRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SesOptions]
  }
}

