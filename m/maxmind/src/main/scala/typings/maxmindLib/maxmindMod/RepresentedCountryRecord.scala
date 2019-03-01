package typings
package maxmindLib.maxmindMod

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("geoname_id")(geoname_id)
    __obj.updateDynamic("iso_code")(iso_code)
    __obj.updateDynamic("names")(names)
    if (!js.isUndefined(is_in_european_union)) __obj.updateDynamic("is_in_european_union")(is_in_european_union)
    __obj.asInstanceOf[RepresentedCountryRecord]
  }
}

