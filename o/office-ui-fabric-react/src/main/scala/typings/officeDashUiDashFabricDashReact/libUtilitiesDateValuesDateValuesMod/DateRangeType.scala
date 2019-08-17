package typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangeType extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/dateValues/DateValues", "DateRangeType")
@js.native
object DateRangeType extends js.Object {
  @js.native
  sealed trait Day extends DateRangeType
  
  @js.native
  sealed trait Month extends DateRangeType
  
  @js.native
  sealed trait Week extends DateRangeType
  
  @js.native
  sealed trait WorkWeek extends DateRangeType
  
  /* 0 */ val Day: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Day with Double = js.native
  /* 2 */ val Month: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Month with Double = js.native
  /* 1 */ val Week: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Week with Double = js.native
  /* 3 */ val WorkWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.WorkWeek with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangeType with Double] = js.native
}

