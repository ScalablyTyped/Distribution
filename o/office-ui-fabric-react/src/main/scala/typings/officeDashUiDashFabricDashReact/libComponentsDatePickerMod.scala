package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsDatePickerDatePickerDotTypesMod.IDatePickerProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DatePicker", JSImport.Namespace)
@js.native
object libComponentsDatePickerMod extends js.Object {
  @js.native
  class DatePickerBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDatePickerDatePickerDotBaseMod.DatePickerBase {
    def this(props: IDatePickerProps) = this()
  }
  
  val DatePicker: StatelessComponent[IDatePickerProps] = js.native
  /* static members */
  @js.native
  object DatePickerBase extends js.Object {
    var defaultProps: IDatePickerProps = js.native
  }
  
  @js.native
  object DateRangeType extends js.Object {
    /* 0 */ val Day: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Day with Double = js.native
    /* 2 */ val Month: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Month with Double = js.native
    /* 1 */ val Week: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Week with Double = js.native
    /* 3 */ val WorkWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.WorkWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType with Double
      ] = js.native
  }
  
  @js.native
  object DayOfWeek extends js.Object {
    /* 5 */ val Friday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Friday with Double = js.native
    /* 1 */ val Monday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Monday with Double = js.native
    /* 6 */ val Saturday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Saturday with Double = js.native
    /* 0 */ val Sunday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Sunday with Double = js.native
    /* 4 */ val Thursday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Thursday with Double = js.native
    /* 2 */ val Tuesday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Tuesday with Double = js.native
    /* 3 */ val Wednesday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Wednesday with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek with Double
      ] = js.native
  }
  
  @js.native
  object FirstWeekOfYear extends js.Object {
    /* 0 */ val FirstDay: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    /* 2 */ val FirstFourDayWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    /* 1 */ val FirstFullWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear with Double
      ] = js.native
  }
  
}

