package typings.momentMini

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.momentMini.momentMiniStrings.sameDay
    - typings.momentMini.momentMiniStrings.nextDay
    - typings.momentMini.momentMiniStrings.lastDay
    - typings.momentMini.momentMiniStrings.nextWeek
    - typings.momentMini.momentMiniStrings.lastWeek
    - typings.momentMini.momentMiniStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typings.momentMini.mod._CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typings.momentMini.mod.MomentInput], 
    /* now */ js.UndefOr[typings.momentMini.mod.Moment], 
    java.lang.String
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.momentMini.mod.Duration_
    - scala.Double
    - java.lang.String
    - typings.momentMini.mod.FromTo
    - typings.momentMini.mod.DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = typings.momentMini.mod._DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = typings.momentMini.mod.unitOfTime.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.momentMini.mod.Moment
    - typings.momentMini.mod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typings.momentMini.mod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | typings.momentMini.mod.MomentBuiltinFormat | (js.Array[java.lang.String | typings.momentMini.mod.MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typings.momentMini.mod.Moment
    - typings.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typings.momentMini.mod.MomentInputObject
    - scala.Unit
  */
  type MomentInput = typings.momentMini.mod._MomentInput | (js.Array[scala.Double | java.lang.String]) | typings.std.Date | java.lang.String | scala.Double | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typings.momentMini.mod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typings.momentMini.mod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typings.momentMini.mod.Moment, java.lang.String]
}
