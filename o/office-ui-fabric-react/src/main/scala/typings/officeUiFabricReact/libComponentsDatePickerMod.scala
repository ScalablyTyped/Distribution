package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsDatePickerDatePickerDottypesMod.IDatePickerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDatePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker", "DatePicker")
  @js.native
  val DatePicker: FunctionComponent[IDatePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker", "DatePickerBase")
  @js.native
  open class DatePickerBase protected ()
    extends typings.officeUiFabricReact.libComponentsDatePickerDatePickerDotbaseMod.DatePickerBase {
    def this(props: IDatePickerProps) = this()
  }
  /* static members */
  object DatePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DatePicker", "DatePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DatePicker", "DatePickerBase.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    inline def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType & Double
      ] = js.native
    
    /* 0 */ val Day: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Day & Double = js.native
    
    /* 2 */ val Month: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Month & Double = js.native
    
    /* 1 */ val Week: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.Week & Double = js.native
    
    /* 3 */ val WorkWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DateRangeType.WorkWeek & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek & Double] = js.native
    
    /* 5 */ val Friday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DatePicker", "FirstWeekOfYear")
  @js.native
  object FirstWeekOfYear extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear & Double
      ] = js.native
    
    /* 0 */ val FirstDay: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstDay & Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFourDayWeek & Double = js.native
    
    /* 1 */ val FirstFullWeek: typings.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.FirstWeekOfYear.FirstFullWeek & Double = js.native
  }
}
