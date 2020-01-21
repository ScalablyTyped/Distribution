package typings.postmark.inboundRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundRules extends js.Object {
  var InboundRules: js.Array[InboundRule]
  var TotalCount: Double
}

object InboundRules {
  @scala.inline
  def apply(InboundRules: js.Array[InboundRule], TotalCount: Double): InboundRules = {
    val __obj = js.Dynamic.literal(InboundRules = InboundRules.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InboundRules]
  }
}

