package typings.atOracleOraclejet.ojdataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator
import typings.atOracleOraclejet.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperator[D] extends js.Object {
  var op: AttributeOperator | CompoundOperator
  def filter(data: js.Array[_]): js.Array[_]
}

object FilterOperator {
  @scala.inline
  def apply[D](filter: js.Array[_] => js.Array[_], op: AttributeOperator | CompoundOperator): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterOperator[D]]
  }
}

