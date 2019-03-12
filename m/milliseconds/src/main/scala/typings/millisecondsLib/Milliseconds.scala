package typings
package millisecondsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milliseconds extends js.Object {
  def days(days: scala.Double): scala.Double
  def hours(hours: scala.Double): scala.Double
  def minutes(minutes: scala.Double): scala.Double
  def months(months: scala.Double): scala.Double
  def seconds(seconds: scala.Double): scala.Double
  def weeks(weeks: scala.Double): scala.Double
  def years(years: scala.Double): scala.Double
}

object Milliseconds {
  @scala.inline
  def apply(
    days: scala.Double => scala.Double,
    hours: scala.Double => scala.Double,
    minutes: scala.Double => scala.Double,
    months: scala.Double => scala.Double,
    seconds: scala.Double => scala.Double,
    weeks: scala.Double => scala.Double,
    years: scala.Double => scala.Double
  ): Milliseconds = {
    val __obj = js.Dynamic.literal(days = js.Any.fromFunction1(days), hours = js.Any.fromFunction1(hours), minutes = js.Any.fromFunction1(minutes), months = js.Any.fromFunction1(months), seconds = js.Any.fromFunction1(seconds), weeks = js.Any.fromFunction1(weeks), years = js.Any.fromFunction1(years))
  
    __obj.asInstanceOf[Milliseconds]
  }
}

