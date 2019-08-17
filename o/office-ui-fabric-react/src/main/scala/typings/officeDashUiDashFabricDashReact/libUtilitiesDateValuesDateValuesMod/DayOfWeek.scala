package typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/dateValues/DateValues", "DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  @js.native
  sealed trait Friday extends DayOfWeek
  
  @js.native
  sealed trait Monday extends DayOfWeek
  
  @js.native
  sealed trait Saturday extends DayOfWeek
  
  @js.native
  sealed trait Sunday extends DayOfWeek
  
  @js.native
  sealed trait Thursday extends DayOfWeek
  
  @js.native
  sealed trait Tuesday extends DayOfWeek
  
  @js.native
  sealed trait Wednesday extends DayOfWeek
  
  /* 5 */ val Friday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Friday with Double = js.native
  /* 1 */ val Monday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Monday with Double = js.native
  /* 6 */ val Saturday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Saturday with Double = js.native
  /* 0 */ val Sunday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Sunday with Double = js.native
  /* 4 */ val Thursday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Thursday with Double = js.native
  /* 2 */ val Tuesday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Tuesday with Double = js.native
  /* 3 */ val Wednesday: typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DayOfWeek with Double] = js.native
}

