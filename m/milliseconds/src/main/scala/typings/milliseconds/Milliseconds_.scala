package typings.milliseconds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milliseconds_ extends js.Object {
  def days(days: Double): Double
  def hours(hours: Double): Double
  def minutes(minutes: Double): Double
  def months(months: Double): Double
  def seconds(seconds: Double): Double
  def weeks(weeks: Double): Double
  def years(years: Double): Double
}

object Milliseconds_ {
  @scala.inline
  def apply(
    days: Double => Double,
    hours: Double => Double,
    minutes: Double => Double,
    months: Double => Double,
    seconds: Double => Double,
    weeks: Double => Double,
    years: Double => Double
  ): Milliseconds_ = {
    val __obj = js.Dynamic.literal(days = js.Any.fromFunction1(days), hours = js.Any.fromFunction1(hours), minutes = js.Any.fromFunction1(minutes), months = js.Any.fromFunction1(months), seconds = js.Any.fromFunction1(seconds), weeks = js.Any.fromFunction1(weeks), years = js.Any.fromFunction1(years))
  
    __obj.asInstanceOf[Milliseconds_]
  }
}

