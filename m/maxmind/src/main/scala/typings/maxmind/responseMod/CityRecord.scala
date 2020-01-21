package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityRecord extends js.Object {
  val confidence: js.UndefOr[Double] = js.undefined
  val geoname_id: Double
  val names: Names
}

object CityRecord {
  @scala.inline
  def apply(geoname_id: Double, names: Names, confidence: Int | Double = null): CityRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityRecord]
  }
}

