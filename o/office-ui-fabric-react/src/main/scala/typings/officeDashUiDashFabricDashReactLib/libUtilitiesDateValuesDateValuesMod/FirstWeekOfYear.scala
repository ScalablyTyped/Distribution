package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FirstWeekOfYear extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/dateValues/DateValues", "FirstWeekOfYear")
@js.native
object FirstWeekOfYear extends js.Object {
  @js.native
  sealed trait FirstDay
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
  
  @js.native
  sealed trait FirstFourDayWeek
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
  
  @js.native
  sealed trait FirstFullWeek
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
  
  /* 0 */ val FirstDay: FirstDay with scala.Double = js.native
  /* 2 */ val FirstFourDayWeek: FirstFourDayWeek with scala.Double = js.native
  /* 1 */ val FirstFullWeek: FirstFullWeek with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear with scala.Double
  ] = js.native
}

