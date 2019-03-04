package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperator[D] extends js.Object {
  var op: atOracleOraclejetLib.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator | atOracleOraclejetLib.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
  def filter(data: js.Array[_]): js.Array[_]
}

object FilterOperator {
  @scala.inline
  def apply[D](
    filter: js.Function1[js.Array[_], js.Array[_]],
    op: atOracleOraclejetLib.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator | atOracleOraclejetLib.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
  ): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(filter = filter, op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterOperator[D]]
  }
}

