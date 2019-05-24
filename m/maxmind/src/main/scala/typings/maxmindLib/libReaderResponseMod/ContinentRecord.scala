package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinentRecord extends js.Object {
  val code: maxmindLib.maxmindLibStrings.AF | maxmindLib.maxmindLibStrings.AN | maxmindLib.maxmindLibStrings.AS | maxmindLib.maxmindLibStrings.EU | maxmindLib.maxmindLibStrings.NA | maxmindLib.maxmindLibStrings.OC | maxmindLib.maxmindLibStrings.SA
  val geoname_id: scala.Double
  val names: Names
}

object ContinentRecord {
  @scala.inline
  def apply(
    code: maxmindLib.maxmindLibStrings.AF | maxmindLib.maxmindLibStrings.AN | maxmindLib.maxmindLibStrings.AS | maxmindLib.maxmindLibStrings.EU | maxmindLib.maxmindLibStrings.NA | maxmindLib.maxmindLibStrings.OC | maxmindLib.maxmindLibStrings.SA,
    geoname_id: scala.Double,
    names: Names
  ): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id, names = names)
  
    __obj.asInstanceOf[ContinentRecord]
  }
}

