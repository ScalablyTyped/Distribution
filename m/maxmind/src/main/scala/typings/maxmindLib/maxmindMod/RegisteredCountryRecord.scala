package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredCountryRecord extends js.Object {
  val geoname_id: scala.Double
  val is_in_european_union: js.UndefOr[scala.Boolean] = js.undefined
  val iso_code: java.lang.String
  val names: Names
}

object RegisteredCountryRecord {
  @scala.inline
  def apply(
    geoname_id: scala.Double,
    iso_code: java.lang.String,
    names: Names,
    is_in_european_union: js.UndefOr[scala.Boolean] = js.undefined
  ): RegisteredCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id, iso_code = iso_code, names = names)
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union)
    __obj.asInstanceOf[RegisteredCountryRecord]
  }
}

