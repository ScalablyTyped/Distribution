package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentedCountryRecord extends RegisteredCountryRecord {
  val `type`: java.lang.String
}

object RepresentedCountryRecord {
  @scala.inline
  def apply(
    geoname_id: scala.Double,
    iso_code: java.lang.String,
    names: Names,
    `type`: java.lang.String,
    is_in_european_union: js.UndefOr[scala.Boolean] = js.undefined
  ): RepresentedCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id, iso_code = iso_code, names = names)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union)
    __obj.asInstanceOf[RepresentedCountryRecord]
  }
}

