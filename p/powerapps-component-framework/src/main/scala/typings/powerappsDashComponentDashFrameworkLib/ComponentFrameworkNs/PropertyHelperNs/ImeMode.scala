package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImeMode extends js.Object

/**
		 * Ime Mode
		 */
@JSGlobal("ComponentFramework.PropertyHelper.ImeMode")
@js.native
object ImeMode extends js.Object {
  @js.native
  sealed trait Active
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode
  
  @js.native
  sealed trait Auto
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode
  
  @js.native
  sealed trait Disabled
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode
  
  @js.native
  sealed trait Inactive
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode
  
  /* 2 */ val Active: Active with scala.Double = js.native
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 3 */ val Disabled: Disabled with scala.Double = js.native
  /* 1 */ val Inactive: Inactive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.ImeMode with scala.Double
  ] = js.native
}

