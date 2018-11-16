package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/dateValues/DateValues", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  @js.native
  sealed trait Friday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  @js.native
  sealed trait Monday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  @js.native
  sealed trait Saturday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  @js.native
  sealed trait Sunday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  @js.native
  sealed trait Thursday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  @js.native
  sealed trait Tuesday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  @js.native
  sealed trait Wednesday
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek
  
  /* 5 */ val Friday: Friday with scala.Double = js.native
  /* 1 */ val Monday: Monday with scala.Double = js.native
  /* 6 */ val Saturday: Saturday with scala.Double = js.native
  /* 0 */ val Sunday: Sunday with scala.Double = js.native
  /* 4 */ val Thursday: Thursday with scala.Double = js.native
  /* 2 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 3 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DayOfWeek with scala.Double
  ] = js.native
}

