package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompoundFilterOperator[D] extends js.Object {
  var criteria: js.Array[FilterOperator[D]]
  var op: atOracleOraclejetLib.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
}

object CompoundFilterOperator {
  @scala.inline
  def apply[D](
    criteria: js.Array[FilterOperator[D]],
    op: atOracleOraclejetLib.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
  ): CompoundFilterOperator[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria, op = op)
  
    __obj.asInstanceOf[CompoundFilterOperator[D]]
  }
}

