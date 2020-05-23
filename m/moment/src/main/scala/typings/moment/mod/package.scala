package typings.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.sameDay
    - typings.moment.momentStrings.nextDay
    - typings.moment.momentStrings.lastDay
    - typings.moment.momentStrings.nextWeek
    - typings.moment.momentStrings.lastWeek
    - typings.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typings.moment.mod._CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typings.moment.mod.MomentInput], 
    /* now */ js.UndefOr[typings.moment.mod.Moment], 
    java.lang.String
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.moment.mod.Duration_
    - scala.Double
    - java.lang.String
    - typings.moment.mod.FromTo
    - typings.moment.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typings.moment.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = typings.moment.mod.unitOfTime.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.moment.mod.Moment
    - typings.moment.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typings.moment.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | typings.moment.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typings.moment.mod.MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typings.moment.mod.Moment
    - typings.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typings.moment.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typings.moment.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | typings.std.Date | java.lang.String | scala.Double | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typings.moment.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typings.moment.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typings.moment.mod.Moment, java.lang.String]
  type numberlike = scala.Double | java.lang.String
}
