package typings.nodeGeocoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var minConfidence: js.UndefOr[Double] = js.undefined
  var zipcode: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    address: String = null,
    country: String = null,
    countryCode: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    minConfidence: js.UndefOr[Double] = js.undefined,
    zipcode: String = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minConfidence)) __obj.updateDynamic("minConfidence")(minConfidence.get.asInstanceOf[js.Any])
    if (zipcode != null) __obj.updateDynamic("zipcode")(zipcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

