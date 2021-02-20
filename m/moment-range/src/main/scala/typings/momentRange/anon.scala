package typings.momentRange

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.moment.mod.unitOfTime.Diff
import typings.momentRange.mod.DateRange
import typings.momentRange.mod.MomentRangeStaticMethods
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    }
  }
  
  @js.native
  trait Adjacent extends StObject {
    
    var adjacent: js.UndefOr[Boolean] = js.native
  }
  object Adjacent {
    
    @scala.inline
    def apply(): Adjacent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Adjacent]
    }
    
    @scala.inline
    implicit class AdjacentMutableBuilder[Self <: Adjacent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjacent(value: Boolean): Self = StObject.set(x, "adjacent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjacentUndefined: Self = StObject.set(x, "adjacent", js.undefined)
    }
  }
  
  @js.native
  trait ExcludeEnd extends StObject {
    
    var excludeEnd: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object ExcludeEnd {
    
    @scala.inline
    def apply(): ExcludeEnd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeEnd]
    }
    
    @scala.inline
    implicit class ExcludeEndMutableBuilder[Self <: ExcludeEnd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait ExcludeStart extends StObject {
    
    var excludeEnd: js.UndefOr[Boolean] = js.native
    
    var excludeStart: js.UndefOr[Boolean] = js.native
  }
  object ExcludeStart {
    
    @scala.inline
    def apply(): ExcludeStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeStart]
    }
    
    @scala.inline
    implicit class ExcludeStartMutableBuilder[Self <: ExcludeStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      @scala.inline
      def setExcludeStart(value: Boolean): Self = StObject.set(x, "excludeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeStartUndefined: Self = StObject.set(x, "excludeStart", js.undefined)
    }
  }
  
  @js.native
  trait Exclusive extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object Exclusive {
    
    @scala.inline
    def apply(): Exclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclusive]
    }
    
    @scala.inline
    implicit class ExclusiveMutableBuilder[Self <: Exclusive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Moment = js.native
    def apply(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: js.UndefOr[scala.Nothing],
      strict: Boolean
    ): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
    def apply(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: String,
      strict: Boolean
    ): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
  }
  
  /* Inlined moment-range.moment-range.MomentRange & {None (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment} */
  @js.native
  trait MomentRangeNoneinpundefin extends StObject {
    
    def apply(): Moment = js.native
    def apply(args: js.Any*): MomentRangeStaticMethods with Moment = js.native
    def apply(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: js.UndefOr[scala.Nothing],
      strict: Boolean
    ): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
    def apply(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: String,
      strict: Boolean
    ): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
    def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
    
    // @deprecated 4.0.0
    def parseZoneRange(isoTimeInterval: String): DateRange = js.native
    
    def range(): DateRange = js.native
    def range(range: String): DateRange = js.native
    def range(range: js.Tuple2[Date | Moment, Date | Moment]): DateRange = js.native
    def range(start: Moment, end: Moment): DateRange = js.native
    def range(start: Moment, end: Date): DateRange = js.native
    def range(start: Date, end: Moment): DateRange = js.native
    def range(start: Date, end: Date): DateRange = js.native
    
    def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
    
    def rangeFromInterval(interval: Diff): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Date): DateRange = js.native
  }
  
  @js.native
  trait Step extends StObject {
    
    var excludeStart: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object Step {
    
    @scala.inline
    def apply(): Step = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeStart(value: Boolean): Self = StObject.set(x, "excludeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeStartUndefined: Self = StObject.set(x, "excludeStart", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
