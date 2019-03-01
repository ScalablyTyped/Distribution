package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryRecord extends RegisteredCountryRecord {
  val confidence: js.UndefOr[scala.Double] = js.undefined
}

object CountryRecord {
  @scala.inline
  def apply(
    geoname_id: scala.Double,
    iso_code: java.lang.String,
    names: Names,
    confidence: scala.Int | scala.Double = null,
    is_in_european_union: js.UndefOr[scala.Boolean] = js.undefined
  ): CountryRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geoname_id")(geoname_id)
    __obj.updateDynamic("iso_code")(iso_code)
    __obj.updateDynamic("names")(names)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union)
    __obj.asInstanceOf[CountryRecord]
  }
}

