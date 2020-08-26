package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NaptrRecord extends js.Object {
  var flags: String = js.native
  var order: Double = js.native
  var preference: Double = js.native
  var regexp: String = js.native
  var replacement: String = js.native
  var service: String = js.native
}

object NaptrRecord {
  @scala.inline
  def apply(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String
  ): NaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[NaptrRecord]
  }
  @scala.inline
  implicit class NaptrRecordOps[Self <: NaptrRecord] (val x: Self) extends AnyVal {
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
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreference(value: Double): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexp(value: String): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
  }
  
}

