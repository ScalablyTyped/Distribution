package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultIssue extends js.Object {
  var code: String
  var context: String
  var message: String
  var selector: String
  var `type`: String
  var typeCode: Double
}

object ResultIssue {
  @scala.inline
  def apply(code: String, context: String, message: String, selector: String, `type`: String, typeCode: Double): ResultIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeCode = typeCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultIssue]
  }
}

