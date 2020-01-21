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
  def apply(geoname_id: Double, iso_code: String, names: Names, confidence: Int | Double = null): SubdivisionsRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubdivisionsRecord]
  }
}

