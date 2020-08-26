package typings.node.dnsMod

import typings.node.nodeStrings.NAPTR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyNaptrRecord
  extends NaptrRecord
     with AnyRecord {
  var `type`: NAPTR = js.native
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
  @scala.inline
  implicit class AnyNaptrRecordOps[Self <: AnyNaptrRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: NAPTR): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

