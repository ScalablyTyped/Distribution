package typings
package maxmindLib.libReaderResponseMod

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
    val __obj = js.Dynamic.literal(geoname_id = geoname_id, iso_code = iso_code, names = names)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union)
    __obj.asInstanceOf[CountryRecord]
  }
}

