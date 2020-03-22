package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.AnonColumnNumber
import typings.oracleOraclejet.AnonRowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Selection[K] extends js.Object {
  var endIndex: js.UndefOr[AnonColumnNumber] = js.undefined
  var endKey: js.UndefOr[AnonRowK[K]] = js.undefined
  var startIndex: js.UndefOr[AnonColumnNumber] = js.undefined
  var startKey: js.UndefOr[AnonRowK[K]] = js.undefined
}

object Selection {
  @scala.inline
  def apply[K](
    endIndex: AnonColumnNumber = null,
    endKey: AnonRowK[K] = null,
    startIndex: AnonColumnNumber = null,
    startKey: AnonRowK[K] = null
  ): Selection[K] = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection[K]]
  }
}

