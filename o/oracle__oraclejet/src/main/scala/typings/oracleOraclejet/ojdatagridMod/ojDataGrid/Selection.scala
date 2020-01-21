package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.AnonColumnRowKOptional
import typings.oracleOraclejet.AnonColumnRowNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Selection[K] extends js.Object {
  var endIndex: js.UndefOr[AnonColumnRowNumber] = js.undefined
  var endKey: js.UndefOr[AnonColumnRowKOptional[K]] = js.undefined
  var startIndex: js.UndefOr[AnonColumnRowNumber] = js.undefined
  var startKey: js.UndefOr[AnonColumnRowKOptional[K]] = js.undefined
}

object Selection {
  @scala.inline
  def apply[K](
    endIndex: AnonColumnRowNumber = null,
    endKey: AnonColumnRowKOptional[K] = null,
    startIndex: AnonColumnRowNumber = null,
    startKey: AnonColumnRowKOptional[K] = null
  ): Selection[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection[K]]
  }
}

