package typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Day
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Month
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.Week
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType.WorkWeek
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangeType with Double] = js.native
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 2 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /* 1 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /* 3 */ @js.native
  object WorkWeek extends TopLevel[WorkWeek with Double]
  
}

