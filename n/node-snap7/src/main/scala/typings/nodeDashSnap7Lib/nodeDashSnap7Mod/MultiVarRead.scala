package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiVarRead extends js.Object {
  var Amount: scala.Double
  var Area: nodeDashSnap7Lib.nodeDashSnap7Mod.Area
  var DBNumber: js.UndefOr[scala.Double] = js.undefined
  var Start: scala.Double
  var WordLen: nodeDashSnap7Lib.nodeDashSnap7Mod.WordLen
}

object MultiVarRead {
  @scala.inline
  def apply(
    Amount: scala.Double,
    Area: Area,
    Start: scala.Double,
    WordLen: WordLen,
    DBNumber: scala.Int | scala.Double = null
  ): MultiVarRead = {
    val __obj = js.Dynamic.literal(Amount = Amount, Area = Area, Start = Start, WordLen = WordLen)
    if (DBNumber != null) __obj.updateDynamic("DBNumber")(DBNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarRead]
  }
}

