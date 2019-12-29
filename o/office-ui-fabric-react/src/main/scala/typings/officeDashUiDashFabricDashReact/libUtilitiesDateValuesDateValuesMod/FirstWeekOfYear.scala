package typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FirstWeekOfYear with Double] = js.native
  /* 0 */ @js.native
  object FirstDay extends TopLevel[FirstDay with Double]
  
  /* 2 */ @js.native
  object FirstFourDayWeek extends TopLevel[FirstFourDayWeek with Double]
  
  /* 1 */ @js.native
  object FirstFullWeek extends TopLevel[FirstFullWeek with Double]
  
}

