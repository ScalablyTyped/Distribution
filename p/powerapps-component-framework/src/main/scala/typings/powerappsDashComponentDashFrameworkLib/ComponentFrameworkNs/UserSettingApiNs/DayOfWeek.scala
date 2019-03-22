package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DayOfWeek extends js.Object

/**
		 * Day Of Week Enum
		 */
@JSGlobal("ComponentFramework.UserSettingApi.DayOfWeek")
@js.native
object DayOfWeek extends js.Object {
  @js.native
  sealed trait Friday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  @js.native
  sealed trait Monday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  @js.native
  sealed trait Saturday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  @js.native
  sealed trait Sunday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  @js.native
  sealed trait Thursday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  @js.native
  sealed trait Tuesday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  @js.native
  sealed trait Wednesday
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek
  
  /* 5 */ val Friday: Friday with scala.Double = js.native
  /* 1 */ val Monday: Monday with scala.Double = js.native
  /* 6 */ val Saturday: Saturday with scala.Double = js.native
  /* 0 */ val Sunday: Sunday with scala.Double = js.native
  /* 4 */ val Thursday: Thursday with scala.Double = js.native
  /* 2 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 3 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DayOfWeek with scala.Double
  ] = js.native
}

