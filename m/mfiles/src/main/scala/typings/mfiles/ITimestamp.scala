package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimestamp extends js.Object {
  
  def Clone(): ITimestamp = js.native
  
  var Day: Double = js.native
  
  var Fraction: Double = js.native
  
  def GetValue(): js.Any = js.native
  
  var Hour: Double = js.native
  
  def LocalTimeToUtc(): ITimestamp = js.native
  
  var Minute: Double = js.native
  
  var Month: Double = js.native
  
  var Second: Double = js.native
  
  def SetValue(Value: js.Any): Unit = js.native
  
  def UtcToLocalTime(): ITimestamp = js.native
  
  var Year: Double = js.native
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
  
  @scala.inline
  implicit class ITimestampOps[Self <: ITimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => ITimestamp): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDay(value: Double): Self = this.set("Day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraction(value: Double): Self = this.set("Fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("GetValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHour(value: Double): Self = this.set("Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTimeToUtc(value: () => ITimestamp): Self = this.set("LocalTimeToUtc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinute(value: Double): Self = this.set("Minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("Month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = this.set("Second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = this.set("SetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUtcToLocalTime(value: () => ITimestamp): Self = this.set("UtcToLocalTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setYear(value: Double): Self = this.set("Year", value.asInstanceOf[js.Any])
  }
}
