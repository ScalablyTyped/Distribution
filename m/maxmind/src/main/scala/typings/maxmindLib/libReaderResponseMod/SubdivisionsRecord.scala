package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubdivisionsRecord extends js.Object {
  val confidence: js.UndefOr[scala.Double] = js.undefined
  val geoname_id: scala.Double
  val iso_code: java.lang.String
  val names: Names
}

object SubdivisionsRecord {
  @scala.inline
  def apply(
    geoname_id: scala.Double,
    iso_code: java.lang.String,
    names: Names,
    confidence: scala.Int | scala.Double = null
  ): SubdivisionsRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id, iso_code = iso_code, names = names)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubdivisionsRecord]
  }
}

