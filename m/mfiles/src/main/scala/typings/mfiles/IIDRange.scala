package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDRange extends js.Object {
  var MaxID: Double
  var MaxID_32bit: String
  var MinID: Double
  var MinID_32bit: String
  def Clone(): IIDRange
  def SetIDs(MinID: Double, MaxID: Double): Unit
  def SetIDs_32bit(MinID: String, MaxID: String): Unit
}

object IIDRange {
  @scala.inline
  def apply(
    Clone: () => IIDRange,
    MaxID: Double,
    MaxID_32bit: String,
    MinID: Double,
    MinID_32bit: String,
    SetIDs: (Double, Double) => Unit,
    SetIDs_32bit: (String, String) => Unit
  ): IIDRange = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), MaxID = MaxID.asInstanceOf[js.Any], MaxID_32bit = MaxID_32bit.asInstanceOf[js.Any], MinID = MinID.asInstanceOf[js.Any], MinID_32bit = MinID_32bit.asInstanceOf[js.Any], SetIDs = js.Any.fromFunction2(SetIDs), SetIDs_32bit = js.Any.fromFunction2(SetIDs_32bit))
  
    __obj.asInstanceOf[IIDRange]
  }
}

