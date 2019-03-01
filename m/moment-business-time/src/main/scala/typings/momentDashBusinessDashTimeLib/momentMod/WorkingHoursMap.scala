package typings
package momentDashBusinessDashTimeLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkingHoursMap extends js.Object {
  var `0`: js.Array[java.lang.String] | scala.Null
  var `1`: js.Array[java.lang.String] | scala.Null
  var `2`: js.Array[java.lang.String] | scala.Null
  var `3`: js.Array[java.lang.String] | scala.Null
  var `4`: js.Array[java.lang.String] | scala.Null
  var `5`: js.Array[java.lang.String] | scala.Null
  var `6`: js.Array[java.lang.String] | scala.Null
}

object WorkingHoursMap {
  @scala.inline
  def apply(
    `0`: js.Array[java.lang.String] = null,
    `1`: js.Array[java.lang.String] = null,
    `2`: js.Array[java.lang.String] = null,
    `3`: js.Array[java.lang.String] = null,
    `4`: js.Array[java.lang.String] = null,
    `5`: js.Array[java.lang.String] = null,
    `6`: js.Array[java.lang.String] = null
  ): WorkingHoursMap = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`)
    if (`1` != null) __obj.updateDynamic("1")(`1`)
    if (`2` != null) __obj.updateDynamic("2")(`2`)
    if (`3` != null) __obj.updateDynamic("3")(`3`)
    if (`4` != null) __obj.updateDynamic("4")(`4`)
    if (`5` != null) __obj.updateDynamic("5")(`5`)
    if (`6` != null) __obj.updateDynamic("6")(`6`)
    __obj.asInstanceOf[WorkingHoursMap]
  }
}

