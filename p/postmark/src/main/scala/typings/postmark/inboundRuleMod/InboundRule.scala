package typings.postmark.inboundRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundRule extends js.Object {
  var ID: Double
  var Rule: String
}

object InboundRule {
  @scala.inline
  def apply(ID: Double, Rule: String): InboundRule = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRule]
  }
}

