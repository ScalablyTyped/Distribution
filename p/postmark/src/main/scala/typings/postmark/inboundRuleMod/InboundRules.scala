package typings.postmark.inboundRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InboundRules extends js.Object {
  var InboundRules: js.Array[InboundRule] = js.native
  var TotalCount: Double = js.native
}

object InboundRules {
  @scala.inline
  def apply(InboundRules: js.Array[InboundRule], TotalCount: Double): InboundRules = {
    val __obj = js.Dynamic.literal(InboundRules = InboundRules.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRules]
  }
  @scala.inline
  implicit class InboundRulesOps[Self <: InboundRules] (val x: Self) extends AnyVal {
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
    def setInboundRulesVarargs(value: InboundRule*): Self = this.set("InboundRules", js.Array(value :_*))
    @scala.inline
    def setInboundRules(value: js.Array[InboundRule]): Self = this.set("InboundRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
  
}

