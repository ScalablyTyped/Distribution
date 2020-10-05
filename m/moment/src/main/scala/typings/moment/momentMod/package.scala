package typings.moment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object momentMod {
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentStrings.sameDay
    - typings.moment.momentStrings.nextDay
    - typings.moment.momentStrings.lastDay
    - typings.moment.momentStrings.nextWeek
    - typings.moment.momentStrings.lastWeek
    - typings.moment.momentStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = typings.moment.momentMod._CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[
    /* m */ js.UndefOr[typings.moment.momentMod.MomentInput], 
    /* now */ js.UndefOr[typings.moment.momentMod.Moment], 
    java.lang.String
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.Duration_
    - scala.Double
    - java.lang.String
    - typings.moment.momentMod.FromTo
    - typings.moment.momentMod.DurationInputObject
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type DurationInputArg1 = js.UndefOr[
    typings.moment.momentMod._DurationInputArg1 | scala.Double | java.lang.String | scala.Null
  ]
  type DurationInputArg2 = typings.moment.momentMod.unitOfTime.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.moment.momentMod.Moment
    - typings.moment.momentMod.Duration_
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = typings.moment.momentMod._LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | typings.moment.momentMod.MomentBuiltinFormat | (js.Array[java.lang.String | typings.moment.momentMod.MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - typings.moment.momentMod.Moment
    - typings.std.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typings.moment.momentMod.MomentInputObject
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type MomentInput = js.UndefOr[
    typings.moment.momentMod._MomentInput | (js.Array[scala.Double | java.lang.String]) | typings.std.Date | java.lang.String | scala.Double | scala.Null
  ]
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ typings.moment.momentMod.Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ typings.moment.momentMod.RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ typings.moment.momentMod.Moment, java.lang.String]
}
