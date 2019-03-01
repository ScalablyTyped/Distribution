package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyNaptrRecord
  extends NaptrRecord
     with AnyRecord {
  var `type`: nodeLib.nodeLibStrings.NAPTR
}

object AnyNaptrRecord {
  @scala.inline
  def apply(
    flags: java.lang.String,
    order: scala.Double,
    preference: scala.Double,
    regexp: java.lang.String,
    replacement: java.lang.String,
    service: java.lang.String,
    `type`: nodeLib.nodeLibStrings.NAPTR
  ): AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("preference")(preference)
    __obj.updateDynamic("regexp")(regexp)
    __obj.updateDynamic("replacement")(replacement)
    __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[AnyNaptrRecord]
  }
}

