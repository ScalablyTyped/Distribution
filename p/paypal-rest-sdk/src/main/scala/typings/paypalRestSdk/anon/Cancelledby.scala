package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelledby extends js.Object {
  var cancelled_by: js.UndefOr[String] = js.undefined
  var cancelled_date: js.UndefOr[String] = js.undefined
  var created_by: js.UndefOr[String] = js.undefined
  var created_date: js.UndefOr[String] = js.undefined
  var first_sent_date: js.UndefOr[String] = js.undefined
  var last_sent_by: js.UndefOr[String] = js.undefined
  var last_sent_date: js.UndefOr[String] = js.undefined
  var last_updated_by: js.UndefOr[String] = js.undefined
  var last_updated_date: js.UndefOr[String] = js.undefined
  var payer_view_url: js.UndefOr[String] = js.undefined
}

object Cancelledby {
  @scala.inline
  def apply(
    cancelled_by: String = null,
    cancelled_date: String = null,
    created_by: String = null,
    created_date: String = null,
    first_sent_date: String = null,
    last_sent_by: String = null,
    last_sent_date: String = null,
    last_updated_by: String = null,
    last_updated_date: String = null,
    payer_view_url: String = null
  ): Cancelledby = {
    val __obj = js.Dynamic.literal()
    if (cancelled_by != null) __obj.updateDynamic("cancelled_by")(cancelled_by.asInstanceOf[js.Any])
    if (cancelled_date != null) __obj.updateDynamic("cancelled_date")(cancelled_date.asInstanceOf[js.Any])
    if (created_by != null) __obj.updateDynamic("created_by")(created_by.asInstanceOf[js.Any])
    if (created_date != null) __obj.updateDynamic("created_date")(created_date.asInstanceOf[js.Any])
    if (first_sent_date != null) __obj.updateDynamic("first_sent_date")(first_sent_date.asInstanceOf[js.Any])
    if (last_sent_by != null) __obj.updateDynamic("last_sent_by")(last_sent_by.asInstanceOf[js.Any])
    if (last_sent_date != null) __obj.updateDynamic("last_sent_date")(last_sent_date.asInstanceOf[js.Any])
    if (last_updated_by != null) __obj.updateDynamic("last_updated_by")(last_updated_by.asInstanceOf[js.Any])
    if (last_updated_date != null) __obj.updateDynamic("last_updated_date")(last_updated_date.asInstanceOf[js.Any])
    if (payer_view_url != null) __obj.updateDynamic("payer_view_url")(payer_view_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelledby]
  }
}

