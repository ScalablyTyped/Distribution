package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionOperator extends js.Object
@JSGlobal("Sdk.Query.ConditionOperator")
@js.native
object ConditionOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConditionOperator with Double] = js.native
  
  @js.native
  sealed trait BeginsWith extends ConditionOperator
  /* 52 */ @js.native
  object BeginsWith extends TopLevel[BeginsWith with Double]
  
  @js.native
  sealed trait Between extends ConditionOperator
  /* 10 */ @js.native
  object Between extends TopLevel[Between with Double]
  
  @js.native
  sealed trait Contains extends ConditionOperator
  /* 47 */ @js.native
  object Contains extends TopLevel[Contains with Double]
  
  @js.native
  sealed trait DoesNotBeginWith extends ConditionOperator
  /* 53 */ @js.native
  object DoesNotBeginWith extends TopLevel[DoesNotBeginWith with Double]
  
  @js.native
  sealed trait DoesNotContain extends ConditionOperator
  /* 48 */ @js.native
  object DoesNotContain extends TopLevel[DoesNotContain with Double]
  
  @js.native
  sealed trait DoesNotEndWith extends ConditionOperator
  /* 55 */ @js.native
  object DoesNotEndWith extends TopLevel[DoesNotEndWith with Double]
  
  @js.native
  sealed trait EndsWith extends ConditionOperator
  /* 54 */ @js.native
  object EndsWith extends TopLevel[EndsWith with Double]
  
  @js.native
  sealed trait Equal extends ConditionOperator
  /* 0 */ @js.native
  object Equal extends TopLevel[Equal with Double]
  
  @js.native
  sealed trait EqualBusinessId extends ConditionOperator
  /* 43 */ @js.native
  object EqualBusinessId extends TopLevel[EqualBusinessId with Double]
  
  @js.native
  sealed trait EqualUserId extends ConditionOperator
  /* 41 */ @js.native
  object EqualUserId extends TopLevel[EqualUserId with Double]
  
  @js.native
  sealed trait EqualUserLanguage extends ConditionOperator
  /* 49 */ @js.native
  object EqualUserLanguage extends TopLevel[EqualUserLanguage with Double]
  
  @js.native
  sealed trait EqualUserOrUserTeams extends ConditionOperator
  /* 71 */ @js.native
  object EqualUserOrUserTeams extends TopLevel[EqualUserOrUserTeams with Double]
  
  @js.native
  sealed trait EqualUserTeams extends ConditionOperator
  /* 72 */ @js.native
  object EqualUserTeams extends TopLevel[EqualUserTeams with Double]
  
  @js.native
  sealed trait GreaterEqual extends ConditionOperator
  /* 4 */ @js.native
  object GreaterEqual extends TopLevel[GreaterEqual with Double]
  
  @js.native
  sealed trait GreaterThan extends ConditionOperator
  /* 2 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  @js.native
  sealed trait In extends ConditionOperator
  /* 8 */ @js.native
  object In extends TopLevel[In with Double]
  
  @js.native
  sealed trait InFiscalPeriod extends ConditionOperator
  /* 67 */ @js.native
  object InFiscalPeriod extends TopLevel[InFiscalPeriod with Double]
  
  @js.native
  sealed trait InFiscalPeriodAndYear extends ConditionOperator
  /* 68 */ @js.native
  object InFiscalPeriodAndYear extends TopLevel[InFiscalPeriodAndYear with Double]
  
  @js.native
  sealed trait InFiscalYear extends ConditionOperator
  /* 66 */ @js.native
  object InFiscalYear extends TopLevel[InFiscalYear with Double]
  
  @js.native
  sealed trait InOrAfterFiscalPeriodAndYear extends ConditionOperator
  /* 70 */ @js.native
  object InOrAfterFiscalPeriodAndYear extends TopLevel[InOrAfterFiscalPeriodAndYear with Double]
  
  @js.native
  sealed trait InOrBeforeFiscalPeriodAndYear extends ConditionOperator
  /* 69 */ @js.native
  object InOrBeforeFiscalPeriodAndYear extends TopLevel[InOrBeforeFiscalPeriodAndYear with Double]
  
  @js.native
  sealed trait Last7Days extends ConditionOperator
  /* 17 */ @js.native
  object Last7Days extends TopLevel[Last7Days with Double]
  
  @js.native
  sealed trait LastFiscalPeriod extends ConditionOperator
  /* 61 */ @js.native
  object LastFiscalPeriod extends TopLevel[LastFiscalPeriod with Double]
  
  @js.native
  sealed trait LastFiscalYear extends ConditionOperator
  /* 60 */ @js.native
  object LastFiscalYear extends TopLevel[LastFiscalYear with Double]
  
  @js.native
  sealed trait LastMonth extends ConditionOperator
  /* 22 */ @js.native
  object LastMonth extends TopLevel[LastMonth with Double]
  
  @js.native
  sealed trait LastWeek extends ConditionOperator
  /* 19 */ @js.native
  object LastWeek extends TopLevel[LastWeek with Double]
  
  @js.native
  sealed trait LastXDays extends ConditionOperator
  /* 33 */ @js.native
  object LastXDays extends TopLevel[LastXDays with Double]
  
  @js.native
  sealed trait LastXFiscalPeriods extends ConditionOperator
  /* 63 */ @js.native
  object LastXFiscalPeriods extends TopLevel[LastXFiscalPeriods with Double]
  
  @js.native
  sealed trait LastXFiscalYears extends ConditionOperator
  /* 62 */ @js.native
  object LastXFiscalYears extends TopLevel[LastXFiscalYears with Double]
  
  @js.native
  sealed trait LastXHours extends ConditionOperator
  /* 31 */ @js.native
  object LastXHours extends TopLevel[LastXHours with Double]
  
  @js.native
  sealed trait LastXMonths extends ConditionOperator
  /* 37 */ @js.native
  object LastXMonths extends TopLevel[LastXMonths with Double]
  
  @js.native
  sealed trait LastXWeeks extends ConditionOperator
  /* 35 */ @js.native
  object LastXWeeks extends TopLevel[LastXWeeks with Double]
  
  @js.native
  sealed trait LastXYears extends ConditionOperator
  /* 39 */ @js.native
  object LastXYears extends TopLevel[LastXYears with Double]
  
  @js.native
  sealed trait LastYear extends ConditionOperator
  /* 28 */ @js.native
  object LastYear extends TopLevel[LastYear with Double]
  
  @js.native
  sealed trait LessEqual extends ConditionOperator
  /* 5 */ @js.native
  object LessEqual extends TopLevel[LessEqual with Double]
  
  @js.native
  sealed trait LessThan extends ConditionOperator
  /* 3 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  @js.native
  sealed trait Like extends ConditionOperator
  /* 6 */ @js.native
  object Like extends TopLevel[Like with Double]
  
  @js.native
  sealed trait Mask extends ConditionOperator
  /* 45 */ @js.native
  object Mask extends TopLevel[Mask with Double]
  
  @js.native
  sealed trait Next7Days extends ConditionOperator
  /* 18 */ @js.native
  object Next7Days extends TopLevel[Next7Days with Double]
  
  @js.native
  sealed trait NextFiscalPeriod extends ConditionOperator
  /* 59 */ @js.native
  object NextFiscalPeriod extends TopLevel[NextFiscalPeriod with Double]
  
  @js.native
  sealed trait NextFiscalYear extends ConditionOperator
  /* 58 */ @js.native
  object NextFiscalYear extends TopLevel[NextFiscalYear with Double]
  
  @js.native
  sealed trait NextMonth extends ConditionOperator
  /* 24 */ @js.native
  object NextMonth extends TopLevel[NextMonth with Double]
  
  @js.native
  sealed trait NextWeek extends ConditionOperator
  /* 21 */ @js.native
  object NextWeek extends TopLevel[NextWeek with Double]
  
  @js.native
  sealed trait NextXDays extends ConditionOperator
  /* 34 */ @js.native
  object NextXDays extends TopLevel[NextXDays with Double]
  
  @js.native
  sealed trait NextXFiscalPeriods extends ConditionOperator
  /* 65 */ @js.native
  object NextXFiscalPeriods extends TopLevel[NextXFiscalPeriods with Double]
  
  @js.native
  sealed trait NextXFiscalYears extends ConditionOperator
  /* 64 */ @js.native
  object NextXFiscalYears extends TopLevel[NextXFiscalYears with Double]
  
  @js.native
  sealed trait NextXHours extends ConditionOperator
  /* 32 */ @js.native
  object NextXHours extends TopLevel[NextXHours with Double]
  
  @js.native
  sealed trait NextXMonths extends ConditionOperator
  /* 38 */ @js.native
  object NextXMonths extends TopLevel[NextXMonths with Double]
  
  @js.native
  sealed trait NextXWeeks extends ConditionOperator
  /* 36 */ @js.native
  object NextXWeeks extends TopLevel[NextXWeeks with Double]
  
  @js.native
  sealed trait NextXYears extends ConditionOperator
  /* 40 */ @js.native
  object NextXYears extends TopLevel[NextXYears with Double]
  
  @js.native
  sealed trait NextYear extends ConditionOperator
  /* 30 */ @js.native
  object NextYear extends TopLevel[NextYear with Double]
  
  @js.native
  sealed trait NotBetween extends ConditionOperator
  /* 11 */ @js.native
  object NotBetween extends TopLevel[NotBetween with Double]
  
  @js.native
  sealed trait NotEqual extends ConditionOperator
  /* 1 */ @js.native
  object NotEqual extends TopLevel[NotEqual with Double]
  
  @js.native
  sealed trait NotEqualBusinessId extends ConditionOperator
  /* 44 */ @js.native
  object NotEqualBusinessId extends TopLevel[NotEqualBusinessId with Double]
  
  @js.native
  sealed trait NotEqualUserId extends ConditionOperator
  /* 42 */ @js.native
  object NotEqualUserId extends TopLevel[NotEqualUserId with Double]
  
  @js.native
  sealed trait NotIn extends ConditionOperator
  /* 9 */ @js.native
  object NotIn extends TopLevel[NotIn with Double]
  
  @js.native
  sealed trait NotLike extends ConditionOperator
  /* 7 */ @js.native
  object NotLike extends TopLevel[NotLike with Double]
  
  @js.native
  sealed trait NotMask extends ConditionOperator
  /* 46 */ @js.native
  object NotMask extends TopLevel[NotMask with Double]
  
  @js.native
  sealed trait NotNull extends ConditionOperator
  /* 13 */ @js.native
  object NotNull extends TopLevel[NotNull with Double]
  
  @js.native
  sealed trait NotOn extends ConditionOperator
  /* 50 */ @js.native
  object NotOn extends TopLevel[NotOn with Double]
  
  @js.native
  sealed trait Null extends ConditionOperator
  /* 12 */ @js.native
  object Null extends TopLevel[Null with Double]
  
  @js.native
  sealed trait OlderThanXMonths extends ConditionOperator
  /* 51 */ @js.native
  object OlderThanXMonths extends TopLevel[OlderThanXMonths with Double]
  
  @js.native
  sealed trait On extends ConditionOperator
  /* 25 */ @js.native
  object On extends TopLevel[On with Double]
  
  @js.native
  sealed trait OnOrAfter extends ConditionOperator
  /* 27 */ @js.native
  object OnOrAfter extends TopLevel[OnOrAfter with Double]
  
  @js.native
  sealed trait OnOrBefore extends ConditionOperator
  /* 26 */ @js.native
  object OnOrBefore extends TopLevel[OnOrBefore with Double]
  
  @js.native
  sealed trait ThisFiscalPeriod extends ConditionOperator
  /* 57 */ @js.native
  object ThisFiscalPeriod extends TopLevel[ThisFiscalPeriod with Double]
  
  @js.native
  sealed trait ThisFiscalYear extends ConditionOperator
  /* 56 */ @js.native
  object ThisFiscalYear extends TopLevel[ThisFiscalYear with Double]
  
  @js.native
  sealed trait ThisMonth extends ConditionOperator
  /* 23 */ @js.native
  object ThisMonth extends TopLevel[ThisMonth with Double]
  
  @js.native
  sealed trait ThisWeek extends ConditionOperator
  /* 20 */ @js.native
  object ThisWeek extends TopLevel[ThisWeek with Double]
  
  @js.native
  sealed trait ThisYear extends ConditionOperator
  /* 29 */ @js.native
  object ThisYear extends TopLevel[ThisYear with Double]
  
  @js.native
  sealed trait Today extends ConditionOperator
  /* 15 */ @js.native
  object Today extends TopLevel[Today with Double]
  
  @js.native
  sealed trait Tomorrow extends ConditionOperator
  /* 16 */ @js.native
  object Tomorrow extends TopLevel[Tomorrow with Double]
  
  @js.native
  sealed trait Yesterday extends ConditionOperator
  /* 14 */ @js.native
  object Yesterday extends TopLevel[Yesterday with Double]
}
