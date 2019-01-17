package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperator[D] extends js.Object {
  var op: atOracleOraclejetLib.ojdataproviderMod.AttributeFilterOperatorNs.AttributeOperator | atOracleOraclejetLib.ojdataproviderMod.CompoundFilterOperatorNs.CompoundOperator
  def filter(data: js.Array[_]): js.Array[_]
}

