package typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FirstWeekOfYear extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/dateValues/DateValues", "FirstWeekOfYear")
@js.native
object FirstWeekOfYear extends js.Object {
  @js.native
  sealed trait FirstDay extends FirstWeekOfYear
  
  @js.native
  sealed trait FirstFourDayWeek extends FirstWeekOfYear
  
  @js.native
  sealed trait FirstFullWeek extends FirstWeekOfYear
  
  /* 0 */ val FirstDay: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
  /* 2 */ val FirstFourDayWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
  /* 1 */ val FirstFullWeek: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FirstWeekOfYear with Double] = js.native
}

