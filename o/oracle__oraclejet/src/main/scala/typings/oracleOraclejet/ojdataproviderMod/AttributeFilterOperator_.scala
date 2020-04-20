package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeFilterOperator_[D] extends js.Object {
  var attribute: String
  var op: AttributeOperator
  var value: js.Any
}

object AttributeFilterOperator_ {
  @scala.inline
  def apply[D](attribute: String, op: AttributeOperator, value: js.Any): AttributeFilterOperator_[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilterOperator_[D]]
  }
}

