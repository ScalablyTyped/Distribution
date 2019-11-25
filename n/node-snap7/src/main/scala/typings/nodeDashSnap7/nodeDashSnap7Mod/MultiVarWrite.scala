package typings.nodeDashSnap7.nodeDashSnap7Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiVarWrite extends js.Object {
  var Amount: Double
  var Area: typings.nodeDashSnap7.nodeDashSnap7Mod.Area
  var DBNumber: js.UndefOr[Double] = js.undefined
  var Data: Buffer
  var Start: Double
  var WordLen: typings.nodeDashSnap7.nodeDashSnap7Mod.WordLen
}

object MultiVarWrite {
  @scala.inline
  def apply(
    Amount: Double,
    Area: Area,
    Data: Buffer,
    Start: Double,
    WordLen: WordLen,
    DBNumber: Int | Double = null
  ): MultiVarWrite = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Area = Area.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], WordLen = WordLen.asInstanceOf[js.Any])
    if (DBNumber != null) __obj.updateDynamic("DBNumber")(DBNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarWrite]
  }
}

