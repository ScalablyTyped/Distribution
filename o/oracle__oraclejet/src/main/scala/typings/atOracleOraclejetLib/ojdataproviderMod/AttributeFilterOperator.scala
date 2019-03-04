package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeFilterOperator[D] extends js.Object {
  var attribute: java.lang.String
  var op: atOracleOraclejetLib.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator
  var value: js.Any
}

object AttributeFilterOperator {
  @scala.inline
  def apply[D](
    attribute: java.lang.String,
    op: atOracleOraclejetLib.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator,
    value: js.Any
  ): AttributeFilterOperator[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute, op = op, value = value)
  
    __obj.asInstanceOf[AttributeFilterOperator[D]]
  }
}

