package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object momentNs {
  /* Rewritten from type alias, can be one of: 
    - momentLib.momentLibStrings.sameDay
    - momentLib.momentLibStrings.nextDay
    - momentLib.momentLibStrings.lastDay
    - momentLib.momentLibStrings.nextWeek
    - momentLib.momentLibStrings.lastWeek
    - momentLib.momentLibStrings.sameElse
    - java.lang.String
  */
  type CalendarKey = _CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment], java.lang.String])
  /* Rewritten from type alias, can be one of: 
    - Duration
    - scala.Double
    - java.lang.String
    - FromTo
    - DurationInputObject
    - scala.Unit
  */
  type DurationInputArg1 = _DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = momentLib.momentMod.momentNs.unitOfTimeNs.DurationConstructor
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - Moment
    - Duration
    - js.Array[java.lang.String]
    - scala.Boolean
  */
  type LocaleSpecifier = _LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | MomentBuiltinFormat | (js.Array[java.lang.String | MomentBuiltinFormat])
  /* Rewritten from type alias, can be one of: 
    - Moment
    - stdLib.Date
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - MomentInputObject
    - scala.Unit
  */
  type MomentInput = _MomentInput | (js.Array[scala.Double | java.lang.String]) | stdLib.Date | java.lang.String | scala.Double | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ Moment, java.lang.String]
}
