package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object momentNs {
  type CalendarKey = _CalendarKey | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment], java.lang.String])
  type DurationInputArg1 = _DurationInputArg1 | scala.Double | java.lang.String | scala.Unit
  type DurationInputArg2 = momentLib.momentMod.momentNs.unitOfTimeNs.DurationConstructor
  type LocaleSpecifier = _LocaleSpecifier | js.Array[java.lang.String] | java.lang.String | scala.Boolean
  type MomentFormatSpecification = java.lang.String | MomentBuiltinFormat | (js.Array[java.lang.String | MomentBuiltinFormat])
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
