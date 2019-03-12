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
    Clone: () => ITimestamp,
    Day: scala.Double,
    Fraction: scala.Double,
    GetValue: () => js.Any,
    Hour: scala.Double,
    LocalTimeToUtc: () => ITimestamp,
    Minute: scala.Double,
    Month: scala.Double,
    Second: scala.Double,
    SetValue: js.Any => scala.Unit,
    UtcToLocalTime: () => ITimestamp,
    Year: scala.Double
  ): ITimestamp = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Day = Day, Fraction = Fraction, GetValue = js.Any.fromFunction0(GetValue), Hour = Hour, LocalTimeToUtc = js.Any.fromFunction0(LocalTimeToUtc), Minute = Minute, Month = Month, Second = Second, SetValue = js.Any.fromFunction1(SetValue), UtcToLocalTime = js.Any.fromFunction0(UtcToLocalTime), Year = Year)
  
    __obj.asInstanceOf[ITimestamp]
  }
}

