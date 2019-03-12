package typings
package postgresDashIntervalLib.postgresDashIntervalMod.PostgresIntervalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresInterval extends js.Object {
  var days: js.UndefOr[scala.Double] = js.undefined
  var hours: js.UndefOr[scala.Double] = js.undefined
  var milliseconds: js.UndefOr[scala.Double] = js.undefined
  var minutes: js.UndefOr[scala.Double] = js.undefined
  var months: js.UndefOr[scala.Double] = js.undefined
  var seconds: js.UndefOr[scala.Double] = js.undefined
  var years: js.UndefOr[scala.Double] = js.undefined
  def toISO(): java.lang.String
  def toISOString(): java.lang.String
  def toPostgres(): java.lang.String
}

object IPostgresInterval {
  @scala.inline
  def apply(
    toISO: () => java.lang.String,
    toISOString: () => java.lang.String,
    toPostgres: () => java.lang.String,
    days: scala.Int | scala.Double = null,
    hours: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null,
    months: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null,
    years: scala.Int | scala.Double = null
  ): IPostgresInterval = {
    val __obj = js.Dynamic.literal(toISO = js.Any.fromFunction0(toISO), toISOString = js.Any.fromFunction0(toISOString), toPostgres = js.Any.fromFunction0(toPostgres))
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostgresInterval]
  }
}

