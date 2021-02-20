package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionOperator extends StObject
@JSGlobal("Sdk.Query.ConditionOperator")
@js.native
object ConditionOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionOperator with Double] = js.native
  
  @js.native
  sealed trait BeginsWith extends ConditionOperator
  /* 52 */ val BeginsWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.BeginsWith with Double = js.native
  
  @js.native
  sealed trait Between extends ConditionOperator
  /* 10 */ val Between: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Between with Double = js.native
  
  @js.native
  sealed trait Contains extends ConditionOperator
  /* 47 */ val Contains: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Contains with Double = js.native
  
  @js.native
  sealed trait DoesNotBeginWith extends ConditionOperator
  /* 53 */ val DoesNotBeginWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.DoesNotBeginWith with Double = js.native
  
  @js.native
  sealed trait DoesNotContain extends ConditionOperator
  /* 48 */ val DoesNotContain: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.DoesNotContain with Double = js.native
  
  @js.native
  sealed trait DoesNotEndWith extends ConditionOperator
  /* 55 */ val DoesNotEndWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.DoesNotEndWith with Double = js.native
  
  @js.native
  sealed trait EndsWith extends ConditionOperator
  /* 54 */ val EndsWith: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EndsWith with Double = js.native
  
  @js.native
  sealed trait Equal extends ConditionOperator
  /* 0 */ val Equal: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Equal with Double = js.native
  
  @js.native
  sealed trait EqualBusinessId extends ConditionOperator
  /* 43 */ val EqualBusinessId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualBusinessId with Double = js.native
  
  @js.native
  sealed trait EqualUserId extends ConditionOperator
  /* 41 */ val EqualUserId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserId with Double = js.native
  
  @js.native
  sealed trait EqualUserLanguage extends ConditionOperator
  /* 49 */ val EqualUserLanguage: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserLanguage with Double = js.native
  
  @js.native
  sealed trait EqualUserOrUserTeams extends ConditionOperator
  /* 71 */ val EqualUserOrUserTeams: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserOrUserTeams with Double = js.native
  
  @js.native
  sealed trait EqualUserTeams extends ConditionOperator
  /* 72 */ val EqualUserTeams: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.EqualUserTeams with Double = js.native
  
  @js.native
  sealed trait GreaterEqual extends ConditionOperator
  /* 4 */ val GreaterEqual: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.GreaterEqual with Double = js.native
  
  @js.native
  sealed trait GreaterThan extends ConditionOperator
  /* 2 */ val GreaterThan: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.GreaterThan with Double = js.native
  
  @js.native
  sealed trait In extends ConditionOperator
  /* 8 */ val In: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.In with Double = js.native
  
  @js.native
  sealed trait InFiscalPeriod extends ConditionOperator
  /* 67 */ val InFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InFiscalPeriod with Double = js.native
  
  @js.native
  sealed trait InFiscalPeriodAndYear extends ConditionOperator
  /* 68 */ val InFiscalPeriodAndYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InFiscalPeriodAndYear with Double = js.native
  
  @js.native
  sealed trait InFiscalYear extends ConditionOperator
  /* 66 */ val InFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InFiscalYear with Double = js.native
  
  @js.native
  sealed trait InOrAfterFiscalPeriodAndYear extends ConditionOperator
  /* 70 */ val InOrAfterFiscalPeriodAndYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InOrAfterFiscalPeriodAndYear with Double = js.native
  
  @js.native
  sealed trait InOrBeforeFiscalPeriodAndYear extends ConditionOperator
  /* 69 */ val InOrBeforeFiscalPeriodAndYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.InOrBeforeFiscalPeriodAndYear with Double = js.native
  
  @js.native
  sealed trait Last7Days extends ConditionOperator
  /* 17 */ val Last7Days: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Last7Days with Double = js.native
  
  @js.native
  sealed trait LastFiscalPeriod extends ConditionOperator
  /* 61 */ val LastFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastFiscalPeriod with Double = js.native
  
  @js.native
  sealed trait LastFiscalYear extends ConditionOperator
  /* 60 */ val LastFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastFiscalYear with Double = js.native
  
  @js.native
  sealed trait LastMonth extends ConditionOperator
  /* 22 */ val LastMonth: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastMonth with Double = js.native
  
  @js.native
  sealed trait LastWeek extends ConditionOperator
  /* 19 */ val LastWeek: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastWeek with Double = js.native
  
  @js.native
  sealed trait LastXDays extends ConditionOperator
  /* 33 */ val LastXDays: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXDays with Double = js.native
  
  @js.native
  sealed trait LastXFiscalPeriods extends ConditionOperator
  /* 63 */ val LastXFiscalPeriods: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXFiscalPeriods with Double = js.native
  
  @js.native
  sealed trait LastXFiscalYears extends ConditionOperator
  /* 62 */ val LastXFiscalYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXFiscalYears with Double = js.native
  
  @js.native
  sealed trait LastXHours extends ConditionOperator
  /* 31 */ val LastXHours: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXHours with Double = js.native
  
  @js.native
  sealed trait LastXMonths extends ConditionOperator
  /* 37 */ val LastXMonths: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXMonths with Double = js.native
  
  @js.native
  sealed trait LastXWeeks extends ConditionOperator
  /* 35 */ val LastXWeeks: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXWeeks with Double = js.native
  
  @js.native
  sealed trait LastXYears extends ConditionOperator
  /* 39 */ val LastXYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastXYears with Double = js.native
  
  @js.native
  sealed trait LastYear extends ConditionOperator
  /* 28 */ val LastYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LastYear with Double = js.native
  
  @js.native
  sealed trait LessEqual extends ConditionOperator
  /* 5 */ val LessEqual: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LessEqual with Double = js.native
  
  @js.native
  sealed trait LessThan extends ConditionOperator
  /* 3 */ val LessThan: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.LessThan with Double = js.native
  
  @js.native
  sealed trait Like extends ConditionOperator
  /* 6 */ val Like: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Like with Double = js.native
  
  @js.native
  sealed trait Mask extends ConditionOperator
  /* 45 */ val Mask: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Mask with Double = js.native
  
  @js.native
  sealed trait Next7Days extends ConditionOperator
  /* 18 */ val Next7Days: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Next7Days with Double = js.native
  
  @js.native
  sealed trait NextFiscalPeriod extends ConditionOperator
  /* 59 */ val NextFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextFiscalPeriod with Double = js.native
  
  @js.native
  sealed trait NextFiscalYear extends ConditionOperator
  /* 58 */ val NextFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextFiscalYear with Double = js.native
  
  @js.native
  sealed trait NextMonth extends ConditionOperator
  /* 24 */ val NextMonth: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextMonth with Double = js.native
  
  @js.native
  sealed trait NextWeek extends ConditionOperator
  /* 21 */ val NextWeek: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextWeek with Double = js.native
  
  @js.native
  sealed trait NextXDays extends ConditionOperator
  /* 34 */ val NextXDays: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXDays with Double = js.native
  
  @js.native
  sealed trait NextXFiscalPeriods extends ConditionOperator
  /* 65 */ val NextXFiscalPeriods: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXFiscalPeriods with Double = js.native
  
  @js.native
  sealed trait NextXFiscalYears extends ConditionOperator
  /* 64 */ val NextXFiscalYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXFiscalYears with Double = js.native
  
  @js.native
  sealed trait NextXHours extends ConditionOperator
  /* 32 */ val NextXHours: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXHours with Double = js.native
  
  @js.native
  sealed trait NextXMonths extends ConditionOperator
  /* 38 */ val NextXMonths: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXMonths with Double = js.native
  
  @js.native
  sealed trait NextXWeeks extends ConditionOperator
  /* 36 */ val NextXWeeks: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXWeeks with Double = js.native
  
  @js.native
  sealed trait NextXYears extends ConditionOperator
  /* 40 */ val NextXYears: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextXYears with Double = js.native
  
  @js.native
  sealed trait NextYear extends ConditionOperator
  /* 30 */ val NextYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NextYear with Double = js.native
  
  @js.native
  sealed trait NotBetween extends ConditionOperator
  /* 11 */ val NotBetween: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotBetween with Double = js.native
  
  @js.native
  sealed trait NotEqual extends ConditionOperator
  /* 1 */ val NotEqual: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotEqual with Double = js.native
  
  @js.native
  sealed trait NotEqualBusinessId extends ConditionOperator
  /* 44 */ val NotEqualBusinessId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotEqualBusinessId with Double = js.native
  
  @js.native
  sealed trait NotEqualUserId extends ConditionOperator
  /* 42 */ val NotEqualUserId: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotEqualUserId with Double = js.native
  
  @js.native
  sealed trait NotIn extends ConditionOperator
  /* 9 */ val NotIn: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotIn with Double = js.native
  
  @js.native
  sealed trait NotLike extends ConditionOperator
  /* 7 */ val NotLike: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotLike with Double = js.native
  
  @js.native
  sealed trait NotMask extends ConditionOperator
  /* 46 */ val NotMask: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotMask with Double = js.native
  
  @js.native
  sealed trait NotNull extends ConditionOperator
  /* 13 */ val NotNull: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotNull with Double = js.native
  
  @js.native
  sealed trait NotOn extends ConditionOperator
  /* 50 */ val NotOn: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.NotOn with Double = js.native
  
  @js.native
  sealed trait Null extends ConditionOperator
  /* 12 */ val Null: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Null with Double = js.native
  
  @js.native
  sealed trait OlderThanXMonths extends ConditionOperator
  /* 51 */ val OlderThanXMonths: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.OlderThanXMonths with Double = js.native
  
  @js.native
  sealed trait On extends ConditionOperator
  /* 25 */ val On: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.On with Double = js.native
  
  @js.native
  sealed trait OnOrAfter extends ConditionOperator
  /* 27 */ val OnOrAfter: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.OnOrAfter with Double = js.native
  
  @js.native
  sealed trait OnOrBefore extends ConditionOperator
  /* 26 */ val OnOrBefore: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.OnOrBefore with Double = js.native
  
  @js.native
  sealed trait ThisFiscalPeriod extends ConditionOperator
  /* 57 */ val ThisFiscalPeriod: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisFiscalPeriod with Double = js.native
  
  @js.native
  sealed trait ThisFiscalYear extends ConditionOperator
  /* 56 */ val ThisFiscalYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisFiscalYear with Double = js.native
  
  @js.native
  sealed trait ThisMonth extends ConditionOperator
  /* 23 */ val ThisMonth: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisMonth with Double = js.native
  
  @js.native
  sealed trait ThisWeek extends ConditionOperator
  /* 20 */ val ThisWeek: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisWeek with Double = js.native
  
  @js.native
  sealed trait ThisYear extends ConditionOperator
  /* 29 */ val ThisYear: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.ThisYear with Double = js.native
  
  @js.native
  sealed trait Today extends ConditionOperator
  /* 15 */ val Today: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Today with Double = js.native
  
  @js.native
  sealed trait Tomorrow extends ConditionOperator
  /* 16 */ val Tomorrow: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Tomorrow with Double = js.native
  
  @js.native
  sealed trait Yesterday extends ConditionOperator
  /* 14 */ val Yesterday: typings.microsoftSdkSoap.mod.global.Sdk.Query.ConditionOperator.Yesterday with Double = js.native
}
