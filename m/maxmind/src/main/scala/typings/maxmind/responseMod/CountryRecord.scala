package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryRecord extends RegisteredCountryRecord {
  val confidence: js.UndefOr[Double] = js.undefined
}

object CountryRecord {
  @scala.inline
  def apply(
    geoname_id: Double,
    iso_code: String,
    names: Names,
    confidence: Int | Double = null,
    is_in_european_union: js.UndefOr[Boolean] = js.undefined
  ): CountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryRecord]
  }
}

