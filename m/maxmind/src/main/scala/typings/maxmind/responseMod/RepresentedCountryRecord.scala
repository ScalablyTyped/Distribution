package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentedCountryRecord extends RegisteredCountryRecord {
  val `type`: String
}

object RepresentedCountryRecord {
  @scala.inline
  def apply(
    geoname_id: Double,
    iso_code: String,
    names: Names,
    `type`: String,
    is_in_european_union: js.UndefOr[Boolean] = js.undefined
  ): RepresentedCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepresentedCountryRecord]
  }
}

