package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreCalendarTypeMod {
  
  /**
    * The types of `Calendar`.
    */
  @JSImport("sap/ui/core/CalendarType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarType & String] = js.native
    
    /* "Buddhist" */ val Buddhist: typings.openui5.sapUiCoreCalendarTypeMod.CalendarType.Buddhist & String = js.native
    
    /* "Gregorian" */ val Gregorian: typings.openui5.sapUiCoreCalendarTypeMod.CalendarType.Gregorian & String = js.native
    
    /* "Islamic" */ val Islamic: typings.openui5.sapUiCoreCalendarTypeMod.CalendarType.Islamic & String = js.native
    
    /* "Japanese" */ val Japanese: typings.openui5.sapUiCoreCalendarTypeMod.CalendarType.Japanese & String = js.native
    
    /* "Persian" */ val Persian: typings.openui5.sapUiCoreCalendarTypeMod.CalendarType.Persian & String = js.native
  }
  
  @js.native
  sealed trait CalendarType extends StObject
  /**
    * The types of `Calendar`.
    */
  @JSImport("sap/ui/core/CalendarType", "CalendarType")
  @js.native
  object CalendarType extends StObject {
    
    /**
      * The Thai buddhist calendar
      */
    @js.native
    sealed trait Buddhist
      extends StObject
         with CalendarType
    
    /**
      * The Gregorian calendar
      */
    @js.native
    sealed trait Gregorian
      extends StObject
         with CalendarType
    
    /**
      * The Islamic calendar
      */
    @js.native
    sealed trait Islamic
      extends StObject
         with CalendarType
    
    /**
      * The Japanese emperor calendar
      */
    @js.native
    sealed trait Japanese
      extends StObject
         with CalendarType
    
    /**
      * The Persian Jalali calendar
      */
    @js.native
    sealed trait Persian
      extends StObject
         with CalendarType
  }
}
