package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangeType extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/dateValues/DateValues", "DateRangeType")
@js.native
object DateRangeType extends js.Object {
  @js.native
  sealed trait Day
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DateRangeType
  
  @js.native
  sealed trait Month
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DateRangeType
  
  @js.native
  sealed trait Week
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DateRangeType
  
  @js.native
  sealed trait WorkWeek
    extends officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DateRangeType
  
  /* 0 */ val Day: Day with scala.Double = js.native
  /* 2 */ val Month: Month with scala.Double = js.native
  /* 1 */ val Week: Week with scala.Double = js.native
  /* 3 */ val WorkWeek: WorkWeek with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDateValuesDateValuesMod.DateRangeType with scala.Double
  ] = js.native
}

