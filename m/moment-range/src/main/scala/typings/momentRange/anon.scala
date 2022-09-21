package typings.momentRange

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.moment.mod.unitOfTime.Diff
import typings.momentRange.mod.DateRange
import typings.momentRange.mod.MomentRangeStaticMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    }
  }
  
  trait Adjacent extends StObject {
    
    var adjacent: js.UndefOr[Boolean] = js.undefined
  }
  object Adjacent {
    
    inline def apply(): Adjacent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Adjacent]
    }
    
    extension [Self <: Adjacent](x: Self) {
      
      inline def setAdjacent(value: Boolean): Self = StObject.set(x, "adjacent", value.asInstanceOf[js.Any])
      
      inline def setAdjacentUndefined: Self = StObject.set(x, "adjacent", js.undefined)
    }
  }
  
  trait ExcludeEnd extends StObject {
    
    var excludeEnd: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object ExcludeEnd {
    
    inline def apply(): ExcludeEnd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeEnd]
    }
    
    extension [Self <: ExcludeEnd](x: Self) {
      
      inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait ExcludeStart extends StObject {
    
    var excludeEnd: js.UndefOr[Boolean] = js.undefined
    
    var excludeStart: js.UndefOr[Boolean] = js.undefined
  }
  object ExcludeStart {
    
    inline def apply(): ExcludeStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeStart]
    }
    
    extension [Self <: ExcludeStart](x: Self) {
      
      inline def setExcludeEnd(value: Boolean): Self = StObject.set(x, "excludeEnd", value.asInstanceOf[js.Any])
      
      inline def setExcludeEndUndefined: Self = StObject.set(x, "excludeEnd", js.undefined)
      
      inline def setExcludeStart(value: Boolean): Self = StObject.set(x, "excludeStart", value.asInstanceOf[js.Any])
      
      inline def setExcludeStartUndefined: Self = StObject.set(x, "excludeStart", js.undefined)
    }
  }
  
  trait Exclusive extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object Exclusive {
    
    inline def apply(): Exclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclusive]
    }
    
    extension [Self <: Exclusive](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Moment = js.native
    def apply(inp: Unit, format: Unit, language: String): Moment = js.native
    def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, strict: Boolean): Moment = js.native
  }
  
  /* Inlined moment-range.moment-range.MomentRange & {None (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment} */
  @js.native
  trait MomentRangeNoneinpundefin extends StObject {
    
    def apply(): Moment = js.native
    def apply(args: Any*): MomentRangeStaticMethods & Moment = js.native
    def apply(inp: Unit, format: Unit, language: String): Moment = js.native
    def apply(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    def apply(inp: MomentInput, strict: Boolean): Moment = js.native
    
    // @deprecated 4.0.0
    def parseZoneRange(isoTimeInterval: String): DateRange = js.native
    
    def range(): DateRange = js.native
    def range(range: String): DateRange = js.native
    def range(range: js.Tuple2[js.Date | Moment, js.Date | Moment]): DateRange = js.native
    def range(start: js.Date, end: js.Date): DateRange = js.native
    def range(start: js.Date, end: Moment): DateRange = js.native
    def range(start: Moment, end: js.Date): DateRange = js.native
    def range(start: Moment, end: Moment): DateRange = js.native
    
    def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
    
    def rangeFromInterval(interval: Diff): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: js.Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Unit, date: js.Date): DateRange = js.native
    def rangeFromInterval(interval: Diff, count: Unit, date: Moment): DateRange = js.native
  }
  
  trait Step extends StObject {
    
    var excludeStart: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object Step {
    
    inline def apply(): Step = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setExcludeStart(value: Boolean): Self = StObject.set(x, "excludeStart", value.asInstanceOf[js.Any])
      
      inline def setExcludeStartUndefined: Self = StObject.set(x, "excludeStart", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
