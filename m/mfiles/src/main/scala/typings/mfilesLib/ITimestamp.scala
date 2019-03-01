package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimestamp extends js.Object {
  var Day: scala.Double
  var Fraction: scala.Double
  var Hour: scala.Double
  var Minute: scala.Double
  var Month: scala.Double
  var Second: scala.Double
  var Year: scala.Double
  def Clone(): ITimestamp
  def GetValue(): js.Any
  def LocalTimeToUtc(): ITimestamp
  def SetValue(Value: js.Any): scala.Unit
  def UtcToLocalTime(): ITimestamp
}

object ITimestamp {
  @scala.inline
  def apply(
    Clone: js.Function0[ITimestamp],
    Day: scala.Double,
    Fraction: scala.Double,
    GetValue: js.Function0[js.Any],
    Hour: scala.Double,
    LocalTimeToUtc: js.Function0[ITimestamp],
    Minute: scala.Double,
    Month: scala.Double,
    Second: scala.Double,
    SetValue: js.Function1[js.Any, scala.Unit],
    UtcToLocalTime: js.Function0[ITimestamp],
    Year: scala.Double
  ): ITimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Day")(Day)
    __obj.updateDynamic("Fraction")(Fraction)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("Hour")(Hour)
    __obj.updateDynamic("LocalTimeToUtc")(LocalTimeToUtc)
    __obj.updateDynamic("Minute")(Minute)
    __obj.updateDynamic("Month")(Month)
    __obj.updateDynamic("Second")(Second)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("UtcToLocalTime")(UtcToLocalTime)
    __obj.updateDynamic("Year")(Year)
    __obj.asInstanceOf[ITimestamp]
  }
}

