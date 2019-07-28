package typings.node.dnsMod

import typings.node.nodeStrings.NAPTR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyNaptrRecord
  extends NaptrRecord
     with AnyRecord {
  var `type`: NAPTR
}

object AnyNaptrRecord {
  @scala.inline
  def apply(
    flags: java.lang.String,
    order: Double,
    preference: Double,
    regexp: java.lang.String,
    replacement: java.lang.String,
    service: java.lang.String,
    `type`: NAPTR
  ): AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags, order = order, preference = preference, regexp = regexp, replacement = replacement, service = service)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyNaptrRecord]
  }
}

