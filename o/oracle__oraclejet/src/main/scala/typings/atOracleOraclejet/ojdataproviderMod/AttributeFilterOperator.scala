package typings.atOracleOraclejet.ojdataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeFilterOperator[D] extends js.Object {
  var attribute: String
  var op: AttributeOperator
  var value: js.Any
}

object AttributeFilterOperator {
  @scala.inline
  def apply[D](attribute: String, op: AttributeOperator, value: js.Any): AttributeFilterOperator[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute, op = op, value = value)
  
    __obj.asInstanceOf[AttributeFilterOperator[D]]
  }
}

