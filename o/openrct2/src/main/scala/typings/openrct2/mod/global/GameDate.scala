package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * APIs for the in-game date.
  */
trait GameDate extends StObject {
  
  /** The day of the month from 1 to 31. */
  val day: Double
  
  /** The current month of the year from 0 to 7, where 0 is March and 7 is October. */
  val month: Double
  
  /**
    * How far through the month we are between 0 and 65536. This is incremented by 4 each tick, so
    * every month takes ~6.8 minutes to complete making a year take just under an hour.
    */
  var monthProgress: Double
  
  /**
    * The total number of months that have elapsed. This will equate to 0 in March, Year 1 and
    * increase by 1 every month, i.e. by 8 every year.
    * Note: this represents the current date and may be reset by cheats or scripts.
    */
  var monthsElapsed: Double
  
  /**
    * The total number of ticks that have elapsed since the beginning of the game / scenario. This
    * should never reset.
    */
  val ticksElapsed: Double
  
  /** The current year starting from 1. */
  val year: Double
  
  /**
    * The total number of years that have elapsed. This always equates to (monthsElapsed / 8).
    */
  val yearsElapsed: Double
}
object GameDate {
  
  inline def apply(
    day: Double,
    month: Double,
    monthProgress: Double,
    monthsElapsed: Double,
    ticksElapsed: Double,
    year: Double,
    yearsElapsed: Double
  ): GameDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthProgress = monthProgress.asInstanceOf[js.Any], monthsElapsed = monthsElapsed.asInstanceOf[js.Any], ticksElapsed = ticksElapsed.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yearsElapsed = yearsElapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameDate]
  }
  
  extension [Self <: GameDate](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthProgress(value: Double): Self = StObject.set(x, "monthProgress", value.asInstanceOf[js.Any])
    
    inline def setMonthsElapsed(value: Double): Self = StObject.set(x, "monthsElapsed", value.asInstanceOf[js.Any])
    
    inline def setTicksElapsed(value: Double): Self = StObject.set(x, "ticksElapsed", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearsElapsed(value: Double): Self = StObject.set(x, "yearsElapsed", value.asInstanceOf[js.Any])
  }
}
