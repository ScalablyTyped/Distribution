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
    val __obj = js.Dynamic.literal(Clone = Clone, Day = Day, Fraction = Fraction, GetValue = GetValue, Hour = Hour, LocalTimeToUtc = LocalTimeToUtc, Minute = Minute, Month = Month, Second = Second, SetValue = SetValue, UtcToLocalTime = UtcToLocalTime, Year = Year)
  
    __obj.asInstanceOf[ITimestamp]
  }
}

