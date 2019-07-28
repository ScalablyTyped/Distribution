package typings.atOracleOraclejet.ojdataproviderMod

import typings.atOracleOraclejet.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompoundFilterOperator[D] extends js.Object {
  var criteria: js.Array[FilterOperator[D]]
  var op: CompoundOperator
}

object CompoundFilterOperator {
  @scala.inline
  def apply[D](criteria: js.Array[FilterOperator[D]], op: CompoundOperator): CompoundFilterOperator[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria, op = op)
  
    __obj.asInstanceOf[CompoundFilterOperator[D]]
  }
}

