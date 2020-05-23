package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubdivisionsRecord extends js.Object {
  val confidence: js.UndefOr[Double] = js.undefined
  val geoname_id: Double
  val iso_code: String
  val names: Names
}

object SubdivisionsRecord {
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names, confidence: js.UndefOr[Double] = js.undefined): SubdivisionsRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubdivisionsRecord]
  }
}

