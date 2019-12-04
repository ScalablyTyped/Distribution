package typings.atOracleOraclejet.ojdataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("CompoundFilterOperator")
trait CompoundFilterOperator_[D] extends js.Object {
  var criteria: js.Array[FilterOperator[D]]
  var op: CompoundOperator
}

object CompoundFilterOperator_ {
  @scala.inline
  def apply[D](criteria: js.Array[FilterOperator[D]], op: CompoundOperator): CompoundFilterOperator_[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompoundFilterOperator_[D]]
  }
}

