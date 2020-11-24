package typings.milliseconds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Milliseconds extends js.Object {
  
  def days(days: Double): Double = js.native
  
  def hours(hours: Double): Double = js.native
  
  def minutes(minutes: Double): Double = js.native
  
  def months(months: Double): Double = js.native
  
  def seconds(seconds: Double): Double = js.native
  
  def weeks(weeks: Double): Double = js.native
  
  def years(years: Double): Double = js.native
}
object Milliseconds {
  
  @scala.inline
  def apply(
    days: Double => Double,
    hours: Double => Double,
    minutes: Double => Double,
    months: Double => Double,
    seconds: Double => Double,
    weeks: Double => Double,
    years: Double => Double
  ): Milliseconds = {
    val __obj = js.Dynamic.literal(days = js.Any.fromFunction1(days), hours = js.Any.fromFunction1(hours), minutes = js.Any.fromFunction1(minutes), months = js.Any.fromFunction1(months), seconds = js.Any.fromFunction1(seconds), weeks = js.Any.fromFunction1(weeks), years = js.Any.fromFunction1(years))
    __obj.asInstanceOf[Milliseconds]
  }
  
  @scala.inline
  implicit class MillisecondsOps[Self <: Milliseconds] (val x: Self) extends AnyVal {
    
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
    def setDays(value: Double => Double): Self = this.set("days", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHours(value: Double => Double): Self = this.set("hours", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinutes(value: Double => Double): Self = this.set("minutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMonths(value: Double => Double): Self = this.set("months", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeconds(value: Double => Double): Self = this.set("seconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeeks(value: Double => Double): Self = this.set("weeks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYears(value: Double => Double): Self = this.set("years", js.Any.fromFunction1(value))
  }
}
