package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters extends js.Object {
  var anchor_type: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var end_time: js.UndefOr[java.lang.String] = js.undefined
  var event_type: js.UndefOr[java.lang.String] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var page_size: js.UndefOr[scala.Double] = js.undefined
  var payee_id: js.UndefOr[java.lang.String] = js.undefined
  var sort_by: js.UndefOr[java.lang.String] = js.undefined
  var sort_order: js.UndefOr[java.lang.String] = js.undefined
  var start_id: js.UndefOr[java.lang.String] = js.undefined
  var start_index: js.UndefOr[scala.Double] = js.undefined
  var start_time: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var total_count_required: js.UndefOr[scala.Boolean] = js.undefined
  var transaction_id: js.UndefOr[java.lang.String] = js.undefined
  var webhook_id: js.UndefOr[java.lang.String] = js.undefined
}

object QueryParameters {
  @scala.inline
  def apply(
    anchor_type: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    end_time: java.lang.String = null,
    event_type: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    page_size: scala.Int | scala.Double = null,
    payee_id: java.lang.String = null,
    sort_by: java.lang.String = null,
    sort_order: java.lang.String = null,
    start_id: java.lang.String = null,
    start_index: scala.Int | scala.Double = null,
    start_time: java.lang.String = null,
    status: js.Array[java.lang.String] = null,
    total_count_required: js.UndefOr[scala.Boolean] = js.undefined,
    transaction_id: java.lang.String = null,
    webhook_id: java.lang.String = null
  ): QueryParameters = {
    val __obj = js.Dynamic.literal()
    if (anchor_type != null) __obj.updateDynamic("anchor_type")(anchor_type)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (end_time != null) __obj.updateDynamic("end_time")(end_time)
    if (event_type != null) __obj.updateDynamic("event_type")(event_type)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (payee_id != null) __obj.updateDynamic("payee_id")(payee_id)
    if (sort_by != null) __obj.updateDynamic("sort_by")(sort_by)
    if (sort_order != null) __obj.updateDynamic("sort_order")(sort_order)
    if (start_id != null) __obj.updateDynamic("start_id")(start_id)
    if (start_index != null) __obj.updateDynamic("start_index")(start_index.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time)
    if (status != null) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(total_count_required)) __obj.updateDynamic("total_count_required")(total_count_required)
    if (transaction_id != null) __obj.updateDynamic("transaction_id")(transaction_id)
    if (webhook_id != null) __obj.updateDynamic("webhook_id")(webhook_id)
    __obj.asInstanceOf[QueryParameters]
  }
}

