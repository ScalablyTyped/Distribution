package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionOperator extends StObject
@JSGlobal("Sdk.Query.ConditionOperator")
@js.native
object ConditionOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionOperator & Double] = js.native
  
  @js.native
  sealed trait BeginsWith
    extends StObject
       with ConditionOperator
  /* 52 */ val BeginsWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.BeginsWith & Double = js.native
  
  @js.native
  sealed trait Between
    extends StObject
       with ConditionOperator
  /* 10 */ val Between: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Between & Double = js.native
  
  @js.native
  sealed trait Contains
    extends StObject
       with ConditionOperator
  /* 47 */ val Contains: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Contains & Double = js.native
  
  @js.native
  sealed trait DoesNotBeginWith
    extends StObject
       with ConditionOperator
  /* 53 */ val DoesNotBeginWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.DoesNotBeginWith & Double = js.native
  
  @js.native
  sealed trait DoesNotContain
    extends StObject
       with ConditionOperator
  /* 48 */ val DoesNotContain: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.DoesNotContain & Double = js.native
  
  @js.native
  sealed trait DoesNotEndWith
    extends StObject
       with ConditionOperator
  /* 55 */ val DoesNotEndWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.DoesNotEndWith & Double = js.native
  
  @js.native
  sealed trait EndsWith
    extends StObject
       with ConditionOperator
  /* 54 */ val EndsWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EndsWith & Double = js.native
  
  @js.native
  sealed trait Equal
    extends StObject
       with ConditionOperator
  /* 0 */ val Equal: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Equal & Double = js.native
  
  @js.native
  sealed trait EqualBusinessId
    extends StObject
       with ConditionOperator
  /* 43 */ val EqualBusinessId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualBusinessId & Double = js.native
  
  @js.native
  sealed trait EqualUserId
    extends StObject
       with ConditionOperator
  /* 41 */ val EqualUserId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserId & Double = js.native
  
  @js.native
  sealed trait EqualUserLanguage
    extends StObject
       with ConditionOperator
  /* 49 */ val EqualUserLanguage: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserLanguage & Double = js.native
  
  @js.native
  sealed trait EqualUserOrUserTeams
    extends StObject
       with ConditionOperator
  /* 71 */ val EqualUserOrUserTeams: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserOrUserTeams & Double = js.native
  
  @js.native
  sealed trait EqualUserTeams
    extends StObject
       with ConditionOperator
  /* 72 */ val EqualUserTeams: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserTeams & Double = js.native
  
  @js.native
  sealed trait GreaterEqual
    extends StObject
       with ConditionOperator
  /* 4 */ val GreaterEqual: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.GreaterEqual & Double = js.native
  
  @js.native
  sealed trait GreaterThan
    extends StObject
       with ConditionOperator
  /* 2 */ val GreaterThan: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.GreaterThan & Double = js.native
  
  @js.native
  sealed trait In
    extends StObject
       with ConditionOperator
  /* 8 */ val In: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.In & Double = js.native
  
  @js.native
  sealed trait InFiscalPeriod
    extends StObject
       with ConditionOperator
  /* 67 */ val InFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InFiscalPeriod & Double = js.native
  
  @js.native
  sealed trait InFiscalPeriodAndYear
    extends StObject
       with ConditionOperator
  /* 68 */ val InFiscalPeriodAndYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InFiscalPeriodAndYear & Double = js.native
  
  @js.native
  sealed trait InFiscalYear
    extends StObject
       with ConditionOperator
  /* 66 */ val InFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InFiscalYear & Double = js.native
  
  @js.native
  sealed trait InOrAfterFiscalPeriodAndYear
    extends StObject
       with ConditionOperator
  /* 70 */ val InOrAfterFiscalPeriodAndYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InOrAfterFiscalPeriodAndYear & Double = js.native
  
  @js.native
  sealed trait InOrBeforeFiscalPeriodAndYear
    extends StObject
       with ConditionOperator
  /* 69 */ val InOrBeforeFiscalPeriodAndYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InOrBeforeFiscalPeriodAndYear & Double = js.native
  
  @js.native
  sealed trait Last7Days
    extends StObject
       with ConditionOperator
  /* 17 */ val Last7Days: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Last7Days & Double = js.native
  
  @js.native
  sealed trait LastFiscalPeriod
    extends StObject
       with ConditionOperator
  /* 61 */ val LastFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastFiscalPeriod & Double = js.native
  
  @js.native
  sealed trait LastFiscalYear
    extends StObject
       with ConditionOperator
  /* 60 */ val LastFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastFiscalYear & Double = js.native
  
  @js.native
  sealed trait LastMonth
    extends StObject
       with ConditionOperator
  /* 22 */ val LastMonth: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastMonth & Double = js.native
  
  @js.native
  sealed trait LastWeek
    extends StObject
       with ConditionOperator
  /* 19 */ val LastWeek: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastWeek & Double = js.native
  
  @js.native
  sealed trait LastXDays
    extends StObject
       with ConditionOperator
  /* 33 */ val LastXDays: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXDays & Double = js.native
  
  @js.native
  sealed trait LastXFiscalPeriods
    extends StObject
       with ConditionOperator
  /* 63 */ val LastXFiscalPeriods: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXFiscalPeriods & Double = js.native
  
  @js.native
  sealed trait LastXFiscalYears
    extends StObject
       with ConditionOperator
  /* 62 */ val LastXFiscalYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXFiscalYears & Double = js.native
  
  @js.native
  sealed trait LastXHours
    extends StObject
       with ConditionOperator
  /* 31 */ val LastXHours: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXHours & Double = js.native
  
  @js.native
  sealed trait LastXMonths
    extends StObject
       with ConditionOperator
  /* 37 */ val LastXMonths: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXMonths & Double = js.native
  
  @js.native
  sealed trait LastXWeeks
    extends StObject
       with ConditionOperator
  /* 35 */ val LastXWeeks: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXWeeks & Double = js.native
  
  @js.native
  sealed trait LastXYears
    extends StObject
       with ConditionOperator
  /* 39 */ val LastXYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXYears & Double = js.native
  
  @js.native
  sealed trait LastYear
    extends StObject
       with ConditionOperator
  /* 28 */ val LastYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastYear & Double = js.native
  
  @js.native
  sealed trait LessEqual
    extends StObject
       with ConditionOperator
  /* 5 */ val LessEqual: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LessEqual & Double = js.native
  
  @js.native
  sealed trait LessThan
    extends StObject
       with ConditionOperator
  /* 3 */ val LessThan: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LessThan & Double = js.native
  
  @js.native
  sealed trait Like
    extends StObject
       with ConditionOperator
  /* 6 */ val Like: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Like & Double = js.native
  
  @js.native
  sealed trait Mask
    extends StObject
       with ConditionOperator
  /* 45 */ val Mask: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Mask & Double = js.native
  
  @js.native
  sealed trait Next7Days
    extends StObject
       with ConditionOperator
  /* 18 */ val Next7Days: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Next7Days & Double = js.native
  
  @js.native
  sealed trait NextFiscalPeriod
    extends StObject
       with ConditionOperator
  /* 59 */ val NextFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextFiscalPeriod & Double = js.native
  
  @js.native
  sealed trait NextFiscalYear
    extends StObject
       with ConditionOperator
  /* 58 */ val NextFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextFiscalYear & Double = js.native
  
  @js.native
  sealed trait NextMonth
    extends StObject
       with ConditionOperator
  /* 24 */ val NextMonth: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextMonth & Double = js.native
  
  @js.native
  sealed trait NextWeek
    extends StObject
       with ConditionOperator
  /* 21 */ val NextWeek: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextWeek & Double = js.native
  
  @js.native
  sealed trait NextXDays
    extends StObject
       with ConditionOperator
  /* 34 */ val NextXDays: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXDays & Double = js.native
  
  @js.native
  sealed trait NextXFiscalPeriods
    extends StObject
       with ConditionOperator
  /* 65 */ val NextXFiscalPeriods: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXFiscalPeriods & Double = js.native
  
  @js.native
  sealed trait NextXFiscalYears
    extends StObject
       with ConditionOperator
  /* 64 */ val NextXFiscalYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXFiscalYears & Double = js.native
  
  @js.native
  sealed trait NextXHours
    extends StObject
       with ConditionOperator
  /* 32 */ val NextXHours: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXHours & Double = js.native
  
  @js.native
  sealed trait NextXMonths
    extends StObject
       with ConditionOperator
  /* 38 */ val NextXMonths: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXMonths & Double = js.native
  
  @js.native
  sealed trait NextXWeeks
    extends StObject
       with ConditionOperator
  /* 36 */ val NextXWeeks: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXWeeks & Double = js.native
  
  @js.native
  sealed trait NextXYears
    extends StObject
       with ConditionOperator
  /* 40 */ val NextXYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXYears & Double = js.native
  
  @js.native
  sealed trait NextYear
    extends StObject
       with ConditionOperator
  /* 30 */ val NextYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextYear & Double = js.native
  
  @js.native
  sealed trait NotBetween
    extends StObject
       with ConditionOperator
  /* 11 */ val NotBetween: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotBetween & Double = js.native
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with ConditionOperator
  /* 1 */ val NotEqual: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotEqual & Double = js.native
  
  @js.native
  sealed trait NotEqualBusinessId
    extends StObject
       with ConditionOperator
  /* 44 */ val NotEqualBusinessId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotEqualBusinessId & Double = js.native
  
  @js.native
  sealed trait NotEqualUserId
    extends StObject
       with ConditionOperator
  /* 42 */ val NotEqualUserId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotEqualUserId & Double = js.native
  
  @js.native
  sealed trait NotIn
    extends StObject
       with ConditionOperator
  /* 9 */ val NotIn: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotIn & Double = js.native
  
  @js.native
  sealed trait NotLike
    extends StObject
       with ConditionOperator
  /* 7 */ val NotLike: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotLike & Double = js.native
  
  @js.native
  sealed trait NotMask
    extends StObject
       with ConditionOperator
  /* 46 */ val NotMask: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotMask & Double = js.native
  
  @js.native
  sealed trait NotNull
    extends StObject
       with ConditionOperator
  /* 13 */ val NotNull: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotNull & Double = js.native
  
  @js.native
  sealed trait NotOn
    extends StObject
       with ConditionOperator
  /* 50 */ val NotOn: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotOn & Double = js.native
  
  @js.native
  sealed trait Null
    extends StObject
       with ConditionOperator
  /* 12 */ val Null: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Null & Double = js.native
  
  @js.native
  sealed trait OlderThanXMonths
    extends StObject
       with ConditionOperator
  /* 51 */ val OlderThanXMonths: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.OlderThanXMonths & Double = js.native
  
  @js.native
  sealed trait On
    extends StObject
       with ConditionOperator
  /* 25 */ val On: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.On & Double = js.native
  
  @js.native
  sealed trait OnOrAfter
    extends StObject
       with ConditionOperator
  /* 27 */ val OnOrAfter: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.OnOrAfter & Double = js.native
  
  @js.native
  sealed trait OnOrBefore
    extends StObject
       with ConditionOperator
  /* 26 */ val OnOrBefore: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.OnOrBefore & Double = js.native
  
  @js.native
  sealed trait ThisFiscalPeriod
    extends StObject
       with ConditionOperator
  /* 57 */ val ThisFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisFiscalPeriod & Double = js.native
  
  @js.native
  sealed trait ThisFiscalYear
    extends StObject
       with ConditionOperator
  /* 56 */ val ThisFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisFiscalYear & Double = js.native
  
  @js.native
  sealed trait ThisMonth
    extends StObject
       with ConditionOperator
  /* 23 */ val ThisMonth: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisMonth & Double = js.native
  
  @js.native
  sealed trait ThisWeek
    extends StObject
       with ConditionOperator
  /* 20 */ val ThisWeek: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisWeek & Double = js.native
  
  @js.native
  sealed trait ThisYear
    extends StObject
       with ConditionOperator
  /* 29 */ val ThisYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisYear & Double = js.native
  
  @js.native
  sealed trait Today
    extends StObject
       with ConditionOperator
  /* 15 */ val Today: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Today & Double = js.native
  
  @js.native
  sealed trait Tomorrow
    extends StObject
       with ConditionOperator
  /* 16 */ val Tomorrow: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Tomorrow & Double = js.native
  
  @js.native
  sealed trait Yesterday
    extends StObject
       with ConditionOperator
  /* 14 */ val Yesterday: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Yesterday & Double = js.native
}
