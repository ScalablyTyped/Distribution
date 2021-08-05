package typings.milliseconds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Milliseconds extends StObject {
  
  def days(days: Double): Double
  
  def hours(hours: Double): Double
  
  def minutes(minutes: Double): Double
  
  def months(months: Double): Double
  
  def seconds(seconds: Double): Double
  
  def weeks(weeks: Double): Double
  
  def years(years: Double): Double
}
object Milliseconds {
  
  inline def apply(
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
  
  extension [Self <: Milliseconds](x: Self) {
    
    inline def setDays(value: Double => Double): Self = StObject.set(x, "days", js.Any.fromFunction1(value))
    
    inline def setHours(value: Double => Double): Self = StObject.set(x, "hours", js.Any.fromFunction1(value))
    
    inline def setMinutes(value: Double => Double): Self = StObject.set(x, "minutes", js.Any.fromFunction1(value))
    
    inline def setMonths(value: Double => Double): Self = StObject.set(x, "months", js.Any.fromFunction1(value))
    
    inline def setSeconds(value: Double => Double): Self = StObject.set(x, "seconds", js.Any.fromFunction1(value))
    
    inline def setWeeks(value: Double => Double): Self = StObject.set(x, "weeks", js.Any.fromFunction1(value))
    
    inline def setYears(value: Double => Double): Self = StObject.set(x, "years", js.Any.fromFunction1(value))
  }
}
