package typings.momentRange

import typings.moment.mod.Moment
import typings.moment.mod.unitOfTime.Diff
import typings.momentRange.anon.Adjacent
import typings.momentRange.anon.ExcludeEnd
import typings.momentRange.anon.ExcludeStart
import typings.momentRange.anon.Exclusive
import typings.momentRange.anon.FnCall
import typings.momentRange.anon.MomentRangeNoneinpundefin
import typings.momentRange.anon.Step
import typings.momentRange.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moment-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("moment-range", "DateRange")
  @js.native
  open class DateRange () extends StObject {
    def this(range: String) = this()
    def this(range: js.Tuple2[js.Date | Moment, js.Date | Moment]) = this()
    def this(start: js.Date, end: js.Date) = this()
    def this(start: js.Date, end: Moment) = this()
    def this(start: Moment, end: js.Date) = this()
    def this(start: Moment, end: Moment) = this()
    
    def add(other: DateRange): DateRange | Null = js.native
    def add(other: DateRange, options: Adjacent): DateRange | Null = js.native
    
    def adjacent(other: DateRange): Boolean = js.native
    
    def by(interval: Diff): js.Iterable[Moment] = js.native
    def by(interval: Diff, options: ExcludeEnd): js.Iterable[Moment] = js.native
    def by(interval: Diff, options: Exclusive): js.Iterable[Moment] = js.native
    
    def byRange(interval: DateRange): js.Iterable[Moment] = js.native
    def byRange(interval: DateRange, options: ExcludeEnd): js.Iterable[Moment] = js.native
    def byRange(interval: DateRange, options: Exclusive): js.Iterable[Moment] = js.native
    
    def center(): Moment = js.native
    
    def contains(other: js.Date): Boolean = js.native
    def contains(other: js.Date, options: ExcludeStart): Boolean = js.native
    def contains(other: js.Date, options: `0`): Boolean = js.native
    def contains(other: Moment): Boolean = js.native
    def contains(other: Moment, options: ExcludeStart): Boolean = js.native
    def contains(other: Moment, options: `0`): Boolean = js.native
    def contains(other: DateRange): Boolean = js.native
    def contains(other: DateRange, options: ExcludeStart): Boolean = js.native
    def contains(other: DateRange, options: `0`): Boolean = js.native
    
    def diff(): Double = js.native
    def diff(unit: Unit, precise: Boolean): Double = js.native
    def diff(unit: Diff): Double = js.native
    def diff(unit: Diff, precise: Boolean): Double = js.native
    
    def duration(): Double = js.native
    def duration(unit: Unit, precise: Boolean): Double = js.native
    def duration(unit: Diff): Double = js.native
    def duration(unit: Diff, precise: Boolean): Double = js.native
    
    var end: Moment = js.native
    
    def intersect(other: DateRange): DateRange | Null = js.native
    
    def isEqual(other: DateRange): Boolean = js.native
    
    def isSame(other: DateRange): Boolean = js.native
    
    def overlaps(other: DateRange): Boolean = js.native
    def overlaps(other: DateRange, options: Adjacent): Boolean = js.native
    
    def reverseBy(interval: Diff): js.Iterable[Moment] = js.native
    def reverseBy(interval: Diff, options: Exclusive): js.Iterable[Moment] = js.native
    def reverseBy(interval: Diff, options: Step): js.Iterable[Moment] = js.native
    
    def reverseByRange(interval: DateRange): js.Iterable[Moment] = js.native
    def reverseByRange(interval: DateRange, options: Exclusive): js.Iterable[Moment] = js.native
    def reverseByRange(interval: DateRange, options: Step): js.Iterable[Moment] = js.native
    
    def snapTo(interval: Diff): DateRange = js.native
    
    var start: Moment = js.native
    
    def subtract(other: DateRange): js.Array[DateRange] = js.native
    
    def toDate(): js.Tuple2[js.Date, js.Date] = js.native
  }
  
  inline def extendMoment(momentClass: FnCall): MomentRangeNoneinpundefin = ^.asInstanceOf[js.Dynamic].applyDynamic("extendMoment")(momentClass.asInstanceOf[js.Any]).asInstanceOf[MomentRangeNoneinpundefin]
  
  @js.native
  trait MomentRange
    extends StObject
       with MomentRangeStaticMethods {
    
    def apply(args: Any*): MomentRangeStaticMethods & Moment = js.native
  }
  
  @js.native
  trait MomentRangeStaticMethods extends StObject {
    
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
  
  /* augmented module */
  object momentAugmentingMod {
    
    trait Moment extends StObject {
      
      def isRange(range: Any): Boolean
      
      def within(range: DateRange): Boolean
    }
    object Moment {
      
      inline def apply(isRange: Any => Boolean, within: DateRange => Boolean): typings.momentRange.mod.momentAugmentingMod.Moment = {
        val __obj = js.Dynamic.literal(isRange = js.Any.fromFunction1(isRange), within = js.Any.fromFunction1(within))
        __obj.asInstanceOf[typings.momentRange.mod.momentAugmentingMod.Moment]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.momentRange.mod.momentAugmentingMod.Moment] (val x: Self) extends AnyVal {
        
        inline def setIsRange(value: Any => Boolean): Self = StObject.set(x, "isRange", js.Any.fromFunction1(value))
        
        inline def setWithin(value: DateRange => Boolean): Self = StObject.set(x, "within", js.Any.fromFunction1(value))
      }
    }
  }
}
