package typings.officeUiFabricReact

import typings.officeUiFabricReact.calendarTypesMod.ICalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Calendar", JSImport.Namespace)
@js.native
object libCalendarMod extends js.Object {
  @js.native
  class Calendar protected ()
    extends typings.officeUiFabricReact.calendarMod.Calendar {
    def this(props: ICalendarProps) = this()
  }
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var defaultProps: ICalendarProps = js.native
  }
  
  @js.native
  object DateRangeType extends js.Object {
    /* 0 */ val Day: typings.officeUiFabricReact.dateValuesMod.DateRangeType.Day with Double = js.native
    /* 2 */ val Month: typings.officeUiFabricReact.dateValuesMod.DateRangeType.Month with Double = js.native
    /* 1 */ val Week: typings.officeUiFabricReact.dateValuesMod.DateRangeType.Week with Double = js.native
    /* 3 */ val WorkWeek: typings.officeUiFabricReact.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.dateValuesMod.DateRangeType with Double] = js.native
  }
  
  @js.native
  object DayOfWeek extends js.Object {
    /* 5 */ val Friday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Friday with Double = js.native
    /* 1 */ val Monday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Monday with Double = js.native
    /* 6 */ val Saturday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    /* 0 */ val Sunday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    /* 4 */ val Thursday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    /* 2 */ val Tuesday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    /* 3 */ val Wednesday: typings.officeUiFabricReact.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.dateValuesMod.DayOfWeek with Double] = js.native
  }
  
  @js.native
  object FirstWeekOfYear extends js.Object {
    /* 0 */ val FirstDay: typings.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    /* 2 */ val FirstFourDayWeek: typings.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    /* 1 */ val FirstFullWeek: typings.officeUiFabricReact.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.dateValuesMod.FirstWeekOfYear with Double] = js.native
  }
  
}

