package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDRange extends js.Object {
  var MaxID: scala.Double
  var MaxID_32bit: java.lang.String
  var MinID: scala.Double
  var MinID_32bit: java.lang.String
  def Clone(): IIDRange
  def SetIDs(MinID: scala.Double, MaxID: scala.Double): scala.Unit
  def SetIDs_32bit(MinID: java.lang.String, MaxID: java.lang.String): scala.Unit
}

object IIDRange {
  @scala.inline
  def apply(
    Clone: js.Function0[IIDRange],
    MaxID: scala.Double,
    MaxID_32bit: java.lang.String,
    MinID: scala.Double,
    MinID_32bit: java.lang.String,
    SetIDs: js.Function2[scala.Double, scala.Double, scala.Unit],
    SetIDs_32bit: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): IIDRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("MaxID")(MaxID)
    __obj.updateDynamic("MaxID_32bit")(MaxID_32bit)
    __obj.updateDynamic("MinID")(MinID)
    __obj.updateDynamic("MinID_32bit")(MinID_32bit)
    __obj.updateDynamic("SetIDs")(SetIDs)
    __obj.updateDynamic("SetIDs_32bit")(SetIDs_32bit)
    __obj.asInstanceOf[IIDRange]
  }
}

