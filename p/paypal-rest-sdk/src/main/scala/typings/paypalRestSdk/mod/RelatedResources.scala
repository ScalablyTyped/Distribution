package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedResources extends js.Object {
  var authorization: js.UndefOr[AuthorizationResource] = js.undefined
  var capture: js.UndefOr[CaptureResource] = js.undefined
  var order: js.UndefOr[js.Any] = js.undefined
  var refund: js.UndefOr[RefundResource] = js.undefined
  var sale: js.UndefOr[SaleResource] = js.undefined
}

object RelatedResources {
  @scala.inline
  def apply(
    authorization: AuthorizationResource = null,
    capture: CaptureResource = null,
    order: js.Any = null,
    refund: RefundResource = null,
    sale: SaleResource = null
  ): RelatedResources = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (refund != null) __obj.updateDynamic("refund")(refund.asInstanceOf[js.Any])
    if (sale != null) __obj.updateDynamic("sale")(sale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedResources]
  }
}

