package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object momentNs {
  type CalendarKey = momentLib.momentLibStrings.sameDay | momentLib.momentLibStrings.nextDay | momentLib.momentLibStrings.lastDay | momentLib.momentLibStrings.nextWeek | momentLib.momentLibStrings.lastWeek | momentLib.momentLibStrings.sameElse | java.lang.String
  type CalendarSpecVal = java.lang.String | (js.Function2[/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment], java.lang.String])
  type DurationInputArg1 = Duration | scala.Double | java.lang.String | FromTo | DurationInputObject | scala.Unit
  type DurationInputArg2 = momentLib.momentMod.momentNs.unitOfTimeNs.DurationConstructor
  type LocaleSpecifier = java.lang.String | Moment | Duration | js.Array[java.lang.String] | scala.Boolean
  type LongDateFormatKey = momentLib.momentLibStrings.LTS | momentLib.momentLibStrings.LT | momentLib.momentLibStrings.L | momentLib.momentLibStrings.LL | momentLib.momentLibStrings.LLL | momentLib.momentLibStrings.LLLL | momentLib.momentLibStrings.lts | momentLib.momentLibStrings.lt | momentLib.momentLibStrings.l | momentLib.momentLibStrings.ll | momentLib.momentLibStrings.lll | momentLib.momentLibStrings.llll
  type MomentFormatSpecification = java.lang.String | MomentBuiltinFormat | (js.Array[java.lang.String | MomentBuiltinFormat])
  type MomentInput = Moment | stdLib.Date | java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String]) | MomentInputObject | scala.Unit
  type MonthWeekdayFn = js.Function2[
    /* momentToFormat */ Moment, 
    /* format */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type RelativeTimeFuturePastVal = java.lang.String | (js.Function1[/* relTime */ java.lang.String, java.lang.String])
  type RelativeTimeKey = momentLib.momentLibStrings.s | momentLib.momentLibStrings.ss | momentLib.momentLibStrings.m | momentLib.momentLibStrings.mm | momentLib.momentLibStrings.h | momentLib.momentLibStrings.hh | momentLib.momentLibStrings.d | momentLib.momentLibStrings.dd | momentLib.momentLibStrings.M | momentLib.momentLibStrings.MM | momentLib.momentLibStrings.y | momentLib.momentLibStrings.yy
  type RelativeTimeSpecVal = java.lang.String | (js.Function4[
    /* n */ scala.Double, 
    /* withoutSuffix */ scala.Boolean, 
    /* key */ RelativeTimeKey, 
    /* isFuture */ scala.Boolean, 
    java.lang.String
  ])
  type WeekdaySimpleFn = js.Function1[/* momentToFormat */ Moment, java.lang.String]
}
