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
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String,
    `type`: NAPTR
  ): AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNaptrRecord]
  }
}

