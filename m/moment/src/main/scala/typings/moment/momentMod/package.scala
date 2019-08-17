package typings.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object momentMod {
  import typings.moment.momentMod.unitOfTimeNs.DurationConstructor
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.sameDay
    - typings.moment.momentStrings.nextDay
    - typings.moment.momentStrings.lastDay
    - typings.moment.momentStrings.nextWeek
    - typings.moment.momentStrings.lastWeek
    - typings.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = _CalendarKey | String
  type CalendarSpecVal = String | (js.Function2[/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment], String])
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.Duration
    - scala.Double
    - java.lang.String
    - typings.moment.momentMod.FromTo
    - typings.moment.momentMod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = _DurationInputArg1 | Double | String | Unit
  type DurationInputArg2 = DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.moment.momentMod.Moment
    - typings.moment.momentMod.Duration
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = _LocaleSpecifier | js.Array[String] | String | Boolean
  type MomentFormatSpecification = String | MomentBuiltinFormat | (js.Array[String | MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.Moment
    - typings.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typings.moment.momentMod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = _MomentInput | (js.Array[Double | String]) | Date | String | Double | Unit
  type MonthWeekdayFn = js.Function2[/* momentToFormat */ Moment, /* format */ js.UndefOr[String], String]
  type RelativeTimeFuturePastVal = String | (js.Function1[/* relTime */ String, String])
  type RelativeTimeSpecVal = String | (js.Function4[
    /* n */ Double, 
    /* withoutSuffix */ Boolean, 
    /* key */ RelativeTimeKey, 
    /* isFuture */ Boolean, 
    String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ Moment, String]
}
