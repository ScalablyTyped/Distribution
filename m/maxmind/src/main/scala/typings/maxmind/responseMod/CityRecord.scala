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
  def apply(geoname_id: Double, names: Names, confidence: js.UndefOr[Double] = js.undefined): CityRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CityRecord]
  }
}

