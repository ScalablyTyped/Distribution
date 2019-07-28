package typings.nodeDashGeocoder.nodeDashGeocoderMod

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
    limit: Int | Double = null,
    minConfidence: Int | Double = null,
    zipcode: String = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (minConfidence != null) __obj.updateDynamic("minConfidence")(minConfidence.asInstanceOf[js.Any])
    if (zipcode != null) __obj.updateDynamic("zipcode")(zipcode)
    __obj.asInstanceOf[Query]
  }
}

