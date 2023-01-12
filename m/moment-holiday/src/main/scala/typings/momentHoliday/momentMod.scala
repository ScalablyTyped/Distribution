package typings.momentHoliday

import org.scalablytyped.runtime.StringDictionary
import typings.momentHoliday.momentHolidayBooleans.`false`
import typings.std.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object momentMod {
  
  @JSImport("moment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("moment", "holidays")
  @js.native
  def holidays: Holidays_ = js.native
  inline def holidays_=(x: Holidays_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("holidays")(x.asInstanceOf[js.Any])
  
  @JSImport("moment", "modifyHolidays")
  @js.native
  def modifyHolidays: HolidayModifier = js.native
  inline def modifyHolidays_=(x: HolidayModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifyHolidays")(x.asInstanceOf[js.Any])
  
  trait HolidayDefinition extends StObject {
    
    var date: String
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var keywords_n: js.UndefOr[js.Array[String]] = js.undefined
    
    var keywords_y: js.UndefOr[js.Array[String]] = js.undefined
    
    var regions: js.UndefOr[js.Array[String]] = js.undefined
    
    var regions_n: js.UndefOr[js.Array[String]] = js.undefined
  }
  object HolidayDefinition {
    
    inline def apply(date: String): HolidayDefinition = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[HolidayDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HolidayDefinition] (val x: Self) extends AnyVal {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setKeywords_n(value: js.Array[String]): Self = StObject.set(x, "keywords_n", value.asInstanceOf[js.Any])
      
      inline def setKeywords_nUndefined: Self = StObject.set(x, "keywords_n", js.undefined)
      
      inline def setKeywords_nVarargs(value: String*): Self = StObject.set(x, "keywords_n", js.Array(value*))
      
      inline def setKeywords_y(value: js.Array[String]): Self = StObject.set(x, "keywords_y", value.asInstanceOf[js.Any])
      
      inline def setKeywords_yUndefined: Self = StObject.set(x, "keywords_y", js.undefined)
      
      inline def setKeywords_yVarargs(value: String*): Self = StObject.set(x, "keywords_y", js.Array(value*))
      
      inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
      
      inline def setRegions_n(value: js.Array[String]): Self = StObject.set(x, "regions_n", value.asInstanceOf[js.Any])
      
      inline def setRegions_nUndefined: Self = StObject.set(x, "regions_n", js.undefined)
      
      inline def setRegions_nVarargs(value: String*): Self = StObject.set(x, "regions_n", js.Array(value*))
    }
  }
  
  @js.native
  trait HolidayModifier extends StObject {
    
    def add(holidays: String): HolidayModifier = js.native
    def add(holidays: String, specifics: Any): HolidayModifier = js.native
    def add(holidays: HolidaysMapping): HolidayModifier = js.native
    def add(holidays: HolidaysMapping, specifics: Any): HolidayModifier = js.native
    
    @JSName("extendParser")
    def extendParser_false(
      parserFunc: js.Function2[/* m */ Moment, /* date */ String, Moment | js.Array[Moment] | `false` | Unit]
    ): HolidayModifier = js.native
    
    def load(locales: String): HolidayModifier = js.native
    def load(locales: js.Array[String]): HolidayModifier = js.native
    
    def remove(holidays: String): HolidayModifier = js.native
    def remove(holidays: js.Array[String]): HolidayModifier = js.native
    
    def set(holidays: String): HolidayModifier = js.native
    def set(holidays: String, specifics: Any): HolidayModifier = js.native
    def set(holidays: js.Array[String]): HolidayModifier = js.native
    def set(holidays: js.Array[String], specifics: Any): HolidayModifier = js.native
    def set(holidays: HolidaysMapping): HolidayModifier = js.native
    def set(holidays: HolidaysMapping, specifics: Any): HolidayModifier = js.native
    
    def undo(): HolidayModifier = js.native
  }
  
  type HolidaysMapping = StringDictionary[HolidayDefinition]
  
  trait Holidays_ extends StObject {
    
    var active: HolidaysMapping
    
    var active_last: HolidaysMapping
  }
  object Holidays_ {
    
    inline def apply(active: HolidaysMapping, active_last: HolidaysMapping): Holidays_ = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], active_last = active_last.asInstanceOf[js.Any])
      __obj.asInstanceOf[Holidays_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Holidays_] (val x: Self) extends AnyVal {
      
      inline def setActive(value: HolidaysMapping): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActive_last(value: HolidaysMapping): Self = StObject.set(x, "active_last", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Moment
    extends StObject
       with Object {
    
    def holiday(): Moment | `false` | StringDictionary[Moment] = js.native
    def holiday(holidays: String): Moment | `false` | StringDictionary[Moment] = js.native
    def holiday(holidays: String, adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
    def holiday(holidays: js.Array[String]): Moment | `false` | StringDictionary[Moment] = js.native
    def holiday(holidays: js.Array[String], adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
    def holiday(holidays: Unit, adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
    
    def holidays(): Moment | `false` | StringDictionary[Moment] = js.native
    def holidays(holidays: String): Moment | `false` | StringDictionary[Moment] = js.native
    def holidays(holidays: String, adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
    def holidays(holidays: js.Array[String]): Moment | `false` | StringDictionary[Moment] = js.native
    def holidays(holidays: js.Array[String], adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
    def holidays(holidays: Unit, adjust: Boolean): Moment | `false` | StringDictionary[Moment] = js.native
    
    def holidaysBetween(m: Moment): js.Array[Moment] | `false` = js.native
    def holidaysBetween(m: Moment, adjust: Boolean): js.Array[Moment] | `false` = js.native
    
    def isHoliday(): Boolean | String | js.Array[String] = js.native
    def isHoliday(holidays: String): Boolean | String | js.Array[String] = js.native
    def isHoliday(holidays: String, adjust: Boolean): Boolean | String | js.Array[String] = js.native
    def isHoliday(holidays: js.Array[String]): Boolean | String | js.Array[String] = js.native
    def isHoliday(holidays: js.Array[String], adjust: Boolean): Boolean | String | js.Array[String] = js.native
    def isHoliday(holidays: Null, adjust: Boolean): Boolean | String | js.Array[String] = js.native
    def isHoliday(holidays: Unit, adjust: Boolean): Boolean | String | js.Array[String] = js.native
    
    def nextHoliday(): js.Array[Moment] | Moment = js.native
    def nextHoliday(count: Double): js.Array[Moment] | Moment = js.native
    def nextHoliday(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
    def nextHoliday(count: Unit, adjust: Boolean): js.Array[Moment] | Moment = js.native
    
    def nextHolidays(): js.Array[Moment] | Moment = js.native
    def nextHolidays(count: Double): js.Array[Moment] | Moment = js.native
    def nextHolidays(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
    def nextHolidays(count: Unit, adjust: Boolean): js.Array[Moment] | Moment = js.native
    
    def previousHoliday(): js.Array[Moment] | Moment = js.native
    def previousHoliday(count: Double): js.Array[Moment] | Moment = js.native
    def previousHoliday(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
    def previousHoliday(count: Unit, adjust: Boolean): js.Array[Moment] | Moment = js.native
    
    def previousHolidays(): js.Array[Moment] | Moment = js.native
    def previousHolidays(count: Double): js.Array[Moment] | Moment = js.native
    def previousHolidays(count: Double, adjust: Boolean): js.Array[Moment] | Moment = js.native
    def previousHolidays(count: Unit, adjust: Boolean): js.Array[Moment] | Moment = js.native
  }
}
