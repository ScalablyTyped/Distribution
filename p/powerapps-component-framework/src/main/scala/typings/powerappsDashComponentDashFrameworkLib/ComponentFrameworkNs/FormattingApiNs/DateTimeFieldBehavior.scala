package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFieldBehavior extends js.Object

/**
		 * DateTime Field Behavior options
		 */
@JSGlobal("ComponentFramework.FormattingApi.DateTimeFieldBehavior")
@js.native
object DateTimeFieldBehavior extends js.Object {
  /**
  			 * Unknown DateTime Behavior
  			 */
  @js.native
  sealed trait None
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior
  
  /**
  			 * Dates and time stored without conversion to UTC
  			 */
  @js.native
  sealed trait TimeZoneIndependent
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior
  
  /**
  			 * Respect user local time. Dates stored as UTC
  			 */
  @js.native
  sealed trait UserLocal
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val TimeZoneIndependent: TimeZoneIndependent with scala.Double = js.native
  /* 1 */ val UserLocal: UserLocal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FormattingApiNs.DateTimeFieldBehavior with scala.Double
  ] = js.native
}

