package typings
package nodeDashGeocoderLib.nodeDashGeocoderMod.nodeUnderscoreGeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var minConfidence: js.UndefOr[scala.Double] = js.undefined
  var zipcode: js.UndefOr[java.lang.String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    minConfidence: scala.Int | scala.Double = null,
    zipcode: java.lang.String = null
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

