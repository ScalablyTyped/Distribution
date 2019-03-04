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
    val __obj = js.Dynamic.literal(flags = flags, order = order, preference = preference, regexp = regexp, replacement = replacement, service = service)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyNaptrRecord]
  }
}

