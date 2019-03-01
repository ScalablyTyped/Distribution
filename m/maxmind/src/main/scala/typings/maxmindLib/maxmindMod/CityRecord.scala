package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityRecord extends js.Object {
  val confidence: js.UndefOr[scala.Double] = js.undefined
  val geoname_id: scala.Double
  val names: Names
}

object CityRecord {
  @scala.inline
  def apply(geoname_id: scala.Double, names: Names, confidence: scala.Int | scala.Double = null): CityRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geoname_id")(geoname_id)
    __obj.updateDynamic("names")(names)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityRecord]
  }
}

