package typings.officeUiFabricReact

import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "Calendar")
  @js.native
  class Calendar protected ()
    extends typings.officeUiFabricReact.calendarCalendarMod.Calendar {
    def this(props: ICalendarProps) = this()
  }
  /* static members */
  object Calendar {
    
    @JSImport("office-ui-fabric-react/lib/components/Calendar", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Calendar", "Calendar.defaultProps")
    @js.native
    def defaultProps: ICalendarProps = js.native
    inline def defaultProps_=(x: ICalendarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType & Double] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day & Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month & Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week & Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek & Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear & Double] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
}
