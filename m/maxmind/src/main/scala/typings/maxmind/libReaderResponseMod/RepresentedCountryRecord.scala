package typings.maxmind.libReaderResponseMod

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
    val __obj = js.Dynamic.literal(geoname_id = geoname_id, iso_code = iso_code, names = names)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union)
    __obj.asInstanceOf[RepresentedCountryRecord]
  }
}

