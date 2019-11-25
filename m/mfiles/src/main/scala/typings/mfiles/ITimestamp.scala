package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimestamp extends js.Object {
  var Day: Double
  var Fraction: Double
  var Hour: Double
  var Minute: Double
  var Month: Double
  var Second: Double
  var Year: Double
  def Clone(): ITimestamp
  def GetValue(): js.Any
  def LocalTimeToUtc(): ITimestamp
  def SetValue(Value: js.Any): Unit
  def UtcToLocalTime(): ITimestamp
}

object ITimestamp {
  @scala.inline
  def apply(
    Clone: () => ITimestamp,
    Day: Double,
    Fraction: Double,
    GetValue: () => js.Any,
    Hour: Double,
    LocalTimeToUtc: () => ITimestamp,
    Minute: Double,
    Month: Double,
    Second: Double,
    SetValue: js.Any => Unit,
    UtcToLocalTime: () => ITimestamp,
    Year: Double
  ): ITimestamp = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Day = Day.asInstanceOf[js.Any], Fraction = Fraction.asInstanceOf[js.Any], GetValue = js.Any.fromFunction0(GetValue), Hour = Hour.asInstanceOf[js.Any], LocalTimeToUtc = js.Any.fromFunction0(LocalTimeToUtc), Minute = Minute.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], SetValue = js.Any.fromFunction1(SetValue), UtcToLocalTime = js.Any.fromFunction0(UtcToLocalTime), Year = Year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITimestamp]
  }
}

