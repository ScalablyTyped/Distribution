package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiVarWrite extends js.Object {
  var Amount: scala.Double
  var Area: Area
  var DBNumber: js.UndefOr[scala.Double] = js.undefined
  var Data: nodeLib.Buffer
  var Start: scala.Double
  var WordLen: WordLen
}

object MultiVarWrite {
  @scala.inline
  def apply(
    Amount: scala.Double,
    Area: Area,
    Data: nodeLib.Buffer,
    Start: scala.Double,
    WordLen: WordLen,
    DBNumber: scala.Int | scala.Double = null
  ): MultiVarWrite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Amount")(Amount)
    __obj.updateDynamic("Area")(Area)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("WordLen")(WordLen)
    if (DBNumber != null) __obj.updateDynamic("DBNumber")(DBNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarWrite]
  }
}

