package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredCountryRecord extends js.Object {
  val geoname_id: Double
  val is_in_european_union: js.UndefOr[Boolean] = js.undefined
  val iso_code: String
  val names: Names
}

object RegisteredCountryRecord {
  @scala.inline
  def apply(
    geoname_id: Double,
    iso_code: String,
    names: Names,
    is_in_european_union: js.UndefOr[Boolean] = js.undefined
  ): RegisteredCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredCountryRecord]
  }
}

